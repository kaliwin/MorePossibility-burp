// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

/**
 * <pre>
 * 一组http请求 (请求和响应)
 * </pre>
 *
 * Protobuf type {@code BurpMorePossibilityApi.httpReqAndRes}
 */
public final class httpReqAndRes extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BurpMorePossibilityApi.httpReqAndRes)
    httpReqAndResOrBuilder {
private static final long serialVersionUID = 0L;
  // Use httpReqAndRes.newBuilder() to construct.
  private httpReqAndRes(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private httpReqAndRes() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new httpReqAndRes();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpReqAndRes_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpReqAndRes_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder.class);
  }

  private int bitField0_;
  public static final int REQ_FIELD_NUMBER = 1;
  private BurpGrpc.proto.BurpApiGrpc.httpReqData req_;
  /**
   * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
   * @return Whether the req field is set.
   */
  @java.lang.Override
  public boolean hasReq() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
   * @return The req.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqData getReq() {
    return req_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqData.getDefaultInstance() : req_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqDataOrBuilder getReqOrBuilder() {
    return req_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqData.getDefaultInstance() : req_;
  }

  public static final int RES_FIELD_NUMBER = 2;
  private BurpGrpc.proto.BurpApiGrpc.httpResData res_;
  /**
   * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
   * @return Whether the res field is set.
   */
  @java.lang.Override
  public boolean hasRes() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
   * @return The res.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpResData getRes() {
    return res_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResData.getDefaultInstance() : res_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpResDataOrBuilder getResOrBuilder() {
    return res_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResData.getDefaultInstance() : res_;
  }

  public static final int INFO_FIELD_NUMBER = 3;
  private BurpGrpc.proto.BurpApiGrpc.httpInfo info_;
  /**
   * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
   * @return Whether the info field is set.
   */
  @java.lang.Override
  public boolean hasInfo() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
   * @return The info.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpInfo getInfo() {
    return info_ == null ? BurpGrpc.proto.BurpApiGrpc.httpInfo.getDefaultInstance() : info_;
  }
  /**
   * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpInfoOrBuilder getInfoOrBuilder() {
    return info_ == null ? BurpGrpc.proto.BurpApiGrpc.httpInfo.getDefaultInstance() : info_;
  }

  public static final int ANNOTATIONSTEXT_FIELD_NUMBER = 4;
  private BurpGrpc.proto.BurpApiGrpc.annotationsText annotationsText_;
  /**
   * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
   * @return Whether the annotationsText field is set.
   */
  @java.lang.Override
  public boolean hasAnnotationsText() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
   * @return The annotationsText.
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.annotationsText getAnnotationsText() {
    return annotationsText_ == null ? BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance() : annotationsText_;
  }
  /**
   * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
   */
  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder getAnnotationsTextOrBuilder() {
    return annotationsText_ == null ? BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance() : annotationsText_;
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
      output.writeMessage(1, getReq());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getRes());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(3, getInfo());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeMessage(4, getAnnotationsText());
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
        .computeMessageSize(1, getReq());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getRes());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInfo());
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getAnnotationsText());
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
    if (!(obj instanceof BurpGrpc.proto.BurpApiGrpc.httpReqAndRes)) {
      return super.equals(obj);
    }
    BurpGrpc.proto.BurpApiGrpc.httpReqAndRes other = (BurpGrpc.proto.BurpApiGrpc.httpReqAndRes) obj;

    if (hasReq() != other.hasReq()) return false;
    if (hasReq()) {
      if (!getReq()
          .equals(other.getReq())) return false;
    }
    if (hasRes() != other.hasRes()) return false;
    if (hasRes()) {
      if (!getRes()
          .equals(other.getRes())) return false;
    }
    if (hasInfo() != other.hasInfo()) return false;
    if (hasInfo()) {
      if (!getInfo()
          .equals(other.getInfo())) return false;
    }
    if (hasAnnotationsText() != other.hasAnnotationsText()) return false;
    if (hasAnnotationsText()) {
      if (!getAnnotationsText()
          .equals(other.getAnnotationsText())) return false;
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
    if (hasReq()) {
      hash = (37 * hash) + REQ_FIELD_NUMBER;
      hash = (53 * hash) + getReq().hashCode();
    }
    if (hasRes()) {
      hash = (37 * hash) + RES_FIELD_NUMBER;
      hash = (53 * hash) + getRes().hashCode();
    }
    if (hasInfo()) {
      hash = (37 * hash) + INFO_FIELD_NUMBER;
      hash = (53 * hash) + getInfo().hashCode();
    }
    if (hasAnnotationsText()) {
      hash = (37 * hash) + ANNOTATIONSTEXT_FIELD_NUMBER;
      hash = (53 * hash) + getAnnotationsText().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes parseFrom(
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
  public static Builder newBuilder(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes prototype) {
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
   * 一组http请求 (请求和响应)
   * </pre>
   *
   * Protobuf type {@code BurpMorePossibilityApi.httpReqAndRes}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BurpMorePossibilityApi.httpReqAndRes)
      BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpReqAndRes_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpReqAndRes_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.class, BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.Builder.class);
    }

    // Construct using BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.newBuilder()
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
        getReqFieldBuilder();
        getResFieldBuilder();
        getInfoFieldBuilder();
        getAnnotationsTextFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      req_ = null;
      if (reqBuilder_ != null) {
        reqBuilder_.dispose();
        reqBuilder_ = null;
      }
      res_ = null;
      if (resBuilder_ != null) {
        resBuilder_.dispose();
        resBuilder_ = null;
      }
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      annotationsText_ = null;
      if (annotationsTextBuilder_ != null) {
        annotationsTextBuilder_.dispose();
        annotationsTextBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return BurpGrpc.proto.BurpApiGrpc.BurpApi.internal_static_BurpMorePossibilityApi_httpReqAndRes_descriptor;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getDefaultInstanceForType() {
      return BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance();
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes build() {
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes buildPartial() {
      BurpGrpc.proto.BurpApiGrpc.httpReqAndRes result = new BurpGrpc.proto.BurpApiGrpc.httpReqAndRes(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.req_ = reqBuilder_ == null
            ? req_
            : reqBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.res_ = resBuilder_ == null
            ? res_
            : resBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.info_ = infoBuilder_ == null
            ? info_
            : infoBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.annotationsText_ = annotationsTextBuilder_ == null
            ? annotationsText_
            : annotationsTextBuilder_.build();
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof BurpGrpc.proto.BurpApiGrpc.httpReqAndRes) {
        return mergeFrom((BurpGrpc.proto.BurpApiGrpc.httpReqAndRes)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(BurpGrpc.proto.BurpApiGrpc.httpReqAndRes other) {
      if (other == BurpGrpc.proto.BurpApiGrpc.httpReqAndRes.getDefaultInstance()) return this;
      if (other.hasReq()) {
        mergeReq(other.getReq());
      }
      if (other.hasRes()) {
        mergeRes(other.getRes());
      }
      if (other.hasInfo()) {
        mergeInfo(other.getInfo());
      }
      if (other.hasAnnotationsText()) {
        mergeAnnotationsText(other.getAnnotationsText());
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
                  getReqFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getResFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getAnnotationsTextFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
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

    private BurpGrpc.proto.BurpApiGrpc.httpReqData req_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqData, BurpGrpc.proto.BurpApiGrpc.httpReqData.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqDataOrBuilder> reqBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     * @return Whether the req field is set.
     */
    public boolean hasReq() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     * @return The req.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqData getReq() {
      if (reqBuilder_ == null) {
        return req_ == null ? BurpGrpc.proto.BurpApiGrpc.httpReqData.getDefaultInstance() : req_;
      } else {
        return reqBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public Builder setReq(BurpGrpc.proto.BurpApiGrpc.httpReqData value) {
      if (reqBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        req_ = value;
      } else {
        reqBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public Builder setReq(
        BurpGrpc.proto.BurpApiGrpc.httpReqData.Builder builderForValue) {
      if (reqBuilder_ == null) {
        req_ = builderForValue.build();
      } else {
        reqBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public Builder mergeReq(BurpGrpc.proto.BurpApiGrpc.httpReqData value) {
      if (reqBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          req_ != null &&
          req_ != BurpGrpc.proto.BurpApiGrpc.httpReqData.getDefaultInstance()) {
          getReqBuilder().mergeFrom(value);
        } else {
          req_ = value;
        }
      } else {
        reqBuilder_.mergeFrom(value);
      }
      if (req_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public Builder clearReq() {
      bitField0_ = (bitField0_ & ~0x00000001);
      req_ = null;
      if (reqBuilder_ != null) {
        reqBuilder_.dispose();
        reqBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqData.Builder getReqBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReqFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpReqDataOrBuilder getReqOrBuilder() {
      if (reqBuilder_ != null) {
        return reqBuilder_.getMessageOrBuilder();
      } else {
        return req_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpReqData.getDefaultInstance() : req_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpReqData req = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpReqData, BurpGrpc.proto.BurpApiGrpc.httpReqData.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqDataOrBuilder> 
        getReqFieldBuilder() {
      if (reqBuilder_ == null) {
        reqBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpReqData, BurpGrpc.proto.BurpApiGrpc.httpReqData.Builder, BurpGrpc.proto.BurpApiGrpc.httpReqDataOrBuilder>(
                getReq(),
                getParentForChildren(),
                isClean());
        req_ = null;
      }
      return reqBuilder_;
    }

    private BurpGrpc.proto.BurpApiGrpc.httpResData res_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpResData, BurpGrpc.proto.BurpApiGrpc.httpResData.Builder, BurpGrpc.proto.BurpApiGrpc.httpResDataOrBuilder> resBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     * @return Whether the res field is set.
     */
    public boolean hasRes() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     * @return The res.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResData getRes() {
      if (resBuilder_ == null) {
        return res_ == null ? BurpGrpc.proto.BurpApiGrpc.httpResData.getDefaultInstance() : res_;
      } else {
        return resBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public Builder setRes(BurpGrpc.proto.BurpApiGrpc.httpResData value) {
      if (resBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        res_ = value;
      } else {
        resBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public Builder setRes(
        BurpGrpc.proto.BurpApiGrpc.httpResData.Builder builderForValue) {
      if (resBuilder_ == null) {
        res_ = builderForValue.build();
      } else {
        resBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public Builder mergeRes(BurpGrpc.proto.BurpApiGrpc.httpResData value) {
      if (resBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          res_ != null &&
          res_ != BurpGrpc.proto.BurpApiGrpc.httpResData.getDefaultInstance()) {
          getResBuilder().mergeFrom(value);
        } else {
          res_ = value;
        }
      } else {
        resBuilder_.mergeFrom(value);
      }
      if (res_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public Builder clearRes() {
      bitField0_ = (bitField0_ & ~0x00000002);
      res_ = null;
      if (resBuilder_ != null) {
        resBuilder_.dispose();
        resBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResData.Builder getResBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getResFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpResDataOrBuilder getResOrBuilder() {
      if (resBuilder_ != null) {
        return resBuilder_.getMessageOrBuilder();
      } else {
        return res_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpResData.getDefaultInstance() : res_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpResData res = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpResData, BurpGrpc.proto.BurpApiGrpc.httpResData.Builder, BurpGrpc.proto.BurpApiGrpc.httpResDataOrBuilder> 
        getResFieldBuilder() {
      if (resBuilder_ == null) {
        resBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpResData, BurpGrpc.proto.BurpApiGrpc.httpResData.Builder, BurpGrpc.proto.BurpApiGrpc.httpResDataOrBuilder>(
                getRes(),
                getParentForChildren(),
                isClean());
        res_ = null;
      }
      return resBuilder_;
    }

    private BurpGrpc.proto.BurpApiGrpc.httpInfo info_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpInfo, BurpGrpc.proto.BurpApiGrpc.httpInfo.Builder, BurpGrpc.proto.BurpApiGrpc.httpInfoOrBuilder> infoBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     * @return Whether the info field is set.
     */
    public boolean hasInfo() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     * @return The info.
     */
    public BurpGrpc.proto.BurpApiGrpc.httpInfo getInfo() {
      if (infoBuilder_ == null) {
        return info_ == null ? BurpGrpc.proto.BurpApiGrpc.httpInfo.getDefaultInstance() : info_;
      } else {
        return infoBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public Builder setInfo(BurpGrpc.proto.BurpApiGrpc.httpInfo value) {
      if (infoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        info_ = value;
      } else {
        infoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public Builder setInfo(
        BurpGrpc.proto.BurpApiGrpc.httpInfo.Builder builderForValue) {
      if (infoBuilder_ == null) {
        info_ = builderForValue.build();
      } else {
        infoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public Builder mergeInfo(BurpGrpc.proto.BurpApiGrpc.httpInfo value) {
      if (infoBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          info_ != null &&
          info_ != BurpGrpc.proto.BurpApiGrpc.httpInfo.getDefaultInstance()) {
          getInfoBuilder().mergeFrom(value);
        } else {
          info_ = value;
        }
      } else {
        infoBuilder_.mergeFrom(value);
      }
      if (info_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public Builder clearInfo() {
      bitField0_ = (bitField0_ & ~0x00000004);
      info_ = null;
      if (infoBuilder_ != null) {
        infoBuilder_.dispose();
        infoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpInfo.Builder getInfoBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.httpInfoOrBuilder getInfoOrBuilder() {
      if (infoBuilder_ != null) {
        return infoBuilder_.getMessageOrBuilder();
      } else {
        return info_ == null ?
            BurpGrpc.proto.BurpApiGrpc.httpInfo.getDefaultInstance() : info_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.httpInfo info = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.httpInfo, BurpGrpc.proto.BurpApiGrpc.httpInfo.Builder, BurpGrpc.proto.BurpApiGrpc.httpInfoOrBuilder> 
        getInfoFieldBuilder() {
      if (infoBuilder_ == null) {
        infoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.httpInfo, BurpGrpc.proto.BurpApiGrpc.httpInfo.Builder, BurpGrpc.proto.BurpApiGrpc.httpInfoOrBuilder>(
                getInfo(),
                getParentForChildren(),
                isClean());
        info_ = null;
      }
      return infoBuilder_;
    }

    private BurpGrpc.proto.BurpApiGrpc.annotationsText annotationsText_;
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.annotationsText, BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder, BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder> annotationsTextBuilder_;
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     * @return Whether the annotationsText field is set.
     */
    public boolean hasAnnotationsText() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     * @return The annotationsText.
     */
    public BurpGrpc.proto.BurpApiGrpc.annotationsText getAnnotationsText() {
      if (annotationsTextBuilder_ == null) {
        return annotationsText_ == null ? BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance() : annotationsText_;
      } else {
        return annotationsTextBuilder_.getMessage();
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public Builder setAnnotationsText(BurpGrpc.proto.BurpApiGrpc.annotationsText value) {
      if (annotationsTextBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        annotationsText_ = value;
      } else {
        annotationsTextBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public Builder setAnnotationsText(
        BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder builderForValue) {
      if (annotationsTextBuilder_ == null) {
        annotationsText_ = builderForValue.build();
      } else {
        annotationsTextBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public Builder mergeAnnotationsText(BurpGrpc.proto.BurpApiGrpc.annotationsText value) {
      if (annotationsTextBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          annotationsText_ != null &&
          annotationsText_ != BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance()) {
          getAnnotationsTextBuilder().mergeFrom(value);
        } else {
          annotationsText_ = value;
        }
      } else {
        annotationsTextBuilder_.mergeFrom(value);
      }
      if (annotationsText_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public Builder clearAnnotationsText() {
      bitField0_ = (bitField0_ & ~0x00000008);
      annotationsText_ = null;
      if (annotationsTextBuilder_ != null) {
        annotationsTextBuilder_.dispose();
        annotationsTextBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder getAnnotationsTextBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getAnnotationsTextFieldBuilder().getBuilder();
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    public BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder getAnnotationsTextOrBuilder() {
      if (annotationsTextBuilder_ != null) {
        return annotationsTextBuilder_.getMessageOrBuilder();
      } else {
        return annotationsText_ == null ?
            BurpGrpc.proto.BurpApiGrpc.annotationsText.getDefaultInstance() : annotationsText_;
      }
    }
    /**
     * <code>.BurpMorePossibilityApi.annotationsText annotationsText = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        BurpGrpc.proto.BurpApiGrpc.annotationsText, BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder, BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder> 
        getAnnotationsTextFieldBuilder() {
      if (annotationsTextBuilder_ == null) {
        annotationsTextBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            BurpGrpc.proto.BurpApiGrpc.annotationsText, BurpGrpc.proto.BurpApiGrpc.annotationsText.Builder, BurpGrpc.proto.BurpApiGrpc.annotationsTextOrBuilder>(
                getAnnotationsText(),
                getParentForChildren(),
                isClean());
        annotationsText_ = null;
      }
      return annotationsTextBuilder_;
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


    // @@protoc_insertion_point(builder_scope:BurpMorePossibilityApi.httpReqAndRes)
  }

  // @@protoc_insertion_point(class_scope:BurpMorePossibilityApi.httpReqAndRes)
  private static final BurpGrpc.proto.BurpApiGrpc.httpReqAndRes DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new BurpGrpc.proto.BurpApiGrpc.httpReqAndRes();
  }

  public static BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<httpReqAndRes>
      PARSER = new com.google.protobuf.AbstractParser<httpReqAndRes>() {
    @java.lang.Override
    public httpReqAndRes parsePartialFrom(
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

  public static com.google.protobuf.Parser<httpReqAndRes> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<httpReqAndRes> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

