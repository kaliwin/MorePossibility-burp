/*
 * Created by JFormDesigner on Tue Jun 06 15:18:09 CST 2023
 */

package UI;

import burp.MorePossibility;

import java.awt.event.*;
import java.util.Map;
import java.util.Set;

import javax.swing.*;
import javax.swing.GroupLayout;

/**
 * declaration 大小 790 740  主ui
 *
 * @author cyvk
 */
public class GrpcServerGui extends JPanel {
    public GrpcServerGui() {
        initComponents();
    }

    private void addServer(ActionEvent e) {
        String selectedData = (String) comboBox1.getSelectedItem();
        String target = textField1.getText();
        String name = textField2.getText();

        if (selectedData != null && target != null && !target.isEmpty() && name != null) {
            //注册服务
//            MorePossibility.burpApiTool.registrationServer(name,target)
            if (MorePossibility.burpApiTool.registrationServer(name,target,formalityChange.data.get(selectedData))) {
                MorePossibility.logging.output().println("注册成功");
                tableModel.addRow(new Object[]{selectedData, target, name});
            }else {
                MorePossibility.logging.error().println("注册失败");
            }
            textField1.setText("");
            textField2.setText("");
        }

        // TODO add your code here
    }

    private void delServer(ActionEvent e) {
        int[] selectedRows = table1.getSelectedRows();
        if (selectedRows.length > 0) {
            for (int i = selectedRows.length - 1; i >= 0; i--) {
                // 卸载服务

                tableModel.deleteRow(selectedRows[i]);
            }
        }
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        
//        BurpServerTypeX[] values = BurpServerTypeX.values();

        formalityChange = new FormalityChange();

        Set<String> strings = formalityChange.data.keySet();

        comboBox1 = new JComboBox<>(strings.toArray(new String[0]));
        textField1 = new JTextField();
        textField2 = new JTextField();
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        tableModel = new MyTableModelX();
        table1 = new JTable(tableModel);
        scrollPane1 = new JScrollPane(table1);


        //======== this ========

        //---- label1 ----
        label1.setText("\u7c7b\u578b");

        //---- label2 ----
        label2.setText("GRPC\u5730\u5740");

        //---- label3 ----
        label3.setText("\u540d\u79f0");

        //---- button1 ----
        button1.setText("\u6ce8\u518c\u670d\u52a1");
        button1.addActionListener(e -> addServer(e));

        //---- button2 ----
        button2.setText("\u5378\u8f7d\u670d\u52a1");
        button2.addActionListener(e -> delServer(e));

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(table1);
        }

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(160, Short.MAX_VALUE)
                    .addComponent(button1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                    .addGap(178, 178, 178)
                    .addComponent(button2, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                    .addGap(236, 236, 236))
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(comboBox1, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label2)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(textField2, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 634, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(91, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 399, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(textField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label3)
                        .addComponent(textField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(label2)
                        .addComponent(label1, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
                        .addComponent(comboBox1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(61, 61, 61)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(button1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                        .addComponent(button2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
                    .addGap(170, 170, 170))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    private JComboBox comboBox1;
    private JTextField textField1;
    private JTextField textField2;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JButton button1;
    private JButton button2;
    private JScrollPane scrollPane1;
    private JTable table1;

    private MyTableModelX tableModel;

    private FormalityChange formalityChange;


    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
