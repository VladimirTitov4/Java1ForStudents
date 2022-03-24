package com.geekbrains.lesson6.examples;

public class Duck extends Animal {

    public Duck(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void voice() {
        System.out.println("Duck is ducking");
    }


}
