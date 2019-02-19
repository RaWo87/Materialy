package com.company.Dziedziczeni;

public class Rectangle extends Shape {
    int bokA;
    int bokB;
    @Override
    double getArea() {
        return bokA*bokB;
    }
    @Override
    double getParimeter() {
        return 0;
    }
}
