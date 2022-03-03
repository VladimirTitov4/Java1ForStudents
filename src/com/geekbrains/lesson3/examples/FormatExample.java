package com.geekbrains.lesson3.examples;

public class FormatExample {

    public static void main(String[] args) {
        int min = 10;
        int max = 20;
        String str = "пож-та";
        System.out.println("Введите \"число\" от " + min + " до " + max + " пож-та");
        System.out.printf("Введите число от %d до %d %s %n%n", min, max, str);

        double d = 0.2545865787432423;

        System.out.printf("%.2f", d);


        String string = String.format("Введите число от %d до %d %s %n%n", min, max, str);

        System.out.println(string + string + string);

    }
}
