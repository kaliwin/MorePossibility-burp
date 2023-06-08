package BurpGrpc.BurpServer;


import BurpGrpc.proto.BurpApiGrpc.Boole;
import BurpGrpc.proto.BurpApiGrpc.EditBoxAssistGrpc;
import BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair;
import io.grpc.stub.StreamObserver;


/**
 * @description: http编辑器辅助实现类,burp将会监听端口对外开放服务
 * @author: cyvk
 * @date: 2023/6/8 下午4:14
 */
public class EditBoxAssistServer extends EditBoxAssistGrpc.EditBoxAssistImplBase {


    /**
     * @description: 添加http键值对 ,并提供url作用域
     * @author: cyvk
     * @param request
     * @param responseObserver
     */
    @Override
    public void addHttpKeyValuePair(httpKeyValuePair request, StreamObserver<Boole> responseObserver) {





        super.addHttpKeyValuePair(request, responseObserver);
    }
}






























