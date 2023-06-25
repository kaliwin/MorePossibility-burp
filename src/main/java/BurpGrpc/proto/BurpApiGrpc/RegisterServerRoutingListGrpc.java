package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  注册服务路由列表
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RegisterServerRoutingListGrpc {

  private RegisterServerRoutingListGrpc() {}

  public static final String SERVICE_NAME = "burpApi.RegisterServerRoutingList";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> getRegisterServerListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RegisterServerList",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> getRegisterServerListMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> getRegisterServerListMethod;
    if ((getRegisterServerListMethod = RegisterServerRoutingListGrpc.getRegisterServerListMethod) == null) {
      synchronized (RegisterServerRoutingListGrpc.class) {
        if ((getRegisterServerListMethod = RegisterServerRoutingListGrpc.getRegisterServerListMethod) == null) {
          RegisterServerRoutingListGrpc.getRegisterServerListMethod = getRegisterServerListMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RegisterServerList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList.getDefaultInstance()))
              .setSchemaDescriptor(new RegisterServerRoutingListMethodDescriptorSupplier("RegisterServerList"))
              .build();
        }
      }
    }
    return getRegisterServerListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegisterServerRoutingListStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListStub>() {
        @java.lang.Override
        public RegisterServerRoutingListStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServerRoutingListStub(channel, callOptions);
        }
      };
    return RegisterServerRoutingListStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegisterServerRoutingListBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListBlockingStub>() {
        @java.lang.Override
        public RegisterServerRoutingListBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServerRoutingListBlockingStub(channel, callOptions);
        }
      };
    return RegisterServerRoutingListBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegisterServerRoutingListFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegisterServerRoutingListFutureStub>() {
        @java.lang.Override
        public RegisterServerRoutingListFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegisterServerRoutingListFutureStub(channel, callOptions);
        }
      };
    return RegisterServerRoutingListFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  注册服务路由列表
   * </pre>
   */
  public static abstract class RegisterServerRoutingListImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * 一建注册服务
     * </pre>
     */
    public void registerServerList(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRegisterServerListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterServerListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.Str,
                BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList>(
                  this, METHODID_REGISTER_SERVER_LIST)))
          .build();
    }
  }

  /**
   * <pre>
   *  注册服务路由列表
   * </pre>
   */
  public static final class RegisterServerRoutingListStub extends io.grpc.stub.AbstractAsyncStub<RegisterServerRoutingListStub> {
    private RegisterServerRoutingListStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServerRoutingListStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServerRoutingListStub(channel, callOptions);
    }

    /**
     * <pre>
     * 一建注册服务
     * </pre>
     */
    public void registerServerList(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRegisterServerListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *  注册服务路由列表
   * </pre>
   */
  public static final class RegisterServerRoutingListBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegisterServerRoutingListBlockingStub> {
    private RegisterServerRoutingListBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServerRoutingListBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServerRoutingListBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * 一建注册服务
     * </pre>
     */
    public BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList registerServerList(BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRegisterServerListMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *  注册服务路由列表
   * </pre>
   */
  public static final class RegisterServerRoutingListFutureStub extends io.grpc.stub.AbstractFutureStub<RegisterServerRoutingListFutureStub> {
    private RegisterServerRoutingListFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegisterServerRoutingListFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegisterServerRoutingListFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * 一建注册服务
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList> registerServerList(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRegisterServerListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_SERVER_LIST = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegisterServerRoutingListImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegisterServerRoutingListImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_SERVER_LIST:
          serviceImpl.registerServerList((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.serviceRegisterRoutingList>) responseObserver);
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

  private static abstract class RegisterServerRoutingListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegisterServerRoutingListBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RegisterServerRoutingList");
    }
  }

  private static final class RegisterServerRoutingListFileDescriptorSupplier
      extends RegisterServerRoutingListBaseDescriptorSupplier {
    RegisterServerRoutingListFileDescriptorSupplier() {}
  }

  private static final class RegisterServerRoutingListMethodDescriptorSupplier
      extends RegisterServerRoutingListBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegisterServerRoutingListMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegisterServerRoutingListGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegisterServerRoutingListFileDescriptorSupplier())
              .addMethod(getRegisterServerListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
