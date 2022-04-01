package com.geekbrains.lesson8.examples;

import javax.swing.*;

public class Example1 extends JFrame {

    public Example1() {
        setTitle("First window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200, 800, 300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Example1();
    }
}
