package com.geekbrains.lesson2.examples.homework;

public class Homework2 {

    public static void main(String[] args) {
//        printNumberSign(2);
//        System.out.println(isNegative(-2));
//        printRepeatedText("Repeat me!!!", 1);
        System.out.println(checkLeapYear(1600));
    }

    /*
     * * Написать метод, который определяет, является ли год високосным, и возвращает boolean
     * (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
     * */
    private static boolean checkLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    /* Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
    (включительно), если да – вернуть true, в противном случае – false */

    private static boolean checkPositiveSum(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    /*
    Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль,
    положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
     */
    private static void printNumberSign(int num) {
        if (num >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное");
        }
    }

    /*
    Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    private static boolean isNegative(int num) {
        return num < 0;
    }

    /*
    Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать
    в консоль указанную строку, указанное количество раз;
     */
    private static void printRepeatedText(String string, int n) {
        for(int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }
}