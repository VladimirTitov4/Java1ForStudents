package com.geekbrains.lesson1.examples.conditions;

public class Conditions {

    public static void main(String[] args) {
        int currentTemperature = 20;

        boolean checkTemp = currentTemperature > 35;

        if (!checkTemp) {
            System.out.println("жарко");
            System.out.println("жарко");
            System.out.println("жарко");
            System.out.println("жарко");
            System.out.println("жарко");
        } else {
            System.out.println("норм");
        }

        System.out.println("окончание программы");

        int a = 5;

        if (a >= 0 && a >= -20) {
            System.out.println("В переменной a лежит число от 0 до 20");
        }

    }
}
