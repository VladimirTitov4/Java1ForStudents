package com.geekbrains.lesson7.examples.strings;

import com.geekbrains.lesson6.examples.staticexamples.User;

public class TestStringExample {

    public static void main(String[] args) {
        User baseUser = new User();
        baseUser.setName("Vasiliy");

        User user2 = baseUser;
        User user3 = baseUser;
        User user4 = baseUser;
        User user5 = baseUser;
        System.out.println("baseUser.getName() = " + baseUser.getName());
        System.out.println("baseUser.getName() = " + user2.getName());
        System.out.println("baseUser.getName() = " + user3.getName());
        System.out.println("baseUser.getName() = " + user4.getName());
        System.out.println("baseUser.getName() = " + user5.getName());

        baseUser.setName("Roman");

        System.out.println("baseUser.getName() = " + baseUser.getName());
        System.out.println("baseUser.getName() = " + user2.getName());
        System.out.println("baseUser.getName() = " + user3.getName());
        System.out.println("baseUser.getName() = " + user4.getName());
        System.out.println("baseUser.getName() = " + user5.getName());
    }
}
