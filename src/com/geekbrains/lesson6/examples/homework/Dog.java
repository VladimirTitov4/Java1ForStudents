package com.geekbrains.lesson6.examples.homework;

public class Dog extends Animal {

    private static int count;

    public Dog(int maxRunDistance, int maxSwimDistance) {
        super(maxRunDistance, maxSwimDistance);
        count++;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public boolean run(int distance) {
        if (distance < this.maxRunDistance) {
            System.out.printf("Собака пробежала %d метров%n", distance);
            return true;
        }
        System.out.println("Собака не смогла пробежать");
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (distance < maxSwimDistance) {
            System.out.printf("Собака проплыла %d метров%n", distance);
            return true;
        }
        System.out.println("Собака не смогла проплыть");
        return false;
    }
}
