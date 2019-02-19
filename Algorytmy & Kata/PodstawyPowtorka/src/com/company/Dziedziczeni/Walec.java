package com.company.Dziedziczeni;

import com.company.CharyMary.Solid;

public class Walec implements Solid {
    int Podstawa;
    int bok;

    Walec(int r, int h){
        this.Podstawa= (int)new Circle(r).getArea();
        this.bok= (int)new Square(h).getArea();
    }


    @Override
    public Object getSurfaceArea() {


        return 2*Podstawa+bok;
    }

    @Override
    public Object getVolume() {
        return null;
    }
}
