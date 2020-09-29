package com.company.lesson2;

public class Lesson2 {

    public static void main(String[] args) {
        int x = 2;
        int y = 5;

//        System.out.println("Кто не делает красивый вывод тот лох: " + (x < y));
//        System.out.println("x < y: " + (x < y));
//        System.out.println("x <= y: " + (x <= y));
//        System.out.println("x >= y: " + (x >= y));
//        System.out.println("x == y: " + (x == y));
//        System.out.println("x != y: " + (x != y));


//        x = x + 1;
//        x = x - 1;
//        x = x * 1;
//        x = x / 1;
//        x = x % 1;
//        System.out.println(x += 1);
        System.out.println(x++);
        System.out.println(++y);

        System.out.println(((x + y) / 2) - 1);

        x = 16;
        if ((x % 2 == 0 && x % 3 == 0) || x % 8 == 0) {
            System.out.println("Вау! Число четное и делится на 3 или делится на 8 без остатка!!!");
        }
    }

    private static void schoolArithmeticsMathematics() {
        int x = 5;
        int y = 10;

        int sum = x + y;
        System.out.println("Sum is: " + sum);
        System.out.println("Sum from method: " + sum(x, y));

        int subtraction = x - y;
        System.out.println("Subtraction is: " + subtraction);

        int multiplication = x * y;
        System.out.println("Multiplication is: " + multiplication);

        int division = x / y;
        System.out.println("Division is: " + division);

        int mod = y % x;
        System.out.println("Mod is: " + mod);
    }

    static int sum(int firstParameter, int secondParameter) {
        return firstParameter + secondParameter;
    }

    /**
     * модификатор_доступа статический_или_нет возвращаемый_тип имя_метода(параметры_метода) {
     *     тело_метода
     * }
     * Пример не статичного метода:
     * String olya = crushIsBeautiful("Olya");
     * public String crushIsBeautiful(String crushName) {
     *     return crushName + " is beautiful";
     * }*/

}
