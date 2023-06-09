package burp;

import BurpGrpc.proto.BurpApiGrpc.*;
import UI.ManGrpcGUI;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.Registration;
import burp.api.montoya.http.handler.*;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.intruder.*;
import burp.api.montoya.ui.Selection;
import burp.api.montoya.ui.editor.RawEditor;
import burp.api.montoya.ui.editor.extension.EditorCreationContext;
import burp.api.montoya.ui.editor.extension.ExtensionProvidedHttpRequestEditor;
import burp.api.montoya.ui.editor.extension.HttpRequestEditorProvider;
import com.google.common.collect.TreeBasedTable;
import com.google.protobuf.ByteString;
import io.grpc.stub.StreamObserver;

import java.awt.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static burp.BurpServerTypeX.INTRUDER_GENERATE;
import static burp.MorePossibility.*;
import static burp.api.montoya.ui.editor.extension.EditorMode.READ_ONLY;


/**
 * @description: burpApi工具类 提供与grpc服务的对接,包括各个burp服务注册卸载 API
 * @author: cyvk
 * @date: 2023/5/29 下午12:28
 */
public class BurpApiTool {

    //    HashMap<String, Registration> serverRegistration; // 服务注册的映射关系
    TreeBasedTable<String, BurpServerTypeX, Registration> serverRegistrationStatus;  // 服务注册状态,结构:名字 服务类型 注册状态


    public BurpApiTool() {
        this.serverRegistrationStatus = TreeBasedTable.create();

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
                IntruderServerGrpc.IntruderServerBlockingStub intruderClient = MorePossibility.runAchieve.getIntruderClient(target);
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
                IntruderServerGrpc.IntruderServerBlockingStub intruderClient = runAchieve.getIntruderClient(target);
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
     * @description: 初始化http明文密文键值对编辑器,用于初始化ui由RunAchieve初始化时调用,会自动匹配信息中心中的明密简直对
     * @author: cyvk
     * @date: 2023/6/8 下午4:31
     */
    public void initRegisterHttpEditorKeyValue() {




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
            case INTRUDER_GENERATE -> {  // 迭代生成器
                return registerIntruderGeneratorPayload(target, name);
            }
            case INTRUDER_PROCESSOR -> {    // 迭代处理器
                return registerIntruderPayloadProcessor(target, name);
            }
            case REAL_TIME_TRAFFIC_MIRRORING -> {  // 实时流量镜像
                return realTimeTrafficMirroring(target, name);
            }

            case HTTP_EDITOR_KEY_VALUE -> { // http键值对 需要

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


        //请求
        String reqUrl = responseReceived.initiatingRequest().url();
        String httpVersion = responseReceived.httpVersion();
        int reqBodyOff = responseReceived.initiatingRequest().bodyOffset();
        byte[] reqByte = responseReceived.initiatingRequest().toByteArray().getBytes();

        //响应
        byte[] resByte = responseReceived.toByteArray().getBytes();
        int resBodyOff = responseReceived.bodyOffset();
        short resStatus = responseReceived.statusCode();

        //组装请求结构
        httpReqData req = httpReqData.newBuilder().setData(ByteString.copyFrom(reqByte)).setBodyIndex(reqBodyOff).setHttpVersion(httpVersion).setUrl(reqUrl).build();

        //组装响应结构
        httpResData res = httpResData.newBuilder().setData(ByteString.copyFrom(resByte)).setBodyIndex(resBodyOff).setStatusCode(resStatus).build();

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
    IntruderServerGrpc.IntruderServerBlockingStub intruderServer;
    String name;

    public intruderDemo(IntruderServerGrpc.IntruderServerBlockingStub intruderServer, String name) {
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
    IntruderServerGrpc.IntruderServerBlockingStub intruderServer;
    IntruderGeneratorData.Builder intruderGeneratorData;

    public intruderGenerate(String name, IntruderServerGrpc.IntruderServerBlockingStub intruderServer) {
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
            ByteData byteData = intruderServer.intruderPayloadGeneratorProvider(intruderGeneratorData.build());
            String str = new String(byteData.getByteData().toByteArray());

            if (str.contains("ggc_end")) {    // 匹配结束符
                return GeneratedPayload.end();
            }

            return GeneratedPayload.payload(ByteArray.byteArray(byteData.getByteData().toByteArray()));

        } catch (Exception e) {
            ManGrpcGUI.pluginLog.append("异常：" + e + "\n");

        }
        return GeneratedPayload.end();
    }
}


/**
 * @description: 初始化键值对编辑器
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


    }

    /**
     * @param requestResponse The {@link HttpRequestResponse} to check.
     *                        该函数决定是否要显示渲染编辑器
     */
    @Override
    public boolean isEnabledFor(HttpRequestResponse requestResponse) {

        // 判断是否有信息
        return  webInformationProcessingCenter.isInfo(requestResponse.url());
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

























