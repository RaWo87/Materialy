package com.company;

public class Chmura implements  Repository {
    @Override
    public void save() {
        System.out.println("zapisuje do chmury");
    }

    @Override
    public void load() {
        System.out.println("laduje z chmury");
    }
}
