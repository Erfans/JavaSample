package com.example.session9;

public class Triangle extends Shape implements ShapeInterface {

    public Triangle(int x, int y) {
        super(x, y);
    }

    public int area() {
        return this.x * this.y / 2;
    }

    @Override
    public int halfArea() {
        return this.area() / 2;
    }
}
