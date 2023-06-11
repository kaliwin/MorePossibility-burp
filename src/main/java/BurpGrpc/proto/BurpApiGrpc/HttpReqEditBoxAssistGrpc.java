package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 编辑框辅助服务
 * 提供请求编辑框
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HttpReqEditBoxAssistGrpc {

  private HttpReqEditBoxAssistGrpc() {}

  public static final String SERVICE_NAME = "burpApi.HttpReqEditBoxAssist";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getReqHttpEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReqHttpEdit",
      requestType = BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getReqHttpEditMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.ByteData> getReqHttpEditMethod;
    if ((getReqHttpEditMethod = HttpReqEditBoxAssistGrpc.getReqHttpEditMethod) == null) {
      synchronized (HttpReqEditBoxAssistGrpc.class) {
        if ((getReqHttpEditMethod = HttpReqEditBoxAssistGrpc.getReqHttpEditMethod) == null) {
          HttpReqEditBoxAssistGrpc.getReqHttpEditMethod = getReqHttpEditMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.ByteData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReqHttpEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setSchemaDescriptor(new HttpReqEditBoxAssistMethodDescriptorSupplier("ReqHttpEdit"))
              .build();
        }
      }
    }
    return getReqHttpEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.Boole> getIsReqHttpEditForMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsReqHttpEditFor",
      requestType = BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.Boole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.Boole> getIsReqHttpEditForMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.Boole> getIsReqHttpEditForMethod;
    if ((getIsReqHttpEditForMethod = HttpReqEditBoxAssistGrpc.getIsReqHttpEditForMethod) == null) {
      synchronized (HttpReqEditBoxAssistGrpc.class) {
        if ((getIsReqHttpEditForMethod = HttpReqEditBoxAssistGrpc.getIsReqHttpEditForMethod) == null) {
          HttpReqEditBoxAssistGrpc.getIsReqHttpEditForMethod = getIsReqHttpEditForMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.Boole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsReqHttpEditFor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Boole.getDefaultInstance()))
              .setSchemaDescriptor(new HttpReqEditBoxAssistMethodDescriptorSupplier("IsReqHttpEditFor"))
              .build();
        }
      }
    }
    return getIsReqHttpEditForMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HttpReqEditBoxAssistStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistStub>() {
        @java.lang.Override
        public HttpReqEditBoxAssistStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpReqEditBoxAssistStub(channel, callOptions);
        }
      };
    return HttpReqEditBoxAssistStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HttpReqEditBoxAssistBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistBlockingStub>() {
        @java.lang.Override
        public HttpReqEditBoxAssistBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpReqEditBoxAssistBlockingStub(channel, callOptions);
        }
      };
    return HttpReqEditBoxAssistBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HttpReqEditBoxAssistFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpReqEditBoxAssistFutureStub>() {
        @java.lang.Override
        public HttpReqEditBoxAssistFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpReqEditBoxAssistFutureStub(channel, callOptions);
        }
      };
    return HttpReqEditBoxAssistFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供请求编辑框
   * </pre>
   */
  public static abstract class HttpReqEditBoxAssistImplBase implements io.grpc.BindableService {

    /**
     */
    public void reqHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReqHttpEditMethod(), responseObserver);
    }

    /**
     */
    public void isReqHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsReqHttpEditForMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReqHttpEditMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
                BurpGrpc.proto.BurpApiGrpc.ByteData>(
                  this, METHODID_REQ_HTTP_EDIT)))
          .addMethod(
            getIsReqHttpEditForMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
                BurpGrpc.proto.BurpApiGrpc.Boole>(
                  this, METHODID_IS_REQ_HTTP_EDIT_FOR)))
          .build();
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供请求编辑框
   * </pre>
   */
  public static final class HttpReqEditBoxAssistStub extends io.grpc.stub.AbstractAsyncStub<HttpReqEditBoxAssistStub> {
    private HttpReqEditBoxAssistStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpReqEditBoxAssistStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpReqEditBoxAssistStub(channel, callOptions);
    }

    /**
     */
    public void reqHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReqHttpEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isReqHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsReqHttpEditForMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供请求编辑框
   * </pre>
   */
  public static final class HttpReqEditBoxAssistBlockingStub extends io.grpc.stub.AbstractBlockingStub<HttpReqEditBoxAssistBlockingStub> {
    private HttpReqEditBoxAssistBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpReqEditBoxAssistBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpReqEditBoxAssistBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.ByteData reqHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReqHttpEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.Boole isReqHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsReqHttpEditForMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供请求编辑框
   * </pre>
   */
  public static final class HttpReqEditBoxAssistFutureStub extends io.grpc.stub.AbstractFutureStub<HttpReqEditBoxAssistFutureStub> {
    private HttpReqEditBoxAssistFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpReqEditBoxAssistFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpReqEditBoxAssistFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ByteData> reqHttpEdit(
        BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReqHttpEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.Boole> isReqHttpEditFor(
        BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsReqHttpEditForMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQ_HTTP_EDIT = 0;
  private static final int METHODID_IS_REQ_HTTP_EDIT_FOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HttpReqEditBoxAssistImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HttpReqEditBoxAssistImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQ_HTTP_EDIT:
          serviceImpl.reqHttpEdit((BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData>) responseObserver);
          break;
        case METHODID_IS_REQ_HTTP_EDIT_FOR:
          serviceImpl.isReqHttpEditFor((BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole>) responseObserver);
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

  private static abstract class HttpReqEditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HttpReqEditBoxAssistBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HttpReqEditBoxAssist");
    }
  }

  private static final class HttpReqEditBoxAssistFileDescriptorSupplier
      extends HttpReqEditBoxAssistBaseDescriptorSupplier {
    HttpReqEditBoxAssistFileDescriptorSupplier() {}
  }

  private static final class HttpReqEditBoxAssistMethodDescriptorSupplier
      extends HttpReqEditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HttpReqEditBoxAssistMethodDescriptorSupplier(String methodName) {
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
      synchronized (HttpReqEditBoxAssistGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HttpReqEditBoxAssistFileDescriptorSupplier())
              .addMethod(getReqHttpEditMethod())
              .addMethod(getIsReqHttpEditForMethod())
              .build();
        }
      }
    }
    return result;
  }
}
