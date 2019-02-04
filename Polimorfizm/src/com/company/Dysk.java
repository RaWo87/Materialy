package com.company;

public class Dysk implements  Repository {

    @Override
    public void save() {
        System.out.println("zapisuje na dysk");
    }

    @Override
    public void load() {
        System.out.println("wczytuje z dysku");

    }
}
