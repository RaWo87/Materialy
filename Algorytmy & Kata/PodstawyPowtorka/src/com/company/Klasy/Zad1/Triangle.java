package com.company.Klasy.Zad1;

public class Triangle {
    int a,b,c;
    int h;

    public Triangle(int a, int h){
        this.a=a;
        this.h=h;
    }
    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public double getArea(){

        return a*h*0.5;
    }
    public double getParemiter(){
        // Zakladamy trojkat rownoramienny
        return a+(Math.round(Math.sqrt((0.25*a*a)+(h*h))*2));
    }

    public double getArea2(){
        double x;
        x= ((c*c)-(b*b)-(a*a))/(2*a);

        return 0.5*a*Math.sqrt((b*b)-(x*x));

    }
    public double getParemiter2(){

        return (a+b>c? (a+c>b? (b+c>a? a+b+c:0):0):0);
    }


}

