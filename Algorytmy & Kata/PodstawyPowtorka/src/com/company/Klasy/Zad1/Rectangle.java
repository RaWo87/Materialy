package com.company.Klasy.Zad1;

public class Rectangle {
    int a;
    int b;

 public Rectangle(int a, int b){
        this.a=a;
        this.b=b;
    }

    public int getArea(){

        return a*b;
    }
    public int getParemiter(){
        return (2*a)+(2*b);
    }
}
