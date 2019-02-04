package com.company;

public class Main {

    public static void main(String[] args) {
        Czlowiek andrzej = new Czarny();
        ((Czarny) andrzej).metodaCzarnego();


        Odejmowanie minus = new Odejmowanie();
        System.out.println(minus.wykonajOperacje(25,5));

	// write your code here
    }
}
