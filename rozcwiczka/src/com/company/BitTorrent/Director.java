package com.company.BitTorrent;

public class Director implements Cloneable{
    String name;
    String lastName;
    Genre gatunek;

    public Director(String name, String lastName, Genre gatunek) {
        this.name = name;
        this.lastName = lastName;
        this.gatunek = gatunek;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Genre getGatunek() {
        return gatunek;
    }

    public void setGatunek(Genre gatunek) {
        this.gatunek = gatunek;
    }
}
