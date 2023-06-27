package burp;

import BurpGrpc.proto.BurpApiGrpc.Menu;
import BurpGrpc.proto.BurpApiGrpc.MenuItem;
import BurpGrpc.proto.BurpApiGrpc.*;
import InformationCenter.WebInfo;
import UI.ManGrpcGUI;
import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Range;
import burp.api.montoya.core.Registration;
import burp.api.montoya.http.handler.*;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.intruder.*;
import burp.api.montoya.proxy.http.*;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.contextmenu.ContextMenuEvent;
import burp.api.montoya.ui.contextmenu.ContextMenuItemsProvider;
import burp.api.montoya.ui.contextmenu.MessageEditorHttpRequestResponse;
import burp.api.montoya.ui.editor.RawEditor;
import burp.api.montoya.ui.editor.extension.*;
import com.google.common.collect.TreeBasedTable;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static burp.BurpServerTypeX.*;
import static burp.MorePossibility.*;
import static burp.api.montoya.ui.editor.extension.EditorMode.READ_ONLY;


/**
 * @description: burpApi工具类 提供与grpc服务的对接,包括各个burp服务注册卸载 API
 * @author: cyvk
 * @date: 2023/5/29 下午12:28
 */
public class BurpApiTool {

    TreeBasedTable<String, BurpServerTypeX, Registration> serverRegistrationStatus;  // 服务注册状态,结构:名字 服务类型 注册状态

    public BurpApiTool() {
        this.serverRegistrationStatus = TreeBasedTable.create();
        init();
    }

    /**
     * @description: 跟随构造函数一同初始化执行
     * @author: cyvk
     * @date: 2023/6/11 下午2:23
     */
    private void init() {
//        burpApi.userInterface().registerHttpRequestEditorProvider(new initHttpKeyValueEditor("Key_Value_test"));
    }


    /**
     * @param name:             请求的客户端名称
     * @param responseObserver: 流  (不区分客户端流还是服务端流)
     * @description: 实时流量镜像, 注册burp HTTP处理器将有响应包的请求通过流传输给零号
     * @author: cyvk
     * @date: 2023/5/29 下午12:30
     */
    public boolean realTimeTrafficMirroring(String name, StreamObserver<httpReqAndRes> responseObserver) {
        //注册 http流量处理器
        Registration httpTrafficRegistration = burpApi.http().registerHttpHandler(new handleHttpTrafficMirroring(responseObserver));
        if (httpTrafficRegistration.isRegistered()) {
            this.serverRegistrationStatus.put(name, BurpServerTypeX.REAL_TIME_TRAFFIC_MIRRORING, httpTrafficRegistration);
            return true;
        }
        return false;
    }


    /**
     * @param target: 目标Grpc地址
     * @param name:   名称
     * @return boolean  是否建立成功
     * @description: burp主动发起rpc请求通过客户端进行实时流量镜像
     * @author: cyvk
     * @date: 2023/6/8 下午3:11
     */
    private boolean realTimeTrafficMirroring(String target, String name) {
        if (!serverRegistrationStatus.contains(name, BurpServerTypeX.INTRUDER_PROCESSOR)) {
            return runAchieve.getRealTimeTrafficMirroring(target, name);
        }
        return false;
    }


    /**
     * @param target: 载荷处理的客户端地址,burp将主动建立连接调用其函数
     * @param name:   处理器名称,用于在burp Intruder中显示 不允许使用中文,不允许特殊字符请用纯大小写英文命名避免出现意料之外的错误
     * @return boolean 成功注册为true,失败false
     * @description: 注册载荷处理器, 通过grpc调用第三方供应商提供的函数
     * @author: cyvk
     * @date: 2023/5/30 下午12:13
     */
    private boolean registerIntruderPayloadProcessor(String target, String name) {

        if (!serverRegistrationStatus.contains(name, BurpServerTypeX.INTRUDER_PROCESSOR)) {

            try {
                IntruderPayloadProcessorServerGrpc.IntruderPayloadProcessorServerBlockingStub intruderClient = runAchieve.getIntruderProcessorClient(target);
                // == null 便是连接失败

                if (intruderClient != null) {
                    //注册burp迭代器处理
                    Registration intrudeProcessorRegistration = burpApi.intruder().registerPayloadProcessor(new intruderDemo(intruderClient, name));
                    if (intrudeProcessorRegistration.isRegistered()) {
                        serverRegistrationStatus.put(name, BurpServerTypeX.INTRUDER_PROCESSOR, intrudeProcessorRegistration);
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    /**
     * @param target:        服务端地址,burp将主动请求调用
     * @param generatorName: 处理器名称,用于在burp Intruder中显示 不允许使用中文,不允许特殊字符请用纯大小写英文命名避免出现意料之外的错误
     * @return boolean       是否注册成功
     * @description: 注册载荷生成器, 用于生成载荷，可生成用户名密码字典,目录,各类注入型载荷
     * @author: cyvk
     * @date: 2023/5/30 下午4:19
     */
    private boolean registerIntruderGeneratorPayload(String target, String generatorName) {

        if (!serverRegistrationStatus.contains(generatorName, INTRUDER_GENERATE)) {

            try {
                IntruderPayloadGeneratorServerGrpc.IntruderPayloadGeneratorServerBlockingStub intruderClient = runAchieve.getIntruderGeneratorClient(target);
                if (intruderClient != null) {
                    Registration intruderPayloadGenerator = burpApi.intruder().registerPayloadGeneratorProvider(new intruderGenerate(generatorName, intruderClient));

                    if (intruderPayloadGenerator.isRegistered()) {
                        serverRegistrationStatus.put(generatorName, INTRUDER_GENERATE, intruderPayloadGenerator);
                        return true;
                    }
                }

            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    /**
     * @param target: Grpc地址
     * @param name:   名称
     * @return boolean 是否注册成功
     * @description: 注册请求编辑框
     * @author: cyvk
     * @date: 2023/6/11 下午4:32
     */
    private boolean registerHttpReqEdit(String target, String name) {
        if (!serverRegistrationStatus.contains(name, HTTP_REQUEST_EDITOR_PROCESSOR)) {
            try {
                HttpReqEditBoxAssistGrpc.HttpReqEditBoxAssistBlockingStub httpReqEditClient = runAchieve.getHttpReqEditClient(target);
                if (httpReqEditClient != null) {
                    Registration httpRequestEditorProvider = burpApi.userInterface().registerHttpRequestEditorProvider(new httpReqEditor(name, httpReqEditClient));
                    if (httpRequestEditorProvider.isRegistered()) {
                        serverRegistrationStatus.put(name, HTTP_REQUEST_EDITOR_PROCESSOR, httpRequestEditorProvider);
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    /**
     * @param target: grpc 地址
     * @param name:   名称
     * @return boolean
     * @description: 注册http响应编辑框
     * @author: cyvk
     * @date: 2023/6/11 下午6:05
     */
    private boolean registerHttpResEdit(String target, String name) {
        if (!serverRegistrationStatus.contains(name, HTTP_RESPONSE_EDITOR_PROCESSOR)) {
            try {
                HttpResEditBoxAssistGrpc.HttpResEditBoxAssistBlockingStub httpResEditClient = runAchieve.getHttpResEditClient(target);
                if (httpResEditClient != null) {
                    Registration httpResponseEditorProvider = burpApi.userInterface().registerHttpResponseEditorProvider(new httpResEditor(name, httpResEditClient));
                    if (httpResponseEditorProvider.isRegistered()) {
                        serverRegistrationStatus.put(name, HTTP_RESPONSE_EDITOR_PROCESSOR, httpResponseEditorProvider);
                        return true;
                    }
                }
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }


    /**
     * @description: 初始化http明文密文键值对编辑器, 用于初始化ui由RunAchieve初始化时调用, 会自动匹配信息中心中的明密简直对
     * @author: cyvk
     * @date: 2023/6/8 下午4:31
     */
    public void initRegisterHttpEditorKeyValue() {


    }


    /**
     * @param tarGet: 目标地址
     * @return boolean  成功与否
     * @description: 注册上下文菜单项 ,通过grpc发起请求获取菜单项,在注册渲染
     * @author: cyvk
     * @date: 2023/6/16 下午3:25
     */
    private boolean registerConTextMenuItems(String tarGet, String name) {

        if (!serverRegistrationStatus.contains(name, CONTEXT_MENU_ITEMS_PROVIDER)) {
            // 调用Grpc  获取菜单项
            MenuInfo conTextMenuItems = runAchieve.getConTextMenuItemsServer(tarGet).getConTextMenuItems(Str.newBuilder().setName(name).build());

            // 注册渲染
            Registration registration = burpApi.userInterface().registerContextMenuItemsProvider(new MenuItemsProvider(conTextMenuItems));

            if (registration.isRegistered()) {

                serverRegistrationStatus.put(name, CONTEXT_MENU_ITEMS_PROVIDER, registration);
                return true;
            }
        }
        return false;
    }


    private boolean registerProxyReqHandler(String tarGet, String name) {
        if (!serverRegistrationStatus.contains(name, PROXY_REQUEST_HANDLER)) {
            ProxyRequestHandlerGrpc.ProxyRequestHandlerBlockingStub proxyRequestHandlerClient = runAchieve.getProxyRequestHandlerClient(tarGet);
            Registration registration = burpApi.proxy().registerRequestHandler(new ProxyReqHandler(proxyRequestHandlerClient));
            if (registration.isRegistered()) {
                serverRegistrationStatus.put(name, PROXY_REQUEST_HANDLER, registration);
                return true;
            }
        }

        return false;

    }


    /**
     * @param tarGet: grpc 地址
     * @param name:   名称
     * @return boolean  是否注册成功
     * @description: 注册代理响应处理器
     * @author: cyvk
     * @date: 2023/6/19 下午2:47
     */
    private boolean registerProxyResHandler(String tarGet, String name) {

        if (!serverRegistrationStatus.contains(name, PROXY_RESPONSE_HANDLER)) {
            ProxyResponseHandlerGrpc.ProxyResponseHandlerBlockingStub proxyResponseHandlerClient = runAchieve.getProxyResponseHandlerClient(tarGet);
            Registration registration = burpApi.proxy().registerResponseHandler(new ProxyResHandler(proxyResponseHandlerClient));
            if (registration.isRegistered()) {
                serverRegistrationStatus.put(name, PROXY_RESPONSE_HANDLER, registration);
                return true;
            }
        }
        return false;
    }


    /**
     * @param tarGet: grpc 地址
     * @param name:   名称
     * @return boolean
     * @description: http流量处理器 请求和响应放在一起 不用可以返回继续
     * @author: cyvk
     * @date: 2023/6/20 下午12:43
     */
    private boolean registerHttpHandler(String tarGet, String name) {
        if (!serverRegistrationStatus.contains(name, HTTP_FLOW_HANDLER)) {
            HttpFlowHandlerGrpc.HttpFlowHandlerBlockingStub httpFlowHandlerClient = runAchieve.getHttpFlowHandlerClient(tarGet);
            Registration registration = burpApi.http().registerHttpHandler(new HttpFlowHandler(httpFlowHandlerClient));
            if (registration.isRegistered()) {
                serverRegistrationStatus.put(name, HTTP_FLOW_HANDLER, registration);
                return true;
            }
        }
        return false;
    }


    /**
     * @param serverName:      名称
     * @param burpServerTypeX: 类型
     * @return boolean
     * @description: 服务卸载 需要名称和服务类型 如果不存在就返回false
     * @author: cyvk
     * @date: 2023/6/6 下午6:01
     */
    public boolean delServer(String serverName, BurpServerTypeX burpServerTypeX) {
        Registration remove = serverRegistrationStatus.remove(serverName, burpServerTypeX);
        if (remove != null) {
            remove.deregister();
            return true;
        }
        return false;
    }


    /**
     * @param name:            服务名称 只允许大小写和数字
     * @param target:          Grpc服务地址
     * @param burpServerTypeX: 服务类型
     * @return boolean
     * @description: 注册服务 返回false 就是目标地址错误或者已经存在 错误信息会向文本域输出 传入名称、地址、服务类型即可
     * @author: cyvk
     * @date: 2023/6/6 下午9:38
     */
    public boolean registrationServer(String name, String target, BurpServerTypeX burpServerTypeX) {
        switch (burpServerTypeX) {
            case INTRUDER_GENERATE -> {         // 迭代生成器
                return registerIntruderGeneratorPayload(target, name);
            }
            case INTRUDER_PROCESSOR -> {        // 迭代处理器
                return registerIntruderPayloadProcessor(target, name);
            }
            case REAL_TIME_TRAFFIC_MIRRORING -> {  // 实时流量镜像
                return realTimeTrafficMirroring(target, name);
            }
            case HTTP_EDITOR_KEY_VALUE -> {        // http键值对 需要后续测试才能使用
                return false;
            }
            case HTTP_REQUEST_EDITOR_PROCESSOR -> {  // http请求编辑器
                return registerHttpReqEdit(target, name);
            }
            case HTTP_RESPONSE_EDITOR_PROCESSOR -> {  // http响应编辑器
                return registerHttpResEdit(target, name);
            }

            case CONTEXT_MENU_ITEMS_PROVIDER -> {      // 上下文菜单提供程序
                return registerConTextMenuItems(target, name);
            }
            case PROXY_REQUEST_HANDLER -> {
                return registerProxyReqHandler(target, name);
            }
            case PROXY_RESPONSE_HANDLER -> {
                return registerProxyResHandler(target, name);
            }
            case HTTP_FLOW_HANDLER -> {
                return registerHttpHandler(target, name);
            }

        }
        return false;
    }

}


// 处理流量镜像
class handleHttpTrafficMirroring implements HttpHandler {
    final Lock lock = new ReentrantLock();   // 线程锁避免并发导致传输流断裂
    StreamObserver<httpReqAndRes> trafficFlow; // 传输流

    public handleHttpTrafficMirroring(StreamObserver<httpReqAndRes> trafficFlow) {
        this.trafficFlow = trafficFlow;
    }

    /**
     * Invoked by Burp when an HTTP request is about to be sent.
     *
     * @param requestToBeSent information about the HTTP request that is going to be sent.
     * @return An instance of {@link RequestToBeSentAction}.
     */
    @Override
    public RequestToBeSentAction handleHttpRequestToBeSent(HttpRequestToBeSent requestToBeSent) {
        return null;
    }

    /**
     * Invoked by Burp when an HTTP response has been received.
     *
     * @param responseReceived information about HTTP response that was received.
     * @return An instance of {@link ResponseReceivedAction}.
     */
    @Override
    public ResponseReceivedAction handleHttpResponseReceived(HttpResponseReceived responseReceived) {

        httpReqData req = BurpApiUtensil.HttpRequestTohttpReqData(responseReceived.initiatingRequest());   // 组装请求

        httpResData res = BurpApiUtensil.httpResponseTohttpResData(responseReceived);    // 组装响应

        //请求信息id、注释
        httpInfo info = httpInfo.newBuilder().setId(responseReceived.messageId()).setInfo(responseReceived.annotations().toString()).build();

        // 组装一组请求、响应、信息
        httpReqAndRes reqAndRes = httpReqAndRes.newBuilder().setReq(req).setRes(res).setInfo(info).build();

        //设置锁避免并发操作流
        lock.lock();
        // 通过流发送流量
        trafficFlow.onNext(reqAndRes);
        lock.unlock(); // 释放锁
        //不做任何处理 返回null
        return null;
    }
}

// 迭代器 载荷处理实现
class intruderDemo implements PayloadProcessor {
    IntruderPayloadProcessorServerGrpc.IntruderPayloadProcessorServerBlockingStub intruderServer;
    String name;

    public intruderDemo(IntruderPayloadProcessorServerGrpc.IntruderPayloadProcessorServerBlockingStub intruderServer, String name) {
        this.intruderServer = intruderServer;
        this.name = name;
    }

    /**
     *
     */
    @Override
    public String displayName() {
        return name;
    }

    /**
     * @param payloadData Information about the current payload to be processed
     */
    @Override
    public PayloadProcessingResult processPayload(PayloadData payloadData) {
        // 构建类型
        ByteData payload = ByteData.newBuilder().setByteData(ByteString.copyFrom(payloadData.currentPayload().getBytes())).build();
        // 通过rpc调用远程函数处理载荷
        ByteData byteData = intruderServer.intruderPayloadProcessor(payload);
        // 返回处理后的结果
        return PayloadProcessingResult.usePayload(ByteArray.byteArray(byteData.getByteData().toByteArray()));
    }
}

// 迭代器 生成器实现
class intruderGenerate implements PayloadGeneratorProvider, PayloadGenerator {
    String name;
    IntruderPayloadGeneratorServerGrpc.IntruderPayloadGeneratorServerBlockingStub intruderServer;
    IntruderGeneratorData.Builder intruderGeneratorData;

    public intruderGenerate(String name, IntruderPayloadGeneratorServerGrpc.IntruderPayloadGeneratorServerBlockingStub intruderServer) {
        this.name = name;
        this.intruderServer = intruderServer;
    }

    /**
     *
     */
    @Override
    public String displayName() {
        return name;
    }

    /**
     * @param attackConfiguration An object containing information about the currently
     *                            selected attack configuration tab.
     */
    @Override
    public PayloadGenerator providePayloadGenerator(AttackConfiguration attackConfiguration) {
        ByteArray content = attackConfiguration.requestTemplate().content();  // 原始请求
        intruderGeneratorData = IntruderGeneratorData.newBuilder()
                .setContentData(ByteString.copyFrom(content.getBytes()));    // 初始化数据
        return this;
    }

    /**
     * @param insertionPoint Insertion point for the payload.
     */
    @Override
    public GeneratedPayload generatePayloadFor(IntruderInsertionPoint insertionPoint) {
        try {
            intruderGeneratorData.setIntruderInsertionPoint(ByteString.copyFrom(insertionPoint.baseValue().getBytes()));
            PayloadGeneratorResult payloadGeneratorResult = intruderServer.intruderPayloadGeneratorProvider(intruderGeneratorData.build());

            if (payloadGeneratorResult.getIsEnd()) {
                return GeneratedPayload.end();
            }
            return GeneratedPayload.payload(ByteArray.byteArray(payloadGeneratorResult.getByteData().toByteArray()));

        } catch (Exception e) {
            ManGrpcGUI.pluginLog.append("异常：" + e + "\n");

        }
        return GeneratedPayload.end();
    }
}


/**
 * @description: 初始化键值对编辑器 ,与BurpApiTool 一同初始化  [+] 功能临时实现 ,存在bug
 * @author: cyvk
 * @date: 2023/6/8 下午4:37
 */
class initHttpKeyValueEditor implements HttpRequestEditorProvider, ExtensionProvidedHttpRequestEditor {
    RawEditor re; // 原始编辑器
    String name;


    public initHttpKeyValueEditor(String name) {
        this.name = name;
    }

    /**
     * @param creationContext details about the context that is requiring a request editor
     */
    @Override
    public ExtensionProvidedHttpRequestEditor provideHttpRequestEditor(EditorCreationContext creationContext) {
        RawEditor rawEditor = burpApi.userInterface().createRawEditor();  // 创建一个原始编辑器
        rawEditor.setEditable(creationContext.editorMode() != READ_ONLY); //以调用方期望的状态设置 是否可编辑
        this.re = rawEditor;
        return this;
    }


    /**
     * @return burp.api.montoya.http.message.requests.HttpRequest
     * @description: isModified()为true时会调用该函数将设置原先Raw中的请求数据  强烈不建议使用因为此时请求与响应早已完成,调用该函数容易造成初始请求丢失
     * 造成额外资源消耗, 暂时未发现使用场景因此isModified()和getRequest()不做任何处理
     * @author: cyvk
     * @date: 2023/5/31 下午5:46
     */
    @Override
    public HttpRequest getRequest() {
        return null;
    }

    /**
     * @param requestResponse The request and response to set in the editor.
     */
    @Override
    public void setRequestResponse(HttpRequestResponse requestResponse) {
        List<WebInfo> webInfo = webInformationProcessingCenter.getWebInfo(requestResponse.url());

        String str = "";

        String reqString = new String(requestResponse.request().toByteArray().getBytes());

        for (WebInfo info : webInfo) {
            str = info.plaintextAndCiphertextSetData.keyValuePairReplacement(reqString);
        }
        re.setContents(ByteArray.byteArray(str));
    }

    /**
     * @param requestResponse The {@link HttpRequestResponse} to check.
     *                        该函数决定是否要显示渲染编辑器
     */
    @Override
    public boolean isEnabledFor(HttpRequestResponse requestResponse) {

        // 判断是否有键值对信息
        return webInformationProcessingCenter.isKeyValuePari(requestResponse.url());
    }

    /**
     * 标题名称
     */
    @Override
    public String caption() {
        return this.name;
    }

    /**
     * ui 渲染
     */
    @Override
    public Component uiComponent() {
        return this.re.uiComponent();
    }

    /**
     * 选择 , 未发现使用场景
     */
    @Override
    public Selection selectedData() {
        return null;
    }

    /**
     * 是否修改原始Raw请求, 保持 false
     */
    @Override
    public boolean isModified() {
        return false;
    }
}


/**
 * @description: 注册http请求编辑器实现，通过grpc渲染
 * @author: cyvk
 * @date: 2023/6/11 下午3:20
 */
class httpReqEditor implements HttpRequestEditorProvider, ExtensionProvidedHttpRequestEditor {

    RawEditor re;
    String name;

    HttpReqEditBoxAssistGrpc.HttpReqEditBoxAssistBlockingStub httpReqEditBoxAssistClient;


    public httpReqEditor(String name, HttpReqEditBoxAssistGrpc.HttpReqEditBoxAssistBlockingStub client) {
        this.name = name;
        this.httpReqEditBoxAssistClient = client;
    }

    /**
     *
     */
    @Override
    public HttpRequest getRequest() {
        return null;
    }

    /**
     * @param requestResponse The request and response to set in the editor.
     */
    @Override
    public void setRequestResponse(HttpRequestResponse requestResponse) {
        HttpRequest request = requestResponse.request();
        HttpResponse response = requestResponse.response();

        httpReqData req = BurpApiUtensil.HttpRequestTohttpReqData(request);

        httpResData res = BurpApiUtensil.httpResponseTohttpResData(response);

        httpInfo httpInfoX = httpInfo.newBuilder()
                .setInfo(requestResponse.annotations().notes())
                .build();

        httpReqAndRes reqAndRes = httpReqAndRes.newBuilder()
                .setReq(req)
                .setRes(res)
                .setInfo(httpInfoX)
                .build();


        HttpEditBoxData heb = HttpEditBoxData.newBuilder()
                .setName(name)
                .setHttpData(reqAndRes)
                .build();

        ByteData byteData = httpReqEditBoxAssistClient.reqHttpEdit(heb);

        ManGrpcGUI.consoleLog.append(name + ": 正在渲染" + "\n");

        re.setContents(ByteArray.byteArray(byteData.getByteData().toByteArray()));

    }

    /**
     * @param requestResponse The {@link HttpRequestResponse} to check.
     */
    @Override
    public boolean isEnabledFor(HttpRequestResponse requestResponse) {


        HttpRequest request = requestResponse.request();
        HttpResponse response = requestResponse.response();

        httpReqData req = BurpApiUtensil.HttpRequestTohttpReqData(request);

        httpResData res = BurpApiUtensil.httpResponseTohttpResData(response);

        httpInfo httpInfoX = httpInfo.newBuilder()
                .setInfo(requestResponse.annotations().notes())
                .build();

        httpReqAndRes reqAndRes = httpReqAndRes.newBuilder()
                .setReq(req)
                .setRes(res)
                .setInfo(httpInfoX)
                .build();


        HttpEditBoxData heb = HttpEditBoxData.newBuilder()
                .setName(name)
                .setHttpData(reqAndRes)
                .build();

        if (httpReqEditBoxAssistClient.isReqHttpEditFor(heb).getBoole()) {
            ManGrpcGUI.consoleLog.append(name + ": 需要渲染" + "\n");
            return true;
        } else {
            ManGrpcGUI.consoleLog.append(name + ": 不需要渲染" + "\n");
            return false;
        }

    }

    @Override
    public String caption() {
        return name;
    }

    @Override
    public Component uiComponent() {
        return re.uiComponent();
    }


    @Override
    public Selection selectedData() {
        return null;
    }

    @Override
    public boolean isModified() {
        return false;
    }

    /**
     * @param creationContext details about the context that is requiring a request editor
     */
    @Override
    public ExtensionProvidedHttpRequestEditor provideHttpRequestEditor(EditorCreationContext creationContext) {
        RawEditor rawEditor = burpApi.userInterface().createRawEditor();  // 创建一个原始编辑器
        rawEditor.setEditable(false); //以调用方期望的状态设置 是否可编辑
        this.re = rawEditor;
        return this;

    }
}


/**
 * @description: 注册http响应编辑器 ,通过grpc 渲染
 * @author: cyvk
 * @date: 2023/6/11 下午5:57
 */
class httpResEditor implements HttpResponseEditorProvider, ExtensionProvidedHttpResponseEditor {


    String name;
    RawEditor re;
    HttpResEditBoxAssistGrpc.HttpResEditBoxAssistBlockingStub httpResEditClient;


    public httpResEditor(String name, HttpResEditBoxAssistGrpc.HttpResEditBoxAssistBlockingStub httpResEditClient) {
        this.name = name;
        this.httpResEditClient = httpResEditClient;
    }

    /**
     * @param creationContext details about the context that is requiring a response editor
     */
    @Override
    public ExtensionProvidedHttpResponseEditor provideHttpResponseEditor(EditorCreationContext creationContext) {
        RawEditor rawEditor = burpApi.userInterface().createRawEditor();  // 创建一个原始编辑器
        rawEditor.setEditable(creationContext.editorMode() != READ_ONLY); //以调用方期望的状态设置 是否可编辑
        this.re = rawEditor;
        return this;
    }


    @Override
    public HttpResponse getResponse() {
        return null;
    }

    /**
     * @param requestResponse The request and response to set in the editor.
     */
    @Override
    public void setRequestResponse(HttpRequestResponse requestResponse) {
        HttpRequest request = requestResponse.request();
        HttpResponse response = requestResponse.response();

        httpReqData req = BurpApiUtensil.HttpRequestTohttpReqData(request);

        httpResData res = BurpApiUtensil.httpResponseTohttpResData(response);

        httpInfo httpInfoX = httpInfo.newBuilder()
                .setInfo(requestResponse.annotations().notes())
                .build();

        httpReqAndRes reqAndRes = httpReqAndRes.newBuilder()
                .setReq(req)
                .setRes(res)
                .setInfo(httpInfoX)
                .build();


        HttpEditBoxData heb = HttpEditBoxData.newBuilder()
                .setName(name)
                .setHttpData(reqAndRes)
                .build();
        ByteData byteData = this.httpResEditClient.resHttpEdit(heb);
        re.setContents(ByteArray.byteArray(byteData.getByteData().toByteArray()));

    }

    @Override
    public boolean isEnabledFor(HttpRequestResponse requestResponse) {
        HttpRequest request = requestResponse.request();
        HttpResponse response = requestResponse.response();


        httpReqData req = BurpApiUtensil.HttpRequestTohttpReqData(request);
        httpResData res = BurpApiUtensil.httpResponseTohttpResData(response);

        httpInfo httpInfoX = httpInfo.newBuilder()
                .setInfo(requestResponse.annotations().notes())
                .build();

        httpReqAndRes reqAndRes = httpReqAndRes.newBuilder()
                .setReq(req)
                .setRes(res)
                .setInfo(httpInfoX)
                .build();


        HttpEditBoxData heb = HttpEditBoxData.newBuilder()
                .setName(name)
                .setHttpData(reqAndRes)
                .build();

        return this.httpResEditClient.isResHttpEditFor(heb).getBoole();
    }


    @Override
    public String caption() {
        return name;
    }

    @Override
    public Component uiComponent() {
        return re.uiComponent();
    }


    @Override
    public Selection selectedData() {
        return null;
    }


    @Override
    public boolean isModified() {
        return false;
    }
}


/**
 * @description: 上下文菜单项提供程序 暂时只提供http的菜单 , webSocket 后续提供
 * @author: cyvk
 * @date: 2023/6/16 上午10:27
 */
class MenuItemsProvider implements ContextMenuItemsProvider {
    MenuInfo conTextMenuItems; // 上下文菜单项

    public MenuItemsProvider(MenuInfo conTextMenuItems) {
        this.conTextMenuItems = conTextMenuItems;
    }

    // 每次右键就会执行该函数用于渲染菜单项
    @Override
    public List<Component> provideMenuItems(ContextMenuEvent event) {

        List<Component> components = new ArrayList<>();

        // 调用 grpc 获取菜单项处理的客户端
        ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client = runAchieve.getMenuItemsProviderClient(conTextMenuItems.getTarGet());

        components.add(new menu(conTextMenuItems.getMenu(), event, client).get());    // 执行渲染并绑定点击事件


        return components;
    }

}

// 菜单
class menu {
    Menu menuListList;

    ContextMenuEvent event;

    ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client;

    public menu(Menu menu, ContextMenuEvent event, ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client) {
        this.menuListList = menu;
        this.client = client;
        this.event = event;
    }


    public Component get() {  // 渲染菜单项
        JMenu jMenu = new JMenu(this.menuListList.getName());

        List<Menu> menuListList1 = this.menuListList.getMenuListList();
        List<MenuItem> menuItemListList = this.menuListList.getMenuItemListList();

        for (Menu menu : menuListList1) {
            jMenu.add(new menu(menu, event, client).get());
        }
        for (MenuItem menuItem : menuItemListList) {  // 菜单项加入
            jMenu.add(new menuItem(menuItem, client, event).get());
        }

        return jMenu;
    }


}

// 菜单项处理类 通过Grpc处理
class menuItem {
    MenuItem menuItem;
    ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client;
    ContextMenuEvent event;

//    String name;

    public menuItem(MenuItem menuItem, ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub client, ContextMenuEvent event) {
        this.event = event;
        this.menuItem = menuItem;
        this.client = client;
    }

    public Component get() {
        JMenuItem jMenuItem = new JMenuItem(this.menuItem.getName());

        jMenuItem.addActionListener(actionEvent -> {   // 点击事件
            if (event.messageEditorRequestResponse().isPresent()) {

                MessageEditorHttpRequestResponse messageEditorHttpRequestResponse = event.messageEditorRequestResponse().get();
                HttpRequest request = messageEditorHttpRequestResponse.requestResponse().request();    // 请求
                HttpResponse response = messageEditorHttpRequestResponse.requestResponse().response(); // 响应

                // 组装一组请求响应 包含注解
                httpReqAndRes httpReqAndResData = BurpApiUtensil.withHttpReqAndRes(request, response, messageEditorHttpRequestResponse.requestResponse().annotations());

                ContextMenuItems.Builder builder = ContextMenuItems.newBuilder()
                        .setName(menuItem.getName())
                        .setHttpReqAndRes(httpReqAndResData);   // 先设置必要属性

                Range range = messageEditorHttpRequestResponse.selectionOffsets().get();     // 选中下标
                if (messageEditorHttpRequestResponse.selectionOffsets().isPresent()) { // 是否有选中数据
                    builder.setIsSelect(true); // 有选中数据
                    SubscriptOffsets subscriptOffsets = SubscriptOffsets.newBuilder()
                            .setStartIndex(range.startIndexInclusive())
                            .setEndIndex(range.endIndexExclusive())
                            .build();

                    builder.setSelectOffsets(subscriptOffsets);    // 设置下标

                    switch (messageEditorHttpRequestResponse.selectionContext()) {
                        case REQUEST -> { // 设置选中数据和来源 只有有选中数据才能返回来源 否则不知道从哪点的
                            byte[] bytes = messageEditorHttpRequestResponse.requestResponse().request().toByteArray().getBytes();
                            builder.setSelectData(ByteString.copyFrom(Arrays.copyOfRange(bytes, range.startIndexInclusive(), range.endIndexExclusive())));
                            builder.setSelectSource(HttpSource.Request); // 设置点击来源
                        }
                        case RESPONSE -> {
                            byte[] bytes = messageEditorHttpRequestResponse.requestResponse().response().toByteArray().getBytes();
                            builder.setSelectData(ByteString.copyFrom(Arrays.copyOfRange(bytes, range.startIndexInclusive(), range.endIndexExclusive())));
                            builder.setSelectSource(HttpSource.Response);  // 设置点击来源
                        }
                    }
                }

                ContextMenuItems contextMenuItems = builder.build();  // 构建上下文请求对象

                MenuItemsReturn menuItemsReturn = client.menuItemsProvider(contextMenuItems);   // 发起Grpc调用

                if (menuItemsReturn.getIsContinue()) { // 继续不做任何处理
                    return;
                }
                if (menuItemsReturn.getIsReviseSelect()) { // 修改选中数据

                    if (range.startIndexInclusive() == 0 && range.endIndexExclusive() == 0) { //
                        return;
                    }

                    switch (messageEditorHttpRequestResponse.selectionContext()) {
                        case REQUEST -> {
                            byte[] req = request.toByteArray().getBytes(); // 请求数据
                            byte[] start = Arrays.copyOfRange(req, 0, range.startIndexInclusive()); // 截止选中前
                            byte[] selectData = menuItemsReturn.getSelectDate().toByteArray();           // 选中数据
                            byte[] end = Arrays.copyOfRange(req, range.endIndexExclusive(), req.length); // 截止选中后

                            int totalLength = start.length + selectData.length + end.length;   // 拿到总长度
                            byte[] newReqData = new byte[totalLength];

                            System.arraycopy(start, 0, newReqData, 0, start.length);
                            System.arraycopy(selectData, 0, newReqData, start.length, selectData.length);
                            System.arraycopy(end, 0, newReqData, start.length + selectData.length, end.length);

                            messageEditorHttpRequestResponse.setRequest(HttpRequest.httpRequest(ByteArray.byteArray(newReqData)));

                        }
                        case RESPONSE -> {
                            byte[] res = response.toByteArray().getBytes(); // 请求数据

                            byte[] start = Arrays.copyOfRange(res, 0, range.startIndexInclusive()); // 截止选中前
                            byte[] selectData = menuItemsReturn.getSelectDate().toByteArray();           // 选中数据
                            byte[] end = Arrays.copyOfRange(res, range.endIndexExclusive(), res.length); // 截止选中后

                            int totalLength = start.length + selectData.length + end.length;   // 拿到总长度
                            byte[] newReqData = new byte[totalLength];

                            // 从组字节流
                            System.arraycopy(start, 0, newReqData, 0, start.length);
                            System.arraycopy(selectData, 0, newReqData, start.length, selectData.length);
                            System.arraycopy(end, 0, newReqData, start.length + selectData.length, end.length);

                            messageEditorHttpRequestResponse.setResponse(HttpResponse.httpResponse(ByteArray.byteArray(newReqData)));

                        }
                    }
                }
                if (menuItemsReturn.getIsReviseReq()) { // 是否修改请求
//                ManGrpcGUI.pluginLog.append("修改请求 \n");
                    HttpRequest httpRequest = HttpRequest.httpRequest(ByteArray.byteArray(menuItemsReturn.getReqData().toByteArray()));
                    messageEditorHttpRequestResponse.setRequest(httpRequest);   // 修改请求
                }

                if (menuItemsReturn.getIsReviseRes()) { // 是否修改响应   BurpAPI中有修改响应的操作但是不可用
//                ManGrpcGUI.pluginLog.append("修改响应 \n");
                    HttpResponse httpResponse = HttpResponse.httpResponse(ByteArray.byteArray(menuItemsReturn.getResData().toByteArray()));
                    messageEditorHttpRequestResponse.setResponse(httpResponse);  // 修改响应
                }
            }
        });

        return jMenuItem;
    }
}

/**
 * @description: 代理请求处理器
 * @author: cyvk
 * @date: 2023/6/19 上午11:27
 */
class ProxyReqHandler implements ProxyRequestHandler {
    ProxyRequestHandlerGrpc.ProxyRequestHandlerBlockingStub client;

    public ProxyReqHandler(ProxyRequestHandlerGrpc.ProxyRequestHandlerBlockingStub client) {
        this.client = client;
    }

    /**
     * @param interceptedRequest An {@link InterceptedRequest} object that extensions can use to query and update details of the request.
     */
    @Override
    public ProxyRequestReceivedAction handleRequestReceived(InterceptedRequest interceptedRequest) {

        httpReqData httpReqData = BurpApiUtensil.HttpRequestTohttpReqData(interceptedRequest);  // 构造 请求数据
        annotationsText annotationsText = BurpApiUtensil.annotationsToannotationsText(interceptedRequest.annotations()); // 构造响应数据

        httpReqGroup httpReqGroup = BurpApiUtensil.buildHttpReqGroup(httpReqData, annotationsText); // 构造请求组

        ProxyRequestAction proxyRequestAction = client.proxyHandleRequestReceived(httpReqGroup);  // 发起Grpc调用

        BurpGrpc.proto.BurpApiGrpc.httpReqGroup httpReqGroup1 = proxyRequestAction.getHttpReqGroup(); // 提取请求组

        Annotations annotations = BurpApiUtensil.annotationsTextToAnnotations(httpReqGroup1.getAnnotationsText()); // 注解 保证永远不为null

        if (proxyRequestAction.getContinue()) {  // 继续不做处理
            return ProxyRequestReceivedAction.continueWith(interceptedRequest, annotations);
        }
        if (proxyRequestAction.getIsReviseReq()) {  // 修改请求
            HttpRequest httpRequest = BurpApiUtensil.httpReqDataTohttpRequest(httpReqGroup1.getHttpReqData());
            return ProxyRequestReceivedAction.continueWith(httpRequest, annotations);
        }
        if (proxyRequestAction.getIsIntercept()) { // 拦截请求在 burp中显示用于二次确认
            HttpRequest httpRequest = BurpApiUtensil.httpReqDataTohttpRequest(httpReqGroup1.getHttpReqData());
            return ProxyRequestReceivedAction.intercept(httpRequest, annotations);
        }
        if (proxyRequestAction.getDrop()) {  // 丢弃请求
            return ProxyRequestReceivedAction.drop();
        }

        return null;

    }

    /**
     * @param interceptedRequest An {@link InterceptedRequest} object that extensions can use to query and update details of the intercepted request.
     */
    @Override
    public ProxyRequestToBeSentAction handleRequestToBeSent(InterceptedRequest interceptedRequest) {
        return null;
    }
}

/**
 * @description: 代理响应处理器 , 不能拦截 不知道什么原因
 * @author: cyvk
 * @date: 2023/6/19 下午5:37
 */
class ProxyResHandler implements ProxyResponseHandler {
    ProxyResponseHandlerGrpc.ProxyResponseHandlerBlockingStub client;

    public ProxyResHandler(ProxyResponseHandlerGrpc.ProxyResponseHandlerBlockingStub client) {
        this.client = client;
    }

    /**
     * @param interceptedResponse An {@link InterceptedResponse} object
     *                            that extensions can use to query and update details of the response, and
     *                            control whether the response should be intercepted and displayed to the
     *                            user for manual review or modification.
     */
    @Override
    public ProxyResponseReceivedAction handleResponseReceived(InterceptedResponse interceptedResponse) {

        httpReqData httpReqData = BurpApiUtensil.HttpRequestTohttpReqData(interceptedResponse.initiatingRequest());
        httpResData httpResData = BurpApiUtensil.httpResponseTohttpResData(interceptedResponse);

        annotationsText annotationsText = BurpApiUtensil.annotationsToannotationsText(interceptedResponse.annotations());

        httpReqAndRes httpReqAndRes = BurpApiUtensil.withHttpReqAndRes(httpReqData, httpResData, annotationsText);

        ProxyResponseAction proxyResponseAction = client.proxyHandleResponseReceived(httpReqAndRes); // 发起Grpc 请求调用

        httpResGroup httpResGroup = proxyResponseAction.getHttpResGroup();   // 获取请求组

        Annotations annotations = BurpApiUtensil.annotationsTextToAnnotations(httpResGroup.getAnnotationsText());  // 注解

        if (proxyResponseAction.getContinue()) {    // 继续不做处理
            return ProxyResponseReceivedAction.continueWith(interceptedResponse, annotations);
        }
        if (proxyResponseAction.getDrop()) {        // 是否丢弃
            return ProxyResponseReceivedAction.drop();
        }

        HttpResponse httpResponse = BurpApiUtensil.httpResDataToHttpResponse(httpResGroup.getHttpResData()); // 格式转换

        if (proxyResponseAction.getIsIntercept()) { // 是否拦截
            return ProxyResponseReceivedAction.intercept(httpResponse, annotations);
        }

        if (proxyResponseAction.getIsReviseRes()) { // 是否修改响应
            return ProxyResponseReceivedAction.continueWith(httpResponse, annotations);
        }
        return null;
    }

    /**
     * @param interceptedResponse An {@link InterceptedResponse} object
     *                            that extensions can use to query and update details of the response.
     */
    @Override
    public ProxyResponseToBeSentAction handleResponseToBeSent(InterceptedResponse interceptedResponse) {
        return null;
    }
}


/**
 * @description: 流量处理器 有请求和响应一起的要放一起 修改请求要自己处理 Content-Length
 * @author: cyvk
 * @date: 2023/6/19 下午5:43
 */
class HttpFlowHandler implements HttpHandler {
    HttpFlowHandlerGrpc.HttpFlowHandlerBlockingStub client;

    public HttpFlowHandler(HttpFlowHandlerGrpc.HttpFlowHandlerBlockingStub client) {
        this.client = client;
    }

    /**
     * @param requestToBeSent information about the HTTP request that is going to be sent.
     */
    @Override
    public RequestToBeSentAction handleHttpRequestToBeSent(HttpRequestToBeSent requestToBeSent) {

        try {


            // 数据转换
            httpReqData httpReqData = BurpApiUtensil.HttpRequestTohttpReqData(requestToBeSent);
            annotationsText annotationsText = BurpApiUtensil.annotationsToannotationsText(requestToBeSent.annotations());
            // 构造请求组
            httpReqGroup httpReqGroup = BurpApiUtensil.buildHttpReqGroup(httpReqData, annotationsText);

            // 发起Grpc 调用
            HttpRequestAction httpRequestAction = client.httpHandleRequestReceived(httpReqGroup);

            // 提取请求组
            BurpGrpc.proto.BurpApiGrpc.httpReqGroup reqGroup = httpRequestAction.getHttpReqGroup();
            // 获取注解
            Annotations annotations = BurpApiUtensil.annotationsTextToAnnotations(reqGroup.getAnnotationsText());

            if (httpRequestAction.getContinue()) { // 继续不做处理
                return RequestToBeSentAction.continueWith(requestToBeSent, annotations);
            }
            if (httpRequestAction.getIsReviseReq()) {  // 修改请求
                // 数据转换
                HttpRequest httpRequest = BurpApiUtensil.httpReqDataTohttpRequest(reqGroup.getHttpReqData());
                return RequestToBeSentAction.continueWith(httpRequest, annotations);
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }

    /**
     * @param responseReceived information about HTTP response that was received.
     */
    @Override
    public ResponseReceivedAction handleHttpResponseReceived(HttpResponseReceived responseReceived) {

        try {

            // 组装一组请求
            httpReqAndRes httpReqAndRes = BurpApiUtensil.withHttpReqAndRes(responseReceived.initiatingRequest(), responseReceived, responseReceived.annotations());

            HttpResponseAction httpResponseAction = client.httpHandleResponseReceived(httpReqAndRes);   // 发起Grpc 请求

            httpResGroup httpResGroup = httpResponseAction.getHttpResGroup();
            Annotations annotations = BurpApiUtensil.annotationsTextToAnnotations(httpResGroup.getAnnotationsText());

            if (httpResponseAction.getContinue()) {     // 继续
                return ResponseReceivedAction.continueWith(responseReceived, annotations);
            }

            if (httpResponseAction.getIsReviseRes()) {  // 修改响应
                HttpResponse httpResponse = BurpApiUtensil.httpResDataToHttpResponse(httpResGroup.getHttpResData());
                return ResponseReceivedAction.continueWith(httpResponse, annotations);
            }
        } catch (Exception e) {
            return null;
        }
        return null;
    }
}




























