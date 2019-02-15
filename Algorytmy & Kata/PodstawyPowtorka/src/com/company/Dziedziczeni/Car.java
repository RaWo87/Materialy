package com.company.Dziedziczeni;

public class Car extends Vehicle {
    String kolorLakieru;
    String marka;

    public Car(int speed, int maxSpeed, String kolorLakieru, String marka) {
        super(speed, maxSpeed,4);
        this.kolorLakieru = kolorLakieru;
        this.marka = marka;
    }

    @Override
    public String toString() {
        return "Car{" +
                "kolorLakieru='" + kolorLakieru + '\'' +
                ", marka='" + marka + '\'' +
                ", speed=" + speed +
                ", maxSpeed=" + maxSpeed +
                ", wheelcount=" + wheelCount +
                '}';
    }
}
