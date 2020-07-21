package com.example.session3;

import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {
        int first, second, result;
        Scanner scanner = new Scanner(System.in);
        // Ask user to give us the first number
        System.out.println("Please enter the first number:");
        // Read the first integer from console
        first = scanner.nextInt();
        System.out.println("Please enter the second number:");
        second = scanner.nextInt();
        // IF-Statement
        /*
        >
        <
        >=
        <=
        ==
        !=
        &&
        ||
         */
        if(first > second) {
            System.out.println(first + " > " + second);
        } else if(first == second) {
            System.out.println("The first and second number are equals");
        } else {
            System.out.println("The first number is not greater than the second");
        }
    }
}
