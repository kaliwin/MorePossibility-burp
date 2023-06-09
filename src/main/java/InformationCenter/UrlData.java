package InformationCenter;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author cyvk
 */
public class UrlData {
    String domain; // 域名
    String path;  // 路径
    String authority; // 域名和端口
    int port; // 端口
    String protocol; // 协议头


    public UrlData(String domain, String path, String authority, int port, String protocol) {
        this.domain = domain;
        this.path = path;
        this.authority = authority;
        this.port = port;
        this.protocol = protocol;
    }


    /**
     * @description: 返回一个没有参数的URL
     * @return java.lang.String
     * @author: cyvk
     * @date: 2023/6/9 下午5:40
     */
    public String getNewUrl(){
        return protocol + "://" + authority + path;
    }

    public static UrlData parseUrl(String url) {
        try {
            URL urlX = new URL(url);
            return new UrlData(urlX.getHost(), urlX.getPath(), urlX.getAuthority(), urlX.getPort(), urlX.getProtocol());
        } catch (Exception e) {
            return null;
        }
    }
}
