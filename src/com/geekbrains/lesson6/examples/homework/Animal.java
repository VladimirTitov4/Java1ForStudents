package com.geekbrains.lesson6.examples.homework;

public abstract class Animal {

    private static int count;

    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(int maxRunDistance, int maxSmimDistance) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSmimDistance;
        count++;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract boolean run(int distance);
    public abstract boolean swim(int distance);

    public void jump(int height) {
        if (height < 5) {
            System.out.println("Животное смогло перепрыгнуть");
        } else {
            System.out.println(this.name + " не прыгнул");
            System.out.println(this.getClass().getSimpleName() + " не прыгнул");
        }
    }

    public static int getCount() {
        return count;
    }
}
