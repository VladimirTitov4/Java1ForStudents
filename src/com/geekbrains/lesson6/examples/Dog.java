package com.geekbrains.lesson6.examples;

public class Dog extends Animal {

    private final String type;

    public Dog(String name, String color, int age, String type) {
        super(name, color, age);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println("Dog's voice is bark");
    }
}
