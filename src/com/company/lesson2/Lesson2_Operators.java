package com.company.lesson2;

public class Lesson2_Operators {
    public static void main(String[] args) {
        int a = 5, b = 2;
        double c = 5.0, d = 2.0;

        System.out.println("Сложение (также унарный плюс)");
        System.out.println(a + b);
        System.out.println(c + d);

        System.out.println("Преобразование a в переменную типа int, если это переменная типа byte, short или char\n");
        System.out.println(+a);

        System.out.println("Вычитание (также унарный минус)");
        System.out.println(a - b);
        System.out.println(c - d);

        System.out.println("Арифметическая инверсия а");
        System.out.println(-a);
        System.out.println(-c);

        System.out.println("Умножение");
        System.out.println(a * b);
        System.out.println(c * d);

        System.out.println("Деление");
        System.out.println(a / b);
        System.out.println(c / d);

        System.out.println("Вычисление остатка от деления");
        System.out.println(a % b);
        System.out.println(c % d);

        System.out.println("Инкремент");
        System.out.println(a++);
        System.out.println(++a);

        System.out.println("Декремент");
        System.out.println(a--);
        System.out.println(--a);

        System.out.println("Различные краткие формы записи");
        System.out.println(a += 5);
        System.out.println(a = a + 5);

        System.out.println(a -= 5);
        System.out.println(a = a - 5);

        System.out.println(a *= 5);
        System.out.println(a = a * 5);

        System.out.println(a /= 5);
        System.out.println(a = a / 5);

        System.out.println(a %= 2);
        System.out.println(a = a % 2);

        boolean isMaksimAttractive = false;
        System.out.println(!isMaksimAttractive);

        System.out.println("Boolean operators");
        int firstVariable = 4;
        int secondVariable = 5;
        boolean result;
        result = firstVariable < secondVariable; // true
        System.out.println("The result is: " + result);

        result = firstVariable > secondVariable; // false
        System.out.println("The result is: " + result);

        result = firstVariable <= 4; // firstVariable smaller or equal to 4 - true
        System.out.println("The result is: " + result);

        result = secondVariable >= 6; // secondVariable bigger or equal to 6 - false
        System.out.println("The result is: " + result);

        result = firstVariable == secondVariable; // firstVariable equal to secondVariable - false
        System.out.println("The result is: " + result);

        result = firstVariable != secondVariable; // firstVariable is not equal to secondVariable - true
        System.out.println("The result is: " + result);

        result = firstVariable > secondVariable || firstVariable < secondVariable; // Logical or - true
        System.out.println("The result is: " + result);

        result = 3 < firstVariable && firstVariable < 6; // Logical and - true
        System.out.println("The result is: " + result);

        result = !result; // Logical not - false
        System.out.println("The result is: " + result);

        //Также существуют побитовые операции более подробно о них http://proglang.su/java/operators

        int aVariables = 60;    /* 60 = 0011 1100 */
        int bVariable = 13;    /* 13 = 0000 1101 */
        int cVariable = 0;

        cVariable = aVariables & bVariable;       /* 12 = 0000 1100 */
        System.out.println("aVariables & bVariable = " + cVariable);

        cVariable = aVariables | bVariable;       /* 61 = 0011 1101 */
        System.out.println("aVariables | bVariable = " + cVariable);

        cVariable = aVariables ^ bVariable;       /* 49 = 0011 0001 */
        System.out.println("aVariables ^ b = " + cVariable);

        cVariable = ~aVariables;          /*-61 = 1100 0011 */
        System.out.println("~aVariables = " + cVariable);

        cVariable = aVariables << 2;     /* 240 = 1111 0000 */
        System.out.println("aVariables << 2 = " + cVariable);

        cVariable = aVariables >> 2;     /* 215 = 1111 */
        System.out.println("aVariables >> 2  = " + cVariable);

        cVariable = aVariables >>> 2;     /* 215 = 0000 1111 */
        System.out.println("aVariables >>> 2 = " + cVariable);
    }
}
