package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 提供响应编辑框
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HttpResEditBoxAssistGrpc {

  private HttpResEditBoxAssistGrpc() {}

  public static final String SERVICE_NAME = "burpApi.HttpResEditBoxAssist";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getResHttpEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResHttpEdit",
      requestType = BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getResHttpEditMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.ByteData> getResHttpEditMethod;
    if ((getResHttpEditMethod = HttpResEditBoxAssistGrpc.getResHttpEditMethod) == null) {
      synchronized (HttpResEditBoxAssistGrpc.class) {
        if ((getResHttpEditMethod = HttpResEditBoxAssistGrpc.getResHttpEditMethod) == null) {
          HttpResEditBoxAssistGrpc.getResHttpEditMethod = getResHttpEditMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.ByteData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResHttpEdit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setSchemaDescriptor(new HttpResEditBoxAssistMethodDescriptorSupplier("ResHttpEdit"))
              .build();
        }
      }
    }
    return getResHttpEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.Boole> getIsResHttpEditForMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IsResHttpEditFor",
      requestType = BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.Boole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
      BurpGrpc.proto.BurpApiGrpc.Boole> getIsResHttpEditForMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.Boole> getIsResHttpEditForMethod;
    if ((getIsResHttpEditForMethod = HttpResEditBoxAssistGrpc.getIsResHttpEditForMethod) == null) {
      synchronized (HttpResEditBoxAssistGrpc.class) {
        if ((getIsResHttpEditForMethod = HttpResEditBoxAssistGrpc.getIsResHttpEditForMethod) == null) {
          HttpResEditBoxAssistGrpc.getIsResHttpEditForMethod = getIsResHttpEditForMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData, BurpGrpc.proto.BurpApiGrpc.Boole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IsResHttpEditFor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Boole.getDefaultInstance()))
              .setSchemaDescriptor(new HttpResEditBoxAssistMethodDescriptorSupplier("IsResHttpEditFor"))
              .build();
        }
      }
    }
    return getIsResHttpEditForMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HttpResEditBoxAssistStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistStub>() {
        @java.lang.Override
        public HttpResEditBoxAssistStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpResEditBoxAssistStub(channel, callOptions);
        }
      };
    return HttpResEditBoxAssistStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HttpResEditBoxAssistBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistBlockingStub>() {
        @java.lang.Override
        public HttpResEditBoxAssistBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpResEditBoxAssistBlockingStub(channel, callOptions);
        }
      };
    return HttpResEditBoxAssistBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HttpResEditBoxAssistFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HttpResEditBoxAssistFutureStub>() {
        @java.lang.Override
        public HttpResEditBoxAssistFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HttpResEditBoxAssistFutureStub(channel, callOptions);
        }
      };
    return HttpResEditBoxAssistFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 提供响应编辑框
   * </pre>
   */
  public static abstract class HttpResEditBoxAssistImplBase implements io.grpc.BindableService {

    /**
     */
    public void resHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResHttpEditMethod(), responseObserver);
    }

    /**
     */
    public void isResHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsResHttpEditForMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getResHttpEditMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
                BurpGrpc.proto.BurpApiGrpc.ByteData>(
                  this, METHODID_RES_HTTP_EDIT)))
          .addMethod(
            getIsResHttpEditForMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData,
                BurpGrpc.proto.BurpApiGrpc.Boole>(
                  this, METHODID_IS_RES_HTTP_EDIT_FOR)))
          .build();
    }
  }

  /**
   * <pre>
   * 提供响应编辑框
   * </pre>
   */
  public static final class HttpResEditBoxAssistStub extends io.grpc.stub.AbstractAsyncStub<HttpResEditBoxAssistStub> {
    private HttpResEditBoxAssistStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpResEditBoxAssistStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpResEditBoxAssistStub(channel, callOptions);
    }

    /**
     */
    public void resHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResHttpEditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isResHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsResHttpEditForMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 提供响应编辑框
   * </pre>
   */
  public static final class HttpResEditBoxAssistBlockingStub extends io.grpc.stub.AbstractBlockingStub<HttpResEditBoxAssistBlockingStub> {
    private HttpResEditBoxAssistBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpResEditBoxAssistBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpResEditBoxAssistBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.ByteData resHttpEdit(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResHttpEditMethod(), getCallOptions(), request);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.Boole isResHttpEditFor(BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsResHttpEditForMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 提供响应编辑框
   * </pre>
   */
  public static final class HttpResEditBoxAssistFutureStub extends io.grpc.stub.AbstractFutureStub<HttpResEditBoxAssistFutureStub> {
    private HttpResEditBoxAssistFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HttpResEditBoxAssistFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HttpResEditBoxAssistFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ByteData> resHttpEdit(
        BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResHttpEditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.Boole> isResHttpEditFor(
        BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsResHttpEditForMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RES_HTTP_EDIT = 0;
  private static final int METHODID_IS_RES_HTTP_EDIT_FOR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HttpResEditBoxAssistImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HttpResEditBoxAssistImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RES_HTTP_EDIT:
          serviceImpl.resHttpEdit((BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData>) responseObserver);
          break;
        case METHODID_IS_RES_HTTP_EDIT_FOR:
          serviceImpl.isResHttpEditFor((BurpGrpc.proto.BurpApiGrpc.HttpEditBoxData) request,
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

  private static abstract class HttpResEditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HttpResEditBoxAssistBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HttpResEditBoxAssist");
    }
  }

  private static final class HttpResEditBoxAssistFileDescriptorSupplier
      extends HttpResEditBoxAssistBaseDescriptorSupplier {
    HttpResEditBoxAssistFileDescriptorSupplier() {}
  }

  private static final class HttpResEditBoxAssistMethodDescriptorSupplier
      extends HttpResEditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HttpResEditBoxAssistMethodDescriptorSupplier(String methodName) {
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
      synchronized (HttpResEditBoxAssistGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HttpResEditBoxAssistFileDescriptorSupplier())
              .addMethod(getResHttpEditMethod())
              .addMethod(getIsResHttpEditForMethod())
              .build();
        }
      }
    }
    return result;
  }
}
