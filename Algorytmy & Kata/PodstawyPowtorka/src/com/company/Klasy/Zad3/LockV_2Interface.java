package com.company.Klasy.Zad3;

import java.util.Scanner;

public class LockV_2Interface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("podaj liczbe przekładni: ");
        int ilosc = input.nextInt();
        LockV_2 lock = new LockV_2(ilosc);
        lock.startingCondition();
        System.out.println("Pozycje startowe dzwigni: ");


        System.out.println(
                "\n aby przekrecic przekładnie wpisz jej nr(np 4)" +
                        "\n aby sprawdzic stan zamka wpisz\"show\"" +
                        "\n aby sprawdzic czy zamek jest zamkniety wpisz \"try\"" +
                        "\n GL&HF");


        while (true) {
           String tekst= input.next().toLowerCase();

            if (tekst.contains("show")) {
                lock.showLock();
            } else if (tekst.contains("try")) {
                System.out.println(lock.checkUP());

            }else if(Integer.valueOf(tekst) instanceof Integer){
                lock.turnUP(Integer.valueOf(tekst));
            }else System.out.println("invalid command");


        }
    }
}
