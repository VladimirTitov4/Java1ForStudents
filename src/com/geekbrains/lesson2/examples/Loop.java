package com.geekbrains.lesson2.examples;

public class Loop {

    public static void main(String[] args) {
        // Возвести 2 в 3ю степень
        // 2*3 == 2 * 2 * 2 == 8

        int a = 2;
        int result = a * a * a;
        System.out.println(result);

        // 2*5 == 2 * 2 * 2 * 2 * 2 == 32

        int powResult = pow(2, 3);
        System.out.println(powResult);
    }
    // result = a * a * a;
    public static int pow(int a, int b) { // a - будем возводить в степень. b = степень
        int result = 1;
        for (int i = 0; i < b; i++) {
            System.out.println("Выполняется итерация цикла для счетчика i = " + i);
            result *= a;
        }
        return result;
    }




}
