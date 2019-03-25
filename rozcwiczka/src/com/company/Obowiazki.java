package com.company;

public class Obowiazki implements Cloneable{
    private String ob1 ="malowac";
    private String ob2 ="gipsowac";

    public String getOb1() {
        return ob1;
    }

    public void setOb1(String ob1) {
        this.ob1 = ob1;
    }

    public String getOb2() {
        return ob2;
    }

    public void setOb2(String ob2) {
        this.ob2 = ob2;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
