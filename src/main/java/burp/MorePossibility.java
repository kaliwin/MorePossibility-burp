package burp;

import BurpGrpc.achieve.RunAchieve;
import InformationCenter.WebInformationProcessingCenter;
import UI.ManGUI;
import burp.api.montoya.BurpExtension;
import burp.api.montoya.MontoyaApi;



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
    }

    /**
     * Invoked when the extension is loaded.
     *
     * @param api The api implementation to access the functionality of burp suite.
     */
    @Override
    public void initialize(MontoyaApi api) {
        burpApi = api;
        this.init(); // 初始化

        api.extension().setName("MorePossibility_test");
        api.logging().output().println("启动了");

        api.userInterface().registerSuiteTab("MorePossibility_test", new ManGUI());  // 构建UI


        api.extension().registerUnloadingHandler(() -> {

            runAchieve.stopServer();

        });

//        runAchieve.startServer(9523);
    }
}






