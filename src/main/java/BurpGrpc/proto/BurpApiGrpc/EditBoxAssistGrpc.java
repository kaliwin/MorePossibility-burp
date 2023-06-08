package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 编辑框辅助服务
 * 提供编辑器键值对替换和主动请求渲染编辑器服务
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EditBoxAssistGrpc {

  private EditBoxAssistGrpc() {}

  public static final String SERVICE_NAME = "burpApi.EditBoxAssist";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair,
      BurpGrpc.proto.BurpApiGrpc.Boole> getAddHttpKeyValuePairMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddHttpKeyValuePair",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.Boole.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair,
      BurpGrpc.proto.BurpApiGrpc.Boole> getAddHttpKeyValuePairMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair, BurpGrpc.proto.BurpApiGrpc.Boole> getAddHttpKeyValuePairMethod;
    if ((getAddHttpKeyValuePairMethod = EditBoxAssistGrpc.getAddHttpKeyValuePairMethod) == null) {
      synchronized (EditBoxAssistGrpc.class) {
        if ((getAddHttpKeyValuePairMethod = EditBoxAssistGrpc.getAddHttpKeyValuePairMethod) == null) {
          EditBoxAssistGrpc.getAddHttpKeyValuePairMethod = getAddHttpKeyValuePairMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair, BurpGrpc.proto.BurpApiGrpc.Boole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddHttpKeyValuePair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Boole.getDefaultInstance()))
              .setSchemaDescriptor(new EditBoxAssistMethodDescriptorSupplier("AddHttpKeyValuePair"))
              .build();
        }
      }
    }
    return getAddHttpKeyValuePairMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EditBoxAssistStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistStub>() {
        @java.lang.Override
        public EditBoxAssistStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EditBoxAssistStub(channel, callOptions);
        }
      };
    return EditBoxAssistStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EditBoxAssistBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistBlockingStub>() {
        @java.lang.Override
        public EditBoxAssistBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EditBoxAssistBlockingStub(channel, callOptions);
        }
      };
    return EditBoxAssistBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EditBoxAssistFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EditBoxAssistFutureStub>() {
        @java.lang.Override
        public EditBoxAssistFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EditBoxAssistFutureStub(channel, callOptions);
        }
      };
    return EditBoxAssistFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供编辑器键值对替换和主动请求渲染编辑器服务
   * </pre>
   */
  public static abstract class EditBoxAssistImplBase implements io.grpc.BindableService {

    /**
     */
    public void addHttpKeyValuePair(BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHttpKeyValuePairMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddHttpKeyValuePairMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair,
                BurpGrpc.proto.BurpApiGrpc.Boole>(
                  this, METHODID_ADD_HTTP_KEY_VALUE_PAIR)))
          .build();
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供编辑器键值对替换和主动请求渲染编辑器服务
   * </pre>
   */
  public static final class EditBoxAssistStub extends io.grpc.stub.AbstractAsyncStub<EditBoxAssistStub> {
    private EditBoxAssistStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EditBoxAssistStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EditBoxAssistStub(channel, callOptions);
    }

    /**
     */
    public void addHttpKeyValuePair(BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHttpKeyValuePairMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供编辑器键值对替换和主动请求渲染编辑器服务
   * </pre>
   */
  public static final class EditBoxAssistBlockingStub extends io.grpc.stub.AbstractBlockingStub<EditBoxAssistBlockingStub> {
    private EditBoxAssistBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EditBoxAssistBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EditBoxAssistBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.Boole addHttpKeyValuePair(BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHttpKeyValuePairMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 编辑框辅助服务
   * 提供编辑器键值对替换和主动请求渲染编辑器服务
   * </pre>
   */
  public static final class EditBoxAssistFutureStub extends io.grpc.stub.AbstractFutureStub<EditBoxAssistFutureStub> {
    private EditBoxAssistFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EditBoxAssistFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EditBoxAssistFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.Boole> addHttpKeyValuePair(
        BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHttpKeyValuePairMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_HTTP_KEY_VALUE_PAIR = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EditBoxAssistImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EditBoxAssistImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_HTTP_KEY_VALUE_PAIR:
          serviceImpl.addHttpKeyValuePair((BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair) request,
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

  private static abstract class EditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EditBoxAssistBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EditBoxAssist");
    }
  }

  private static final class EditBoxAssistFileDescriptorSupplier
      extends EditBoxAssistBaseDescriptorSupplier {
    EditBoxAssistFileDescriptorSupplier() {}
  }

  private static final class EditBoxAssistMethodDescriptorSupplier
      extends EditBoxAssistBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EditBoxAssistMethodDescriptorSupplier(String methodName) {
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
      synchronized (EditBoxAssistGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EditBoxAssistFileDescriptorSupplier())
              .addMethod(getAddHttpKeyValuePairMethod())
              .build();
        }
      }
    }
    return result;
  }
}
