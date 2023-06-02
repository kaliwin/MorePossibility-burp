// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

package BurpGrpc.proto.BurpApiGrpc;

public interface httpReqDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:burpApi.httpReqData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *请求包数据
   * </pre>
   *
   * <code>bytes Data = 1;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();

  /**
   * <pre>
   *请求url
   * </pre>
   *
   * <code>string Url = 2;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   *请求url
   * </pre>
   *
   * <code>string Url = 2;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   *请求体开始下标,如若请求体下标与总长度一致就是没有请求体
   * </pre>
   *
   * <code>int64 BodyIndex = 3;</code>
   * @return The bodyIndex.
   */
  long getBodyIndex();

  /**
   * <pre>
   * http版本
   * </pre>
   *
   * <code>string httpVersion = 4;</code>
   * @return The httpVersion.
   */
  java.lang.String getHttpVersion();
  /**
   * <pre>
   * http版本
   * </pre>
   *
   * <code>string httpVersion = 4;</code>
   * @return The bytes for httpVersion.
   */
  com.google.protobuf.ByteString
      getHttpVersionBytes();
}
