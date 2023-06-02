package BurpGrpc.BurpServer;

import BurpGrpc.proto.BurpApiGrpc.*;
import io.grpc.stub.StreamObserver;

import static burp.MorePossibility.burpApiTool;
import static burp.MorePossibility.logging;

/**
 * BurpGrpc 服务实现
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
        logging.output().println("接收到实时流量镜像请求: " + request.getName());
        if (burpApiTool.realTimeTrafficMirroring(request, responseObserver)){
            logging.output().println("实时流量注册成功");
        };
    }
}

// 侦查类实现
class scoutServer extends ScoutServerGrpc.ScoutServerImplBase {


    /**
     * @param request:          编辑器名称、键值对
     * @param responseObserver: 响应流 返回操作状态是否添加成功
     * @description: 添加http编辑器键值对, 用于替换原有内容
     * @author: cyvk
     * @date: 2023/5/31 下午4:55
     */
    @Override
    public void addHttpEditorEncryptAndDecryptKeyValue(httpEditorKeyValue request, StreamObserver<Status> responseObserver) {

    }

}