package text.infomationCenter;

import InformationCenter.WebInfo;
import InformationCenter.WebInformationProcessing;

import java.util.List;

/**
 * @author cyvk
 * @description: 测试类
 */
public class TestWebInformationProcessing {


    public static void main(String[] args) {

        WebInformationProcessing webInformationProcessing = new WebInformationProcessing();


        if (webInformationProcessing.addPlaintextCiphertextPair("https://www.baidu.com/admin/is.js","cyvk","9521")) {
            System.out.println("添加成功");
        }
        if (webInformationProcessing.addPlaintextCiphertextPair("https://www.baidu.com/admin/is.js","ggc","6599")) {
            System.out.println("添加成功");
        }

        List<WebInfo> webInfo = webInformationProcessing.getWebInfo("https://www.baidu.com/dsasdfasdf/sdf");
        for (WebInfo info : webInfo) {
            String gigcyvkdj = info.plaintextAndCiphertextSetData.keyValuePairReplacement("gigcyvkdj");
            System.out.println(gigcyvkdj);

        }




    }



}
