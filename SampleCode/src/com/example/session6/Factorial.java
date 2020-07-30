package com.example.session6;

public class Factorial {

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }

    public static int factorial(int input) {
        if (input == 0) {
            return 1;
        }

        return input * factorial(input - 1);
    }
}
