package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 实时流量镜像
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RealTimeTrafficMirroringGrpc {

  private RealTimeTrafficMirroringGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BurpMorePossibilityApi.RealTimeTrafficMirroring";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
      BurpGrpc.proto.BurpApiGrpc.Str> getRealTimeTrafficMirroringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RealTimeTrafficMirroring",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
      BurpGrpc.proto.BurpApiGrpc.Str> getRealTimeTrafficMirroringMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.Str> getRealTimeTrafficMirroringMethod;
    if ((getRealTimeTrafficMirroringMethod = RealTimeTrafficMirroringGrpc.getRealTimeTrafficMirroringMethod) == null) {
      synchronized (RealTimeTrafficMirroringGrpc.class) {
        if ((getRealTimeTrafficMirroringMethod = RealTimeTrafficMirroringGrpc.getRealTimeTrafficMirroringMethod) == null) {
          RealTimeTrafficMirroringGrpc.getRealTimeTrafficMirroringMethod = getRealTimeTrafficMirroringMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.Str>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RealTimeTrafficMirroring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setSchemaDescriptor(new RealTimeTrafficMirroringMethodDescriptorSupplier("RealTimeTrafficMirroring"))
              .build();
        }
      }
    }
    return getRealTimeTrafficMirroringMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RealTimeTrafficMirroringStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringStub>() {
        @java.lang.Override
        public RealTimeTrafficMirroringStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RealTimeTrafficMirroringStub(channel, callOptions);
        }
      };
    return RealTimeTrafficMirroringStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RealTimeTrafficMirroringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringBlockingStub>() {
        @java.lang.Override
        public RealTimeTrafficMirroringBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RealTimeTrafficMirroringBlockingStub(channel, callOptions);
        }
      };
    return RealTimeTrafficMirroringBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RealTimeTrafficMirroringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RealTimeTrafficMirroringFutureStub>() {
        @java.lang.Override
        public RealTimeTrafficMirroringFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RealTimeTrafficMirroringFutureStub(channel, callOptions);
        }
      };
    return RealTimeTrafficMirroringFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 实时流量镜像
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *实时流量传输
     *burp将主动建立连接通过客户端流进行实时流量镜像
     * </pre>
     */
    default io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> realTimeTrafficMirroring(
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Str> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRealTimeTrafficMirroringMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service RealTimeTrafficMirroring.
   * <pre>
   * 实时流量镜像
   * </pre>
   */
  public static abstract class RealTimeTrafficMirroringImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RealTimeTrafficMirroringGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service RealTimeTrafficMirroring.
   * <pre>
   * 实时流量镜像
   * </pre>
   */
  public static final class RealTimeTrafficMirroringStub
      extends io.grpc.stub.AbstractAsyncStub<RealTimeTrafficMirroringStub> {
    private RealTimeTrafficMirroringStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RealTimeTrafficMirroringStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RealTimeTrafficMirroringStub(channel, callOptions);
    }

    /**
     * <pre>
     *实时流量传输
     *burp将主动建立连接通过客户端流进行实时流量镜像
     * </pre>
     */
    public io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> realTimeTrafficMirroring(
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Str> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRealTimeTrafficMirroringMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service RealTimeTrafficMirroring.
   * <pre>
   * 实时流量镜像
   * </pre>
   */
  public static final class RealTimeTrafficMirroringBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RealTimeTrafficMirroringBlockingStub> {
    private RealTimeTrafficMirroringBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RealTimeTrafficMirroringBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RealTimeTrafficMirroringBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service RealTimeTrafficMirroring.
   * <pre>
   * 实时流量镜像
   * </pre>
   */
  public static final class RealTimeTrafficMirroringFutureStub
      extends io.grpc.stub.AbstractFutureStub<RealTimeTrafficMirroringFutureStub> {
    private RealTimeTrafficMirroringFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RealTimeTrafficMirroringFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RealTimeTrafficMirroringFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_REAL_TIME_TRAFFIC_MIRRORING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REAL_TIME_TRAFFIC_MIRRORING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.realTimeTrafficMirroring(
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Str>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRealTimeTrafficMirroringMethod(),
          io.grpc.stub.ServerCalls.asyncClientStreamingCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
              BurpGrpc.proto.BurpApiGrpc.Str>(
                service, METHODID_REAL_TIME_TRAFFIC_MIRRORING)))
        .build();
  }

  private static abstract class RealTimeTrafficMirroringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RealTimeTrafficMirroringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RealTimeTrafficMirroring");
    }
  }

  private static final class RealTimeTrafficMirroringFileDescriptorSupplier
      extends RealTimeTrafficMirroringBaseDescriptorSupplier {
    RealTimeTrafficMirroringFileDescriptorSupplier() {}
  }

  private static final class RealTimeTrafficMirroringMethodDescriptorSupplier
      extends RealTimeTrafficMirroringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    RealTimeTrafficMirroringMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RealTimeTrafficMirroringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RealTimeTrafficMirroringFileDescriptorSupplier())
              .addMethod(getRealTimeTrafficMirroringMethod())
              .build();
        }
      }
    }
    return result;
  }
}
