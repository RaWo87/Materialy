package sda;

import java.util.HashSet;
import java.util.Set;

public class Sety {

    // kolejnosc nieokresloma
    // add, addALL cala kolekcja
    // contains

    public static void main(String[] args) {
//        Countries kraje = new Countries();
//        kraje.addCountry("polska");
//        kraje.addCountry("polska2");
//        kraje.addCountry("polska3");
//        kraje.addCountry("polska");
//        kraje.addCountry("polska");
//
//        kraje.removeCountry("polska");
//        kraje.modifyCountry("polska98","polskaB");
//
//        System.out.println(kraje.zbiorKrajow);

        Countries2 setKrajow = new Countries2();
        Prezydent Duda = new Prezydent("Andzej","Duda");
        setKrajow.addCountry("polandia","warsza",2,Duda);
        setKrajow.addCountry("niemlandia","berlin",32,Duda);
        setKrajow.addCountry("roslandia","moskwa",2123,Duda);
        setKrajow.addCountry("finlandia","helsinki",9999,Duda);
        setKrajow.addCountry("portugalia","lizbona", 8,Duda);

        System.out.println(setKrajow.getALLCountries());
        System.out.println(setKrajow.getByName("polandia"));


    }
}

