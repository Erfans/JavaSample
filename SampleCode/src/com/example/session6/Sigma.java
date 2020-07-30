package com.example.session6;

public class Sigma {

    public static void main(String[] args) {
        int result = sigma(6);
        System.out.println(result);
    }

    public static int sigma(int value) {
        if (value < 1) {
            return 0;
        }

        int innerSigmaResult = sigma(value - 1);
        return value + innerSigmaResult;
    }

    /*
    Sigma( 1,2,3,...,10)
    = 10 + sigma ( 1,2,3,...,9)
    = 10 + 9 + sigma(1,2,3,...,8)
    = 10 + 9 + 8 + sigma(1,2,3,...,7)
     */
}
