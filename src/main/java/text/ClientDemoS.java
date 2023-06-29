package text;


import BurpGrpc.proto.BurpApiGrpc.BurpServerGrpc;
import BurpGrpc.proto.BurpApiGrpc.Str;
import BurpGrpc.proto.BurpApiGrpc.httpInfo;
import BurpGrpc.proto.BurpApiGrpc.httpReqAndRes;
import io.grpc.ManagedChannel;
import io.grpc.okhttp.OkHttpChannelBuilder;
import io.grpc.stub.StreamObserver;

/**
 * @author cyvk
 */
public class ClientDemoS {


    public static void main(String[] args) throws InterruptedException {

//
//
//        BurpServerGrpc.BurpServerStub burpServerStub = BurpServerGrpc.newStub(build);
//
//        StreamObserver<httpReqAndRes> httpReqAndResStreamObserver = burpServerStub.realTimeTrafficMirroring(new StreamObserver<Str>() {
//            @Override
//            public void onNext(Str value) {
//                System.out.println("结束");
//            }
//
//            @Override
//            public void onError(Throwable t) {
//
//            }
//
//            @Override
//            public void onCompleted() {
//                System.out.println("结束");
//            }
//        });
//
//        for (int i = 0; i < 30; i++) {
//            httpInfo build1 = httpInfo.newBuilder().setId(i).build();
//            httpReqAndRes data = httpReqAndRes.newBuilder().setInfo(build1).build();
//            httpReqAndResStreamObserver.onNext(data);
//        }
//        httpReqAndResStreamObserver.onCompleted();
//
//
//        Thread.sleep(100000);
//        ManagedChannel build = OkHttpChannelBuilder.forTarget("127.0.0.1:9525").usePlaintext().build();


    }

}
