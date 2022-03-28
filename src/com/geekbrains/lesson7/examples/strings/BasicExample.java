package com.geekbrains.lesson7.examples.strings;

public class BasicExample {

    public static void main(String[] args) {
        String string = "Beginners Book";
        String string2 = "Beginners Book";
        String string3 = new String("Beginners Book");

        char[] charsArray = {'h', 'e', 'l', 'l', 'o'};

        String str3 = new String(charsArray);

//        System.out.println(str3);

        boolean startWithH = str3.startsWith("a");
//        System.out.println(startWithH);

        String str3Upper = str3.toUpperCase();
//        System.out.println(str3Upper);

        char c = str3.charAt(1);
//        System.out.println("c = " + c);

        char[] chars = str3.toCharArray();
        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
        }

//        String intern = string2.intern();

        testMethod();
    }

    // String pool
    {
        // String str1 = "str" -> 0000123;
    }

    private static void testMethod() {
        String str1 = "str";
        String str2 = str1.intern();
        String str3 = new String("str");
        String str4 = str1.intern();
        String str5 = new String(str1.intern());
        String str6 = "Str";

        /*System.out.println(str1 == str2); // true
        System.out.println(str1 == str3); // false
        System.out.println(str1 == str4); // true
        System.out.println(str1 == str2); // true
        System.out.println(str1 == str5); // true*/
        /*System.out.println(str1 == str6); //
        System.out.println(str1.equals(str6));

        System.out.println(str1.equalsIgnoreCase(str6));

        System.out.println(str1.toUpperCase().equals(str6.toUpperCase()));*/

//        System.out.println(str1 == new String("str").intern());




        String testString = "test";

        System.out.println(testString == new String("test"));
    }
}






























