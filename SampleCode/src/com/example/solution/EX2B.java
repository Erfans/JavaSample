package com.example.solution;

import java.util.Scanner;

public class EX2B {
    public static void main(String[] args) {
        System.out.print("Enter the number:");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int result = 1;
        for (int i = 2; i <= input; i++) {
            result *= i;
        }

        System.out.print("Result is " + result);
    }
}
