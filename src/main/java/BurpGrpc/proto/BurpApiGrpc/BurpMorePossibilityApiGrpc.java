package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *burpApi服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BurpMorePossibilityApiGrpc {

  private BurpMorePossibilityApiGrpc() {}

  public static final java.lang.String SERVICE_NAME = "burpApi.BurpMorePossibilityApi";

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
    if ((getRegisterRealTimeTrafficMirroringMethod = BurpMorePossibilityApiGrpc.getRegisterRealTimeTrafficMirroringMethod) == null) {
      synchronized (BurpMorePossibilityApiGrpc.class) {
        if ((getRegisterRealTimeTrafficMirroringMethod = BurpMorePossibilityApiGrpc.getRegisterRealTimeTrafficMirroringMethod) == null) {
          BurpMorePossibilityApiGrpc.getRegisterRealTimeTrafficMirroringMethod = getRegisterRealTimeTrafficMirroringMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterRealTimeTrafficMirroring"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setSchemaDescriptor(new BurpMorePossibilityApiMethodDescriptorSupplier("RegisterRealTimeTrafficMirroring"))
              .build();
        }
      }
    }
    return getRegisterRealTimeTrafficMirroringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList,
      BurpGrpc.proto.BurpApiGrpc.processingStatus> getRegisterServerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterServerList",
      requestType = BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.processingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList,
      BurpGrpc.proto.BurpApiGrpc.processingStatus> getRegisterServerListMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList, BurpGrpc.proto.BurpApiGrpc.processingStatus> getRegisterServerListMethod;
    if ((getRegisterServerListMethod = BurpMorePossibilityApiGrpc.getRegisterServerListMethod) == null) {
      synchronized (BurpMorePossibilityApiGrpc.class) {
        if ((getRegisterServerListMethod = BurpMorePossibilityApiGrpc.getRegisterServerListMethod) == null) {
          BurpMorePossibilityApiGrpc.getRegisterServerListMethod = getRegisterServerListMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList, BurpGrpc.proto.BurpApiGrpc.processingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterServerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.processingStatus.getDefaultInstance()))
              .setSchemaDescriptor(new BurpMorePossibilityApiMethodDescriptorSupplier("RegisterServerList"))
              .build();
        }
      }
    }
    return getRegisterServerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getGetProxyHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProxyHistory",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getGetProxyHistoryMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getGetProxyHistoryMethod;
    if ((getGetProxyHistoryMethod = BurpMorePossibilityApiGrpc.getGetProxyHistoryMethod) == null) {
      synchronized (BurpMorePossibilityApiGrpc.class) {
        if ((getGetProxyHistoryMethod = BurpMorePossibilityApiGrpc.getGetProxyHistoryMethod) == null) {
          BurpMorePossibilityApiGrpc.getGetProxyHistoryMethod = getGetProxyHistoryMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProxyHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setSchemaDescriptor(new BurpMorePossibilityApiMethodDescriptorSupplier("GetProxyHistory"))
              .build();
        }
      }
    }
    return getGetProxyHistoryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BurpMorePossibilityApiStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiStub>() {
        @java.lang.Override
        public BurpMorePossibilityApiStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpMorePossibilityApiStub(channel, callOptions);
        }
      };
    return BurpMorePossibilityApiStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BurpMorePossibilityApiBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiBlockingStub>() {
        @java.lang.Override
        public BurpMorePossibilityApiBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpMorePossibilityApiBlockingStub(channel, callOptions);
        }
      };
    return BurpMorePossibilityApiBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BurpMorePossibilityApiFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BurpMorePossibilityApiFutureStub>() {
        @java.lang.Override
        public BurpMorePossibilityApiFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BurpMorePossibilityApiFutureStub(channel, callOptions);
        }
      };
    return BurpMorePossibilityApiFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *burpApi服务
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     *注册实时流量传输
     *burp将监听端口通过服务端端流进行实时流量镜像
     * </pre>
     */
    default void registerRealTimeTrafficMirroring(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterRealTimeTrafficMirroringMethod(), responseObserver);
    }

    /**
     * <pre>
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    default void registerServerList(BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServerListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取代理历史请求 由于过滤会很复杂因此直接返回所有历史数据 入参为只占位符不用理睬
     * 由于数据过大默认单个消息最大为500MB 客户端也需要处理 后续将提供分块传输 过滤提取等方式
     * 修改为服务端流的方式进行流量传输
     * </pre>
     */
    default void getProxyHistory(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProxyHistoryMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BurpMorePossibilityApi.
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static abstract class BurpMorePossibilityApiImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BurpMorePossibilityApiGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BurpMorePossibilityApi.
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpMorePossibilityApiStub
      extends io.grpc.stub.AbstractAsyncStub<BurpMorePossibilityApiStub> {
    private BurpMorePossibilityApiStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpMorePossibilityApiStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpMorePossibilityApiStub(channel, callOptions);
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
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    public void registerServerList(BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServerListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 获取代理历史请求 由于过滤会很复杂因此直接返回所有历史数据 入参为只占位符不用理睬
     * 由于数据过大默认单个消息最大为500MB 客户端也需要处理 后续将提供分块传输 过滤提取等方式
     * 修改为服务端流的方式进行流量传输
     * </pre>
     */
    public void getProxyHistory(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProxyHistoryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BurpMorePossibilityApi.
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpMorePossibilityApiBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BurpMorePossibilityApiBlockingStub> {
    private BurpMorePossibilityApiBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpMorePossibilityApiBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpMorePossibilityApiBlockingStub(channel, callOptions);
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
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.processingStatus registerServerList(BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServerListMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 获取代理历史请求 由于过滤会很复杂因此直接返回所有历史数据 入参为只占位符不用理睬
     * 由于数据过大默认单个消息最大为500MB 客户端也需要处理 后续将提供分块传输 过滤提取等方式
     * 修改为服务端流的方式进行流量传输
     * </pre>
     */
    public java.util.Iterator<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes> getProxyHistory(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProxyHistoryMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BurpMorePossibilityApi.
   * <pre>
   *burpApi服务
   * </pre>
   */
  public static final class BurpMorePossibilityApiFutureStub
      extends io.grpc.stub.AbstractFutureStub<BurpMorePossibilityApiFutureStub> {
    private BurpMorePossibilityApiFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BurpMorePossibilityApiFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BurpMorePossibilityApiFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.processingStatus> registerServerList(
        BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServerListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING = 0;
  private static final int METHODID_REGISTER_SERVER_LIST = 1;
  private static final int METHODID_GET_PROXY_HISTORY = 2;

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
        case METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING:
          serviceImpl.registerRealTimeTrafficMirroring((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>) responseObserver);
          break;
        case METHODID_REGISTER_SERVER_LIST:
          serviceImpl.registerServerList((BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus>) responseObserver);
          break;
        case METHODID_GET_PROXY_HISTORY:
          serviceImpl.getProxyHistory((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getRegisterRealTimeTrafficMirroringMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.Str,
              BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>(
                service, METHODID_REGISTER_REAL_TIME_TRAFFIC_MIRRORING)))
        .addMethod(
          getRegisterServerListMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList,
              BurpGrpc.proto.BurpApiGrpc.processingStatus>(
                service, METHODID_REGISTER_SERVER_LIST)))
        .addMethod(
          getGetProxyHistoryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.Str,
              BurpGrpc.proto.BurpApiGrpc.httpReqAndRes>(
                service, METHODID_GET_PROXY_HISTORY)))
        .build();
  }

  private static abstract class BurpMorePossibilityApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BurpMorePossibilityApiBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BurpMorePossibilityApi");
    }
  }

  private static final class BurpMorePossibilityApiFileDescriptorSupplier
      extends BurpMorePossibilityApiBaseDescriptorSupplier {
    BurpMorePossibilityApiFileDescriptorSupplier() {}
  }

  private static final class BurpMorePossibilityApiMethodDescriptorSupplier
      extends BurpMorePossibilityApiBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BurpMorePossibilityApiMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BurpMorePossibilityApiGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BurpMorePossibilityApiFileDescriptorSupplier())
              .addMethod(getRegisterRealTimeTrafficMirroringMethod())
              .addMethod(getRegisterServerListMethod())
              .addMethod(getGetProxyHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
