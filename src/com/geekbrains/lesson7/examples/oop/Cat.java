package com.geekbrains.lesson7.examples.oop;

public class Cat {

    private String name;
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        System.out.println("Кот начал есть, съел " + appetite);
        plate.decreaseFood(appetite);
    }

}
