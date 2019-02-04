package com.company;

public interface Operacja {

    double liczba1;
    double liczba2;

    void Operacja(double liczba1, double liczba2);
    default void wyswietlWynik() {

        System.out.println(wykonajOperacje(liczba1, liczba2));
    }

    double wykonajOperacje(double liczba1, double liczba2);
}
