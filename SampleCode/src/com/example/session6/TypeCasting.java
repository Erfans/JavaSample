package com.example.session6;

public class TypeCasting {

    public static void main(String[] args) {
        int oldInt = 2;
        long oldLong = 10;
        float oldFloat = 2.3f;
        double oldDouble = 4.4;
        char oldChar = 'A';

        // show ASCII code of char
        System.out.println((int) oldChar);
        System.out.println((int) 'a');

        int newInt = (int) oldFloat;

        System.out.println(oldFloat);
        System.out.println(newInt);

        System.out.println("=======================");

        int a = 10;
        int b = 3;

        float result = (float) a / b;
        System.out.println(result);

        float c;
        c = a;
        System.out.println(c);
    }
}
