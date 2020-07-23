package com.example.session5;

public class Hop {
    public static void main(String[] args) {
        for (int i = 1; i < 50; i++) {
            if(i % 5 == 0) {
                System.out.println("Hop");
                continue;
            }
            System.out.println(i);
        }
    }
}
