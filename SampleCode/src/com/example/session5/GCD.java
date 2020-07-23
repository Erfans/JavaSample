package com.example.session5;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        /*
        int min;
        if (first < second) {
            min = first;
        } else {
            min = second;
        }
        */
        int result = gcd(first, second);
        System.out.printf("GCD of %d and %d is %d\n", first, second, result);
    }


    public static int gcd(int x, int y) {
        /*
        int min;
        if (x < y) {
            min = x;
        } else {
            min = y;
        }
        */
        int min = (x < y) ? x : y;
        for(int i = min; i > 0; i--) {
            if(x % i == 0 && y % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
