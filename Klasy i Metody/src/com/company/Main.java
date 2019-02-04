package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
//    String[] mojaTablica = {"jacek","ola"};
//    String[] imiona = new String[10];
//        String[] imiona2 = new String[10];
//
//        for (int i = 0; i <mojaTablica.length ; i++) {
//            imiona[i] = mojaTablica[i];
//        }
//
//        for (int i = 0; i < imiona.length; i++) {
//            if(imiona[i]==null){break;}
//            System.out.println(imiona[i]);
//            System.out.println(imiona2[i]);
//        }

//        String[] imiona={"Jacek", " Ala", "Ma", "Kota"};
//        String imie = imiona[imiona.length-1];
//        System.out.println(imie);
//        System.out.println(imie.charAt(0));
//        System.out.println(imie.charAt(imiona.length-1));

        //TABLICE WIELOWYMIAROWE POTRZEBUJA TYLKO 1 WYMIAR np.  "tab[1][]"
        //TABLICE > 2 WYMIAR LEPIEJ ZASTAPIC OBIEKTAMI

//        int[][] tab_v2 = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };
//        int[] pierwszyRzad = tab_v2[0];
//        System.out.println(Arrays.toString(pierwszyRzad));
//
//        String[][] tab = {
//                {"x", "o", "x"},
//                {"o", "x", "o"},
//                {"x", "o", "x"}
//        };
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(Arrays.toString(tab[i]));
//        }
//
//        System.out.println(tab[1][2]);
//        System.out.println(tab[2][0]);
//
//        tab[1][1] = "o";
//
//        for (int i = 0; i < tab.length; i++) {
//            System.out.println(Arrays.toString(tab[i]));
//        }
            // ERROR
//        for (int i = 0; i <tab.length ; i++) {
//            for (int j = 0; j < tab.length; j++) {
//                while (tab[i][j] == "o") {
//                    System.out.println("wygrałeś w " + (i + 1) + "rzedzie");
//                    break;
//                }
//            }
//              }
//            System.out.println();
//            for(String element: tab[1]){
//                System.out.print(element+" ");
//            }
//        System.out.println();
//        for (String[] rzad: tab
//             ) {
//            for (String kolumna: rzad
//                 ) {
//                System.out.print(kolumna+" ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for(int i=0;i<tab.length;i++){
//            System.out.println(tab[i][1]+" ");
//        }
//        for (int i = 0; i < tab.length; i++) {
//            for (int j = 0; j < tab[i].length; j++) {
//                if (
//                        tab[i][0] == "o" || tab[i][0] == "W" &&
//                                tab[i][1] == "o" || tab[i][0] == "W" &&
//                                tab[i][2] == "o" || tab[i][0] == "W"
//                ) {
//                    tab[i][0] = "W";
//                    tab[i][1] = "W";
//                    tab[i][2] = "W";
//                }
//                if (
//                        tab[0][j] == "o" || tab[0][j] == "W" &&
//                                tab[1][j] == "o" || tab[1][j] == "W" &&
//                                tab[2][j] == "o" || tab[2][j] == "W"
//                )
//                {
//                    tab[0][j] = "W";
//                    tab[1][j] = "W";
//                    tab[2][j] = "W";
//                }
//            }
//        }
//        System.out.println();
//        for (String[] rzad: tab
//        ) {
//            for (String kolumna: rzad
//            ) {
//                System.out.print(kolumna+" ");
//            }
//            System.out.println();
//        }

        // OBIEKTOWOSC
//        Dom mojDom1 = new Dom();
//        System.out.println("opcja domyslna "+mojDom1.iloscPieter);
//        mojDom1.iloscPieter = 10;
//        System.out.println("opcja blok "+mojDom1.iloscPieter);
//        System.out.println("szerokosc domu: "+mojDom1.szerokosc);
//        System.out.println("dlugosc domu: "+mojDom1.dlugosc);
//
//        System.out.println("pole domu: "+mojDom1.dlugosc*mojDom1.szerokosc);
//        Dom[] ulica = {new Dom(),new Dom(),new Dom(),new Dom()};
//        Dom[] ulica2 = new Dom[5];
//        System.out.println(ulica[ulica.length-1]);
//        System.out.println(ulica[ulica.length-1].iloscPieter);
//        System.out.println(ulica2[ulica2.length-1]);
//
//        Samochod audi = new Samochod();
//        Silnik silnik5L = new Silnik();
//        silnik5L.pojemnosc =6000;
//        audi.silnik = silnik5L;
////        audi.silnik.pojemnosc=5000;
//        System.out.println("pojemnosc "+audi.silnik.pojemnosc);
//
//        Samochod mercedes = new Samochod();
//        mercedes.silnik = silnik5L;
//
//        System.out.println("silnik mercedesa: " +mercedes.silnik.pojemnosc);
//            // tworzymy obiekt auto
//            Samochod scania = new Samochod();
//            // tworzymy pusta tablice kół
//        for(int i=0;i < scania.kola.length;i++){
//            scania.kola[i] = new Kolo();
//        }
//        // sprawdzanie ciśneinia + pompowanie
//        for (Kolo aktualne: scania.kola
//             ) {
//            if(aktualne.cisnienie <=0){
//            } aktualne.cisnienie = 4;
//        }
//        // drukowanie for
//        for (int i = 0; i <scania.kola.length; i++) {
//            System.out.print(" "+scania.kola[i].cisnienie);
//        }
//        // drukowanie foreach
//        System.out.println();
//        for (Kolo koloSprawdzane: scania.kola
//             ) {
//            System.out.print(" "+koloSprawdzane.cisnienie);
//        }
//
//        Silnik _2jz = new Silnik(3000, "super1");
//
//        System.out.println("_2jz - pojemnosc: "+ _2jz.pojemnosc);
//        System.out.println("nazwa: "+ _2jz.nazwa);
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Podaj pojemnosc:" );
//        int nowaP = input.nextInt();
//
//        System.out.println("Podaj nazwe:" );
//        String nowaN = input.next();
//
//        Silnik v6 = new Silnik(nowaP,nowaN);
//
//        System.out.println("pojemnosc "+v6.pojemnosc+"nazwa:" +v6.nazwa);
//        System.out.println();
//
//    Silnik silnikBmw = new Silnik(5000);
//    Samochod bmw = new Samochod(silnikBmw);
//

//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Podaj imie:" );
//        String noweImie = input.next();
//        System.out.println("Podaj nazwisko:" );
//        String noweNazwisko = input.next();

//        User user1 = new User("ala", "Makotska");
//        User user2 = new User("Jan","Kowalski");
//        User user3 = new User(77,"Brajanusz");
//
//        System.out.println("imie: "+user1.imie+" nazwisko: "+user1.nazwisko);
//        System.out.println("imie: "+user2.imie+" nazwisko: "+user2.nazwisko);
//        System.out.println("imie: "+user1.wiek+" nazwisko: "+user2.imie);
//        System.out.println("wiek: "+user3.wiek+" nazwisko: "+user3.nazwisko);
//
Okno oknoStandardowe = new Okno(200,200);
Okno[] zestawOkien = new Okno[] {oknoStandardowe,oknoStandardowe,oknoStandardowe};
Drzwi drzwiWejsciowe = new Drzwi(100,200,"stal");

Garaż mojGaraż = new Garaż(new Drzwi(100,100,"karton"),oknoStandardowe);
Dom mojdom1 = new Dom(mojGaraż,drzwiWejsciowe,zestawOkien);


        System.out.println(mojdom1.mojeOkno[2].wysokosc);
        System.out.println(mojdom1.mojGaraz.drzwiGarazowe.material);




    }
}
