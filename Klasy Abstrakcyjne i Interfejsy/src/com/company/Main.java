package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        B obiektB = new B("msciek");
        String sayHi = obiektB.przywitanie("andzej");
        System.out.println(sayHi);

        Dodawanie wynik = new Dodawanie(6,7);
        wynik.wyswietlWynik();
        System.out.println(wynik.wykonajOperacje(5,4));

        Mnozenie wynikMnoz = new Mnozenie(5,6);
        wynikMnoz.wyswietlWynik();

        Odejmowanie wynikOd = new Odejmowanie(10,5);
        wynikOd.wyswietlWynik();

        WiekszaLiczba wieksza = new WiekszaLiczba(6.6,5.6665);
        wieksza.wyswietlWynik();

        MniejszaLiczba mniejsza = new MniejszaLiczba(7,232);
        mniejsza.wyswietlWynik();

        Powitanie witacz = new Powitanie("andzej");
        witacz.przywitajSie();

    }
}
