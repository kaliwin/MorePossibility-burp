package burp;

/**
 * @description: 定义所有支持的类型
 * @author: cyvk
 * @date: 2023/6/6 下午4:50
 */
public enum BurpServerTypeX {
    INTRUDER_PROCESSOR,             // 迭代处理器
    INTRUDER_GENERATE,              // 迭代生成器
    REAL_TIME_TRAFFIC_MIRRORING,    // 实时流量镜像
    HTTP_EDITOR_KEY_VALUE,          // http键值对用于相互转换
    HTTP_REQUEST_EDITOR_PROCESSOR,  // 请求编辑处理器
    HTTP_RESPONSE_EDITOR_PROCESSOR, // 响应编辑处理器
    CONTEXT_MENU_ITEMS_PROVIDER ,   // 上下文菜单提供程序
    PROXY_REQUEST_HANDLER ,         // 代理请求处理器
    PROXY_RESPONSE_HANDLER,         // 代理响应处理器
    HTTP_FLOW_HANDLER,           // http请求处理器
//    HTTP_RESPONSE_HANDLER           // http响应处理器

}
