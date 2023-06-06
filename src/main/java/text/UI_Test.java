package text;

//import BurpGrpc.proto.BurpApiGrpc.rpcTestGrpc;
import UI.GrpcServerGui;

        import javax.swing.*;

/**
 * @author cyvk
 */
public class UI_Test {


    public static void main(String[] args) throws InterruptedException {
        JFrame jFrame = new JFrame("test");
        jFrame.setSize(790, 740);
        jFrame.getContentPane().add(new GrpcServerGui());
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//        new Test("113.109.109.51:9521").Start();

//        Thread.sleep(10000);

//        System.setProperty("java.net.preferIPv6Addresses", "true");
//        ClientDemo clientDemo = new ClientDemo();
//        clientDemo.ClientDemo();
//        clientDemo.twoStream();
//        clientDemo.ClientStream();

//        }

//        ClientDemo clientDemo = new ClientDemo();
//        clientDemo.ClientDemo();
//        clientDemo.ClientStream();

    }
}




