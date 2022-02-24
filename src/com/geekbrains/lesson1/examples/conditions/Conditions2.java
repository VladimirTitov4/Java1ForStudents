package com.geekbrains.lesson1.examples.conditions;

public class Conditions2 {

    public static void main(String[] args) {
        /*int currentTemperature = 20;

        if (currentTemperature > 35) {
            System.out.println("жарко");
        } else if (currentTemperature > 20) {
            System.out.println("более менее");
        } else if (currentTemperature < 10) {
            System.out.println("Холодно");
        } else {
            System.out.println("норм");
        }

        if (currentTemperature == 20) {
            System.out.println("123");
        }

        System.out.println("456");*/

        conditions2();
    }

    private static void conditions2() {
        int a = 0;
        int b = 1;

        if ((a != 0) & (1 / 0 == 0)) {
            System.out.println("done!");
        }

    }
}
