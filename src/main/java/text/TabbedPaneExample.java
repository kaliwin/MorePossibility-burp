package text;

import UI.ManGUI;
import UI.ManGrpcGUI;

import javax.swing.*;

public class TabbedPaneExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("选项卡示例");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        // 创建 JTabbedPane
//        JTabbedPane tabbedPane = new JTabbedPane();
//
//        // 创建第一个面板
//        JPanel panel1 = new JPanel();
//        panel1.add(new JLabel("这是面板 1"));
//        tabbedPane.addTab("选项卡 1", panel1);
//
//        // 创建第二个面板
//        JPanel panel2 = new ManGrpcGUI();
//        panel2.add(new JLabel("这是面板 2"));
//        tabbedPane.addTab("选项卡 2", panel2);

        // 将 JTabbedPane 添加到窗口中
        frame.getContentPane().add(new ManGUI());

        frame.setSize(200, 200);
        frame.setVisible(true);
    }
}
