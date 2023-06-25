package burp;


import BurpGrpc.proto.BurpApiGrpc.*;
import burp.api.montoya.core.Annotations;
import burp.api.montoya.core.ByteArray;
import burp.api.montoya.core.HighlightColor;
import burp.api.montoya.http.HttpService;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import com.google.protobuf.ByteString;

/**
 * @description: BurpApiUtensil 公共工具类 提供静态函数 用于将burp中的对象转化为Grpc proto文件中定义的消息类型
 * @author: cyvk
 * @date: 2023/6/20 下午3:00
 */
public class BurpApiUtensil {

    /**
     * @param hr: burp中的请求对象  HTTP1.1 和 HTTP2 使用的都是这个对象 一旦错误会抛运行时异常
     * @return BurpGrpc.proto.BurpApiGrpc.httpReqData
     * @description: 讲burp请求转换为Grpc 定义的 httpReqData
     * @author: cyvk
     * @date: 2023/6/20 下午3:06
     */
    public static httpReqData HttpRequestTohttpReqData(HttpRequest hr) {
        try {
            //      获取所需字段
            String url = hr.url();   //url
            HttpService httpService = hr.httpService();   // 目标地址 ip 端口
            byte[] reqData = hr.toByteArray().getBytes(); // 请求报文
            int bodyIndex = hr.bodyOffset();              // 请求体偏移量
            String httpVersion = hr.httpVersion();        // http版本

            //     组装请求
            httpReqService reqService = httpReqService.newBuilder()
                    .setIp(httpService.host())
                    .setPort(httpService.port())
                    .setSecure(httpService.secure()).build();  // 组装服务路由

            return httpReqData.newBuilder()
                    .setUrl(url)
                    .setHttpVersion(httpVersion)
                    .setData(ByteString.copyFrom(reqData))
                    .setBodyIndex(bodyIndex)
                    .setHttpReqService(reqService)        // 组装请求
                    .build();

        } catch (Exception e) {
            return null;
        }
    }


    /**
     * @param httpReqData: grpc 传输的 消息实例
     * @return burp.api.montoya.http.message.requests.HttpRequest
     * @description: 将Grpc中的httpReqData 转化为 HttpRequest 错误抛出运行时异常
     * <p>
     * 无论如何都必须给路由字段 HttpService 即便你没改也要给 转换为HttpRequest 只需要路由字段和字节流就行 可以用HTTP1.1的报文
     * 来发送HTTP2 的传输协议 修改协议头就行 Burp会自动处理
     * 因为是第三方程序处理过的直接拼接路由地址和字节流就会直接发送 中间不会在做任何处理因此 切记使用POST时要处理 Content-Length
     * 一定要处理 Content-Length 否则服务器不会接受 如若 服务端直接主动断开没有响应大概率是你没有处理 Content-Length
     * @author: cyvk
     * @date: 2023/6/20 下午3:10
     */
    public static HttpRequest httpReqDataTohttpRequest(httpReqData httpReqData) {


        try {

            httpReqService httpReqService = httpReqData.getHttpReqService();   // 路由
            byte[] reqData = httpReqData.getData().toByteArray();  // 请求报文
            // 构建http服务路由
            HttpService httpService = HttpService.httpService(httpReqService.getIp(), httpReqService.getPort(), httpReqService.getSecure());

            return HttpRequest.httpRequest(httpService, ByteArray.byteArray(reqData));

        } catch (Exception e) {
            return null;
        }

    }


    /**
     * @param httpResponse: 响应对象
     * @return BurpGrpc.proto.BurpApiGrpc.httpResData
     * @description: 将burp响应对象转为Grpc httpResData 对象 错误返回null
     * @author: cyvk
     * @date: 2023/6/20 下午3:48
     */
    public static httpResData httpResponseTohttpResData(HttpResponse httpResponse) {

        try {
            short statusCode = httpResponse.statusCode();    // 响应状态码
            String httpVersion = httpResponse.httpVersion(); //  http版本
            byte[] bytes = httpResponse.toByteArray().getBytes(); // 字节流数据
            int bodyIndex = httpResponse.bodyOffset();          // 请求体下标

            return httpResData.newBuilder()    // 组装数据
                    .setStatusCode(statusCode)
                    .setData(ByteString.copyFrom(bytes))
                    .setBodyIndex(bodyIndex)
                    .setHttpVersion(httpVersion)
                    .build();
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * @param httpRes: Grpc 响应对象 httpResData
     * @return burp.api.montoya.http.message.responses.HttpResponse
     * @description: 将httpResData 转为 burp响应对象 给字节流就行
     * @author: cyvk
     * @date: 2023/6/20 下午3:51
     */
    public static HttpResponse httpResDataToHttpResponse(httpResData httpRes) {
        try {


            return HttpResponse.httpResponse(ByteArray.byteArray(httpRes.getData().toByteArray()));
        } catch (Exception e) {
            return null;
        }

    }


    /**
     * @param annotationsText: Grpc 注解类型
     * @return burp.api.montoya.core.Annotations
     * @description: 注解转换
     * @author: cyvk
     * @date: 2023/6/20 下午4:01
     */
    public static Annotations annotationsTextToAnnotations(annotationsText annotationsText) {
        if (annotationsText.getIsInfo()) {

            highlightColor color = annotationsText.getColor();

            return Annotations.annotations(annotationsText.getNotes(), HighlightColor.highlightColor(color.name()));
        } else {
            return Annotations.annotations();
        }
    }

    /**
     * @param annotations: Burp注解
     * @return BurpGrpc.proto.BurpApiGrpc.AnnotationsText
     * @description: Burp 注解 转为 Grpc AnnotationsText
     * @author: cyvk
     * @date: 2023/6/20 下午4:06
     */
    public static annotationsText annotationsToannotationsText(Annotations annotations) {

        annotationsText.Builder builder = annotationsText.newBuilder();
        HighlightColor hc;
        if (annotations.notes() == null) {
            return builder.build();
        }

        annotations.highlightColor();
        hc = annotations.highlightColor();
        return builder
                .setIsInfo(true)
                .setColor(highlightColor.valueOf(hc.name()))
                .setNotes(annotations.notes())
                .build();

    }

    //with

    /**
     * @param reqData:         请求数据
     * @param annotationsText: 注解
     * @return BurpGrpc.proto.BurpApiGrpc.httpReqGroup
     * @description: 构建请求组 将请求和注解组合
     * @author: cyvk
     * @date: 2023/6/20 下午4:29
     */
    public static httpReqGroup buildHttpReqGroup(httpReqData reqData, annotationsText annotationsText) {
        return httpReqGroup.newBuilder().setHttpReqData(reqData).setAnnotationsText(annotationsText).build();
    }

    /**
     * @param resData:         响应数据
     * @param annotationsText: 注解
     * @return BurpGrpc.proto.BurpApiGrpc.httpResGroup
     * @description: 构建响应组 将响应和注解组合
     * @author: cyvk
     * @date: 2023/6/20 下午4:31
     */
    public static httpResGroup buildHttpResGroup(httpResData resData, annotationsText annotationsText) {
        return httpResGroup.newBuilder().setHttpResData(resData).setAnnotationsText(annotationsText).build();
    }

    /**
     * @param req:             请求
     * @param res:             响应
     * @param annotationsText: 注解
     * @return BurpGrpc.proto.BurpApiGrpc.httpReqAndRes
     * @description: 将请求和响应合成一组
     * @author: cyvk
     * @date: 2023/6/20 下午5:12
     */
    public static httpReqAndRes withHttpReqAndRes(httpReqData req, httpResData res, annotationsText annotationsText) {
        return httpReqAndRes.newBuilder()
                .setReq(req)
                .setRes(res)
                .setAnnotationsText(annotationsText)
                .build();
    }

    /**
     * @param req:         请求
     * @param res:         响应
     * @param annotations: 注解
     * @return BurpGrpc.proto.BurpApiGrpc.httpReqAndRes
     * @description: 组装 一组请求和响应
     * @author: cyvk
     * @date: 2023/6/20 下午5:42
     */
    public static httpReqAndRes withHttpReqAndRes(HttpRequest req, HttpResponse res, Annotations annotations) {
        httpReqData httpReqData ;
        httpResData httpResData;
        annotationsText annotationsText;
        if (req != null){
            httpReqData = HttpRequestTohttpReqData(req);
        }else {
            httpReqData = BurpGrpc.proto.BurpApiGrpc.httpReqData.newBuilder().build();
        }

        if (res != null){
            httpResData =  httpResponseTohttpResData(res);
        }else {
            httpResData = BurpGrpc.proto.BurpApiGrpc.httpResData.newBuilder().build();
        }

        if (annotations != null){
            annotationsText = annotationsToannotationsText(annotations);
        }else {
            annotationsText = BurpGrpc.proto.BurpApiGrpc.annotationsText.newBuilder().build();
        }

        return withHttpReqAndRes(httpReqData, httpResData, annotationsText);

    }


}






