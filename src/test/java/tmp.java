import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tmp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Menu Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenu subMenu = new JMenu("Sub Menu");

        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");

        subMenu.add(openItem);
        fileMenu.add(subMenu);
        fileMenu.add(saveItem);

        menuBar.add(fileMenu);

        frame.setJMenuBar(menuBar);
        frame.setSize(300, 200);
        frame.setVisible(true);

        // 添加动作监听器
        openItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Open menu item clicked");
            }
        });

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Save menu item clicked");
            }
        });
    }
}
