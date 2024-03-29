// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * http响应操作
 * </pre>
 *
 * Protobuf type {@code BurpMorePossibilityApi.HttpResponseAction}
 */
public final class HttpResponseAction extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BurpMorePossibilityApi.HttpResponseAction)
    HttpResponseActionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HttpResponseAction.newBuilder() to construct.
  private HttpResponseAction(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HttpResponseAction() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HttpResponseAction();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_HttpResponseAction_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_HttpResponseAction_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.class, BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.Builder.class);
  }

  private int bitField0_;
  public static final int CONTINUE_FIELD_NUMBER = 1;
  private boolean continue_ = false;
  /**
   * <pre>
   * 继续不做任何处理
   * </pre>
   *
   * <code>bool continue = 1;</code>
   * @return The continue.
   */
  @java.lang.Override
  public boolean getContinue() {
    return continue_;
  }

  public static final int ISREVISERES_FIELD_NUMBER = 3;
  private boolean isReviseRes_ = false;
  /**
   * <pre>
   * 修改响应
   * </pre>
   *
   * <code>bool isReviseRes = 3;</code>
   * @return The isReviseRes.
   */
  @java.lang.Override
  public boolean getIsReviseRes() {
    return isReviseRes_;
  }

  public static final int HTTPRESGROUP_FIELD_NUMBER = 4;
  private BurpGrpc.proto.BurpApiGrpc.httpResGroup httpResGroup_;
  /**
   * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
   * @return Whether the httpResGroup field is set.
   */
  @java.lang.Override
  public boolean hasHttpResGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
   * @return The httpResGroup.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpResGroup getHttpResGroup() {
    return httpResGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResGroup.getDefaultInstance() : httpResGroup_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpResGroupOrBuilder getHttpResGroupOrBuilder() {
    return httpResGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResGroup.getDefaultInstance() : httpResGroup_;
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
    if (continue_ != false) {
      output.writeBool(1, continue_);
    }
    if (isReviseRes_ != false) {
      output.writeBool(3, isReviseRes_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(4, getHttpResGroup());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (continue_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, continue_);
    }
    if (isReviseRes_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isReviseRes_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getHttpResGroup());
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.HttpResponseAction)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.HttpResponseAction other = (BurpGrpc.proto.BurpApiGrpc.HttpResponseAction) obj;

    if (getContinue()
        != other.getContinue()) return false;
    if (getIsReviseRes()
        != other.getIsReviseRes()) return false;
    if (hasHttpResGroup() != other.hasHttpResGroup()) return false;
    if (hasHttpResGroup()) {
      if (!getHttpResGroup()
          .equals(other.getHttpResGroup())) return false;
    }
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
    hash = (37 * hash) + CONTINUE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getContinue());
    hash = (37 * hash) + ISREVISERES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReviseRes());
    if (hasHttpResGroup()) {
      hash = (37 * hash) + HTTPRESGROUP_FIELD_NUMBER;
      hash = (53 * hash) + getHttpResGroup().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.HttpResponseAction prototype) {
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
   * http响应操作
   * </pre>
   *
   * Protobuf type {@code BurpMorePossibilityApi.HttpResponseAction}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BurpMorePossibilityApi.HttpResponseAction)
      BurpGrpc.proto.BurpApiGrpc.HttpResponseActionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_HttpResponseAction_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_HttpResponseAction_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.class, BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getHttpResGroupFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      continue_ = false;
      isReviseRes_ = false;
      httpResGroup_ = null;
      if (httpResGroupBuilder_ != null) {
        httpResGroupBuilder_.dispose();
        httpResGroupBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_HttpResponseAction_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.HttpResponseAction getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.HttpResponseAction build() {
      BurpGrpc.proto.BurpApiGrpc.HttpResponseAction result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.HttpResponseAction buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.HttpResponseAction result = new BurpGrpc.proto.BurpApiGrpc.HttpResponseAction(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.HttpResponseAction result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.continue_ = continue_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.isReviseRes_ = isReviseRes_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.httpResGroup_ = httpResGroupBuilder_ == null
            ? httpResGroup_
            : httpResGroupBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.HttpResponseAction) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.HttpResponseAction)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.HttpResponseAction other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.HttpResponseAction.getDefaultInstance()) return this;
      if (other.getContinue() != false) {
        setContinue(other.getContinue());
      }
      if (other.getIsReviseRes() != false) {
        setIsReviseRes(other.getIsReviseRes());
      }
      if (other.hasHttpResGroup()) {
        mergeHttpResGroup(other.getHttpResGroup());
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
              continue_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 24: {
              isReviseRes_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 24
            case 34: {
              input.readMessage(
                  getHttpResGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 34
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

    private boolean continue_ ;
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool continue = 1;</code>
     * @return The continue.
     */
    @java.lang.Override
    public boolean getContinue() {
      return continue_;
    }
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool continue = 1;</code>
     * @param value The continue to set.
     * @return This builder for chaining.
     */
    public Builder setContinue(boolean value) {

      continue_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 继续不做任何处理
     * </pre>
     *
     * <code>bool continue = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearContinue() {
      bitField0_ = (bitField0_ & ~0x00000001);
      continue_ = false;
      onChanged();
      return this;
    }

    private boolean isReviseRes_ ;
    /**
     * <pre>
     * 修改响应
     * </pre>
     *
     * <code>bool isReviseRes = 3;</code>
     * @return The isReviseRes.
     */
    @java.lang.Override
    public boolean getIsReviseRes() {
      return isReviseRes_;
    }
    /**
     * <pre>
     * 修改响应
     * </pre>
     *
     * <code>bool isReviseRes = 3;</code>
     * @param value The isReviseRes to set.
     * @return This builder for chaining.
     */
    public Builder setIsReviseRes(boolean value) {

      isReviseRes_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * 修改响应
     * </pre>
     *
     * <code>bool isReviseRes = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsReviseRes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      isReviseRes_ = false;
      onChanged();
      return this;
    }

    private BurpGrpc.proto.BurpApiGrpc.httpResGroup httpResGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpResGroup, BurpGrpc.proto.BurpApiGrpc.httpResGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpResGroupOrBuilder> httpResGroupBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     * @return Whether the httpResGroup field is set.
     */
    public boolean hasHttpResGroup() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     * @return The httpResGroup.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResGroup getHttpResGroup() {
      if (httpResGroupBuilder_ == null) {
        return httpResGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResGroup.getDefaultInstance() : httpResGroup_;
      } else {
        return httpResGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public Builder setHttpResGroup(BurpGrpc.proto.BurpApiGrpc.httpResGroup value) {
      if (httpResGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpResGroup_ = value;
      } else {
        httpResGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public Builder setHttpResGroup(
        BurpGrpc.proto.BurpApiGrpc.httpResGroup.Builder builderForValue) {
      if (httpResGroupBuilder_ == null) {
        httpResGroup_ = builderForValue.build();
      } else {
        httpResGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public Builder mergeHttpResGroup(BurpGrpc.proto.BurpApiGrpc.httpResGroup value) {
      if (httpResGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          httpResGroup_ != null &&
          httpResGroup_ != BurpGrpc.proto.BurpApiGrpc.httpResGroup.getDefaultInstance()) {
          getHttpResGroupBuilder().mergeFrom(value);
        } else {
          httpResGroup_ = value;
        }
      } else {
        httpResGroupBuilder_.mergeFrom(value);
      }
      if (httpResGroup_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public Builder clearHttpResGroup() {
      bitField0_ = (bitField0_ & ~0x00000004);
      httpResGroup_ = null;
      if (httpResGroupBuilder_ != null) {
        httpResGroupBuilder_.dispose();
        httpResGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResGroup.Builder getHttpResGroupBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getHttpResGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResGroupOrBuilder getHttpResGroupOrBuilder() {
      if (httpResGroupBuilder_ != null) {
        return httpResGroupBuilder_.getMessageOrBuilder();
      } else {
        return httpResGroup_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpResGroup.getDefaultInstance() : httpResGroup_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResGroup httpResGroup = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpResGroup, BurpGrpc.proto.BurpApiGrpc.httpResGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpResGroupOrBuilder> 
        getHttpResGroupFieldBuilder() {
      if (httpResGroupBuilder_ == null) {
        httpResGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpResGroup, BurpGrpc.proto.BurpApiGrpc.httpResGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpResGroupOrBuilder>(
                getHttpResGroup(),
                getParentForChildren(),
                isClean());
        httpResGroup_ = null;
      }
      return httpResGroupBuilder_;
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


    // @@protoc_insertion_point(builder_scope:BurpMorePossibilityApi.HttpResponseAction)
  }

  // @@protoc_insertion_point(class_scope:BurpMorePossibilityApi.HttpResponseAction)
  private static final BurpGrpc.proto.BurpApiGrpc.HttpResponseAction DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.HttpResponseAction();
  }

  public static BurpGrpc.proto.BurpApiGrpc.HttpResponseAction getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpResponseAction>
      PARSER = new com.google.protobuf.AbstractParser<HttpResponseAction>() {
    @java.lang.Override
    public HttpResponseAction parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpResponseAction> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpResponseAction> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.HttpResponseAction getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

