package InformationCenter;


import com.google.common.collect.TreeBasedTable;

import java.util.*;


/**
 * @description: web信息处理, 提供数据提交自动分类归档 、数据检索
 * 6月9号 该类只进行明密文键值对实验测试
 * @author: cyvk
 * @date: 2023/6/9 上午10:30
 */
public class WebInformationProcessingCenter {
    // web目标树状
    // rowKey为  域名       示例: baidu.com 、 admin.baidu.com、 test.ddi.baidu.org
    // columnKey url 作用域    示例: https://www.baidu.com 、 http://admin.test.baidu.com/admin
    // value 为 url 作用域下的信息
    public TreeBasedTable<String, String, WebInfo> webInfoTs;

    public WebInformationProcessingCenter() {
        this.webInfoTs = TreeBasedTable.create();
    }

    /**
     * @param domain: url  url 完整的url路径https://www.baidu.com
     * @return boolean 查询是否有符合域名的目标
     * @description: 查看url是否包含可用的target 应用于明密文匹配 , 信息渲染
     * url为绝对url格式 示例https://admin.baidu.com/admin/search.jsp?id=124&user=test
     * target 可命中的域名作用域为 baidu.com 、baidu.com/admin/search 、admin.baidu.com
     * 不可命中的域为https://www.baidu.com 、admin.baidu.com/index
     * 因为考虑到后续大量数据的压力,设计这种匹配方式 , 但是将会保留正则匹配的函数已应对未来复杂的匹配需求
     * @author: cyvk
     * @date: 2023/6/9 上午10:42
     */
    public SortedMap<String, WebInfo> getTargetInfo(String domain) {
        SortedSet<String> strings = webInfoTs.rowKeySet();
        SortedMap<String, WebInfo> webInfoS = new TreeMap<>();
        for (String tarGet : strings) {
            if (domain.contains(tarGet)) {
                webInfoS.putAll(webInfoTs.row(tarGet));
            }
        }
        return webInfoS;
    }

    /**
     * @param url: url 示例https://www.baidu.com/di/admin/index.php?s=dfd&userid=amdin  给出完整url即可不需要做处理保留url编码也可
     * @return java.util.List<InformationCenter.WebInfo>
     * @description: 通过url解析出域名已获取所有url信息, 暂时用于键值对功能实现
     * @author: cyvk
     * @date: 2023/6/9 下午4:28
     */
    public List<WebInfo> getWebInfo(String url) {

        UrlData urlData = UrlData.parseUrl(url);
        if (urlData == null) {
            return null;
        }

        SortedMap<String, WebInfo> targetInfo = getTargetInfo(urlData.domain);  // 检索域名 获取所有相关url信息集合

        Set<String> urls = targetInfo.keySet();            // 获取键值

        List<WebInfo> listWebInfo = new ArrayList<>();

        for (String string : urls) {        // 遍历键值讲数据添加到列表中
            listWebInfo.add(targetInfo.get(string));
        }
        return listWebInfo;
    }


    /**
     * @param url: 绝对url示例https://www.baidu.com/dsdf/admin.jsp?id=us
     * @description: 创建目标信息
     * @author: cyvk
     * @date: 2023/6/9 上午11:32
     */
    private String addTargetInfo(String url) {
        UrlData urlX = UrlData.parseUrl(url);
        if (urlX != null) {
            String newUrl = urlX.getNewUrl();
            if (webInfoTs.contains(urlX.domain, newUrl)) {
                return newUrl;
            }
            WebInfo webInfo = new WebInfo(newUrl);
            webInfoTs.put(urlX.domain, newUrl, webInfo);
            return newUrl;
        } else {
            return null;
        }

    }


    /**
     * @param url:        url
     * @param plaintext:  明文
     * @param ciphertext: 密文
     * @return boolean    是否添加成功
     * @description: 添加明文密文键值对
     * @author: cyvk
     * @date: 2023/6/9 下午2:48
     */
    public boolean addPlaintextCiphertextPair(String url, String plaintext, String ciphertext) {

        String newUrl = addTargetInfo(url);

        if (newUrl == null) { // 创建目标失败返回false
            return false;
        }

        if (webInfoTs.containsColumn(newUrl)) {
            Map<String, WebInfo> column = webInfoTs.column(newUrl);

            for (String s : column.keySet()) {
                return column.get(s).plaintextAndCiphertextSetData.addPlaintextAndCiphertext(plaintext, ciphertext, newUrl);
            }
        }
        return false;
    }

    /**
     * @param url: url
     * @return boolean
     * @description: 判断该url是否有可用信息
     * @author: cyvk
     * @date: 2023/6/9 下午5:58
     */
    public boolean isInfo(String url) {
        UrlData urlData = UrlData.parseUrl(url);
        if (urlData == null) {
            return false;
        }
        SortedSet<String> strings = webInfoTs.rowKeySet();

        for (String string : strings) {
            if (string.contains(urlData.domain)) {
                return true;
            }
        }
        return false;
    }


    /**
     * @param url: url
     * @return boolean  true 为有
     * @description: 是否有键值对信息
     * @author: cyvk
     * @date: 2023/6/9 下午6:05
     */
    public boolean isKeyValuePari(String url) {
        if (isInfo(url)) {
            List<WebInfo> webInfo = getWebInfo(url);
        }
        return false;
    }

}

























