package com.company;

import java.util.Arrays;

public class Zajecia2 {
    public static void main(String[] args) {

        // PETLE FOR,WHILE,    I TABLICE
        int dlug = 10000;
        double kwota = 0D;
        double oprocentowanie = 0.05D;
        int liczbaMiesiecy = 0;
        double suma = 0D;
        int counter = 0;
        double expectedProfit = 1500;
        int number = 100;
        int liczba1 = 9;
        int liczba2 =13;


        String[] tab = {"jacek ","jacek ","jacek "};
        tab[0]="jacek ";
        tab[1]="ma ";
        tab[2]="kota ";


//        while(counter<tab.length){
//            System.out.print(tab[counter]+" ");
//            counter++;
//        }
//
//        System.out.println(tab[0]+tab[1]+tab[2]);
//            for(int i=0;i<tab.length;i++){
//                System.out.print(tab[i]+" ");
//            }
        System.out.println();

        double wynik = 0;
        int[] oceny = {3, 5, 3, 2, 5, 4, 5, 5, 3, 3, 4, 4, 4, 5};
//        for (int i = 0; i < oceny.length; i++) {
//            wynik += oceny[i];
//        }

        System.out.println("For each");
        for(int ocena : oceny){
            System.out.print(ocena+" ");
        }
        System.out.println();
        for(int i=(oceny.length-1);i>=0;i--){
            System.out.print(oceny[i]+" ");
        }
        System.out.println();

        String[] imiona = {"jacek", "piotrek", "marta", "olga", "jan", "brajanusz"};

        System.out.println();
        for(String imie: imiona){
            System.out.print(imie+" ");
        }
        System.out.println();

//        System.out.println("srednia ocen to: "+Math.round(wynik/oceny.length));
//        System.out.println("suma ocen to: " + wynik);
        System.out.println(Arrays.toString(oceny));

//        int[] liczby = new int[10];
//        liczby[0]= 23;
//        liczby[1]=44;
//        liczby[2]=454;
//        liczby[3]=34535;
//        liczby[4]=3453;
//        liczby[5]=3453;
//        liczby[6]=34;
//        liczby[7]=234;
//
//        System.out.println(liczby[2]);
//        System.out.println(liczby.length);
//        String[] imie = new String[3];
//        imie[2]= "Rafal";
//        System.out.println(imie[0]+imie[1]+imie[2]);
//
//        String[] imiona= new String[10];
//        String[] imiona2 = {"jacek", "placek","ala","kotor"};
//        System.out.println(imiona2[0]);
//        imiona2[0] = "Ola";
//        System.out.println(imiona2[0]);

//        for (int i = 0; i < 1000; i++) {
//
//            if (i == 666) {
//                System.out.println("tych nie lubimy");
//            break;
//            }
//            if (i%2!=0) {
//                System.out.println(i);
//            continue;}
//        }

//        for (int i = 100; i >= 0; i--){
//            switch(i){
//                case 9:
//                    System.out.println("tej nie lubie");
//                    break;
//                case 13:
//                    System.out.println("tej nie pocałuje");
//                    break;
//                case 0:
//                    System.out.println("ZERO");
//                    break;
//                default:
//                    System.out.println("lubie: "+i);
//                    break;
//            }
//        }



//        for (int i = 100; i >= 0; i--) {
//
//            int znak = i;
//            if (znak < 60) {
//                znak += 60;
//            }
//            if (i == liczba1 || i == liczba2) {
//                System.out.println("Tej nie lubie");
//            } else if (i == 0) {
//                System.out.println("null  " + i);
//            } else if (i % 2 == 0) {
//                System.out.println("even " + (char) znak + " " + i);
//            } else System.out.println("odd " + (char) znak + " " + i);
//
//
//        }

//        for(int index =0; index<100; index+=2){
//            System.out.println("cześć"+index);
//        }

//        for(<zmienne>;<warunek logiczny>;<krok>){}

//        do {
//            System.out.print(number);
//            if (number % 2 == 0) {
//                System.out.println("  even");
//            } else System.out.println("  Odd");
//            number--;
//        } while (number >= 1);

//        do{
//            suma+=dlug*oprocentowanie;
//            liczbaMiesiecy++;
//        }while(suma<expectedProfit);
//        System.out.println("liczba miesiecy: " +liczbaMiesiecy);


//        do{
//            System.out.println("do while counter: "+ counter);
//        }while(counter!=0);
//
//        while(counter!=0){
//            System.out.println("while counter: "+counter);
//        }

//        while(suma<expectedProfit){
//            suma += dlug*oprocentowanie;
//            liczbaMiesiecy++;
//        }
//        System.out.println("liczba miesiecy: "+ liczbaMiesiecy);

//        while (counter < liczbaMiesiecy) {
//            kwota += dlug * oprocentowanie;
//            counter++;
//        }
//        System.out.println("kwota: " + kwota);

//        double wynik = 6*(0.05*10000);
//        System.out.println(wynik);

//        int[] tablica = new int[10];
//        tablica[8] = 234234;
//
//        System.out.println(tablica[8]);
//
//        while(counter<10){
//            System.out.println("Rafal "+counter);
//            counter++;
//        }



    }
}
