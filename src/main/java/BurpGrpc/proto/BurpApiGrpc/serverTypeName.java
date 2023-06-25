// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 服务类型名称
 * </pre>
 *
 * Protobuf enum {@code burpApi.serverTypeName}
 */
public enum serverTypeName
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 迭代处理器
   * </pre>
   *
   * <code>INTRUDER_PROCESSOR = 0;</code>
   */
  INTRUDER_PROCESSOR(0),
  /**
   * <pre>
   * 迭代生成器
   * </pre>
   *
   * <code>INTRUDER_GENERATE = 1;</code>
   */
  INTRUDER_GENERATE(1),
  /**
   * <pre>
   * 实时流量镜像
   * </pre>
   *
   * <code>REAL_TIME_TRAFFIC_MIRRORING = 2;</code>
   */
  REAL_TIME_TRAFFIC_MIRRORING(2),
  /**
   * <pre>
   * http键值对用于相互转换
   * </pre>
   *
   * <code>HTTP_EDITOR_KEY_VALUE = 3;</code>
   */
  HTTP_EDITOR_KEY_VALUE(3),
  /**
   * <pre>
   * 请求编辑处理器
   * </pre>
   *
   * <code>HTTP_REQUEST_EDITOR_PROCESSOR = 4;</code>
   */
  HTTP_REQUEST_EDITOR_PROCESSOR(4),
  /**
   * <pre>
   * 响应编辑处理器
   * </pre>
   *
   * <code>HTTP_RESPONSE_EDITOR_PROCESSOR = 5;</code>
   */
  HTTP_RESPONSE_EDITOR_PROCESSOR(5),
  /**
   * <pre>
   * 上下文菜单提供程序
   * </pre>
   *
   * <code>CONTEXT_MENU_ITEMS_PROVIDER = 6;</code>
   */
  CONTEXT_MENU_ITEMS_PROVIDER(6),
  /**
   * <pre>
   * 代理请求处理器
   * </pre>
   *
   * <code>PROXY_REQUEST_HANDLER = 7;</code>
   */
  PROXY_REQUEST_HANDLER(7),
  /**
   * <pre>
   * 代理响应处理器
   * </pre>
   *
   * <code>PROXY_RESPONSE_HANDLER = 8;</code>
   */
  PROXY_RESPONSE_HANDLER(8),
  /**
   * <pre>
   * http请求处理器
   * </pre>
   *
   * <code>HTTP_FLOW_HANDLER = 9;</code>
   */
  HTTP_FLOW_HANDLER(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 迭代处理器
   * </pre>
   *
   * <code>INTRUDER_PROCESSOR = 0;</code>
   */
  public static final int INTRUDER_PROCESSOR_VALUE = 0;
  /**
   * <pre>
   * 迭代生成器
   * </pre>
   *
   * <code>INTRUDER_GENERATE = 1;</code>
   */
  public static final int INTRUDER_GENERATE_VALUE = 1;
  /**
   * <pre>
   * 实时流量镜像
   * </pre>
   *
   * <code>REAL_TIME_TRAFFIC_MIRRORING = 2;</code>
   */
  public static final int REAL_TIME_TRAFFIC_MIRRORING_VALUE = 2;
  /**
   * <pre>
   * http键值对用于相互转换
   * </pre>
   *
   * <code>HTTP_EDITOR_KEY_VALUE = 3;</code>
   */
  public static final int HTTP_EDITOR_KEY_VALUE_VALUE = 3;
  /**
   * <pre>
   * 请求编辑处理器
   * </pre>
   *
   * <code>HTTP_REQUEST_EDITOR_PROCESSOR = 4;</code>
   */
  public static final int HTTP_REQUEST_EDITOR_PROCESSOR_VALUE = 4;
  /**
   * <pre>
   * 响应编辑处理器
   * </pre>
   *
   * <code>HTTP_RESPONSE_EDITOR_PROCESSOR = 5;</code>
   */
  public static final int HTTP_RESPONSE_EDITOR_PROCESSOR_VALUE = 5;
  /**
   * <pre>
   * 上下文菜单提供程序
   * </pre>
   *
   * <code>CONTEXT_MENU_ITEMS_PROVIDER = 6;</code>
   */
  public static final int CONTEXT_MENU_ITEMS_PROVIDER_VALUE = 6;
  /**
   * <pre>
   * 代理请求处理器
   * </pre>
   *
   * <code>PROXY_REQUEST_HANDLER = 7;</code>
   */
  public static final int PROXY_REQUEST_HANDLER_VALUE = 7;
  /**
   * <pre>
   * 代理响应处理器
   * </pre>
   *
   * <code>PROXY_RESPONSE_HANDLER = 8;</code>
   */
  public static final int PROXY_RESPONSE_HANDLER_VALUE = 8;
  /**
   * <pre>
   * http请求处理器
   * </pre>
   *
   * <code>HTTP_FLOW_HANDLER = 9;</code>
   */
  public static final int HTTP_FLOW_HANDLER_VALUE = 9;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static serverTypeName valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static serverTypeName forNumber(int value) {
    switch (value) {
      case 0: return INTRUDER_PROCESSOR;
      case 1: return INTRUDER_GENERATE;
      case 2: return REAL_TIME_TRAFFIC_MIRRORING;
      case 3: return HTTP_EDITOR_KEY_VALUE;
      case 4: return HTTP_REQUEST_EDITOR_PROCESSOR;
      case 5: return HTTP_RESPONSE_EDITOR_PROCESSOR;
      case 6: return CONTEXT_MENU_ITEMS_PROVIDER;
      case 7: return PROXY_REQUEST_HANDLER;
      case 8: return PROXY_RESPONSE_HANDLER;
      case 9: return HTTP_FLOW_HANDLER;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<serverTypeName>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      serverTypeName> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<serverTypeName>() {
          public serverTypeName findValueByNumber(int number) {
            return serverTypeName.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor().getEnumTypes().get(1);
  }

  private static final serverTypeName[] VALUES = values();

  public static serverTypeName valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private serverTypeName(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:burpApi.serverTypeName)
}
