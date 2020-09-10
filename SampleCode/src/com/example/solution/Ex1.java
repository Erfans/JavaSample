package com.example.solution;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        System.out.println("Enter number");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Shanbe");
                break;
            case 2:
                System.out.println("1Shanbe");
                break;
            case 3:
                System.out.println("2Shanbe");
                break;
            case 4:
                System.out.println("3Shanbe");
                break;
            case 5:
                System.out.println("4Shanbe");
                break;
            case 6:
                System.out.println("5Shanbe");
                break;
            case 7:
                System.out.println("Jome");
                break;
            default:
                System.out.println("Wrong Number");
        }
    }
}
