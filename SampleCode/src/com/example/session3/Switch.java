package com.example.session3;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int first, second, result = -999;
        char operand;
        Scanner scanner = new Scanner(System.in);
        // Ask user to give us the first number
        System.out.println("Please enter the first number:");
        // Read the first integer from console
        first = scanner.nextInt();
        System.out.println("Please enter the second number:");
        second = scanner.nextInt();
        System.out.println("Please enter your operand:");
        operand = scanner.next().charAt(0);
        //Main code
        switch (operand) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.println("Please enter a valid operand");
        }
        System.out.println(first + " " + operand + " " + second + " = " + result);
    }
}
