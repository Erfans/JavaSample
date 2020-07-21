package com.example.session3;

import java.util.Scanner;

public class MathematicalOperations {
    public static void main(String[] args) {
        int first, second, result;
        Scanner scanner = new Scanner(System.in);
        // Ask user to give us the first number
        System.out.println("Please enter the first number:");
        // Read the first integer from console
        first = scanner.nextInt();
        System.out.println("Please enter the second number:");
        second = scanner.nextInt();
        //Main code

        /*
        ()
        unary operand -
        *, /
        +, -
         */

        //first + second * 2
        result = (-first * second) * 2;

        System.out.println("The result is " + result);
    }
}
