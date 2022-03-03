package com.geekbrains.lesson3.examples;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

public class ConsoleExample {

    public static void main(String[] args) {
//        scannerExample();
        Random random = new Random();
        int min = random.nextInt(10);
        int max = random.nextInt(20);

        range(min, max);
    }

    public static void range(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Введите значение от " + min + " до " + max);
            number = scanner.nextInt();
        } while (!(number >= min && number <= max));

        scanner.close();
    }

    private static void scannerExample() {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);

        System.out.println("Введите строку");
        String line = scanner.nextLine();
        System.out.println("Пользователь ввел строку " + line);

        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Пользователь ввел число " + a);
    }
}
