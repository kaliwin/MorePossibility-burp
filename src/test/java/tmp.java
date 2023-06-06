import burp.BurpServerTypeX;
import com.google.common.collect.TreeBasedTable;

public class tmp {


    public static void main(String[] args) {


        text text = new text();

        text.funTest();

        System.out.println(text.delServer("payLoadTest",BurpServerTypeX.INTRUDER_PROCESSOR));
        System.out.println("sd");
        System.out.println(text.serverRegistrationStatus);
    }
}










class text {

   public TreeBasedTable<String, BurpServerTypeX, String> serverRegistrationStatus ;

    public text() {
        this.serverRegistrationStatus = TreeBasedTable.create();
    }

    public void funTest (){
        serverRegistrationStatus.put("payLoadTest", BurpServerTypeX.INTRUDER_PROCESSOR, "s");
    }
    public String delServer(String serverName , BurpServerTypeX burpServerTypeX){
        String remove = serverRegistrationStatus.remove(serverName, burpServerTypeX);

        return remove;
    }

}



