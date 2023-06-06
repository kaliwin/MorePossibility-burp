package UI;

import javax.swing.*;

public class textGUI {


    public static void main(String[] args) {

        JFrame jFrame = new JFrame();


        jFrame.setSize(700,700);

        jFrame.getContentPane().add(new ManGui());

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }

}
