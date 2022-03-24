package com.geekbrains.lesson6.examples;

public class Inheritance {

    public static void main(String[] args) {
        Cat cat = new Cat("Max", "white", 3);
        Dog dog = new Dog("Jack", "black", 5, "husky");

        System.out.println("--- Cat section ---");
        cat.play();
        cat.sleep();
        cat.voice();
        System.out.println(cat.printInfo());

        System.out.println("--- Dog section ---");
        dog.voice();
        System.out.println(dog.printInfo());

        cat = null;
    }
}
