package com.geekbrains.lesson7.examples.anonymous;

public class MinusButton extends Button {

    @Override
    public int execute(int x, int y) {
        return x - y;
    }

    @Override
    public String print() {
        return "g";
    }
}
