package com.geekbrains.lesson5.examples;

public class TestCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Барсик", 5);
        cat1.setColor("Белый");
        cat1.setAge(5);
        Cat cat2 = new Cat("Бежевый");
        Cat cat3 = cat2;

        System.out.println(cat2);
        System.out.println(cat3);

        System.out.println("---");

        cat2.setAge(10);

        System.out.println(cat2);

        testMethod(100, cat2, "ooooolName");

        System.out.println(cat2);
        System.out.println(cat3);
    }

    private static void testMethod(int age, Cat cat, String name) {
        age = 5;
        cat.setName("newName", 25);
        name = "oldName";
    }
}
