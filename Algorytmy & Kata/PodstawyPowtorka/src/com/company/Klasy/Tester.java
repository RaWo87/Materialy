package com.company.Klasy;

import com.company.Klasy.Zad1.Circle;
import com.company.Klasy.Zad1.Rectangle;
import com.company.Klasy.Zad1.Triangle;

public class Tester {


    public static void main(String[] args) {
        Rectangle prostokat = new Rectangle(5,10);
        Triangle trojkat = new Triangle(5,10);
        Triangle trojkat2 = new Triangle(5,8,5);
        Circle kolko = new Circle(5);

        System.out.println("prostokat - pole: "+prostokat.getArea()+" obwod: "+prostokat.getParemiter());
        System.out.println("trojkat - pole: "+trojkat.getArea()+" obwod: "+trojkat.getParemiter());
        System.out.println("kolo - pole: "+kolko.getArea()+" obwod: "+kolko.getParemiter());
        System.out.println("trojkat2 - pole: "+trojkat2.getArea2()+" obwod: "+trojkat2.getParemiter2());

    }
}
