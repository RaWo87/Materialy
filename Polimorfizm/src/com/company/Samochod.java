package com.company;

public class Samochod implements Nadwozie, Podwozie {
private String kolor = " niebieski";
    @Override
    public void naprawBlache() {
        System.out.println("naprawiam blache");
    }

    @Override
    public void wymienSzyby() {
        System.out.println("wymieniam szyby");
    }

    @Override
    public void naprawHamulce() {
        System.out.println("naprawiam hamulce");
    }

    @Override
    public void wymienAmortyzator() {
        System.out.println("wymieniam amortyzator");
    }


    @Override
    public void pobierzKolor() {
        System.out.println(kolor);
    }

    @Override
    public void przemalujNaCzerwono() {
        this.kolor = "czerwony";
    }
}
