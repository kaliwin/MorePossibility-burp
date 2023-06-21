package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 获取上下文菜单项服务器
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.52.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class GetConTextMenuItemsServerGrpc {

  private GetConTextMenuItemsServerGrpc() {}

  public static final String SERVICE_NAME = "burpApi.GetConTextMenuItemsServer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.MenuInfo> getGetConTextMenuItemsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetConTextMenuItems",
      requestType = BurpGrpc.proto.BurpApiGrpc.Str.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.MenuInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str,
      BurpGrpc.proto.BurpApiGrpc.MenuInfo> getGetConTextMenuItemsMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.MenuInfo> getGetConTextMenuItemsMethod;
    if ((getGetConTextMenuItemsMethod = GetConTextMenuItemsServerGrpc.getGetConTextMenuItemsMethod) == null) {
      synchronized (GetConTextMenuItemsServerGrpc.class) {
        if ((getGetConTextMenuItemsMethod = GetConTextMenuItemsServerGrpc.getGetConTextMenuItemsMethod) == null) {
          GetConTextMenuItemsServerGrpc.getGetConTextMenuItemsMethod = getGetConTextMenuItemsMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.Str, BurpGrpc.proto.BurpApiGrpc.MenuInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetConTextMenuItems"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.Str.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.MenuInfo.getDefaultInstance()))
              .setSchemaDescriptor(new GetConTextMenuItemsServerMethodDescriptorSupplier("GetConTextMenuItems"))
              .build();
        }
      }
    }
    return getGetConTextMenuItemsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static GetConTextMenuItemsServerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerStub>() {
        @java.lang.Override
        public GetConTextMenuItemsServerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetConTextMenuItemsServerStub(channel, callOptions);
        }
      };
    return GetConTextMenuItemsServerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static GetConTextMenuItemsServerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerBlockingStub>() {
        @java.lang.Override
        public GetConTextMenuItemsServerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetConTextMenuItemsServerBlockingStub(channel, callOptions);
        }
      };
    return GetConTextMenuItemsServerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static GetConTextMenuItemsServerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<GetConTextMenuItemsServerFutureStub>() {
        @java.lang.Override
        public GetConTextMenuItemsServerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new GetConTextMenuItemsServerFutureStub(channel, callOptions);
        }
      };
    return GetConTextMenuItemsServerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 获取上下文菜单项服务器
   * </pre>
   */
  public static abstract class GetConTextMenuItemsServerImplBase implements io.grpc.BindableService {

    /**
     */
    public void getConTextMenuItems(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetConTextMenuItemsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetConTextMenuItemsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                BurpGrpc.proto.BurpApiGrpc.Str,
                BurpGrpc.proto.BurpApiGrpc.MenuInfo>(
                  this, METHODID_GET_CON_TEXT_MENU_ITEMS)))
          .build();
    }
  }

  /**
   * <pre>
   * 获取上下文菜单项服务器
   * </pre>
   */
  public static final class GetConTextMenuItemsServerStub extends io.grpc.stub.AbstractAsyncStub<GetConTextMenuItemsServerStub> {
    private GetConTextMenuItemsServerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetConTextMenuItemsServerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetConTextMenuItemsServerStub(channel, callOptions);
    }

    /**
     */
    public void getConTextMenuItems(BurpGrpc.proto.BurpApiGrpc.Str request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetConTextMenuItemsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * 获取上下文菜单项服务器
   * </pre>
   */
  public static final class GetConTextMenuItemsServerBlockingStub extends io.grpc.stub.AbstractBlockingStub<GetConTextMenuItemsServerBlockingStub> {
    private GetConTextMenuItemsServerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetConTextMenuItemsServerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetConTextMenuItemsServerBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.MenuInfo getConTextMenuItems(BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetConTextMenuItemsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * 获取上下文菜单项服务器
   * </pre>
   */
  public static final class GetConTextMenuItemsServerFutureStub extends io.grpc.stub.AbstractFutureStub<GetConTextMenuItemsServerFutureStub> {
    private GetConTextMenuItemsServerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected GetConTextMenuItemsServerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new GetConTextMenuItemsServerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.MenuInfo> getConTextMenuItems(
        BurpGrpc.proto.BurpApiGrpc.Str request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetConTextMenuItemsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_CON_TEXT_MENU_ITEMS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final GetConTextMenuItemsServerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(GetConTextMenuItemsServerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_CON_TEXT_MENU_ITEMS:
          serviceImpl.getConTextMenuItems((BurpGrpc.proto.BurpApiGrpc.Str) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuInfo>) responseObserver);
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

  private static abstract class GetConTextMenuItemsServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    GetConTextMenuItemsServerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("GetConTextMenuItemsServer");
    }
  }

  private static final class GetConTextMenuItemsServerFileDescriptorSupplier
      extends GetConTextMenuItemsServerBaseDescriptorSupplier {
    GetConTextMenuItemsServerFileDescriptorSupplier() {}
  }

  private static final class GetConTextMenuItemsServerMethodDescriptorSupplier
      extends GetConTextMenuItemsServerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    GetConTextMenuItemsServerMethodDescriptorSupplier(String methodName) {
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
      synchronized (GetConTextMenuItemsServerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new GetConTextMenuItemsServerFileDescriptorSupplier())
              .addMethod(getGetConTextMenuItemsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
