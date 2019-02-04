package com.company;

public class MniejszaLiczba extends Operacja{

    public MniejszaLiczba(double liczba1, double liczba2){
        super(liczba1,liczba2);

    }

    @Override
    double wykonajOperacje(double liczba1, double liczba2) {
        if(liczba1 == liczba2){
            return liczba1;
        }else if(liczba1 < liczba2){
            return liczba1;
        }else return liczba2;
    }

    @Override
    void wyswietlWynik() {
        System.out.print("mniejsza lizcba to ");
        super.wyswietlWynik();
    }
}
