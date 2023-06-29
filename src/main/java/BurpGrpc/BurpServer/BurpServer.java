package BurpGrpc.BurpServer;

import BurpGrpc.proto.BurpApiGrpc.*;
import UI.GrpcServerGUI;
import UI.ManGrpcGUI;
import burp.BurpApiUtensil;
import burp.BurpServerTypeX;
import burp.MorePossibility;
import burp.api.montoya.proxy.ProxyHttpRequestResponse;
import io.grpc.stub.StreamObserver;

import java.util.List;

import static UI.ManGrpcGUI.pluginLog;
import static burp.MorePossibility.burpApiTool;

/**
 * BurpGrpc 服务实现
 *
 * @author cyvk
 */
public class BurpServer extends BurpServerGrpc.BurpServerImplBase {

    /**
     * <pre>
     * 注册实时流量传输
     * burp将主动建立连接通过客户端流进行实时流量镜像
     * </pre>
     */
    @Override
    public void registerRealTimeTrafficMirroring(Str request, StreamObserver<httpReqAndRes> responseObserver) {

        pluginLog.append("接收到实时流量镜像请求: " + request.getName() + "\n");

        if (burpApiTool.realTimeTrafficMirroring(request.getName(), responseObserver)) {
            pluginLog.append("实时流量注册成功" + "\n");
        }
    }


    /**
     * @description: 服务注册 提供API让程序快速注册
     * @author: cyvk
     * @date: 2023/6/25 下午3:59
     */

    public boolean registerServer(serviceRegisterRouting routing) {
        String name = routing.getName();
        String grpcAddress = routing.getGrpcAddress();
        serverTypeName serverType = routing.getServerType();
        BurpServerTypeX burpServerTypeX = BurpServerTypeX.valueOf(serverType.name()); // 枚举类型转换

        return GrpcServerGUI.registerServer(name, grpcAddress, burpServerTypeX);// 调用注册函数
    }


    /**
     * @description: 一建注册服务 Burp 提供API允许第三方注册多个服务  只要有一个注册失败就会返回false
     * 但是 注册成功的服务不会卸载  只有全部注册成功才会返回 true
     * @author: cyvk
     * @date: 2023/6/25 下午6:10
     */
    @Override
    public void registerServerList(serviceRegisterRoutingList request, StreamObserver<processingStatus> responseObserver) {

        List<serviceRegisterRouting> serviceListList = request.getServiceListList();

        boolean result = true;

        for (serviceRegisterRouting serviceRegisterRouting : serviceListList) {
            if (!registerServer(serviceRegisterRouting)) {
                result = false;
            }
        }
        processingStatus build = processingStatus.newBuilder()
                .setBoole(result).build();

        responseObserver.onNext(build);
        responseObserver.onCompleted();
    }


    /**
     * @param request:          占位
     * @param responseObserver: 响应
     * @description: 获取代理历史请求 全部无过滤  使用外网服务器的注意带宽堵塞 最大限制500MB
     * @author: cyvk
     * @date: 2023/6/27 下午4:34
     */
    @Override
    public void getProxyHistory(Str request, StreamObserver<ProxyHistoryData> responseObserver) {

        pluginLog.append("调用Proxy历史流量\n");

        List<ProxyHttpRequestResponse> history = MorePossibility.burpApi.proxy().history();

        ProxyHistoryData.Builder builder = ProxyHistoryData.newBuilder();

        try {
            for (ProxyHttpRequestResponse proxyHttpRequestResponse : history) {
                httpReqAndRes httpReqAndRes = BurpApiUtensil.withHttpReqAndRes(proxyHttpRequestResponse.finalRequest(), proxyHttpRequestResponse.originalResponse(), proxyHttpRequestResponse.annotations());
                builder.addHttpReqAndResData(httpReqAndRes);
            }

            responseObserver.onNext(builder.build());
            responseObserver.onCompleted();
        }catch (Exception e){
            ManGrpcGUI.consoleLog.append("异常 : "+e+"\n");
        }
    }
}





















