// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

public interface httpKeyValuePairOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BurpMorePossibilityApi.httpKeyValuePair)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 域名作用域 正则表达式 用于匹配适用的url
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The domain.
   */
  java.lang.String getDomain();
  /**
   * <pre>
   * 域名作用域 正则表达式 用于匹配适用的url
   * </pre>
   *
   * <code>string domain = 1;</code>
   * @return The bytes for domain.
   */
  com.google.protobuf.ByteString
      getDomainBytes();

  /**
   * <pre>
   * 明文数据
   * </pre>
   *
   * <code>bytes ciphertext = 2;</code>
   * @return The ciphertext.
   */
  com.google.protobuf.ByteString getCiphertext();

  /**
   * <pre>
   * 密文数据
   * </pre>
   *
   * <code>bytes plaintext = 3;</code>
   * @return The plaintext.
   */
  com.google.protobuf.ByteString getPlaintext();
}
