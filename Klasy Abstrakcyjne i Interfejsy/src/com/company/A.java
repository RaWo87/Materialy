package com.company;

public abstract class A {

    private String tekst;
    public A(){}
    public A(String tekst){
        this.tekst = tekst;
    }
void wyswietlPrzywitanie(){
    System.out.println(tekst);
}

    public abstract String przywitanie(String tekst);
}
