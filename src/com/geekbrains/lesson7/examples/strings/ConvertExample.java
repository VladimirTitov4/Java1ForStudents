package com.geekbrains.lesson7.examples.strings;

public class ConvertExample {

    public static void main(String[] args) {
        /*String str = "123";
        int x = 100;*/
//        System.out.println(str + x); // 123100

        String baseString = "The Beginners Book";  // 123
        baseString = "some string"; // 356


        String anotherString = "The Beginners Book"; // 123

        String replacedString = baseString.replace('o', 'A');
        System.out.println(replacedString);
        System.out.println(baseString);

        /*String replaceFirst = baseString.replaceFirst("o", "A");
        System.out.println(replaceFirst);

        String[] stringArray = baseString.split(",");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("stringArray[i] = " + stringArray[i]);
        }

        String joinedString = String.join("+", stringArray);
        System.out.println("joinedString = " + joinedString);*/
    }
}
