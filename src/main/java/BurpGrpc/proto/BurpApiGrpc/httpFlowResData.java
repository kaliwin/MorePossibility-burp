// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * http流量响应数据
 * </pre>
 *
 * Protobuf type {@code BurpMorePossibilityApi.httpFlowResData}
 */
public final class httpFlowResData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BurpMorePossibilityApi.httpFlowResData)
    httpFlowResDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use httpFlowResData.newBuilder() to construct.
  private httpFlowResData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private httpFlowResData() {
    httpFlowSource_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new httpFlowResData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowResData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowResData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.httpFlowResData.class, BurpGrpc.proto.BurpApiGrpc.httpFlowResData.Builder.class);
  }

  private int bitField0_;
  public static final int HTTPREQANDRES_FIELD_NUMBER = 1;
  private BurpGrpc.proto.BurpApiGrpc.httpReqAndRes httpReqAndRes_;
  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   * @return Whether the httpReqAndRes field is set.
   */
  @java.lang.Override
  public boolean hasHttpReqAndRes() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   * @return The httpReqAndRes.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getHttpReqAndRes() {
    return httpReqAndRes_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance() : httpReqAndRes_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder getHttpReqAndResOrBuilder() {
    return httpReqAndRes_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance() : httpReqAndRes_;
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
      output.writeMessage(1, getHttpReqAndRes());
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
        .computeMessageSize(1, getHttpReqAndRes());
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.httpFlowResData)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.httpFlowResData other = (BurpGrpc.proto.BurpApiGrpc.httpFlowResData) obj;

    if (hasHttpReqAndRes() != other.hasHttpReqAndRes()) return false;
    if (hasHttpReqAndRes()) {
      if (!getHttpReqAndRes()
          .equals(other.getHttpReqAndRes())) return false;
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
    if (hasHttpReqAndRes()) {
      hash = (37 * hash) + HTTPREQANDRES_FIELD_NUMBER;
      hash = (53 * hash) + getHttpReqAndRes().hashCode();
    }
    hash = (37 * hash) + HTTPFLOWSOURCE_FIELD_NUMBER;
    hash = (53 * hash) + httpFlowSource_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.httpFlowResData prototype) {
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
   * http流量响应数据
   * </pre>
   *
   * Protobuf type {@code BurpMorePossibilityApi.httpFlowResData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BurpMorePossibilityApi.httpFlowResData)
      BurpGrpc.proto.BurpApiGrpc.httpFlowResDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowResData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowResData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.httpFlowResData.class, BurpGrpc.proto.BurpApiGrpc.httpFlowResData.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.httpFlowResData.newBuilder()
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
        getHttpReqAndResFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      httpReqAndRes_ = null;
      if (httpReqAndResBuilder_ != null) {
        httpReqAndResBuilder_.dispose();
        httpReqAndResBuilder_ = null;
      }
      httpFlowSource_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpFlowResData_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowResData getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.httpFlowResData.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowResData build() {
      BurpGrpc.proto.BurpApiGrpc.httpFlowResData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpFlowResData buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.httpFlowResData result = new BurpGrpc.proto.BurpApiGrpc.httpFlowResData(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.httpFlowResData result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.httpReqAndRes_ = httpReqAndResBuilder_ == null
            ? httpReqAndRes_
            : httpReqAndResBuilder_.build();
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
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.httpFlowResData) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.httpFlowResData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.httpFlowResData other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.httpFlowResData.getDefaultInstance()) return this;
      if (other.hasHttpReqAndRes()) {
        mergeHttpReqAndRes(other.getHttpReqAndRes());
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
                  getHttpReqAndResFieldBuilder().getBuilder(),
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

    private BurpGrpc.proto.BurpApiGrpc.httpReqAndRes httpReqAndRes_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder> httpReqAndResBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     * @return Whether the httpReqAndRes field is set.
     */
    public boolean hasHttpReqAndRes() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     * @return The httpReqAndRes.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getHttpReqAndRes() {
      if (httpReqAndResBuilder_ == null) {
        return httpReqAndRes_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance() : httpReqAndRes_;
      } else {
        return httpReqAndResBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public Builder setHttpReqAndRes(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes value) {
      if (httpReqAndResBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        httpReqAndRes_ = value;
      } else {
        httpReqAndResBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public Builder setHttpReqAndRes(
        BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder builderForValue) {
      if (httpReqAndResBuilder_ == null) {
        httpReqAndRes_ = builderForValue.build();
      } else {
        httpReqAndResBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public Builder mergeHttpReqAndRes(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes value) {
      if (httpReqAndResBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          httpReqAndRes_ != null &&
          httpReqAndRes_ != BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()) {
          getHttpReqAndResBuilder().mergeFrom(value);
        } else {
          httpReqAndRes_ = value;
        }
      } else {
        httpReqAndResBuilder_.mergeFrom(value);
      }
      if (httpReqAndRes_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public Builder clearHttpReqAndRes() {
      bitField0_ = (bitField0_ & ~0x00000001);
      httpReqAndRes_ = null;
      if (httpReqAndResBuilder_ != null) {
        httpReqAndResBuilder_.dispose();
        httpReqAndResBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder getHttpReqAndResBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getHttpReqAndResFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder getHttpReqAndResOrBuilder() {
      if (httpReqAndResBuilder_ != null) {
        return httpReqAndResBuilder_.getMessageOrBuilder();
      } else {
        return httpReqAndRes_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance() : httpReqAndRes_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder> 
        getHttpReqAndResFieldBuilder() {
      if (httpReqAndResBuilder_ == null) {
        httpReqAndResBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpReqAndRes, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder>(
                getHttpReqAndRes(),
                getParentForChildren(),
                isClean());
        httpReqAndRes_ = null;
      }
      return httpReqAndResBuilder_;
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


    // @@protoc_insertion_point(builder_scope:BurpMorePossibilityApi.httpFlowResData)
  }

  // @@protoc_insertion_point(class_scope:BurpMorePossibilityApi.httpFlowResData)
  private static final BurpGrpc.proto.BurpApiGrpc.httpFlowResData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.httpFlowResData();
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpFlowResData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<httpFlowResData>
      PARSER = new com.google.protobuf.AbstractParser<httpFlowResData>() {
    @java.lang.Override
    public httpFlowResData parsePartialFrom(
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

  public static com.google.protobuf.Parser<httpFlowResData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<httpFlowResData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpFlowResData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

