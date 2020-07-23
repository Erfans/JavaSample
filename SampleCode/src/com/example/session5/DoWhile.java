package com.example.session5;

import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int sum = 0, input;
        Scanner scanner = new Scanner(System.in);
        do {
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
        System.out.println("SUM = " + sum);
    }
}
