package com.company.Dziedziczeni;

public class Circle extends Shape {
    int r;


    Circle(int r){
        this.r=r;
    }
    @Override
    double getArea() {
        return (int)Math.PI*r*r;
    }

    @Override
    double getParimeter() {
        return (int)2*Math.PI*r;
    }
}
