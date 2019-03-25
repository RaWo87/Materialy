package com.company.FootballMenager;

public class Club implements Cloneable{
    private String name = "default";
    private Menager menager;

    public Club(String name, Menager menager) {
        this.name = name;
        this.menager = menager;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Menager getMenager() {
        return menager;
    }

    public void setMenager(Menager menager) {
        this.menager = menager;
    }

    protected Object clone() throws CloneNotSupportedException{
        Club c = (Club)super.clone();
        c.menager = (Menager)menager.clone();
        return c;
    }
}
