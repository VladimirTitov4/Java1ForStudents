package com.geekbrains.lesson6.examples.homework;

public class Homework7 {

    public static void main(String[] args) {
        Animal[] participants = prepareParticipants();

        for (Animal participant : participants) {
//            participant.run(300);
//            participant.swim(1);
            participant.jump(10);
        }

        /*System.out.println("Кол-во созданных животных " + Animal.getCount());
        System.out.println("Кол-во созданных котов " + Cat.getCount());
        System.out.println("Кол-во созданных собак " + Dog.getCount());*/
    }

    private static Animal[] prepareParticipants() {
        return new Animal[] {
                /*new Dog(400, 30),
                new Dog(100, 3),
                new Cat(400, 2),
                new Cat(200, 10),
                new Cat(200, 10),*/
                new Cat("Max"),
                new Cat("Dima"),
                new Cat("Anton"),
        };
    }
}
