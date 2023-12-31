// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 菜单项返回 给burp 要做的操作
 * </pre>
 *
 * Protobuf type {@code BurpMorePossibilityApi.MenuItemsReturn}
 */
public final class MenuItemsReturn extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BurpMorePossibilityApi.MenuItemsReturn)
    MenuItemsReturnOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MenuItemsReturn.newBuilder() to construct.
  private MenuItemsReturn(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MenuItemsReturn() {
    reqData_ = com.google.protobuf.ByteString.EMPTY;
    resData_ = com.google.protobuf.ByteString.EMPTY;
    selectDate_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MenuItemsReturn();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_MenuItemsReturn_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_MenuItemsReturn_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.class, BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.Builder.class);
  }

  public static final int ISCONTINUE_FIELD_NUMBER = 1;
  private boolean isContinue_ = false;
  /**
   * <pre>
   * 继续不做任何处理
   * </pre>
   *
   * <code>bool IsContinue = 1;</code>
   * @return The isContinue.
   */
  @java.lang.Override
  public boolean getIsContinue() {
    return isContinue_;
  }

  public static final int ISREVISESELECT_FIELD_NUMBER = 2;
  private boolean isReviseSelect_ = false;
  /**
   * <pre>
   * 修改选中数据
   * </pre>
   *
   * <code>bool IsReviseSelect = 2;</code>
   * @return The isReviseSelect.
   */
  @java.lang.Override
  public boolean getIsReviseSelect() {
    return isReviseSelect_;
  }

  public static final int ISREVISEREQ_FIELD_NUMBER = 3;
  private boolean isReviseReq_ = false;
  /**
   * <pre>
   * 修改请求
   * </pre>
   *
   * <code>bool IsReviseReq = 3;</code>
   * @return The isReviseReq.
   */
  @java.lang.Override
  public boolean getIsReviseReq() {
    return isReviseReq_;
  }

  public static final int ISREVISERES_FIELD_NUMBER = 4;
  private boolean isReviseRes_ = false;
  /**
   * <pre>
   * 修改响应 此前burp 可修改重放器响应现在不能 先保留
   * </pre>
   *
   * <code>bool IsReviseRes = 4;</code>
   * @return The isReviseRes.
   */
  @java.lang.Override
  public boolean getIsReviseRes() {
    return isReviseRes_;
  }

  public static final int REQDATA_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString reqData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 请求数据用于覆盖burp 请求   用于修改 http编辑框
   * </pre>
   *
   * <code>bytes ReqData = 5;</code>
   * @return The reqData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getReqData() {
    return reqData_;
  }

  public static final int RESDATA_FIELD_NUMBER = 6;
  private com.google.protobuf.ByteString resData_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 请求数据用于覆盖burp 请求   用于修改 http编辑框
   * </pre>
   *
   * <code>bytes ResData = 6;</code>
   * @return The resData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResData() {
    return resData_;
  }

  public static final int SELECTDATE_FIELD_NUMBER = 7;
  private com.google.protobuf.ByteString selectDate_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * 选中数据 用于替换 用户在重放器选中的数据
   * </pre>
   *
   * <code>bytes SelectDate = 7;</code>
   * @return The selectDate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSelectDate() {
    return selectDate_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (isContinue_ != false) {
      output.writeBool(1, isContinue_);
    }
    if (isReviseSelect_ != false) {
      output.writeBool(2, isReviseSelect_);
    }
    if (isReviseReq_ != false) {
      output.writeBool(3, isReviseReq_);
    }
    if (isReviseRes_ != false) {
      output.writeBool(4, isReviseRes_);
    }
    if (!reqData_.isEmpty()) {
      output.writeBytes(5, reqData_);
    }
    if (!resData_.isEmpty()) {
      output.writeBytes(6, resData_);
    }
    if (!selectDate_.isEmpty()) {
      output.writeBytes(7, selectDate_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isContinue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isContinue_);
    }
    if (isReviseSelect_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isReviseSelect_);
    }
    if (isReviseReq_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isReviseReq_);
    }
    if (isReviseRes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isReviseRes_);
    }
    if (!reqData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, reqData_);
    }
    if (!resData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(6, resData_);
    }
    if (!selectDate_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(7, selectDate_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn other = (BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn) obj;

    if (getIsContinue()
        != other.getIsContinue()) return false;
    if (getIsReviseSelect()
        != other.getIsReviseSelect()) return false;
    if (getIsReviseReq()
        != other.getIsReviseReq()) return false;
    if (getIsReviseRes()
        != other.getIsReviseRes()) return false;
    if (!getReqData()
        .equals(other.getReqData())) return false;
    if (!getResData()
        .equals(other.getResData())) return false;
    if (!getSelectDate()
        .equals(other.getSelectDate())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ISCONTINUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsContinue());
    hash = (37 * hash) + ISREVISESELECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReviseSelect());
    hash = (37 * hash) + ISREVISEREQ_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReviseReq());
    hash = (37 * hash) + ISREVISERES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReviseRes());
    hash = (37 * hash) + REQDATA_FIELD_NUMBER;
    hash = (53 * hash) + getReqData().hashCode();
    hash = (37 * hash) + RESDATA_FIELD_NUMBER;
    hash = (53 * hash) + getResData().hashCode();
    hash = (37 * hash) + SELECTDATE_FIELD_NUMBER;
    hash = (53 * hash) + getSelectDate().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 菜单项返回 给burp 要做的操作
   * </pre>
   *
   * Protobuf type {@code BurpMorePossibilityApi.MenuItemsReturn}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BurpMorePossibilityApi.MenuItemsReturn)
      BurpGrpc.proto.BurpApiGrpc.MenuItemsReturnOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_MenuItemsReturn_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_MenuItemsReturn_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.class, BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      isContinue_ = false;
      isReviseSelect_ = false;
      isReviseReq_ = false;
      isReviseRes_ = false;
      reqData_ = com.google.protobuf.ByteString.EMPTY;
      resData_ = com.google.protobuf.ByteString.EMPTY;
      selectDate_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_MenuItemsReturn_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn build() {
      BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn result = new BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.isContinue_ = isContinue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isReviseSelect_ = isReviseSelect_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.isReviseReq_ = isReviseReq_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.isReviseRes_ = isReviseRes_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.reqData_ = reqData_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.resData_ = resData_;
      }
      if (((from_bitField0_ & 0x00000040) != 0)) {
        result.selectDate_ = selectDate_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn.getDefaultInstance()) return this;
      if (other.getIsContinue() != false) {
        setIsContinue(other.getIsContinue());
      }
      if (other.getIsReviseSelect() != false) {
        setIsReviseSelect(other.getIsReviseSelect());
      }
      if (other.getIsReviseReq() != false) {
        setIsReviseReq(other.getIsReviseReq());
      }
      if (other.getIsReviseRes() != false) {
        setIsReviseRes(other.getIsReviseRes());
      }
      if (other.getReqData() != com.google.protobuf.ByteString.EMPTY) {
        setReqData(other.getReqData());
      }
      if (other.getResData() != com.google.protobuf.ByteString.EMPTY) {
        setResData(other.getResData());
      }
      if (other.getSelectDate() != com.google.protobuf.ByteString.EMPTY) {
        setSelectDate(other.getSelectDate());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              isContinue_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              isReviseSelect_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              isReviseReq_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              isReviseRes_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              reqData_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 50: {
              resData_ = input.readBytes();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            case 58: {
              selectDate_ = input.readBytes();
              bitField0_ |= 0x00000040;
              break;
            } // case 58
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean isContinue_ ;
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool IsContinue = 1;</code>
     * @return The isContinue.
     */
    @java.lang.Override
    public boolean getIsContinue() {
      return isContinue_;
    }
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool IsContinue = 1;</code>
     * @param value The isContinue to set.
     * @return This builder for chaining.
     */
    public Builder setIsContinue(boolean value) {

      isContinue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool IsContinue = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsContinue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      isContinue_ = false;
      onChanged();
      return this;
    }

    private boolean isReviseSelect_ ;
    /**
     * <pre>
     * 修改选中数据
     * </pre>
     *
     * <code>bool IsReviseSelect = 2;</code>
     * @return The isReviseSelect.
     */
    @java.lang.Override
    public boolean getIsReviseSelect() {
      return isReviseSelect_;
    }
    /**
     * <pre>
     * 修改选中数据
     * </pre>
     *
     * <code>bool IsReviseSelect = 2;</code>
     * @param value The isReviseSelect to set.
     * @return This builder for chaining.
     */
    public Builder setIsReviseSelect(boolean value) {

      isReviseSelect_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 修改选中数据
     * </pre>
     *
     * <code>bool IsReviseSelect = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReviseSelect() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isReviseSelect_ = false;
      onChanged();
      return this;
    }

    private boolean isReviseReq_ ;
    /**
     * <pre>
     * 修改请求
     * </pre>
     *
     * <code>bool IsReviseReq = 3;</code>
     * @return The isReviseReq.
     */
    @java.lang.Override
    public boolean getIsReviseReq() {
      return isReviseReq_;
    }
    /**
     * <pre>
     * 修改请求
     * </pre>
     *
     * <code>bool IsReviseReq = 3;</code>
     * @param value The isReviseReq to set.
     * @return This builder for chaining.
     */
    public Builder setIsReviseReq(boolean value) {

      isReviseReq_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 修改请求
     * </pre>
     *
     * <code>bool IsReviseReq = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReviseReq() {
      bitField0_ = (bitField0_ & ~0x00000004);
      isReviseReq_ = false;
      onChanged();
      return this;
    }

    private boolean isReviseRes_ ;
    /**
     * <pre>
     * 修改响应 此前burp 可修改重放器响应现在不能 先保留
     * </pre>
     *
     * <code>bool IsReviseRes = 4;</code>
     * @return The isReviseRes.
     */
    @java.lang.Override
    public boolean getIsReviseRes() {
      return isReviseRes_;
    }
    /**
     * <pre>
     * 修改响应 此前burp 可修改重放器响应现在不能 先保留
     * </pre>
     *
     * <code>bool IsReviseRes = 4;</code>
     * @param value The isReviseRes to set.
     * @return This builder for chaining.
     */
    public Builder setIsReviseRes(boolean value) {

      isReviseRes_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 修改响应 此前burp 可修改重放器响应现在不能 先保留
     * </pre>
     *
     * <code>bool IsReviseRes = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReviseRes() {
      bitField0_ = (bitField0_ & ~0x00000008);
      isReviseRes_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString reqData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ReqData = 5;</code>
     * @return The reqData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getReqData() {
      return reqData_;
    }
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ReqData = 5;</code>
     * @param value The reqData to set.
     * @return This builder for chaining.
     */
    public Builder setReqData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      reqData_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ReqData = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearReqData() {
      bitField0_ = (bitField0_ & ~0x00000010);
      reqData_ = getDefaultInstance().getReqData();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString resData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ResData = 6;</code>
     * @return The resData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getResData() {
      return resData_;
    }
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ResData = 6;</code>
     * @param value The resData to set.
     * @return This builder for chaining.
     */
    public Builder setResData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      resData_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 请求数据用于覆盖burp 请求   用于修改 http编辑框
     * </pre>
     *
     * <code>bytes ResData = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearResData() {
      bitField0_ = (bitField0_ & ~0x00000020);
      resData_ = getDefaultInstance().getResData();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString selectDate_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * 选中数据 用于替换 用户在重放器选中的数据
     * </pre>
     *
     * <code>bytes SelectDate = 7;</code>
     * @return The selectDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSelectDate() {
      return selectDate_;
    }
    /**
     * <pre>
     * 选中数据 用于替换 用户在重放器选中的数据
     * </pre>
     *
     * <code>bytes SelectDate = 7;</code>
     * @param value The selectDate to set.
     * @return This builder for chaining.
     */
    public Builder setSelectDate(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      selectDate_ = value;
      bitField0_ |= 0x00000040;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 选中数据 用于替换 用户在重放器选中的数据
     * </pre>
     *
     * <code>bytes SelectDate = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearSelectDate() {
      bitField0_ = (bitField0_ & ~0x00000040);
      selectDate_ = getDefaultInstance().getSelectDate();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:BurpMorePossibilityApi.MenuItemsReturn)
  }

  // @@protoc_insertion_point(class_scope:BurpMorePossibilityApi.MenuItemsReturn)
  private static final BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn();
  }

  public static BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MenuItemsReturn>
      PARSER = new com.google.protobuf.AbstractParser<MenuItemsReturn>() {
    @java.lang.Override
    public MenuItemsReturn parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<MenuItemsReturn> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MenuItemsReturn> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.MenuItemsReturn getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

