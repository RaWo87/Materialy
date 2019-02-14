package com.company.Klasy.Zad1;

public class Circle {
    int r;


    public Circle(int r){
        this.r=r;

    }

    public double getArea(){

        return Math.round(Math.PI*r*r);
    }
    public double getParemiter(){
        return Math.round(Math.PI*r*2);
    }
}
