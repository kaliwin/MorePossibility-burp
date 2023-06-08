package BurpGrpc.BurpServer;

import BurpGrpc.proto.BurpApiGrpc.ScoutServerGrpc;
import BurpGrpc.proto.BurpApiGrpc.Status;
import BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue;
import io.grpc.stub.StreamObserver;

// 侦查类实现
public class scoutServer extends ScoutServerGrpc.ScoutServerImplBase {


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
