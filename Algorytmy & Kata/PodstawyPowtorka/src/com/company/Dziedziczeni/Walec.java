package com.company.Dziedziczeni;

public class Walec implements Solid {
    int podstawa;
    int bok;
    int h;

    Walec(int r, int h){
        this.h=h;
        this.podstawa = (int)new Circle(r).getArea();
        this.bok= (int)new Rectangle(h,(int)(new Circle(r).getParimeter())).getArea();
    }

    @Override
    public Object getSurfaceArea() {
        return 2* podstawa +bok;
    }

    @Override
    public Object getVolume() {

        return podstawa*h ;
    }
}
