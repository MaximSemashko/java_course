package com.company.lesson1;

public class Lesson1_DataTypes {

    public static void main(String[] args) {
        System.out.println("Hello world");

        byte byteVar = 1;
        short shortVar = 1;
        int intVar = 1;
        long longVar = 1L;
        float floatVar = 1f;
        double doubleVar = 1.0;
        char charVar = 'c';
        String stringVar = "this is string";
        boolean booleanVar = true;
        booleanVar = false;

        int x,y = 1;

        String maksim = "Maksim";
        String olya = "Olya";
        String love = "loves";

        String maksimLovesOlya = maksim + " " + love + " " + olya;
        String olyaLovesMaksim = olya + " " + love + " " + maksim;

        System.out.println(maksimLovesOlya);
        System.out.println(olyaLovesMaksim);
        System.out.println(maksimLovesOlya + "and " + olyaLovesMaksim);

        int daysInYear = 365;
        System.out.println("There are: " + daysInYear);
    }
}
