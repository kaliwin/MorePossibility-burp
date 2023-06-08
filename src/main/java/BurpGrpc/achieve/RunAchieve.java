package BurpGrpc.achieve;


import BurpGrpc.BurpServer.BurpServer;
import BurpGrpc.proto.BurpApiGrpc.BurpServerGrpc;
import BurpGrpc.proto.BurpApiGrpc.IntruderServerGrpc;
import BurpGrpc.proto.BurpApiGrpc.Str;
import BurpGrpc.proto.BurpApiGrpc.httpReqAndRes;
import UI.ManGrpcGUI;
import burp.MorePossibility;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.OkHttpServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;

/**
 * @description: 实现类用于构建Grpc通信连接和管理提供监听服务注册客户端和卸载操作
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
    public void startServer(int port) {
        OkHttpServerBuilder okHttpServerBuilder = OkHttpServerBuilder.forPort(port, InsecureServerCredentials.create());
        Server grpcServer = okHttpServerBuilder.addService(new BurpServer()).build();

        try {
            grpcServer.start();
        } catch (IOException e) {
//            MorePossibility.logging.error().println("错误: ");
//            MorePossibility.logging.error().println(e);
            ManGrpcGUI.pluginLog.append("错误: " + e + "\n");

            throw new RuntimeException(e);
        }
        this.grpcServer = grpcServer;
    }


    /**
     * @description: 关闭grpc服务
     * @author: cyvk
     * @date: 2023/5/30 下午2:38
     */
    public void stopServer() {
        this.grpcServer.shutdownNow();
    }


    /**
     * @param target: 目标 "127.0.0.1:9525"
     * @return BurpServerGrpc.BurpServerStub 获取BurpServer的客户端API,用于burp调用远程函数
     * @description: 连接远程Grpc服务器获取客户端API
     * @author: cyvk
     * @date: 2023/5/30 上午11:44
     */
    public BurpServerGrpc.BurpServerStub getClient(String target) {
        return BurpServerGrpc.newStub(OkHttpChannelBuilder.forTarget(target).usePlaintext().build());
    }

    /**
     * @param target: 目标地址 "127.0.0.1:9525"
     * @return BurpGrpc.proto.BurpApiGrpc.IntruderServerGrpc.IntruderServerStub  操作类,用于调用远程rpc函数
     * @description: 连接远程Grpc服务器获取迭代器客户端API 调用处理和生成两个函数
     * @author: cyvk
     * @date: 2023/5/30 下午2:32
     */
    public IntruderServerGrpc.IntruderServerBlockingStub getIntruderClient(String target) {
        return IntruderServerGrpc.newBlockingStub(OkHttpChannelBuilder.forTarget(target).usePlaintext().build());
    }


    /**
     * @param target: 目标Grpc 地址
     * @return boolean  是否注册成功
     * @description: 主动发起调用通过客户端流完成流量镜像
     * @author: cyvk
     * @date: 2023/6/8 下午3:05
     */
    public boolean getRealTimeTrafficMirroring(String target,String name) {

        BurpServerGrpc.BurpServerStub burpServerStub = BurpServerGrpc.newStub(OkHttpChannelBuilder.forTarget(target).usePlaintext().build());
        StreamObserver<httpReqAndRes> httpReqAndResStreamObserver = burpServerStub.realTimeTrafficMirroring(new StreamObserver<Str>() {
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

}
