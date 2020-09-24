package com.example.solution;

public class Hanoi {

    public static void main(String[] args) {
        hanoi('A', 'B', 'C', 9);
    }

    public static void hanoi(char a, char b, char c, int n) {
        if(n > 1) {
            hanoi(a,c,b, n-1);
            System.out.println(a + " -> " + b);
            hanoi(c,b,a,n-1);
        } else {
            System.out.println(a + " -> " + b);
        }
    }
}
