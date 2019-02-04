package com.company;

public class WiekszaLiczba extends Operacja {

    public WiekszaLiczba(double liczba1, double liczba2){
        super(liczba1,liczba2);
    }

    @Override
    double wykonajOperacje(double liczba1, double liczba2) {
        return Math.max(liczba1,liczba2);
    }

    @Override
    void wyswietlWynik() {
        System.out.print("wieksza liczba to ");
        super.wyswietlWynik();
    }
}
