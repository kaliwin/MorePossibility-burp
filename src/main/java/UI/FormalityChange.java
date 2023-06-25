package UI;

import burp.BurpServerTypeX;
import com.google.common.collect.TreeBasedTable;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cyvk
 */
public class FormalityChange {
    public Map<String, BurpServerTypeX> data;

    public Map<BurpServerTypeX, String> de;


    public FormalityChange() { // 转换用于中文渲染
        this.data = new HashMap<>();
        this.de = new HashMap<>();

        data.put("迭代处理器", BurpServerTypeX.INTRUDER_PROCESSOR);
        data.put("迭代生成器", BurpServerTypeX.INTRUDER_GENERATE);
        data.put("实时流量镜像", BurpServerTypeX.REAL_TIME_TRAFFIC_MIRRORING);
        data.put("请求编辑处理器", BurpServerTypeX.HTTP_REQUEST_EDITOR_PROCESSOR);
        data.put("响应编辑处理器", BurpServerTypeX.HTTP_RESPONSE_EDITOR_PROCESSOR);
        data.put("http键值对", BurpServerTypeX.HTTP_EDITOR_KEY_VALUE);
        data.put("上下文菜单提供程序", BurpServerTypeX.CONTEXT_MENU_ITEMS_PROVIDER);
        data.put("Proxy请求处理器", BurpServerTypeX.PROXY_REQUEST_HANDLER);
        data.put("Proxy响应处理器", BurpServerTypeX.PROXY_RESPONSE_HANDLER);
        data.put("http流量处理器", BurpServerTypeX.HTTP_FLOW_HANDLER);
//        data.put("http响应处理器", BurpServerTypeX.HTTP_RESPONSE_HANDLER);


        //    ===================================================================================================    //

        de.put(BurpServerTypeX.INTRUDER_PROCESSOR, "迭代处理器");
        de.put(BurpServerTypeX.INTRUDER_GENERATE, "迭代生成器");
        de.put(BurpServerTypeX.REAL_TIME_TRAFFIC_MIRRORING, "实时流量镜像");
        de.put(BurpServerTypeX.HTTP_REQUEST_EDITOR_PROCESSOR, "请求编辑处理器");
        de.put(BurpServerTypeX.HTTP_RESPONSE_EDITOR_PROCESSOR, "响应编辑处理器");
        de.put(BurpServerTypeX.HTTP_EDITOR_KEY_VALUE, "http键值对");
        de.put(BurpServerTypeX.CONTEXT_MENU_ITEMS_PROVIDER, "上下文菜单提供程序");
        de.put(BurpServerTypeX.PROXY_REQUEST_HANDLER, "Proxy请求处理器");
        de.put(BurpServerTypeX.PROXY_RESPONSE_HANDLER, "Proxy响应处理器");
        de.put(BurpServerTypeX.HTTP_FLOW_HANDLER, "http流量处理器");
//        de.put(BurpServerTypeX.HTTP_RESPONSE_HANDLER, "http响应处理器");

    }
}
