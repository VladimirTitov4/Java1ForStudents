package com.geekbrains.lesson6.examples;

public class PolymorphismExample {

    public static void main(String[] args) {
        Cat cat = new Cat("Max", "white", 3);
        Dog dog = new Dog("Jack", "black", 5, "husky");
        Duck duck = new Duck("Duck", "black", 5);

        sayVoice(cat);
        sayVoice(dog);
        sayVoice(duck);

    }

    private static void sayVoice(Animal animal) {
        animal.voice();
    }
}
