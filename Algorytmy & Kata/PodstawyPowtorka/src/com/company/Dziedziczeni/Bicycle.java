package com.company.Dziedziczeni;

public class Bicycle extends Vehicle {

    String typRamy;
    int iloscPrzezutek;

    public Bicycle(int speed, int maxSpeed, String typRamy, int iloscPrzezutek) {
        super(speed, maxSpeed,2);
        this.typRamy = typRamy;
        this.iloscPrzezutek = iloscPrzezutek;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "typRamy='" + typRamy + '\'' +
                ", iloscPrzezutek=" + iloscPrzezutek +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", wheelcount=" + wheelCount +
                '}';
    }
}
