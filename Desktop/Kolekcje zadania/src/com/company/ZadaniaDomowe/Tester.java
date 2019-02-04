package com.company.ZadaniaDomowe;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        Algorytmy a = new Algorytmy();

        System.out.println(a.toUpperCases("aSdSaCV"));

        Set<Double> liczby = new HashSet<Double>();
        liczby.add(22.0);
        liczby.add(9.0);
        liczby.add(25.0);
        liczby.add(27.0);
        System.out.println(a.biggestNumber(liczby));
        System.out.println(a.modulo3(liczby));
        System.out.println(a.custoModulo(liczby, 5));
        System.out.println(a.returnOdd(-2, 24));
        System.out.println(a.returnPrime(5, 36));
        System.out.println(a.countWords(" ala ma kota           kot to chołota "));
        System.out.println(a.countLetters("a b c d         z %"));
        a.consonantOrVowel("A bC d");

        System.out.println(a.removeAndConnect("ala Bala naSrala"));


    }
}
