package BurpGrpc.BurpServer;

import BurpGrpc.proto.BurpApiGrpc.*;
import io.grpc.stub.StreamObserver;

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
//        logging.output().println("接收到实时流量镜像请求: " + request.getName());

        pluginLog.append("接收到实时流量镜像请求: " + request.getName() + "\n");

        if (burpApiTool.realTimeTrafficMirroring(request.getName(), responseObserver)) {
//            logging.output().println("实时流量注册成功");
            pluginLog.append("实时流量注册成功" + "\n");
        }
        ;
    }
}

