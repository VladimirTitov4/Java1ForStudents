package com.geekbrains.lesson8.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Example2 extends JFrame {

    public Example2() {
        setTitle("Second window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(500, 500, 640, 480);

        JButton[] buttons = new JButton[5];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton("#" + i);
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Object object = e.getSource();
                    if (e.getSource() instanceof JButton) {
                        JButton jButton = (JButton) object;
                        String text = jButton.getText();
                        System.out.println("Hello from " + text);
                    }
                }
            });
        }

        add(buttons[0], BorderLayout.EAST);
        add(buttons[1], BorderLayout.WEST);
        add(buttons[2], BorderLayout.SOUTH);
        add(buttons[3], BorderLayout.NORTH);
        add(buttons[4], BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Example2();
    }
}
