package com.company;

public class Odejmowanie extends Operacja{

    public Odejmowanie(double liczba1, double liczba2) {
        super(liczba1, liczba2);

    }

    @Override
    double wykonajOperacje(double liczba1, double liczba2) {
        return liczba1 - liczba2;
    }
}
