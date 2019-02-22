package com.company.Dziedziczeni;

public class Square extends Rectangle {
    int bokA;



    Square(int bok){
        super(bok,bok);
        this.bokA=bok;
    }
    @Override
    double getArea() {
        return bokA*bokA;
    }
}
