package com.geekbrains.lesson1.homework;

public class Homework1 {

    public static void main(String[] args) {
//        printThreeWords();
//        checkSumSign();
//        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 2;
        int b = 3;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    private static void printColor() {
        int value = 10;
        if (value <= 0) {
            System.out.println("red");
        } else if (/*value > 0 && */value < 100) {
            System.out.println("yellow");
        } else {
            System.out.println("green");
        }
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2;
        int b = 3;
        int sum = a + b;
        if (sum > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
