package com.company;

public class Power implements Operacja {
    @Override
    public double oblicz(double liczba1, double liczba2) {
        if(liczba2 == 0){return 1;}
        double multiply = liczba1;
        for (int i = 1; i < liczba2; i++) {
            liczba1*=multiply;
        }

        return liczba1;
    }
}
