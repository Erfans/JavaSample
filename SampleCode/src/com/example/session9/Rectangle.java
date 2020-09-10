package com.example.session9;

public class Rectangle extends Shape implements ShapeInterface {

    public Rectangle(int x, int y) {
        super(x, y);
    }

    public int area() {
        int z = this.z;
        return this.x * this.y;
    }

    @Override
    public int halfArea() {
        return this.area() / 2;
    }
}
