package com.company.Podstawy;

public class Podstawy {

    //ZAD1 znajduje najwieksza z 3 roznych liczb
    public void zad1() {
        int a = 2, b = 3, c = 10;

        int resault = (a > b && a > c ? a : b > a && b > c ? b : c);
        System.out.println("zbior: " + a + " " + b + " " + c + " " + " wynik: " + resault);
    }
    //ZAD 2 spr czy parzysta
    public void zad2(){
        int a=2;
        boolean resault=(a%2==0? true: false);
        System.out.println("czy "+a+" jest parzysta? - "+resault);
    }
    //ZAD3 sprawdza czy liczba jest wieksza mniejsza czy rowna zero
    public void zad3() {
        int a = 2;
        System.out.println("czy "+a+" jest wieksze od 0?: ");
       boolean resault = (a >0?true: a<0? false: null);
        System.out.println(resault);
    }
    //ZAD4 najwieksza z 4
    public void zad4(int wariant) {
        int[] tab = {1, -200, 323, 4, 5, 0};
        switch (wariant) {
            case 1: {
                int resault = Integer.MIN_VALUE;
                int altResault = Integer.MAX_VALUE;
                for (int a : tab
                ) {
                    resault = (a > resault ? a : resault);
                    altResault = (a < altResault ? a : altResault);
                }
                System.out.println("najwieksza liczba jest: " + resault);
                System.out.println("najmniejsza liczba jest: " + altResault);
            }
            case 2:{
                int resault = 0;
                for (int i = 0; i < tab.length - 1; i++) {
                    int max = (tab[i] > tab[i + 1] ? tab[i] : tab[i + 1]);
                    resault = (max > resault ? max : resault);
                }
                System.out.println("najwieksza liczba to: " + resault);
            }
        }
    }
    //ZAD 5 for
    public void zad5(int wariant) {
        switch (wariant) {
            case 1:
                // int 5-100
                System.out.println();
                for (int i = 5; i <= 100; i++) {
                    System.out.print(i + " ");
                }
                break;
            case 2:
                // int 55-150, 60 chars/row
                String resault = "";
                System.out.println();
                for (int i = 55; i <= 150; i++) {
                    resault = resault + String.valueOf(i) + " ";
                    if (resault.length() > 60) {
                        System.out.println(resault);
                        resault = "";
                    }
                }
                System.out.println(resault);
                break;
            case 3:
                //int 100-1
                System.out.println();
                for (int i = 100; i > 0; i--) {
                    System.out.print(i + " ");
                }
                break;
            case 4:
                //int 0-100 %2=0
                System.out.println();
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + " ");
                    }
                }
                break;
            case 5:
                // int 0-100 + informacja o dzielnikach
                for (int i = 0; i < 100; i++) {
                    System.out.print("\n" + i);
                    if (i % 2 == 0) System.out.print(",podz/2");
                    if (i % 3 == 0) System.out.print(",podz/3");
                    if (i % 5 == 0) System.out.print(",podz/5");

                }
                break;
            case 6:
                //suma liczb z zadanego rpzedzialu
                int wynik = 0;
                for (int i = 1; i < 460; i++) {
                    wynik += i;
                }
                System.out.println("suma 1:459= " + wynik);
                break;
            case 7:
                // suma 459 wyrazow ciagu art 5,7,9...
                int a = 5;
                wynik = 0;
                for (int i = 1; i < 460; i++) {
                    wynik += a;
                    a += 2;
                }
                System.out.println("wynik: " + wynik);
                break;
            case 8:
                // choinka '1
                int rows = 5;
                for (int i = 0; i <= rows; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 9:
                // choinka '2
                rows = 5;
                for (int i = 0; i <= rows; i++) {
                    for (int j = rows; j > i; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 10:
                // choinka '3
                rows = 5;
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows; j++) {
                        if (j - i >= 0) {
                            System.out.print("*");
                        } else System.out.print(" ");

                    }
                    System.out.println();
                }
                break;
            case 11:
                //choinka '4
                rows =8;
                int starCounter=1;


                for (int i = 1; i <=rows ; i++) {
                    //printing spaces
                    for (int j = 1; j <=(rows-i) ; j++) {
                       System.out.print(" ");
                    }
                    //printing stars
                    for (int j = 0; j <starCounter ; j++) {
                        System.out.print("*");
                    }
                    starCounter+=2;
                    //newline
                    System.out.println();
                }
        }
    }
//ZAD 6 generator choinek
    public void choinkonator(int ilePieter){
        int hight = ilePieter;
        int starCounter =1;
        int k=1;
        for (int lvl = 1; lvl <hight ; lvl++) {


            for (int i = 1; i <=hight; i++) {
                for (int j = 1; j <= (hight - k); j++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < starCounter; j++) {
                    System.out.print("*");
                }
                starCounter += 2;
                System.out.println();
            }starCounter=1;
            k++;


        }
    }





}
