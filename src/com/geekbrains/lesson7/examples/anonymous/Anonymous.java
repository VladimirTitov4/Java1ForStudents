package com.geekbrains.lesson7.examples.anonymous;

public class Anonymous {

    public static void main(String[] args) {
        PlusButton plusButton = new PlusButton();
        MinusButton minusButton = new MinusButton();
        int x = 10;
        int y = 5;

        System.out.println(plusButton.execute(x, y));
        System.out.println(plusButton.print());
        System.out.println(minusButton.execute(x, y));

        Button button = new Button() {
            @Override
            public int execute(int x, int y) {
                return x * y;
            }

            @Override
            public String print() {
                return "dasdas";
            }
        };

        Button button1 = new Button() {
            @Override
            public int execute(int x, int y) {
                return 0;
            }

            @Override
            public String print() {
                return null;
            }
        };

        button.execute(1, 2);
        button.print();



//        System.out.println(.print());

    }
}
