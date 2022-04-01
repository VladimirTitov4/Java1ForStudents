package com.geekbrains.lesson8.examples;

import javax.swing.*;
import java.awt.*;

public class BorderLayout2 extends JFrame {

    public BorderLayout2() {
        setTitle("First window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 640, 480);

        JButton[] buttons = new JButton[10];
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            button = new JButton("#" + i);
            button.setPreferredSize(new Dimension(300, 300));
            button.setAlignmentX(Component.RIGHT_ALIGNMENT);
//            buttons[i].setAlignmentY(Component.CENTER_ALIGNMENT);
            add(button);
        }

        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayout2();
    }
}
