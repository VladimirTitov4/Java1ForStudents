package com.geekbrains.lesson7.examples.oop;

public class Test7 {

    public static void main(String[] args) {
        Cat cat = new Cat("Max", 10);
        Plate plate = new Plate(100);

        plate.info();
        cat.eat(plate);
        plate.info();
    }
}
