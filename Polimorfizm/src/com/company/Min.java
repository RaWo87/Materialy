package com.company;

public class Min implements Operacja {
    @Override
    public double oblicz(double liczba1, double liczba2) {
        if (liczba1 < liczba2 || liczba1 == liczba2) {
            return liczba1;
        }
        return liczba2;
    }
}
