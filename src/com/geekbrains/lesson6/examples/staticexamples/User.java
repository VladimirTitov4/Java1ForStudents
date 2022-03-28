package com.geekbrains.lesson6.examples.staticexamples;

public class User {

    private String name;
    private static String lastName;
    private Passport passport;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static String getLastNameStatic() {
        return lastName;
    }

    class Passport {
        private String number;
        private String serial;
        private String address;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Сборщик мусора добрался до объекта");
    }
}
