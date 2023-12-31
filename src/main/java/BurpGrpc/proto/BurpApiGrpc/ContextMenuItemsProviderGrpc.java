package BurpGrpc.proto.BurpApiGrpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * 右键菜单项执行程序
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.59.1)",
    comments = "Source: burpApi.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ContextMenuItemsProviderGrpc {

  private ContextMenuItemsProviderGrpc() {}

  public static final java.lang.String SERVICE_NAME = "BurpMorePossibilityApi.ContextMenuItemsProvider";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ContextMenuItems,
      BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> getMenuItemsProviderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MenuItemsProvider",
      requestType = BurpGrpc.proto.BurpApiGrpc.ContextMenuItems.class,
      responseType = BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ContextMenuItems,
      BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> getMenuItemsProviderMethod() {
    io.grpc.MethodDescriptor<BurpGrpc.proto.BurpApiGrpc.ContextMenuItems, BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> getMenuItemsProviderMethod;
    if ((getMenuItemsProviderMethod = ContextMenuItemsProviderGrpc.getMenuItemsProviderMethod) == null) {
      synchronized (ContextMenuItemsProviderGrpc.class) {
        if ((getMenuItemsProviderMethod = ContextMenuItemsProviderGrpc.getMenuItemsProviderMethod) == null) {
          ContextMenuItemsProviderGrpc.getMenuItemsProviderMethod = getMenuItemsProviderMethod =
              io.grpc.MethodDescriptor.<BurpGrpc.proto.BurpApiGrpc.ContextMenuItems, BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MenuItemsProvider"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.ContextMenuItems.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.getDefaultInstance()))
              .setSchemaDescriptor(new ContextMenuItemsProviderMethodDescriptorSupplier("MenuItemsProvider"))
              .build();
        }
      }
    }
    return getMenuItemsProviderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ContextMenuItemsProviderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderStub>() {
        @java.lang.Override
        public ContextMenuItemsProviderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextMenuItemsProviderStub(channel, callOptions);
        }
      };
    return ContextMenuItemsProviderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ContextMenuItemsProviderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderBlockingStub>() {
        @java.lang.Override
        public ContextMenuItemsProviderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextMenuItemsProviderBlockingStub(channel, callOptions);
        }
      };
    return ContextMenuItemsProviderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ContextMenuItemsProviderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ContextMenuItemsProviderFutureStub>() {
        @java.lang.Override
        public ContextMenuItemsProviderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ContextMenuItemsProviderFutureStub(channel, callOptions);
        }
      };
    return ContextMenuItemsProviderFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * 右键菜单项执行程序
   * </pre>
   */
  public interface AsyncService {

    /**
     */
    default void menuItemsProvider(BurpGrpc.proto.BurpApiGrpc.ContextMenuItems request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMenuItemsProviderMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ContextMenuItemsProvider.
   * <pre>
   * 右键菜单项执行程序
   * </pre>
   */
  public static abstract class ContextMenuItemsProviderImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ContextMenuItemsProviderGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ContextMenuItemsProvider.
   * <pre>
   * 右键菜单项执行程序
   * </pre>
   */
  public static final class ContextMenuItemsProviderStub
      extends io.grpc.stub.AbstractAsyncStub<ContextMenuItemsProviderStub> {
    private ContextMenuItemsProviderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextMenuItemsProviderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextMenuItemsProviderStub(channel, callOptions);
    }

    /**
     */
    public void menuItemsProvider(BurpGrpc.proto.BurpApiGrpc.ContextMenuItems request,
        io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMenuItemsProviderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ContextMenuItemsProvider.
   * <pre>
   * 右键菜单项执行程序
   * </pre>
   */
  public static final class ContextMenuItemsProviderBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ContextMenuItemsProviderBlockingStub> {
    private ContextMenuItemsProviderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextMenuItemsProviderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextMenuItemsProviderBlockingStub(channel, callOptions);
    }

    /**
     */
    public BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn menuItemsProvider(BurpGrpc.proto.BurpApiGrpc.ContextMenuItems request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMenuItemsProviderMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ContextMenuItemsProvider.
   * <pre>
   * 右键菜单项执行程序
   * </pre>
   */
  public static final class ContextMenuItemsProviderFutureStub
      extends io.grpc.stub.AbstractFutureStub<ContextMenuItemsProviderFutureStub> {
    private ContextMenuItemsProviderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ContextMenuItemsProviderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ContextMenuItemsProviderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn> menuItemsProvider(
        BurpGrpc.proto.BurpApiGrpc.ContextMenuItems request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMenuItemsProviderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MENU_ITEMS_PROVIDER = 0;

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
        case METHODID_MENU_ITEMS_PROVIDER:
          serviceImpl.menuItemsProvider((BurpGrpc.proto.BurpApiGrpc.ContextMenuItems) request,
              (io.grpc.stub.StreamObserver<BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn>) responseObserver);
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
          getMenuItemsProviderMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              BurpGrpc.proto.BurpApiGrpc.ContextMenuItems,
              BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn>(
                service, METHODID_MENU_ITEMS_PROVIDER)))
        .build();
  }

  private static abstract class ContextMenuItemsProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ContextMenuItemsProviderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ContextMenuItemsProvider");
    }
  }

  private static final class ContextMenuItemsProviderFileDescriptorSupplier
      extends ContextMenuItemsProviderBaseDescriptorSupplier {
    ContextMenuItemsProviderFileDescriptorSupplier() {}
  }

  private static final class ContextMenuItemsProviderMethodDescriptorSupplier
      extends ContextMenuItemsProviderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ContextMenuItemsProviderMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ContextMenuItemsProviderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ContextMenuItemsProviderFileDescriptorSupplier())
              .addMethod(getMenuItemsProviderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
