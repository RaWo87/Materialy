package com.company.FootballMenager;

public class Menager implements Cloneable{
    private String name ="default";
    private String lastName = "default";

    protected Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
