/*
 * Created by JFormDesigner on Sun Jun 18 12:33:37 CST 2023
 */

package UI;

import burp.MorePossibility;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

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

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        textField1 = new JTextField();
        button1 = new JButton();
        button2 = new JButton();
        panel1 = new ManGrpcGUI();

        //======== this ========

        //---- button1 ----
        button1.setText("\u53d1\u9001\u6d4b\u8bd5");
        button1.addActionListener(e -> send(e));

        //---- button2 ----
        button2.setText("text");

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(137, 137, 137)
                    .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 192, GroupLayout.PREFERRED_SIZE)
                    .addGap(97, 97, 97)
                    .addComponent(button1)
                    .addGap(45, 45, 45)
                    .addComponent(button2)
                    .addContainerGap(618, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 1221, Short.MAX_VALUE)
                    .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button1)
                        .addComponent(button2))
                    .addGap(18, 18, 18)
                    .addComponent(panel1, GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addContainerGap())
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private ManGrpcGUI panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
