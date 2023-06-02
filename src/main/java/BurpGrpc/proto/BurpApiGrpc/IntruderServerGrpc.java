package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 迭代器服务, 两个函数 处理器和生成器,用于引入第三方程序
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntruderServerGrpc {

  private IntruderServerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.IntruderServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ByteData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntruderPayloadProcessor",
      requestType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ByteData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ByteData, BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod;
    if ((getIntruderPayloadProcessorMethod = IntruderServerGrpc.getIntruderPayloadProcessorMethod) == null) {
      synchronized (IntruderServerGrpc.class) {
        if ((getIntruderPayloadProcessorMethod = IntruderServerGrpc.getIntruderPayloadProcessorMethod) == null) {
          IntruderServerGrpc.getIntruderPayloadProcessorMethod = getIntruderPayloadProcessorMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.ByteData, BurpGrpc.proto.BurpApiGrpc.ByteData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntruderPayloadProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setSchemaDescriptor(new IntruderServerMethodDescriptorSupplier("IntruderPayloadProcessor"))
              .build();
        }
      }
    }
    return getIntruderPayloadProcessorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadGeneratorProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntruderPayloadGeneratorProvider",
      requestType = BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadGeneratorProviderMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData, BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadGeneratorProviderMethod;
    if ((getIntruderPayloadGeneratorProviderMethod = IntruderServerGrpc.getIntruderPayloadGeneratorProviderMethod) == null) {
      synchronized (IntruderServerGrpc.class) {
        if ((getIntruderPayloadGeneratorProviderMethod = IntruderServerGrpc.getIntruderPayloadGeneratorProviderMethod) == null) {
          IntruderServerGrpc.getIntruderPayloadGeneratorProviderMethod = getIntruderPayloadGeneratorProviderMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData, BurpGrpc.proto.BurpApiGrpc.ByteData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntruderPayloadGeneratorProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setSchemaDescriptor(new IntruderServerMethodDescriptorSupplier("IntruderPayloadGeneratorProvider"))
              .build();
        }
      }
    }
    return getIntruderPayloadGeneratorProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntruderServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderServerStub>() {
        @java.lang.Override
        public IntruderServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderServerStub(channel, callOptions);
        }
      };
    return IntruderServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntruderServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderServerBlockingStub>() {
        @java.lang.Override
        public IntruderServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderServerBlockingStub(channel, callOptions);
        }
      };
    return IntruderServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntruderServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderServerFutureStub>() {
        @java.lang.Override
        public IntruderServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderServerFutureStub(channel, callOptions);
        }
      };
    return IntruderServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 迭代器服务, 两个函数 处理器和生成器,用于引入第三方程序
   * </pre>
   */
  public static abstract class IntruderServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public void intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.ByteData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntruderPayloadProcessorMethod(), responseObserver);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public void intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntruderPayloadGeneratorProviderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIntruderPayloadProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.ByteData,
                BurpGrpc.proto.BurpApiGrpc.ByteData>(
                  this, METHODID_INTRUDER_PAYLOAD_PROCESSOR)))
          .addMethod(
            getIntruderPayloadGeneratorProviderMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
                BurpGrpc.proto.BurpApiGrpc.ByteData>(
                  this, METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER)))
          .build();
    }
  }

  /**
   * <pre>
   * 迭代器服务, 两个函数 处理器和生成器,用于引入第三方程序
   * </pre>
   */
  public static final class IntruderServerStub extends io.grpc.stub.AbstractAsyncStub<IntruderServerStub> {
    private IntruderServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public void intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.ByteData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntruderPayloadProcessorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public void intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntruderPayloadGeneratorProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 迭代器服务, 两个函数 处理器和生成器,用于引入第三方程序
   * </pre>
   */
  public static final class IntruderServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<IntruderServerBlockingStub> {
    private IntruderServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.ByteData intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.ByteData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntruderPayloadProcessorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.ByteData intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntruderPayloadGeneratorProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 迭代器服务, 两个函数 处理器和生成器,用于引入第三方程序
   * </pre>
   */
  public static final class IntruderServerFutureStub extends io.grpc.stub.AbstractFutureStub<IntruderServerFutureStub> {
    private IntruderServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ByteData> intruderPayloadProcessor(
        BurpGrpc.proto.BurpApiGrpc.ByteData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntruderPayloadProcessorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ByteData> intruderPayloadGeneratorProvider(
        BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntruderPayloadGeneratorProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTRUDER_PAYLOAD_PROCESSOR = 0;
  private static final int METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntruderServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntruderServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTRUDER_PAYLOAD_PROCESSOR:
          serviceImpl.intruderPayloadProcessor((BurpGrpc.proto.BurpApiGrpc.ByteData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData>) responseObserver);
          break;
        case METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER:
          serviceImpl.intruderPayloadGeneratorProvider((BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData>) responseObserver);
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

  private static abstract class IntruderServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntruderServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntruderServer");
    }
  }

  private static final class IntruderServerFileDescriptorSupplier
      extends IntruderServerBaseDescriptorSupplier {
    IntruderServerFileDescriptorSupplier() {}
  }

  private static final class IntruderServerMethodDescriptorSupplier
      extends IntruderServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntruderServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntruderServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntruderServerFileDescriptorSupplier())
              .addMethod(getIntruderPayloadProcessorMethod())
              .addMethod(getIntruderPayloadGeneratorProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
