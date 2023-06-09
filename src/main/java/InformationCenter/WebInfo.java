package InformationCenter;

/**
 * @author cyvk
 */ //web信息: 包含明文密文键值对
public class WebInfo {
    public PlaintextAndCiphertextSetData plaintextAndCiphertextSetData; // 明文密文集合
    String targetUrl; //目标


    public WebInfo(String targetUrl) {
        this.targetUrl = targetUrl;
        this.plaintextAndCiphertextSetData = new PlaintextAndCiphertextSetData();
    }


    /**
     * @param data : 要匹配的数据
     * @return java.lang.String
     * @description: 获取明文或者密文
     * @author: cyvk
     * @date: 2023/6/8 下午5:01
     */
    public String getKeyOrValue(String data) {

//        plaintextAndCiphertextSetData.plaintextAndCiphertextS.

        return null;
    }


}
