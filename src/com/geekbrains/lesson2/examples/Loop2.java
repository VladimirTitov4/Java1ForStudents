package com.geekbrains.lesson2.examples;

public class Loop2 {

    public static void main(String[] args) {
        anotherLoop();
        enhancedLoop();
    }

    private static void anotherLoop() {
        System.out.println("Variant 1");
        int counter = 10;
        while (counter < 5) {
            System.out.println(counter);
            counter++;
        }

        System.out.println("Variant 2");

        int anotherCounter = 10;
        do {
            System.out.println(anotherCounter);
            anotherCounter++;
        } while (anotherCounter < 5);
    }


    public static void innerLoop() {
        int counter = 0;
        outer:
        {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i == 3 && j == 3) {
                        break outer;
                    }
                    System.out.println("i = " + i + ", j = " + j);
                    counter++;
                }
                System.out.println();
            }
        }
        System.out.println("Общее кол-во итераций = " + counter);

    }

    public static void loop(int num) {
        for (int i = 0; i < 100; i++) {
            if (i == num) {
                break;
            }
            System.out.println("Привет, Мария");
        }
    }

    public static void enhancedLoop() {
        String[] array = new String[]{"first", "second", "third"};
        for (String currentString : array) {
            System.out.println(currentString);
        }
    }
}
