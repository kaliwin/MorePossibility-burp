package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 迭代处理器
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntruderPayloadProcessorServerGrpc {

  private IntruderPayloadProcessorServerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.IntruderPayloadProcessorServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "IntruderPayloadProcessor",
      requestType = BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.ByteData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData,
      BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData, BurpGrpc.proto.BurpApiGrpc.ByteData> getIntruderPayloadProcessorMethod;
    if ((getIntruderPayloadProcessorMethod = IntruderPayloadProcessorServerGrpc.getIntruderPayloadProcessorMethod) == null) {
      synchronized (IntruderPayloadProcessorServerGrpc.class) {
        if ((getIntruderPayloadProcessorMethod = IntruderPayloadProcessorServerGrpc.getIntruderPayloadProcessorMethod) == null) {
          IntruderPayloadProcessorServerGrpc.getIntruderPayloadProcessorMethod = getIntruderPayloadProcessorMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData, BurpGrpc.proto.BurpApiGrpc.ByteData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "IntruderPayloadProcessor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ByteData.getDefaultInstance()))
              .setSchemaDescriptor(new IntruderPayloadProcessorServerMethodDescriptorSupplier("IntruderPayloadProcessor"))
              .build();
        }
      }
    }
    return getIntruderPayloadProcessorMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntruderPayloadProcessorServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerStub>() {
        @java.lang.Override
        public IntruderPayloadProcessorServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadProcessorServerStub(channel, callOptions);
        }
      };
    return IntruderPayloadProcessorServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntruderPayloadProcessorServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerBlockingStub>() {
        @java.lang.Override
        public IntruderPayloadProcessorServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadProcessorServerBlockingStub(channel, callOptions);
        }
      };
    return IntruderPayloadProcessorServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntruderPayloadProcessorServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntruderPayloadProcessorServerFutureStub>() {
        @java.lang.Override
        public IntruderPayloadProcessorServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntruderPayloadProcessorServerFutureStub(channel, callOptions);
        }
      };
    return IntruderPayloadProcessorServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 迭代处理器
   * </pre>
   */
  public static abstract class IntruderPayloadProcessorServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public void intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIntruderPayloadProcessorMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getIntruderPayloadProcessorMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData,
                BurpGrpc.proto.BurpApiGrpc.ByteData>(
                  this, METHODID_INTRUDER_PAYLOAD_PROCESSOR)))
          .build();
    }
  }

  /**
   * <pre>
   * 迭代处理器
   * </pre>
   */
  public static final class IntruderPayloadProcessorServerStub extends io.grpc.stub.AbstractAsyncStub<IntruderPayloadProcessorServerStub> {
    private IntruderPayloadProcessorServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadProcessorServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadProcessorServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public void intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.ByteData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIntruderPayloadProcessorMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 迭代处理器
   * </pre>
   */
  public static final class IntruderPayloadProcessorServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<IntruderPayloadProcessorServerBlockingStub> {
    private IntruderPayloadProcessorServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadProcessorServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadProcessorServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.ByteData intruderPayloadProcessor(BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIntruderPayloadProcessorMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 迭代处理器
   * </pre>
   */
  public static final class IntruderPayloadProcessorServerFutureStub extends io.grpc.stub.AbstractFutureStub<IntruderPayloadProcessorServerFutureStub> {
    private IntruderPayloadProcessorServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntruderPayloadProcessorServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntruderPayloadProcessorServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 迭代器载荷处理
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.ByteData> intruderPayloadProcessor(
        BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIntruderPayloadProcessorMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTRUDER_PAYLOAD_PROCESSOR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IntruderPayloadProcessorServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IntruderPayloadProcessorServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTRUDER_PAYLOAD_PROCESSOR:
          serviceImpl.intruderPayloadProcessor((BurpGrpc.proto.BurpApiGrpc.PayloadProcessorData) request,
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

  private static abstract class IntruderPayloadProcessorServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntruderPayloadProcessorServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IntruderPayloadProcessorServer");
    }
  }

  private static final class IntruderPayloadProcessorServerFileDescriptorSupplier
      extends IntruderPayloadProcessorServerBaseDescriptorSupplier {
    IntruderPayloadProcessorServerFileDescriptorSupplier() {}
  }

  private static final class IntruderPayloadProcessorServerMethodDescriptorSupplier
      extends IntruderPayloadProcessorServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IntruderPayloadProcessorServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (IntruderPayloadProcessorServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntruderPayloadProcessorServerFileDescriptorSupplier())
              .addMethod(getIntruderPayloadProcessorMethod())
              .build();
        }
      }
    }
    return result;
  }
}
