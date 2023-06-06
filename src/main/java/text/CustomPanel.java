package text;


import javax.swing.*;
import java.awt.*;



public class CustomPanel {
    public static void main(String[] args) {

        JFrame dd = new JFrame("dd");

        MyPanelX myPanel = new MyPanelX();

//        JPanel jPanel = new JPanel();
//
//        jPanel.add(myPanel);

//        dd.getContentPane().add(myPanel);

//        JScrollPane scrollPane = new JScrollPane(myPanel.table);
        dd.setLayout(new BorderLayout());
        dd.add(myPanel, BorderLayout.NORTH);
//        dd.add(scrollPane, BorderLayout.CENTER);

        dd.setVisible(true);
        dd.setSize(700,700);
        dd.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

















