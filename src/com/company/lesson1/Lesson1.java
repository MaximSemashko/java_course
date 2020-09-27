package com.company.lesson1;

public class Lesson1 {

    public static void main(String[] args) {
        // comment
        System.out.println("Hello world");

        // целочисленные переменные: 1, 2, 3...199800000...
        byte byteVariable = 1;
        short shortVariable = 1;
        int integerVariable = 1;
        long longVariable = 1;

        // Дробные числа: 1.00, 1.23, 1.43 ...
        float floatVariable = 1.00123f;
        double doubleVariable = 123.23;
        //change variable
        doubleVariable = 23.0;

        //строки
        char charVariable = 'c';
        String stringVariable = "string variable";

        // Boolean
        boolean booleanVariable = true;

        int x, y, z = 5;

        String crushName = "Olya";
        String myName = "Maksim";
        String loves = "loves";
        String space = " ";
        String andWord = " and ";

        String crushLovesMe = crushName + space + loves + space + myName;
        System.out.println(crushLovesMe);

        String maksimLovesCrush = myName + space + loves + space + crushName;
        System.out.println(maksimLovesCrush);

        String maksimAndOlyaFallInLove = maksimLovesCrush + andWord + crushLovesMe;
        System.out.println(maksimAndOlyaFallInLove);
    }
}
