package com.example.solution;

public class Ex2 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (Ex2.isPrimary(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrimary(int number) {

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
