package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 迭代器 生成器
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntruderPayloadGeneratorServerGrpc {

  private IntruderPayloadGeneratorServerGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BurpMorePossibilityApi.IntruderPayloadGeneratorServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
      BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> getIntruderPayloadGeneratorProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntruderPayloadGeneratorProvider",
      requestType = BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
      BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> getIntruderPayloadGeneratorProviderMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData, BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> getIntruderPayloadGeneratorProviderMethod;
    if ((getIntruderPayloadGeneratorProviderMethod = IntruderPayloadGeneratorServerGrpc.getIntruderPayloadGeneratorProviderMethod) == null) {
      synchronized (IntruderPayloadGeneratorServerGrpc.class) {
        if ((getIntruderPayloadGeneratorProviderMethod = IntruderPayloadGeneratorServerGrpc.getIntruderPayloadGeneratorProviderMethod) == null) {
          IntruderPayloadGeneratorServerGrpc.getIntruderPayloadGeneratorProviderMethod = getIntruderPayloadGeneratorProviderMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData, BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntruderPayloadGeneratorProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult.getDefaultInstance()))
              .setSchemaDescriptor(new IntruderPayloadGeneratorServerMethodDescriptorSupplier("IntruderPayloadGeneratorProvider"))
              .build();
        }
      }
    }
    return getIntruderPayloadGeneratorProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntruderPayloadGeneratorServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerStub>() {
        @java.lang.Override
        public IntruderPayloadGeneratorServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadGeneratorServerStub(channel, callOptions);
        }
      };
    return IntruderPayloadGeneratorServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntruderPayloadGeneratorServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerBlockingStub>() {
        @java.lang.Override
        public IntruderPayloadGeneratorServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadGeneratorServerBlockingStub(channel, callOptions);
        }
      };
    return IntruderPayloadGeneratorServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntruderPayloadGeneratorServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadGeneratorServerFutureStub>() {
        @java.lang.Override
        public IntruderPayloadGeneratorServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadGeneratorServerFutureStub(channel, callOptions);
        }
      };
    return IntruderPayloadGeneratorServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 迭代器 生成器
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    default void intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntruderPayloadGeneratorProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service IntruderPayloadGeneratorServer.
   * <pre>
   * 迭代器 生成器
   * </pre>
   */
  public static abstract class IntruderPayloadGeneratorServerImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntruderPayloadGeneratorServerGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service IntruderPayloadGeneratorServer.
   * <pre>
   * 迭代器 生成器
   * </pre>
   */
  public static final class IntruderPayloadGeneratorServerStub
      extends io.grpc.stub.AbstractAsyncStub<IntruderPayloadGeneratorServerStub> {
    private IntruderPayloadGeneratorServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadGeneratorServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadGeneratorServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public void intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntruderPayloadGeneratorProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service IntruderPayloadGeneratorServer.
   * <pre>
   * 迭代器 生成器
   * </pre>
   */
  public static final class IntruderPayloadGeneratorServerBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntruderPayloadGeneratorServerBlockingStub> {
    private IntruderPayloadGeneratorServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadGeneratorServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadGeneratorServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult intruderPayloadGeneratorProvider(BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntruderPayloadGeneratorProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service IntruderPayloadGeneratorServer.
   * <pre>
   * 迭代器 生成器
   * </pre>
   */
  public static final class IntruderPayloadGeneratorServerFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntruderPayloadGeneratorServerFutureStub> {
    private IntruderPayloadGeneratorServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadGeneratorServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadGeneratorServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷生成, 服务端流 流终止就为生成结束
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult> intruderPayloadGeneratorProvider(
        BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntruderPayloadGeneratorProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER = 0;

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
        case METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER:
          serviceImpl.intruderPayloadGeneratorProvider((BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult>) responseObserver);
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
          getIntruderPayloadGeneratorProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.IntruderGeneratorData,
              BurpGrpc.proto.BurpApiGrpc.PayloadGeneratorResult>(
                service, METHODID_INTRUDER_PAYLOAD_GENERATOR_PROVIDER)))
        .build();
  }

  private static abstract class IntruderPayloadGeneratorServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntruderPayloadGeneratorServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntruderPayloadGeneratorServer");
    }
  }

  private static final class IntruderPayloadGeneratorServerFileDescriptorSupplier
      extends IntruderPayloadGeneratorServerBaseDescriptorSupplier {
    IntruderPayloadGeneratorServerFileDescriptorSupplier() {}
  }

  private static final class IntruderPayloadGeneratorServerMethodDescriptorSupplier
      extends IntruderPayloadGeneratorServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntruderPayloadGeneratorServerMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntruderPayloadGeneratorServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntruderPayloadGeneratorServerFileDescriptorSupplier())
              .addMethod(getIntruderPayloadGeneratorProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
