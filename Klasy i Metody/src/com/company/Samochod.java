package com.company;

public class Samochod {

    Silnik silnik = new Silnik();

    Samochod(Silnik silnik) {
        this.silnik = silnik;
    }
    Kolo[] kola = new Kolo[18];
    Samochod(){

        System.out.println("Tworze nowy samochod");



    }
}
