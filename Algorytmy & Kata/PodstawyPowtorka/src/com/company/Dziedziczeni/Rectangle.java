package com.company.Dziedziczeni;

public class Rectangle extends Shape {
    int bokA;
    int bokB;

    public Rectangle(int bokA, int bokB) {
        this.bokA = bokA;
        this.bokB = bokB;
    }

    double getArea() {
        return bokA*bokB;
    }
    @Override
    double getParimeter() {
        return 0;
    }
}
