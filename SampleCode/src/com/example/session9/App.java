package com.example.session9;

public class App {
    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(10, 20);
        Triangle triangle1 = new Triangle(10, 20);

        System.out.println("area of rect1 = " + rect1.area());
        System.out.println("area of triangle1 = " + triangle1.area());

        System.out.println("half area of rect1 = " + rect1.halfArea());
        System.out.println("half area of triangle1 = " + triangle1.halfArea());
    }
}
