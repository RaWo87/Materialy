package com.company;

public class Mnozenie extends Operacja {

    public Mnozenie(double liczba1, double liczba2){
        super(liczba1, liczba2);
    }

    @Override
    double wykonajOperacje(double liczba1,double liczba2){
        return liczba1*liczba2;
    }
}
