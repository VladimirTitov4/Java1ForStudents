package com.geekbrains.lesson2.examples;

public class CodeBlock {

    public static void main(String[] args) {
        int a = 0;
        test(a);
        {
            int b = 15;
        }
//        System.out.println(b);

        System.out.println(a);

        test3(0);
    }

    public static int test(int a) {
        return a = 10;
    }

    public static void test2(int a) {
        System.out.println("Вход в метод");
        while (a < 5) {
            if (a == 3) {
                return;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("Выход из метода");
    }

    public static void test3(int a) {
        System.out.println("Вход в метод");
        while (a < 5) {
            if (a == 3) {
                break;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("Выход из метода");
    }
}
