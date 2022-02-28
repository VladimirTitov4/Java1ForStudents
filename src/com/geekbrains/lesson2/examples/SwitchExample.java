package com.geekbrains.lesson2.examples;

public class SwitchExample {

    public static void main(String[] args) {
        printMonthByNumberSwitch(2);
    }

    private static String printMonthByNumberSwitch(int numberOfMonth) {
        return switch (numberOfMonth) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            default -> "Неизвестный месяц";
        };
    }

    private static void printMonthByNumberSwitchOld(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1, 10, 11 :
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("Неизвестный месяц");
        }
    }

    private static void printMonthByNumberIf(int numberOfMonth) {
        if (numberOfMonth == 1) {
            System.out.println("Январь");
        } else if (numberOfMonth == 2) {
            System.out.println("Февраль");
        } else if (numberOfMonth == 3) {
            System.out.println("Март");
        } else if (numberOfMonth == 4) {
            System.out.println("Апрель");
        } else if (numberOfMonth == 5 && numberOfMonth == 8) {
            System.out.println("Май");
        } else if (numberOfMonth == 6) {
            System.out.println("Июнь");
        } else {
            System.out.println("Неизвестный месяц");
        }
    }

    private static int getNumberDaysInMonthV0(String monthName) {
        return switch (monthName) {
            case "January", "July", "August", "October", "December", "May", "March" -> 31;
            case "February" -> 28;
            case "April", "September", "November", "June" -> 30;
            default -> 0;
        };
    }

    private static int getNumberDaysInMonthV0OldStyle(String monthName) {
        int result = 0;
        if ("January".equals(monthName)) {
            result = 31;
        } else if ("February".equals(monthName)) {
            result = 28;
        } else if ("March".equals(monthName)) {
            result = 31;
        } else if ("April".equals(monthName)) {
            result = 30;
        } else if ("May".equals(monthName)) {
            result = 31;
        } else if ("June".equals(monthName)) {
            result = 30;
        } else if ("July".equals(monthName) || "August".equals(monthName)) {
            result = 31;
        } else if ("September".equals(monthName)) {
            result = 30;
        } else if ("October".equals(monthName)) {
            result = 31;
        } else if ("November".equals(monthName)) {
            result = 30;
        } else if ("December".equals(monthName)) {
            result = 31;
        }

        return result;
    }
}
