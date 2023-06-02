package BurpGrpc.achieve;


import BurpGrpc.BurpServer.BurpServer;
import BurpGrpc.proto.BurpApiGrpc.*;
import burp.MorePossibility;
import io.grpc.InsecureServerCredentials;
import io.grpc.Server;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.okhttp.OkHttpServerBuilder;

import java.io.IOException;

/**
 * @description: 实现类用于构建Grpc通信连接和管理提供监听服务注册客户端和卸载操作
 * @author: cyvk
 * @date: 2023/5/30 下午12:03
 */
public class RunAchieve {
    public Server grpcServer; //服务端
//    public BurpServerGrpc.BurpServerStub grpcClient;  // 客户端API
    /**
     * @param port: 监听端口 并启动服务
     * @description: 启动Grpc服务端, 开始监听端口,将BurpGrpc.BurpServer.BurpServer类作为rpc服务的实现类
     *      只能监听一个端口多个服务由该函数一并开启
     * @author: cyvk
     * @date: 2023/5/29 下午2:14
     */
    public void startServer(int port) {
        OkHttpServerBuilder okHttpServerBuilder = OkHttpServerBuilder.forPort(port, InsecureServerCredentials.create());
        Server grpcServer = okHttpServerBuilder.addService(new BurpServer()).build();

        try {
            grpcServer.start();
        } catch (IOException e) {
            MorePossibility.logging.error().println("错误: ");
            MorePossibility.logging.error().println(e);
            throw new RuntimeException(e);
        }
        this.grpcServer = grpcServer;
    }


    /**
     * @description: 关闭grpc服务
     * @author: cyvk
     * @date: 2023/5/30 下午2:38
     */
    public void stopServer(){
        this.grpcServer.shutdownNow();
    }


    /**
     * @description: 连接远程Grpc服务器获取客户端API
     * @param target:  目标 "127.0.0.1:9525"
     * @return BurpServerGrpc.BurpServerStub 获取BurpServer的客户端API,用于burp调用远程函数
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
    public IntruderServerGrpc.IntruderServerBlockingStub getIntruderClient(String target){
        return IntruderServerGrpc.newBlockingStub(OkHttpChannelBuilder.forTarget(target).usePlaintext().build());
    }



}
