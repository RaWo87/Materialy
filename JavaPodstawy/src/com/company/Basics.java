package com.company;

public class Basics {
    public static void main(String[] args) {
        // Zadeklaruj trzy zmienne liczbowe (całkowite) i przypisz im wartości.
        // Następnie wypisz wartość największej z nich.

        int a=10,b=2,c=3;
        if(a>b && a>c){
            System.out.println(a+" is the greatest!");
        }else if(b>a && b>c){
            System.out.println(b+" is the greatest!");
        }else System.out.println(c+" is the greatest!");


    // Sprawdź, czy wartość przypisana zmiennej jest parzysta, czy nie
    // (wypisz na ekranie odpowiedni komunikat). Użyj google,
    // aby znaleźć sposób na sprawdzenie parzystości wartości
         a=0;
    if(a%2==0 && a!=0){
        System.out.println(a+ " parzysta");
    }else System.out.println(a+ " nieparzysta");

    // Mniejsza wieksza rowna 0
    switch (a) {
        case 0:
        {
            System.out.println(a+" jest rowne 0");
            break;
        }
        default:
        {if (a>0){
            System.out.println(a+" wieksze od 0");
        }else System.out.println(a+ " mniejsze od 0");
        }
    }





}}