package com.example.solution;

import java.util.Scanner;

public class Ex3A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number:");
        int x = scanner.nextInt();

        System.out.print("Enter the second number:");
        int y = scanner.nextInt();

        int gcd = gcd(x, y);
        System.out.print("GCD is: " + gcd);
    }

    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x % y);
        }
    }
}
