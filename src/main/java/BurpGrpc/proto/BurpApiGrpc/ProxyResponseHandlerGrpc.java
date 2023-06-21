package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 代理响应处理器 提供对相应的处理
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ProxyResponseHandlerGrpc {

  private ProxyResponseHandlerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.ProxyResponseHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
      BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> getProxyHandleResponseReceivedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ProxyHandleResponseReceived",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
      BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> getProxyHandleResponseReceivedMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> getProxyHandleResponseReceivedMethod;
    if ((getProxyHandleResponseReceivedMethod = ProxyResponseHandlerGrpc.getProxyHandleResponseReceivedMethod) == null) {
      synchronized (ProxyResponseHandlerGrpc.class) {
        if ((getProxyHandleResponseReceivedMethod = ProxyResponseHandlerGrpc.getProxyHandleResponseReceivedMethod) == null) {
          ProxyResponseHandlerGrpc.getProxyHandleResponseReceivedMethod = getProxyHandleResponseReceivedMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ProxyHandleResponseReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction.getDefaultInstance()))
              .setSchemaDescriptor(new ProxyResponseHandlerMethodDescriptorSupplier("ProxyHandleResponseReceived"))
              .build();
        }
      }
    }
    return getProxyHandleResponseReceivedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProxyResponseHandlerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerStub>() {
        @java.lang.Override
        public ProxyResponseHandlerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyResponseHandlerStub(channel, callOptions);
        }
      };
    return ProxyResponseHandlerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProxyResponseHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerBlockingStub>() {
        @java.lang.Override
        public ProxyResponseHandlerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyResponseHandlerBlockingStub(channel, callOptions);
        }
      };
    return ProxyResponseHandlerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProxyResponseHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProxyResponseHandlerFutureStub>() {
        @java.lang.Override
        public ProxyResponseHandlerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProxyResponseHandlerFutureStub(channel, callOptions);
        }
      };
    return ProxyResponseHandlerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 代理响应处理器 提供对相应的处理
   * </pre>
   */
  public static abstract class ProxyResponseHandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void proxyHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getProxyHandleResponseReceivedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getProxyHandleResponseReceivedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpReqAndRes,
                BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction>(
                  this, METHODID_PROXY_HANDLE_RESPONSE_RECEIVED)))
          .build();
    }
  }

  /**
   * <pre>
   * 代理响应处理器 提供对相应的处理
   * </pre>
   */
  public static final class ProxyResponseHandlerStub extends io.grpc.stub.AbstractAsyncStub<ProxyResponseHandlerStub> {
    private ProxyResponseHandlerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyResponseHandlerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyResponseHandlerStub(channel, callOptions);
    }

    /**
     */
    public void proxyHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getProxyHandleResponseReceivedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 代理响应处理器 提供对相应的处理
   * </pre>
   */
  public static final class ProxyResponseHandlerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProxyResponseHandlerBlockingStub> {
    private ProxyResponseHandlerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyResponseHandlerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyResponseHandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction proxyHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getProxyHandleResponseReceivedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 代理响应处理器 提供对相应的处理
   * </pre>
   */
  public static final class ProxyResponseHandlerFutureStub extends io.grpc.stub.AbstractFutureStub<ProxyResponseHandlerFutureStub> {
    private ProxyResponseHandlerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProxyResponseHandlerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProxyResponseHandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction> proxyHandleResponseReceived(
        BurpGrpc.proto.BurpApiGrpc.httpReqAndRes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getProxyHandleResponseReceivedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROXY_HANDLE_RESPONSE_RECEIVED = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProxyResponseHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProxyResponseHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROXY_HANDLE_RESPONSE_RECEIVED:
          serviceImpl.proxyHandleResponseReceived((BurpGrpc.proto.BurpApiGrpc.httpReqAndRes) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ProxyResponseAction>) responseObserver);
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

  private static abstract class ProxyResponseHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProxyResponseHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProxyResponseHandler");
    }
  }

  private static final class ProxyResponseHandlerFileDescriptorSupplier
      extends ProxyResponseHandlerBaseDescriptorSupplier {
    ProxyResponseHandlerFileDescriptorSupplier() {}
  }

  private static final class ProxyResponseHandlerMethodDescriptorSupplier
      extends ProxyResponseHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProxyResponseHandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProxyResponseHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProxyResponseHandlerFileDescriptorSupplier())
              .addMethod(getProxyHandleResponseReceivedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
