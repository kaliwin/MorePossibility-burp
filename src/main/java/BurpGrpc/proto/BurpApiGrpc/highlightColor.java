// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 注解颜色
 * </pre>
 *
 * Protobuf enum {@code BurpMorePossibilityApi.highlightColor}
 */
public enum highlightColor
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * 没有任何颜色
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  NONE(0),
  /**
   * <code>RED = 1;</code>
   */
  RED(1),
  /**
   * <code>ORANGE = 2;</code>
   */
  ORANGE(2),
  /**
   * <code>YELLOW = 3;</code>
   */
  YELLOW(3),
  /**
   * <code>GREEN = 4;</code>
   */
  GREEN(4),
  /**
   * <code>CYAN = 5;</code>
   */
  CYAN(5),
  /**
   * <code>BLUE = 6;</code>
   */
  BLUE(6),
  /**
   * <code>PINK = 7;</code>
   */
  PINK(7),
  /**
   * <code>MAGENTA = 8;</code>
   */
  MAGENTA(8),
  /**
   * <code>GRAY = 9;</code>
   */
  GRAY(9),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * 没有任何颜色
   * </pre>
   *
   * <code>NONE = 0;</code>
   */
  public static final int NONE_VALUE = 0;
  /**
   * <code>RED = 1;</code>
   */
  public static final int RED_VALUE = 1;
  /**
   * <code>ORANGE = 2;</code>
   */
  public static final int ORANGE_VALUE = 2;
  /**
   * <code>YELLOW = 3;</code>
   */
  public static final int YELLOW_VALUE = 3;
  /**
   * <code>GREEN = 4;</code>
   */
  public static final int GREEN_VALUE = 4;
  /**
   * <code>CYAN = 5;</code>
   */
  public static final int CYAN_VALUE = 5;
  /**
   * <code>BLUE = 6;</code>
   */
  public static final int BLUE_VALUE = 6;
  /**
   * <code>PINK = 7;</code>
   */
  public static final int PINK_VALUE = 7;
  /**
   * <code>MAGENTA = 8;</code>
   */
  public static final int MAGENTA_VALUE = 8;
  /**
   * <code>GRAY = 9;</code>
   */
  public static final int GRAY_VALUE = 9;


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
  public static highlightColor valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static highlightColor forNumber(int value) {
    switch (value) {
      case 0: return NONE;
      case 1: return RED;
      case 2: return ORANGE;
      case 3: return YELLOW;
      case 4: return GREEN;
      case 5: return CYAN;
      case 6: return BLUE;
      case 7: return PINK;
      case 8: return MAGENTA;
      case 9: return GRAY;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<highlightColor>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      highlightColor> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<highlightColor>() {
          public highlightColor findValueByNumber(int number) {
            return highlightColor.forNumber(number);
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
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.getDescriptor().getEnumTypes().get(5);
  }

  private static final highlightColor[] VALUES = values();

  public static highlightColor valueOf(
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

  private highlightColor(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:BurpMorePossibilityApi.highlightColor)
}

