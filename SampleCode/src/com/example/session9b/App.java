package com.example.session9b;

import com.example.session9.Rectangle;
import com.example.session9.Triangle;

public class App {
    public static void main(String[] args) {
        Student h1 = new Student("Erfan", "SH");
        Staff h2 = new Staff("Soroush", "V");

        printName(h1);
        printName(h2);
    }

    public static void printName(Human human) {
        System.out.println(human.getName());
    }
}
