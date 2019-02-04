package com.company;

public class Odejmowanie implements Operacja {
    @Override
    public double oblicz(double liczba1, double liczba2) {
        return liczba1-liczba2;
    }
}
