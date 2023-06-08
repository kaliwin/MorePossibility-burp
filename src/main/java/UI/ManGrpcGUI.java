/*
 * Created by JFormDesigner on Thu Jun 08 11:02:31 CST 2023
 */

package UI;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * @author root
 * @description: 服务注册主面板 提供两个输出口, 插件为burp注册信息输出，控制台为用户输出借用grpc调用向控制台输出
 */
public class ManGrpcGUI extends JPanel {
    public ManGrpcGUI() {
        initComponents();
    }

    private void button1(ActionEvent e) {
        // 清空插件信息
//        GrpcServerGui.
        pluginLog.setText("");
    }

    private void button2(ActionEvent e) {
        // TODO add your code here
        // 清空控制台
        consoleLog.setText("");
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        panel1 = new GrpcServerGui();
        scrollPane1 = new JScrollPane();
        consoleLog = new JTextArea();
        scrollPane2 = new JScrollPane();
        pluginLog = new JTextArea();
        label1 = new JLabel();
        label2 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();

        //======== this ========

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(consoleLog);
        }

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(pluginLog);
        }

        //---- label1 ----
        label1.setText("\u63a7\u5236\u53f0\u8f93\u51fa");

        //---- label2 ----
        label2.setText("\u63d2\u4ef6\u4fe1\u606f\u8f93\u51fa");

        //---- button1 ----
        button1.setText("\u6e05\u7a7a\u63d2\u4ef6\u4fe1\u606f");
        button1.addActionListener(e -> button1(e));

        //---- button2 ----
        button2.setText("\u6e05\u7a7a\u63a7\u5236\u53f0");
        button2.addActionListener(e -> button2(e));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(scrollPane1, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                                .addComponent(scrollPane2, GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 396, Short.MAX_VALUE)))
                    .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 790, GroupLayout.PREFERRED_SIZE)
                    .addGap(28, 28, 28))
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 139, GroupLayout.PREFERRED_SIZE)
                    .addGap(55, 55, 55)
                    .addComponent(button1)
                    .addGap(52, 52, 52)
                    .addComponent(button2)
                    .addContainerGap(957, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(8, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1))
                        .addComponent(button2, GroupLayout.Alignment.TRAILING))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addComponent(panel1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 740, GroupLayout.PREFERRED_SIZE)
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 335, GroupLayout.PREFERRED_SIZE)
                            .addGap(44, 44, 44)))
                    .addGap(26, 26, 26))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private GrpcServerGui panel1;
    private JScrollPane scrollPane1;
    public static JTextArea consoleLog;
    private JScrollPane scrollPane2;
    public static JTextArea pluginLog;
    private JLabel label1;
    private JLabel label2;
    private JButton button1;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
