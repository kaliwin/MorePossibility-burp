// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

public interface httpResDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BurpMorePossibilityApi.httpResData)
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
   *状态码
   * </pre>
   *
   * <code>int32 StatusCode = 2;</code>
   * @return The statusCode.
   */
  int getStatusCode();

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
   * <code>string httpVersion = 5;</code>
   * @return The httpVersion.
   */
  java.lang.String getHttpVersion();
  /**
   * <code>string httpVersion = 5;</code>
   * @return The bytes for httpVersion.
   */
  com.google.protobuf.ByteString
      getHttpVersionBytes();
}
