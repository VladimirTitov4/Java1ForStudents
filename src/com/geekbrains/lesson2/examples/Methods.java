package com.geekbrains.lesson2.examples;

public class Methods {

    public static void main(String[] args) {
        int a = sumAB(1, 2 );
        int b = sumAB(5, 10 );
        System.out.println("Результат c = " + a);
        System.out.println("Результат b = " + b);

        int sumCAndB = a + b;

        System.out.println("sumCAndB = " + (sumAB(1, 2) + sumAB(5, 10)));

        sumBD(1, 2);

        System.out.println("проверка баланса: " + checkBalance(500, 600));

        String string = checkBalance(500, 600) ? "да" : "нет" ;
        System.out.println(string);

        boolean balancePositive = checkBalance(500, 600);

        if (balancePositive) {
            System.out.println("Да");
        } else {
            System.out.println("нет");
        }
    }

    private static int sumAB(int a, int b) {
        return a + b;
    }

    private static boolean checkBalance(int a, int b) {
        return sumAB(a, b) > 1000;
    }

    private static void sumBD(int b, int d) {
        System.out.println("Результат b = " + (b + d));
    }

    private static void greetingWorld() {
        System.out.println("Hello, World!");
    }

    private static void greetingPerson(String name) {
        System.out.println("Hello, " + name);
    }
}
