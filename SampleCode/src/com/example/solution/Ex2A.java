package com.example.solution;

import java.util.Scanner;

public class Ex2A {
    public static void main(String[] args) {

        System.out.print("Enter the number:");

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        for (int i = 0; i < input; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
