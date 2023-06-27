/*
 * Created by JFormDesigner on Sun Jun 18 12:33:37 CST 2023
 */

package UI;

import burp.MorePossibility;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @author root
 */
public class Hu extends JPanel {
    public Hu() {
        initComponents();
    }

    private void send(ActionEvent e) {
//        String url = textField1.getText();
////        MorePossibility.burpApi.http().sendRequest()
//        MorePossibility.burpApiTool.test(url);

        // TODO add your code here
    }

    private void startServer(ActionEvent e) {
        // TODO add your code here

        try {
            if (MorePossibility.runAchieve.startServer(Integer.parseInt(textField1.getText()))) {
                int port = MorePossibility.runAchieve.grpcServer.getPort();
                label2.setText("服务正在运行 端口: " + port);
                ManGrpcGUI.pluginLog.append("[+] BurpAPI 服务启动成功 :"+MorePossibility.runAchieve.grpcServer.getPort()+"\n");
            }

            if (MorePossibility.runAchieve.grpcServer.isShutdown()) {
                label2.setText("服务关闭");
            }

        }catch (Exception c){
            ManGrpcGUI.pluginLog.append("[-] 异常未能启动服务 "+c+"\n");
        }
        textField1.setText("");
    }

    private void stopServer(ActionEvent e) {
        // TODO add your code here
        MorePossibility.runAchieve.stopServer();
        if (!MorePossibility.runAchieve.grpcServer.isShutdown()) {
            int port = MorePossibility.runAchieve.grpcServer.getPort();
            label2.setText("服务未能关闭 : " + port);
            ManGrpcGUI.pluginLog.append("[-] 服务未能关闭 \n");
        } else {
            label2.setText("服务关闭");
            ManGrpcGUI.pluginLog.append("[+] 服务关闭 \n");
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        panel1 = new ManGrpcGUI();
        label1 = new JLabel();
        label2 = new JLabel();

        //======== this ========

        //---- button1 ----
        button1.setText("\u5f00\u542f\u670d\u52a1");
        button1.addActionListener(e -> {
			send(e);
			startServer(e);
		});

        //---- button2 ----
        button2.setText("\u5173\u95ed\u670d\u52a1");
        button2.addActionListener(e -> stopServer(e));

        //---- label1 ----
        label1.setText("burpAPI\u670d\u52a1\u7aef\u53e3");

        //---- label2 ----
        label2.setText("\u670d\u52a1\u672a\u542f\u52a8");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)
                    .addComponent(button1)
                    .addGap(18, 18, 18)
                    .addComponent(button2)
                    .addGap(33, 33, 33)
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 344, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(302, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 1233, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button2)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addGap(12, 12, 12))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private ManGrpcGUI panel1;
    private JLabel label1;
    private JLabel label2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
