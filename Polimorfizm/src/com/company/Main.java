package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//
//        A a = new C();
//        System.out.println( a instanceof B);
//        ((C) a).metodaB();

	// write your code here
//        Samochod bmw = new Samochod();
//        WarsztatNadwozia warsztat = new WarsztatNadwozia();
//        warsztat.napraw(bmw);
//        WarsztatLakierniczy lakiernia = new WarsztatLakierniczy();
//        lakiernia.lakieruj(bmw);
//bmw.pobierzKolor();
//warsztat.maluj(bmw);

//      Chmura obloczek = new Chmura();
//        DataMenager menagier2 = new DataMenager(obloczek);
//        menagier2.dodajDane();
//
//
//        Repository repo;
//        boolean internetConnection = false;
//        if(internetConnection){
//            repo = new Chmura();
//        }else{
//            repo = new Dysk();
//        }
//        DataMenager menagier = new DataMenager(repo);
//        repo = new Brain();
//        DataMenager brainMenager = new DataMenager(repo);
//
//menagier.wyswietlDane();
//brainMenager.dodajDane();


        Kalkulator calc = Kalkulator.DODAWANIE;
        Kalkulator[] tab = Kalkulator.values();

        double liczba1 = 3;
        double liczba2 = 3;
        String testZnak = "^";


        for (Kalkulator element : tab
        ) {
            if (testZnak.equals(element.znak)) {
                System.out.println(element);
                double wynik = element.operacja.oblicz(liczba1, liczba2);
                System.out.println(wynik);
            }
        }

        //Operacja operacja = Kalkulator.znajdzKalkulatorDlaZnaku(testZnak);

        //System.out.println(operacja.oblicz(liczba1,liczba2));
        //System.out.println(Kalkulator.znajdzKalkulatorDlaZnaku(testZnak).oblicz(liczba1,liczba2));

        Date now = new Date();
        System.out.println(now);
        Thread.sleep(5000);
        System.out.println(new Date());



    }
}
