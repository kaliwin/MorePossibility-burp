package burp;

import BurpGrpc.achieve.RunAchieve;
import InformationCenter.WebInformationProcessingCenter;
import UI.ManGUI;
import UI.ManGrpcGUI;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.RawEditor;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpResponseEditor;
import org.apache.commons.text.StringEscapeUtils;

import java.awt.*;


/**
 * @author cyvk
 */ // 插件入口
public class MorePossibility implements BurpExtension {
    // burpAPI
    public static MontoyaApi burpApi;
    // 打印函数
//    public static Logging logging;  使用  ManGrpcGUI.pluginLog 打印信息
    // burpAPI的工具类用于注册burp服务和与Grpc的对接
    public static BurpApiTool burpApiTool;
    // 启动实现, 关于Grpc通信类,提供服务监听,建立rpc连接通信
    public static RunAchieve runAchieve;

    public static WebInformationProcessingCenter webInformationProcessingCenter; // web信息处理中心


    // 初始化
    private void init() {
        burpApiTool = new BurpApiTool();  //burpAPI的工具类
        runAchieve = new RunAchieve();    //grpc 通讯的类
        webInformationProcessingCenter = new WebInformationProcessingCenter(); // web信息处理中心

        // 注册u2c 组件用于处理Unicode 编码转换
        burpApi.userInterface().registerHttpResponseEditorProvider(creationContext -> {
            RawEditor rawEditor = burpApi.userInterface().createRawEditor();
            rawEditor.setEditable(false);
            return new ExtensionProvidedHttpResponseEditor() {
                @Override
                public HttpResponse getResponse() {
                    return null;
                }

                @Override
                public void setRequestResponse(HttpRequestResponse requestResponse) {
                    HttpResponse response = requestResponse.response();
                    String str = new String(response.body().getBytes());
                    // 转换编码
                    HttpResponse httpResponse = response.withBody(ByteArray.byteArray(StringEscapeUtils.unescapeJava(str).getBytes()));
                    rawEditor.setContents(httpResponse.toByteArray());

                }

                @Override
                public boolean isEnabledFor(HttpRequestResponse requestResponse) {
                    return true;
                }

                @Override
                public String caption() {
                    return "u2c";
                }

                @Override
                public Component uiComponent() {
                    return rawEditor.uiComponent();
                }

                @Override
                public Selection selectedData() {
                    return null;
                }

                @Override
                public boolean isModified() {
                    return false;
                }
            };
        });
    }




    /**
     * Invoked when the extension is loaded.
     *  插件入口函数
     * @param api The api implementation to access the functionality of burp suite.
     */
    @Override
    public void initialize(MontoyaApi api) {

        try {
            burpApi = api;
            this.init(); // 初始化

            api.extension().setName("MorePossibility-Burp");
            api.logging().logToOutput("MorePossibility-Burp is part of ManDown\n" +
                    "Affiliated with MorePossibility https://github.com/MorePossibility");

            api.userInterface().registerSuiteTab("MorePossibility-Burp", new ManGUI());  // 构建UI


            api.extension().registerUnloadingHandler(() -> {
                // 设置关闭选项 目前存在隐藏bug会出现部分服务无法关闭的情况但是不影响使用
                runAchieve.stopServer();
            });

        } catch (Exception e) {
            ManGrpcGUI.consoleLog.append("[-] 插件主线程抛出异常 : " + e + "\n");
        }
    }




}






