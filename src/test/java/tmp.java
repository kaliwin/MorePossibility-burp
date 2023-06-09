import InformationCenter.WebInformationProcessing;
import burp.BurpServerTypeX;
import com.google.common.collect.TreeBasedTable;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class tmp {


    public static void main(String[] args) {

        String filePath = "/root/tmp/2.txt";

        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
//            System.out.println(content);


//            String text = "ABABDABACDABABCABAB";
            String pattern = "Discovered open port 51546/cyvk";

            int index = StringUtils.indexOf(content, pattern);
            if (index != -1) {
                System.out.println("匹配成功，子字符串的起始位置为：" + index);
            } else {
                System.out.println("未找到匹配的子字符串");
            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}


class text {

    public TreeBasedTable<String, BurpServerTypeX, String> serverRegistrationStatus;

    public text() {
        this.serverRegistrationStatus = TreeBasedTable.create();
    }

    public void funTest() {
        serverRegistrationStatus.put("payLoadTest", BurpServerTypeX.INTRUDER_PROCESSOR, "s");
    }

    public String delServer(String serverName, BurpServerTypeX burpServerTypeX) {
        return serverRegistrationStatus.remove(serverName, burpServerTypeX);

    }

}



