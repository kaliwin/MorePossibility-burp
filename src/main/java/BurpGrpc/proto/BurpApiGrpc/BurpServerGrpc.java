package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *burpApi服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BurpServerGrpc {

  private BurpServerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.BurpServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getRegisterRealTimeTrafficMirroringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterRealTimeTrafficMirroring",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getRegisterRealTimeTrafficMirroringMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getRegisterRealTimeTrafficMirroringMethod;
    if ((getRegisterRealTimeTrafficMirroringMethod = BurpServerGrpc.getRegisterRealTimeTrafficMirroringMethod) == null) {
      synchronized (BurpServerGrpc.class) {
        if ((getRegisterRealTimeTrafficMirroringMethod = BurpServerGrpc.getRegisterRealTimeTrafficMirroringMethod) == null) {
          BurpServerGrpc.getRegisterRealTimeTrafficMirroringMethod = getRegisterRealTimeTrafficMirroringMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterRealTimeTrafficMirroring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setSchemaDescriptor(new BurpServerMethodDescriptorSupplier("RegisterRealTimeTrafficMirroring"))
              .build();
        }
      }
    }
    return getRegisterRealTimeTrafficMirroringMethod;
  }

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
    if ((getRealTimeTrafficMirroringMethod = BurpServerGrpc.getRealTimeTrafficMirroringMethod) == null) {
      synchronized (BurpServerGrpc.class) {
        if ((getRealTimeTrafficMirroringMethod = BurpServerGrpc.getRealTimeTrafficMirroringMethod) == null) {
          BurpServerGrpc.getRealTimeTrafficMirroringMethod = getRealTimeTrafficMirroringMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.Str>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RealTimeTrafficMirroring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setSchemaDescriptor(new BurpServerMethodDescriptorSupplier("RealTimeTrafficMirroring"))
              .build();
        }
      }
    }
    return getRealTimeTrafficMirroringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.Status> getRegisterServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterServer",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.Status.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.Status> getRegisterServerMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.Status> getRegisterServerMethod;
    if ((getRegisterServerMethod = BurpServerGrpc.getRegisterServerMethod) == null) {
      synchronized (BurpServerGrpc.class) {
        if ((getRegisterServerMethod = BurpServerGrpc.getRegisterServerMethod) == null) {
          BurpServerGrpc.getRegisterServerMethod = getRegisterServerMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.Status>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Status.getDefaultInstance()))
              .setSchemaDescriptor(new BurpServerMethodDescriptorSupplier("RegisterServer"))
              .build();
        }
      }
    }
    return getRegisterServerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BurpServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpServerStub>() {
        @java.lang.Override
        public BurpServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpServerStub(channel, callOptions);
        }
      };
    return BurpServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BurpServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpServerBlockingStub>() {
        @java.lang.Override
        public BurpServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpServerBlockingStub(channel, callOptions);
        }
      };
    return BurpServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BurpServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpServerFutureStub>() {
        @java.lang.Override
        public BurpServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpServerFutureStub(channel, callOptions);
        }
      };
    return BurpServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static abstract class BurpServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *注册实时流量传输
     *burp将监听端口通过服务端端流进行实时流量镜像
     * </pre>
     */
    public void registerRealTimeTrafficMirroring(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterRealTimeTrafficMirroringMethod(), responseObserver);
    }

    /**
     * <pre>
     *实时流量传输
     *burp将主动建立连接通过客户端流进行实时流量镜像
     * </pre>
     */
    public io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> realTimeTrafficMirroring(
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Str> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRealTimeTrafficMirroringMethod(), responseObserver);
    }

    /**
     * <pre>
     * 注册服务
     * 服务注册 主动向burp发起请求进行注册服务
     * </pre>
     */
    public void registerServer(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Status> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterRealTimeTrafficMirroringMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.Str,
                BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>(
                  this, METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING)))
          .addMethod(
            getRealTimeTrafficMirroringMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
                BurpGrpc.proto.BurpApiGrpc.Str>(
                  this, METHODID_REAL_TIME_TRAFFIC_MIRRORING)))
          .addMethod(
            getRegisterServerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.Str,
                BurpGrpc.proto.BurpApiGrpc.Status>(
                  this, METHODID_REGISTER_SERVER)))
          .build();
    }
  }

  /**
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpServerStub extends io.grpc.stub.AbstractAsyncStub<BurpServerStub> {
    private BurpServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpServerStub(channel, callOptions);
    }

    /**
     * <pre>
     *注册实时流量传输
     *burp将监听端口通过服务端端流进行实时流量镜像
     * </pre>
     */
    public void registerRealTimeTrafficMirroring(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getRegisterRealTimeTrafficMirroringMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * 注册服务
     * 服务注册 主动向burp发起请求进行注册服务
     * </pre>
     */
    public void registerServer(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Status> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<BurpServerBlockingStub> {
    private BurpServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *注册实时流量传输
     *burp将监听端口通过服务端端流进行实时流量镜像
     * </pre>
     */
    public java.util.Iterator<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> registerRealTimeTrafficMirroring(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getRegisterRealTimeTrafficMirroringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 注册服务
     * 服务注册 主动向burp发起请求进行注册服务
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.Status registerServer(BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServerMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpServerFutureStub extends io.grpc.stub.AbstractFutureStub<BurpServerFutureStub> {
    private BurpServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 注册服务
     * 服务注册 主动向burp发起请求进行注册服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.Status> registerServer(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING = 0;
  private static final int METHODID_REGISTER_SERVER = 1;
  private static final int METHODID_REAL_TIME_TRAFFIC_MIRRORING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BurpServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BurpServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING:
          serviceImpl.registerRealTimeTrafficMirroring((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>) responseObserver);
          break;
        case METHODID_REGISTER_SERVER:
          serviceImpl.registerServer((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Status>) responseObserver);
          break;
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

  private static abstract class BurpServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BurpServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BurpServer");
    }
  }

  private static final class BurpServerFileDescriptorSupplier
      extends BurpServerBaseDescriptorSupplier {
    BurpServerFileDescriptorSupplier() {}
  }

  private static final class BurpServerMethodDescriptorSupplier
      extends BurpServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BurpServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BurpServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BurpServerFileDescriptorSupplier())
              .addMethod(getRegisterRealTimeTrafficMirroringMethod())
              .addMethod(getRealTimeTrafficMirroringMethod())
              .addMethod(getRegisterServerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
