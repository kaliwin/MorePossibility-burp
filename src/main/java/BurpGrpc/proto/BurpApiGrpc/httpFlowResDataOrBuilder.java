// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: burpApi.proto

// Protobuf Java Version: 3.25.1
package BurpGrpc.proto.BurpApiGrpc;

public interface httpFlowResDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BurpMorePossibilityApi.httpFlowResData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   * @return Whether the httpReqAndRes field is set.
   */
  boolean hasHttpReqAndRes();
  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   * @return The httpReqAndRes.
   */
  BurpGrpc.proto.BurpApiGrpc.httpReqAndRes getHttpReqAndRes();
  /**
   * <code>.BurpMorePossibilityApi.httpReqAndRes httpReqAndRes = 1;</code>
   */
  BurpGrpc.proto.BurpApiGrpc.httpReqAndResOrBuilder getHttpReqAndResOrBuilder();

  /**
   * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The enum numeric value on the wire for httpFlowSource.
   */
  int getHttpFlowSourceValue();
  /**
   * <code>.BurpMorePossibilityApi.httpFlowSource httpFlowSource = 2;</code>
   * @return The httpFlowSource.
   */
  BurpGrpc.proto.BurpApiGrpc.httpFlowSource getHttpFlowSource();
}
