package com.example.session10;

import java.util.Scanner;

public class StringSample2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first  = scanner.next();
        String second = scanner.next();

        if(first.equalsIgnoreCase(second)) {
            System.out.printf("%s and %s are equal", first, second);
        } else {
            System.out.printf("%s and %s are not equal", first, second);
        }
    }
}
