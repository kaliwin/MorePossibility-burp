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
    if ((getRegisterServerListMethod = BurpServerGrpc.getRegisterServerListMethod) == null) {
      synchronized (BurpServerGrpc.class) {
        if ((getRegisterServerListMethod = BurpServerGrpc.getRegisterServerListMethod) == null) {
          BurpServerGrpc.getRegisterServerListMethod = getRegisterServerListMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList, BurpGrpc.proto.BurpApiGrpc.processingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterServerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.processingStatus.getDefaultInstance()))
              .setSchemaDescriptor(new BurpServerMethodDescriptorSupplier("RegisterServerList"))
              .build();
        }
      }
    }
    return getRegisterServerListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> getGetProxyHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetProxyHistory",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> getGetProxyHistoryMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> getGetProxyHistoryMethod;
    if ((getGetProxyHistoryMethod = BurpServerGrpc.getGetProxyHistoryMethod) == null) {
      synchronized (BurpServerGrpc.class) {
        if ((getGetProxyHistoryMethod = BurpServerGrpc.getGetProxyHistoryMethod) == null) {
          BurpServerGrpc.getGetProxyHistoryMethod = getGetProxyHistoryMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetProxyHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData.getDefaultInstance()))
              .setSchemaDescriptor(new BurpServerMethodDescriptorSupplier("GetProxyHistory"))
              .build();
        }
      }
    }
    return getGetProxyHistoryMethod;
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
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    public void registerServerList(BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServerListMethod(), responseObserver);
    }

    /**
     * <pre>
     * 获取代理历史请求 由于过滤会很复杂因此直接返回所有历史数据 入参为只占位符不用理睬
     * 由于数据过大默认单个消息最大为500MB 客户端也需要处理 后续将提供分块传输 过滤提取等方式
     * </pre>
     */
    public void getProxyHistory(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProxyHistoryMethod(), responseObserver);
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
            getRegisterServerListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList,
                BurpGrpc.proto.BurpApiGrpc.processingStatus>(
                  this, METHODID_REGISTER_SERVER_LIST)))
          .addMethod(
            getGetProxyHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.Str,
                BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData>(
                  this, METHODID_GET_PROXY_HISTORY)))
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
     * </pre>
     */
    public void getProxyHistory(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProxyHistoryMethod(), getCallOptions()), request, responseObserver);
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
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData getProxyHistory(BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProxyHistoryMethod(), getCallOptions(), request);
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
     * 服务注册列表 包含多个服务  多个服务其中有一个注册失败不会影响到已经成功的 只要有一个失败便会返回false
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.processingStatus> registerServerList(
        BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServerListMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 获取代理历史请求 由于过滤会很复杂因此直接返回所有历史数据 入参为只占位符不用理睬
     * 由于数据过大默认单个消息最大为500MB 客户端也需要处理 后续将提供分块传输 过滤提取等方式
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData> getProxyHistory(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProxyHistoryMethod(), getCallOptions()), request);
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
        case METHODID_REGISTER_SERVER_LIST:
          serviceImpl.registerServerList((BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus>) responseObserver);
          break;
        case METHODID_GET_PROXY_HISTORY:
          serviceImpl.getProxyHistory((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyHistoryData>) responseObserver);
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
              .addMethod(getRegisterServerListMethod())
              .addMethod(getGetProxyHistoryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
