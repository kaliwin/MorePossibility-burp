package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * http流量处理器 请求和响应放一起
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HttpFlowHandlerGrpc {

  private HttpFlowHandlerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.HttpFlowHandler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowReqData,
      BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> getHttpHandleRequestReceivedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HttpHandleRequestReceived",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.HttpRequestAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowReqData,
      BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> getHttpHandleRequestReceivedMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowReqData, BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> getHttpHandleRequestReceivedMethod;
    if ((getHttpHandleRequestReceivedMethod = HttpFlowHandlerGrpc.getHttpHandleRequestReceivedMethod) == null) {
      synchronized (HttpFlowHandlerGrpc.class) {
        if ((getHttpHandleRequestReceivedMethod = HttpFlowHandlerGrpc.getHttpHandleRequestReceivedMethod) == null) {
          HttpFlowHandlerGrpc.getHttpHandleRequestReceivedMethod = getHttpHandleRequestReceivedMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpFlowReqData, BurpGrpc.proto.BurpApiGrpc.HttpRequestAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HttpHandleRequestReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpRequestAction.getDefaultInstance()))
              .setSchemaDescriptor(new HttpFlowHandlerMethodDescriptorSupplier("HttpHandleRequestReceived"))
              .build();
        }
      }
    }
    return getHttpHandleRequestReceivedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowResData,
      BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> getHttpHandleResponseReceivedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HttpHandleResponseReceived",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpFlowResData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowResData,
      BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> getHttpHandleResponseReceivedMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpFlowResData, BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> getHttpHandleResponseReceivedMethod;
    if ((getHttpHandleResponseReceivedMethod = HttpFlowHandlerGrpc.getHttpHandleResponseReceivedMethod) == null) {
      synchronized (HttpFlowHandlerGrpc.class) {
        if ((getHttpHandleResponseReceivedMethod = HttpFlowHandlerGrpc.getHttpHandleResponseReceivedMethod) == null) {
          HttpFlowHandlerGrpc.getHttpHandleResponseReceivedMethod = getHttpHandleResponseReceivedMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpFlowResData, BurpGrpc.proto.BurpApiGrpc.HttpResponseAction>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HttpHandleResponseReceived"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpFlowResData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.getDefaultInstance()))
              .setSchemaDescriptor(new HttpFlowHandlerMethodDescriptorSupplier("HttpHandleResponseReceived"))
              .build();
        }
      }
    }
    return getHttpHandleResponseReceivedMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HttpFlowHandlerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerStub>() {
        @java.lang.Override
        public HttpFlowHandlerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpFlowHandlerStub(channel, callOptions);
        }
      };
    return HttpFlowHandlerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HttpFlowHandlerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerBlockingStub>() {
        @java.lang.Override
        public HttpFlowHandlerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpFlowHandlerBlockingStub(channel, callOptions);
        }
      };
    return HttpFlowHandlerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HttpFlowHandlerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpFlowHandlerFutureStub>() {
        @java.lang.Override
        public HttpFlowHandlerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpFlowHandlerFutureStub(channel, callOptions);
        }
      };
    return HttpFlowHandlerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * http流量处理器 请求和响应放一起
   * </pre>
   */
  public static abstract class HttpFlowHandlerImplBase implements io.grpc.BindableService {

    /**
     */
    public void httpHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHttpHandleRequestReceivedMethod(), responseObserver);
    }

    /**
     */
    public void httpHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowResData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHttpHandleResponseReceivedMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHttpHandleRequestReceivedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpFlowReqData,
                BurpGrpc.proto.BurpApiGrpc.HttpRequestAction>(
                  this, METHODID_HTTP_HANDLE_REQUEST_RECEIVED)))
          .addMethod(
            getHttpHandleResponseReceivedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpFlowResData,
                BurpGrpc.proto.BurpApiGrpc.HttpResponseAction>(
                  this, METHODID_HTTP_HANDLE_RESPONSE_RECEIVED)))
          .build();
    }
  }

  /**
   * <pre>
   * http流量处理器 请求和响应放一起
   * </pre>
   */
  public static final class HttpFlowHandlerStub extends io.grpc.stub.AbstractAsyncStub<HttpFlowHandlerStub> {
    private HttpFlowHandlerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpFlowHandlerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpFlowHandlerStub(channel, callOptions);
    }

    /**
     */
    public void httpHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHttpHandleRequestReceivedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void httpHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowResData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHttpHandleResponseReceivedMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * http流量处理器 请求和响应放一起
   * </pre>
   */
  public static final class HttpFlowHandlerBlockingStub extends io.grpc.stub.AbstractBlockingStub<HttpFlowHandlerBlockingStub> {
    private HttpFlowHandlerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpFlowHandlerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpFlowHandlerBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.HttpRequestAction httpHandleRequestReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHttpHandleRequestReceivedMethod(), getCallOptions(), request);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.HttpResponseAction httpHandleResponseReceived(BurpGrpc.proto.BurpApiGrpc.httpFlowResData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHttpHandleResponseReceivedMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * http流量处理器 请求和响应放一起
   * </pre>
   */
  public static final class HttpFlowHandlerFutureStub extends io.grpc.stub.AbstractFutureStub<HttpFlowHandlerFutureStub> {
    private HttpFlowHandlerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpFlowHandlerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpFlowHandlerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.HttpRequestAction> httpHandleRequestReceived(
        BurpGrpc.proto.BurpApiGrpc.httpFlowReqData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHttpHandleRequestReceivedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.HttpResponseAction> httpHandleResponseReceived(
        BurpGrpc.proto.BurpApiGrpc.httpFlowResData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHttpHandleResponseReceivedMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HTTP_HANDLE_REQUEST_RECEIVED = 0;
  private static final int METHODID_HTTP_HANDLE_RESPONSE_RECEIVED = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HttpFlowHandlerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HttpFlowHandlerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HTTP_HANDLE_REQUEST_RECEIVED:
          serviceImpl.httpHandleRequestReceived((BurpGrpc.proto.BurpApiGrpc.httpFlowReqData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpRequestAction>) responseObserver);
          break;
        case METHODID_HTTP_HANDLE_RESPONSE_RECEIVED:
          serviceImpl.httpHandleResponseReceived((BurpGrpc.proto.BurpApiGrpc.httpFlowResData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.HttpResponseAction>) responseObserver);
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

  private static abstract class HttpFlowHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HttpFlowHandlerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HttpFlowHandler");
    }
  }

  private static final class HttpFlowHandlerFileDescriptorSupplier
      extends HttpFlowHandlerBaseDescriptorSupplier {
    HttpFlowHandlerFileDescriptorSupplier() {}
  }

  private static final class HttpFlowHandlerMethodDescriptorSupplier
      extends HttpFlowHandlerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HttpFlowHandlerMethodDescriptorSupplier(String methodName) {
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
      synchronized (HttpFlowHandlerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HttpFlowHandlerFileDescriptorSupplier())
              .addMethod(getHttpHandleRequestReceivedMethod())
              .addMethod(getHttpHandleResponseReceivedMethod())
              .build();
        }
      }
    }
    return result;
  }
}
