package UI;


import javax.swing.*;

/**
 * @description: 主GUI用于burp渲染
 * @author: cyvk
 * @date: 2023/6/8 下午12:06
 */
public class ManGUI extends JTabbedPane {

    public ManGUI() {

        // 创建第一个面板
        JPanel panel1 = new Hu();
//        panel1.add(new JLabel("这是面板 1"));
        addTab("服务注册面板", panel1);

        // 创建第二个面板
        JPanel panel2 = new JPanel();
        panel2.add(new JLabel("这是面板 ,占位"));
        addTab("选项卡 2", panel2);

    }
}
