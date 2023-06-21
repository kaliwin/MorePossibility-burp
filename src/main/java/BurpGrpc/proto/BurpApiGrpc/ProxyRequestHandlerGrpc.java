package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 代理请求处理器 提供请求修改拦截
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProxyRequestHandlerGrpc {

  private ProxyRequestHandlerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.ProxyRequestHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqGroup,
      BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> getProxyHandleRequestReceivedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProxyHandleRequestReceived",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpReqGroup.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqGroup,
      BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> getProxyHandleRequestReceivedMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqGroup, BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> getProxyHandleRequestReceivedMethod;
    if ((getProxyHandleRequestReceivedMethod = ProxyRequestHandlerGrpc.getProxyHandleRequestReceivedMethod) == null) {
      synchronized (ProxyRequestHandlerGrpc.class) {
        if ((getProxyHandleRequestReceivedMethod = ProxyRequestHandlerGrpc.getProxyHandleRequestReceivedMethod) == null) {
          ProxyRequestHandlerGrpc.getProxyHandleRequestReceivedMethod = getProxyHandleRequestReceivedMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpReqGroup, BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProxyHandleRequestReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyRequestHandlerMethodDescriptorSupplier("ProxyHandleRequestReceived"))
              .build();
        }
      }
    }
    return getProxyHandleRequestReceivedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyRequestHandlerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerStub>() {
        @java.lang.Override
        public ProxyRequestHandlerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyRequestHandlerStub(channel, callOptions);
        }
      };
    return ProxyRequestHandlerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyRequestHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerBlockingStub>() {
        @java.lang.Override
        public ProxyRequestHandlerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyRequestHandlerBlockingStub(channel, callOptions);
        }
      };
    return ProxyRequestHandlerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyRequestHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyRequestHandlerFutureStub>() {
        @java.lang.Override
        public ProxyRequestHandlerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyRequestHandlerFutureStub(channel, callOptions);
        }
      };
    return ProxyRequestHandlerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 代理请求处理器 提供请求修改拦截
   * </pre>
   */
  public static abstract class ProxyRequestHandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void proxyHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpReqGroup request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProxyHandleRequestReceivedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProxyHandleRequestReceivedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpReqGroup,
                BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction>(
                  this, METHODID_PROXY_HANDLE_REQUEST_RECEIVED)))
          .build();
    }
  }

  /**
   * <pre>
   * 代理请求处理器 提供请求修改拦截
   * </pre>
   */
  public static final class ProxyRequestHandlerStub extends io.grpc.stub.AbstractAsyncStub<ProxyRequestHandlerStub> {
    private ProxyRequestHandlerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyRequestHandlerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyRequestHandlerStub(channel, callOptions);
    }

    /**
     */
    public void proxyHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpReqGroup request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProxyHandleRequestReceivedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 代理请求处理器 提供请求修改拦截
   * </pre>
   */
  public static final class ProxyRequestHandlerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProxyRequestHandlerBlockingStub> {
    private ProxyRequestHandlerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyRequestHandlerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyRequestHandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction proxyHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpReqGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProxyHandleRequestReceivedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 代理请求处理器 提供请求修改拦截
   * </pre>
   */
  public static final class ProxyRequestHandlerFutureStub extends io.grpc.stub.AbstractFutureStub<ProxyRequestHandlerFutureStub> {
    private ProxyRequestHandlerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyRequestHandlerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyRequestHandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction> proxyHandleRequestReceived(
        BurpGrpc.proto.BurpApiGrpc.httpReqGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProxyHandleRequestReceivedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROXY_HANDLE_REQUEST_RECEIVED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProxyRequestHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProxyRequestHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROXY_HANDLE_REQUEST_RECEIVED:
          serviceImpl.proxyHandleRequestReceived((BurpGrpc.proto.BurpApiGrpc.httpReqGroup) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyRequestAction>) responseObserver);
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

  private static abstract class ProxyRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyRequestHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProxyRequestHandler");
    }
  }

  private static final class ProxyRequestHandlerFileDescriptorSupplier
      extends ProxyRequestHandlerBaseDescriptorSupplier {
    ProxyRequestHandlerFileDescriptorSupplier() {}
  }

  private static final class ProxyRequestHandlerMethodDescriptorSupplier
      extends ProxyRequestHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProxyRequestHandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProxyRequestHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyRequestHandlerFileDescriptorSupplier())
              .addMethod(getProxyHandleRequestReceivedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
