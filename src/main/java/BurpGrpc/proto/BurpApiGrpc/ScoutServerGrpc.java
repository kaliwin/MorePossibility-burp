package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 侦查服务  未实现
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ScoutServerGrpc {

  private ScoutServerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.ScoutServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue,
      BurpGrpc.proto.BurpApiGrpc.processingStatus> getAddHttpEditorEncryptAndDecryptKeyValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHttpEditorEncryptAndDecryptKeyValue",
      requestType = BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.processingStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue,
      BurpGrpc.proto.BurpApiGrpc.processingStatus> getAddHttpEditorEncryptAndDecryptKeyValueMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue, BurpGrpc.proto.BurpApiGrpc.processingStatus> getAddHttpEditorEncryptAndDecryptKeyValueMethod;
    if ((getAddHttpEditorEncryptAndDecryptKeyValueMethod = ScoutServerGrpc.getAddHttpEditorEncryptAndDecryptKeyValueMethod) == null) {
      synchronized (ScoutServerGrpc.class) {
        if ((getAddHttpEditorEncryptAndDecryptKeyValueMethod = ScoutServerGrpc.getAddHttpEditorEncryptAndDecryptKeyValueMethod) == null) {
          ScoutServerGrpc.getAddHttpEditorEncryptAndDecryptKeyValueMethod = getAddHttpEditorEncryptAndDecryptKeyValueMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue, BurpGrpc.proto.BurpApiGrpc.processingStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHttpEditorEncryptAndDecryptKeyValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.processingStatus.getDefaultInstance()))
              .setSchemaDescriptor(new ScoutServerMethodDescriptorSupplier("addHttpEditorEncryptAndDecryptKeyValue"))
              .build();
        }
      }
    }
    return getAddHttpEditorEncryptAndDecryptKeyValueMethod;
  }

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
    if ((getAddHttpKeyValuePairMethod = ScoutServerGrpc.getAddHttpKeyValuePairMethod) == null) {
      synchronized (ScoutServerGrpc.class) {
        if ((getAddHttpKeyValuePairMethod = ScoutServerGrpc.getAddHttpKeyValuePairMethod) == null) {
          ScoutServerGrpc.getAddHttpKeyValuePairMethod = getAddHttpKeyValuePairMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair, BurpGrpc.proto.BurpApiGrpc.Boole>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddHttpKeyValuePair"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Boole.getDefaultInstance()))
              .setSchemaDescriptor(new ScoutServerMethodDescriptorSupplier("AddHttpKeyValuePair"))
              .build();
        }
      }
    }
    return getAddHttpKeyValuePairMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ScoutServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoutServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoutServerStub>() {
        @java.lang.Override
        public ScoutServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoutServerStub(channel, callOptions);
        }
      };
    return ScoutServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ScoutServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoutServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoutServerBlockingStub>() {
        @java.lang.Override
        public ScoutServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoutServerBlockingStub(channel, callOptions);
        }
      };
    return ScoutServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ScoutServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ScoutServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ScoutServerFutureStub>() {
        @java.lang.Override
        public ScoutServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ScoutServerFutureStub(channel, callOptions);
        }
      };
    return ScoutServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 侦查服务  未实现
   * </pre>
   */
  public static abstract class ScoutServerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 添加http编辑器加解密键值对 参数为http编辑组件名称以及key、value
     * </pre>
     */
    public void addHttpEditorEncryptAndDecryptKeyValue(BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHttpEditorEncryptAndDecryptKeyValueMethod(), responseObserver);
    }

    /**
     */
    public void addHttpKeyValuePair(BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.Boole> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHttpKeyValuePairMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddHttpEditorEncryptAndDecryptKeyValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue,
                BurpGrpc.proto.BurpApiGrpc.processingStatus>(
                  this, METHODID_ADD_HTTP_EDITOR_ENCRYPT_AND_DECRYPT_KEY_VALUE)))
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
   * 侦查服务  未实现
   * </pre>
   */
  public static final class ScoutServerStub extends io.grpc.stub.AbstractAsyncStub<ScoutServerStub> {
    private ScoutServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoutServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoutServerStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加http编辑器加解密键值对 参数为http编辑组件名称以及key、value
     * </pre>
     */
    public void addHttpEditorEncryptAndDecryptKeyValue(BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHttpEditorEncryptAndDecryptKeyValueMethod(), getCallOptions()), request, responseObserver);
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
   * 侦查服务  未实现
   * </pre>
   */
  public static final class ScoutServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<ScoutServerBlockingStub> {
    private ScoutServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoutServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoutServerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加http编辑器加解密键值对 参数为http编辑组件名称以及key、value
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.processingStatus addHttpEditorEncryptAndDecryptKeyValue(BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHttpEditorEncryptAndDecryptKeyValueMethod(), getCallOptions(), request);
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
   * 侦查服务  未实现
   * </pre>
   */
  public static final class ScoutServerFutureStub extends io.grpc.stub.AbstractFutureStub<ScoutServerFutureStub> {
    private ScoutServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ScoutServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ScoutServerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 添加http编辑器加解密键值对 参数为http编辑组件名称以及key、value
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.processingStatus> addHttpEditorEncryptAndDecryptKeyValue(
        BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHttpEditorEncryptAndDecryptKeyValueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.Boole> addHttpKeyValuePair(
        BurpGrpc.proto.BurpApiGrpc.httpKeyValuePair request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHttpKeyValuePairMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_HTTP_EDITOR_ENCRYPT_AND_DECRYPT_KEY_VALUE = 0;
  private static final int METHODID_ADD_HTTP_KEY_VALUE_PAIR = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ScoutServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ScoutServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_HTTP_EDITOR_ENCRYPT_AND_DECRYPT_KEY_VALUE:
          serviceImpl.addHttpEditorEncryptAndDecryptKeyValue((BurpGrpc.proto.BurpApiGrpc.httpEditorKeyValue) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.processingStatus>) responseObserver);
          break;
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

  private static abstract class ScoutServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ScoutServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ScoutServer");
    }
  }

  private static final class ScoutServerFileDescriptorSupplier
      extends ScoutServerBaseDescriptorSupplier {
    ScoutServerFileDescriptorSupplier() {}
  }

  private static final class ScoutServerMethodDescriptorSupplier
      extends ScoutServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ScoutServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (ScoutServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ScoutServerFileDescriptorSupplier())
              .addMethod(getAddHttpEditorEncryptAndDecryptKeyValueMethod())
              .addMethod(getAddHttpKeyValuePairMethod())
              .build();
        }
      }
    }
    return result;
  }
}
