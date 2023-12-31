// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * http流量请求数据
 * </pre>
 *
 * Protobuf type {@code BurpMorePossibilityApi.httpFlowReqData}
 */
public final class httpFlowReqData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BurpMorePossibilityApi.httpFlowReqData)
    httpFlowReqDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use httpFlowReqData.newBuilder() to construct.
  private httpFlowReqData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private httpFlowReqData() {
    httpFlowSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new httpFlowReqData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowReqData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowReqData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.class, BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.Builder.class);
  }

  private int bitField0_;
  public static final int HTTPREQGROUP_FIELD_NUMBER = 1;
  private BurpGrpc.proto.BurpApiGrpc.httpReqGroup httpReqGroup_;
  /**
   * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
   * @return Whether the httpReqGroup field is set.
   */
  @java.lang.Override
  public boolean hasHttpReqGroup() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
   * @return The httpReqGroup.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqGroup getHttpReqGroup() {
    return httpReqGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance() : httpReqGroup_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder getHttpReqGroupOrBuilder() {
    return httpReqGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance() : httpReqGroup_;
  }

  public static final int HTTPFLOWSOURCE_FIELD_NUMBER = 2;
  private int httpFlowSource_ = 0;
  /**
   * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The enum numeric value on the wire for httpFlowSource.
   */
  @java.lang.Override public int getHttpFlowSourceValue() {
    return httpFlowSource_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The httpFlowSource.
   */
  @java.lang.Override public BurpGrpc.proto.BurpApiGrpc.httpFlowSource getHttpFlowSource() {
    BurpGrpc.proto.BurpApiGrpc.httpFlowSource result = BurpGrpc.proto.BurpApiGrpc.httpFlowSource.forNumber(httpFlowSource_);
    return result == null ? BurpGrpc.proto.BurpApiGrpc.httpFlowSource.UNRECOGNIZED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getHttpReqGroup());
    }
    if (httpFlowSource_ != BurpGrpc.proto.BurpApiGrpc.httpFlowSource.NULL.getNumber()) {
      output.writeEnum(2, httpFlowSource_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHttpReqGroup());
    }
    if (httpFlowSource_ != BurpGrpc.proto.BurpApiGrpc.httpFlowSource.NULL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, httpFlowSource_);
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.httpFlowReqData)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.httpFlowReqData other = (BurpGrpc.proto.BurpApiGrpc.httpFlowReqData) obj;

    if (hasHttpReqGroup() != other.hasHttpReqGroup()) return false;
    if (hasHttpReqGroup()) {
      if (!getHttpReqGroup()
          .equals(other.getHttpReqGroup())) return false;
    }
    if (httpFlowSource_ != other.httpFlowSource_) return false;
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
    if (hasHttpReqGroup()) {
      hash = (37 * hash) + HTTPREQGROUP_FIELD_NUMBER;
      hash = (53 * hash) + getHttpReqGroup().hashCode();
    }
    hash = (37 * hash) + HTTPFLOWSOURCE_FIELD_NUMBER;
    hash = (53 * hash) + httpFlowSource_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData prototype) {
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
   * http流量请求数据
   * </pre>
   *
   * Protobuf type {@code BurpMorePossibilityApi.httpFlowReqData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BurpMorePossibilityApi.httpFlowReqData)
      BurpGrpc.proto.BurpApiGrpc.httpFlowReqDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowReqData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowReqData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.class, BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.newBuilder()
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
        getHttpReqGroupFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      httpReqGroup_ = null;
      if (httpReqGroupBuilder_ != null) {
        httpReqGroupBuilder_.dispose();
        httpReqGroupBuilder_ = null;
      }
      httpFlowSource_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowReqData_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowReqData getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowReqData build() {
      BurpGrpc.proto.BurpApiGrpc.httpFlowReqData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowReqData buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.httpFlowReqData result = new BurpGrpc.proto.BurpApiGrpc.httpFlowReqData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.httpReqGroup_ = httpReqGroupBuilder_ == null
            ? httpReqGroup_
            : httpReqGroupBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.httpFlowSource_ = httpFlowSource_;
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
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.httpFlowReqData) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.httpFlowReqData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.httpFlowReqData other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.httpFlowReqData.getDefaultInstance()) return this;
      if (other.hasHttpReqGroup()) {
        mergeHttpReqGroup(other.getHttpReqGroup());
      }
      if (other.httpFlowSource_ != 0) {
        setHttpFlowSourceValue(other.getHttpFlowSourceValue());
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
            case 10: {
              input.readMessage(
                  getHttpReqGroupFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              httpFlowSource_ = input.readEnum();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private BurpGrpc.proto.BurpApiGrpc.httpReqGroup httpReqGroup_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqGroup, BurpGrpc.proto.BurpApiGrpc.httpReqGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder> httpReqGroupBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     * @return Whether the httpReqGroup field is set.
     */
    public boolean hasHttpReqGroup() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     * @return The httpReqGroup.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqGroup getHttpReqGroup() {
      if (httpReqGroupBuilder_ == null) {
        return httpReqGroup_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance() : httpReqGroup_;
      } else {
        return httpReqGroupBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public Builder setHttpReqGroup(BurpGrpc.proto.BurpApiGrpc.httpReqGroup value) {
      if (httpReqGroupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpReqGroup_ = value;
      } else {
        httpReqGroupBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public Builder setHttpReqGroup(
        BurpGrpc.proto.BurpApiGrpc.httpReqGroup.Builder builderForValue) {
      if (httpReqGroupBuilder_ == null) {
        httpReqGroup_ = builderForValue.build();
      } else {
        httpReqGroupBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public Builder mergeHttpReqGroup(BurpGrpc.proto.BurpApiGrpc.httpReqGroup value) {
      if (httpReqGroupBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          httpReqGroup_ != null &&
          httpReqGroup_ != BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance()) {
          getHttpReqGroupBuilder().mergeFrom(value);
        } else {
          httpReqGroup_ = value;
        }
      } else {
        httpReqGroupBuilder_.mergeFrom(value);
      }
      if (httpReqGroup_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public Builder clearHttpReqGroup() {
      bitField0_ = (bitField0_ & ~0x00000001);
      httpReqGroup_ = null;
      if (httpReqGroupBuilder_ != null) {
        httpReqGroupBuilder_.dispose();
        httpReqGroupBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqGroup.Builder getHttpReqGroupBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHttpReqGroupFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder getHttpReqGroupOrBuilder() {
      if (httpReqGroupBuilder_ != null) {
        return httpReqGroupBuilder_.getMessageOrBuilder();
      } else {
        return httpReqGroup_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpReqGroup.getDefaultInstance() : httpReqGroup_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqGroup httpReqGroup = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqGroup, BurpGrpc.proto.BurpApiGrpc.httpReqGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder> 
        getHttpReqGroupFieldBuilder() {
      if (httpReqGroupBuilder_ == null) {
        httpReqGroupBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpReqGroup, BurpGrpc.proto.BurpApiGrpc.httpReqGroup.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqGroupOrBuilder>(
                getHttpReqGroup(),
                getParentForChildren(),
                isClean());
        httpReqGroup_ = null;
      }
      return httpReqGroupBuilder_;
    }

    private int httpFlowSource_ = 0;
    /**
     * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
     * @return The enum numeric value on the wire for httpFlowSource.
     */
    @java.lang.Override public int getHttpFlowSourceValue() {
      return httpFlowSource_;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
     * @param value The enum numeric value on the wire for httpFlowSource to set.
     * @return This builder for chaining.
     */
    public Builder setHttpFlowSourceValue(int value) {
      httpFlowSource_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
     * @return The httpFlowSource.
     */
    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowSource getHttpFlowSource() {
      BurpGrpc.proto.BurpApiGrpc.httpFlowSource result = BurpGrpc.proto.BurpApiGrpc.httpFlowSource.forNumber(httpFlowSource_);
      return result == null ? BurpGrpc.proto.BurpApiGrpc.httpFlowSource.UNRECOGNIZED : result;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
     * @param value The httpFlowSource to set.
     * @return This builder for chaining.
     */
    public Builder setHttpFlowSource(BurpGrpc.proto.BurpApiGrpc.httpFlowSource value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      httpFlowSource_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHttpFlowSource() {
      bitField0_ = (bitField0_ & ~0x00000002);
      httpFlowSource_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BurpMorePossibilityApi.httpFlowReqData)
  }

  // @@protoc_insertion_point(class_scope:BurpMorePossibilityApi.httpFlowReqData)
  private static final BurpGrpc.proto.BurpApiGrpc.httpFlowReqData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.httpFlowReqData();
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowReqData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<httpFlowReqData>
      PARSER = new com.google.protobuf.AbstractParser<httpFlowReqData>() {
    @java.lang.Override
    public httpFlowReqData parsePartialFrom(
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

  public static com.google.protobuf.Parser<httpFlowReqData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<httpFlowReqData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpFlowReqData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

