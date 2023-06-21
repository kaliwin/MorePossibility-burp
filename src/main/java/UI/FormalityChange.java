package UI;

import burp.BurpServerTypeX;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cyvk
 */
public class FormalityChange {
    public Map<String, BurpServerTypeX> data;

    public FormalityChange() { // 转换用于中文渲染
        this.data = new HashMap<>();

        data.put("迭代处理器", BurpServerTypeX.INTRUDER_PROCESSOR);
        data.put("迭代生成器", BurpServerTypeX.INTRUDER_GENERATE);
        data.put("实时流量镜像", BurpServerTypeX.REAL_TIME_TRAFFIC_MIRRORING);
        data.put("请求编辑处理器", BurpServerTypeX.HTTP_REQUEST_EDITOR_PROCESSOR);
        data.put("响应编辑处理器", BurpServerTypeX.HTTP_RESPONSE_EDITOR_PROCESSOR);
        data.put("http键值对", BurpServerTypeX.HTTP_EDITOR_KEY_VALUE);
        data.put("上下文菜单提供程序", BurpServerTypeX.CONTEXT_MENU_ITEMS_PROVIDER);

        data.put("Proxy请求处理器",BurpServerTypeX.PROXY_REQUEST_HANDLER);
        data.put("Proxy响应处理器",BurpServerTypeX.PROXY_RESPONSE_HANDLER);
        data.put("http响应处理器",BurpServerTypeX.HTTP_REQUEST_HANDLER);
        data.put("http请求处理器",BurpServerTypeX.HTTP_REQUEST_HANDLER);
    }
}
