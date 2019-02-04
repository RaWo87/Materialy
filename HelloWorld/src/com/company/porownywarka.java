package com.company;

import java.util.Scanner;

public class porownywarka {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float A = 0f;
        float B = 0f;

        System.out.println("Podaj dwie liczby a powiem ci czy sa rowne!");
        System.out.print("Podaj pierwsza: ");

        A =  sc.nextFloat();

        System.out.print("Podaj druga: ");
        B =  sc.nextFloat();

        //boolean wynik = A == B;
        //System.out.print("twoje liczby sa rowne: ");
        //System.out.println(wynik);

        if(A == B){
            System.out.println("twoje liczby sa rowne!");
        } else System.out.println("twoje liczby NIE sa rowne!");


        //if(A != B){
        //    System.out.println("twoje liczby NIE sa rowne!");
        //}
        System.out.print("koniec");
    }

}
