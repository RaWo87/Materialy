package com.company.Klasy.Zad3;

import java.util.Scanner;

public class LockInterface {



    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lock zamek = new Lock();
        System.out.println("podaj pierwsza cyfre aby otworzyc zamek");
        zamek.guessA=input.nextInt();
        System.out.println("podaj druga cyfre aby otworzyc zamek");
        zamek.guessB=input.nextInt();
        System.out.println("podaj trzecia cyfre aby otworzyc zamek");
        zamek.guessC=input.nextInt();
        System.out.println("Aby przesunac przekładnie podaj jej symbol (A/B/C),\n" +
                "Aby sprawdzić czy zamek jest otwarty wpisz \"try\",\n" +
                "Aby zobaczyc aktualna kombinacje wpisz \"check\"\n");
        while(true){
            String commandLine = input.nextLine().toLowerCase();
            if(commandLine.contains("try")){
                System.out.println(zamek.isOpen());
            }else if(commandLine.contains("check")){
                zamek.showLock();
            }else {
                if (commandLine.contains("a")) {
                    zamek.turnUP('a');
                } else {
                    if (commandLine.contains("b")) {
                        zamek.turnUP('b');
                    } else {
                        if (commandLine.contains("c")) {
                            zamek.turnUP('c');
                        }
                    }
                }
            }
            if(zamek.isOpen()) System.out.println("lock is opened");
        }


    }


}
