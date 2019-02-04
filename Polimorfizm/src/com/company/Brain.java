package com.company;

public class Brain implements Repository {
    @Override
    public void save() {
        System.out.println("zapisuje do mozgo");
    }

    @Override
    public void load() {
        System.out.println("wczytuje z mozgo");


    }
}
