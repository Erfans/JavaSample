package com.example.session9;

public abstract class Shape {

    protected int z;

    int x;
    int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    public abstract int area();
}
