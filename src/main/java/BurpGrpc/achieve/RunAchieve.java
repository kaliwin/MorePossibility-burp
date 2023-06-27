package BurpGrpc.achieve;


import BurpGrpc.BurpServer.BurpServer;
import BurpGrpc.proto.BurpApiGrpc.*;
import UI.ManGrpcGUI;
import burp.MorePossibility;
import io.grpc.InsecureServerCredentials;
import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.OkHttpServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

/**
 * @description: 该类用于构建Grpc通信, 服务端 / 客户端
 * @author: cyvk
 * @date: 2023/5/30 下午12:03
 */
public class RunAchieve {
    public Server grpcServer; //服务端

    public RunAchieve() {


    }


//    public BurpServerGrpc.BurpServerStub grpcClient;  // 客户端API

    /**
     * @param port: 监听端口 并启动服务
     * @description: 启动Grpc服务端, 开始监听端口,将BurpGrpc.BurpServer.BurpServer类作为rpc服务的实现类
     * 只能监听一个端口多个服务由该函数一并开启
     * @author: cyvk
     * @date: 2023/5/29 下午2:14
     */
    public boolean startServer(int port) {

        if (this.grpcServer != null) {
            if (!this.grpcServer.isShutdown()) {
                ManGrpcGUI.consoleLog.append("[-] 服务正在运行请先关闭原服务才能开启新服务  服务端口" + this.grpcServer.getPort() + "\n");
                return false;
            }
        }

        OkHttpServerBuilder okHttpServerBuilder = OkHttpServerBuilder.forPort(port, InsecureServerCredentials.create());
        Server grpcServer = okHttpServerBuilder.addService(new BurpServer()).build();
        try {
            grpcServer.start();
            this.grpcServer = grpcServer;
            return true;
        } catch (IOException e) {
            ManGrpcGUI.pluginLog.append("[-] 错误: " + e + "\n");
//            throw new RuntimeException(e);
            return false;
        }

    }


    /**
     * @description: 关闭grpc服务
     * @author: cyvk
     * @date: 2023/5/30 下午2:38
     */
    public void stopServer() {
        if (grpcServer != null) {
            this.grpcServer.shutdownNow();
        }
    }


    public static ManagedChannel getChannel(String target) {
        return OkHttpChannelBuilder.forTarget(target).usePlaintext().build();
    }


    /**
     * @param target: 目标 "127.0.0.1:9525"
     * @return BurpServerGrpc.BurpServerStub 获取BurpServer的客户端API,用于burp调用远程函数
     * @description: 连接远程Grpc服务器获取客户端API
     * @author: cyvk
     * @date: 2023/5/30 上午11:44
     */
    public BurpServerGrpc.BurpServerStub getClient(String target) {
        return BurpServerGrpc.newStub(getChannel(target));
    }

    /**
     * @param target: 目标地址 "127.0.0.1:9525"
     * @return BurpGrpc.proto.BurpApiGrpc.IntruderServerGrpc.IntruderServerStub  操作类,用于调用远程rpc函数
     * @description: 迭代处理器
     * @author: cyvk
     * @date: 2023/5/30 下午2:32
     */
    public IntruderPayloadProcessorServerGrpc.IntruderPayloadProcessorServerBlockingStub getIntruderProcessorClient(String target) {
        return IntruderPayloadProcessorServerGrpc.newBlockingStub(getChannel(target));
    }

    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.IntruderPayloadGeneratorServerGrpc.IntruderPayloadGeneratorServerBlockingStub
     * @description: 迭代生成器
     * @author: cyvk
     * @date: 2023/6/25 下午2:46
     */
    public IntruderPayloadGeneratorServerGrpc.IntruderPayloadGeneratorServerBlockingStub getIntruderGeneratorClient(String target) {
        return IntruderPayloadGeneratorServerGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: 目标Grpc 地址
     * @return boolean  是否注册成功
     * @description: 主动发起调用通过客户端流完成流量镜像
     * @author: cyvk
     * @date: 2023/6/8 下午3:05
     */
    public boolean getRealTimeTrafficMirroring(String target, String name) {

        BurpServerGrpc.BurpServerStub burpServerStub = BurpServerGrpc.newStub(getChannel(target));
        StreamObserver<httpReqAndRes> httpReqAndResStreamObserver = burpServerStub.realTimeTrafficMirroring(new StreamObserver<>() {
            @Override
            public void onNext(Str value) {
                ManGrpcGUI.consoleLog.append(Str.getDefaultInstance().getName());
            }

            @Override
            public void onError(Throwable t) {
                ManGrpcGUI.consoleLog.append("异常: " + t.toString() + "\n");
            }

            @Override
            public void onCompleted() {
                ManGrpcGUI.consoleLog.append("实时镜像调用结束" + "\n");
            }
        });
        return MorePossibility.burpApiTool.realTimeTrafficMirroring(name, httpReqAndResStreamObserver);
    }


    /**
     * @param target: 目标地址
     * @return BurpGrpc.proto.BurpApiGrpc.HttpReqEditBoxAssistGrpc.HttpReqEditBoxAssistBlockingStub
     * @description: http请求编辑框
     * @author: cyvk
     * @date: 2023/6/11 下午4:05
     */
    public HttpReqEditBoxAssistGrpc.HttpReqEditBoxAssistBlockingStub getHttpReqEditClient(String target) {
        return HttpReqEditBoxAssistGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.HttpResEditBoxAssistGrpc.HttpResEditBoxAssistBlockingStub
     * @description: http响应编辑框
     * @author: cyvk
     * @date: 2023/6/11 下午6:01
     */
    public HttpResEditBoxAssistGrpc.HttpResEditBoxAssistBlockingStub getHttpResEditClient(String target) {
        return HttpResEditBoxAssistGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.GetConTextMenuItemsServerGrpc.GetConTextMenuItemsServerBlockingStub
     * @description: 获取菜单项
     * @author: cyvk
     * @date: 2023/6/16 下午4:15
     */
    public GetConTextMenuItemsServerGrpc.GetConTextMenuItemsServerBlockingStub getConTextMenuItemsServer(String target) {
        return GetConTextMenuItemsServerGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub
     * @description: 获取菜单项处理客户端
     * @author: cyvk
     * @date: 2023/6/16 下午4:17
     */
    public ContextMenuItemsProviderGrpc.ContextMenuItemsProviderBlockingStub getMenuItemsProviderClient(String target) {
        return ContextMenuItemsProviderGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.ProxyRequestHandlerGrpc.ProxyRequestHandlerBlockingStub
     * @description: 获取代理请求处理器
     * @author: cyvk
     * @date: 2023/6/19 上午11:31
     */
    public ProxyRequestHandlerGrpc.ProxyRequestHandlerBlockingStub getProxyRequestHandlerClient(String target) {
        return ProxyRequestHandlerGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc 地址
     * @return BurpGrpc.proto.BurpApiGrpc.ProxyResponseHandlerGrpc.ProxyResponseHandlerBlockingStub
     * @description: 获取代理响应处理器
     * @author: cyvk
     * @date: 2023/6/19 下午2:39
     */
    public ProxyResponseHandlerGrpc.ProxyResponseHandlerBlockingStub getProxyResponseHandlerClient(String target) {
        return ProxyResponseHandlerGrpc.newBlockingStub(getChannel(target));
    }


    /**
     * @param target: grpc地址
     * @return BurpGrpc.proto.BurpApiGrpc.HttpRequestHandlerGrpc.HttpRequestHandlerBlockingStub
     * @description: http 请求流量处理器
     * @author: cyvk
     * @date: 2023/6/19 下午5:31
     */
    public HttpFlowHandlerGrpc.HttpFlowHandlerBlockingStub getHttpFlowHandlerClient(String target) {
        return HttpFlowHandlerGrpc.newBlockingStub(getChannel(target));
    }

}
























