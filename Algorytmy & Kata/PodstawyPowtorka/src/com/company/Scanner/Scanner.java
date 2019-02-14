package com.company.Scanner;

public class Scanner {
    java.util.Scanner input = new java.util.Scanner(System.in);

    //ZAD1 wyswietl liczby naturalne do zadanej

    public void printGivenInt() {
        System.out.println("podaj przedział");
        int range = input.nextInt();
        System.out.println();
        for (int i = 1; i < range; i++) {
            System.out.print(i + " ");
        }
    }

    //ZAD2 pole prostokąta
    public void rectangleArea() {
        System.out.println("podaj 2 boki prostokąta");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("pole prostokata wynosi: " + a * b);
    }

    //ZAD 3 pole wybranej figury
    public void volumeAndArea() {
        System.out.println("jakiej figury pole chcesz policzyc?:\n" +
                "trojkata, kwadratu, prostokata czy kola?");
        int a, b;
        String figure = input.nextLine();
        if ("trojkata".contains(figure.toLowerCase())) {
            System.out.println("podaj bok i wysokość trojkata: ");
            a = input.nextInt();
            b = input.nextInt();
            System.out.println("pole: " + (0.5 * a * b) + " obwod: " + (3 * a));
        } else if ("kwadratu".contains(figure.toLowerCase())) {
            System.out.println("podaj bok kwadratu: ");
            a = input.nextInt();
            System.out.println("pole: " + (a * a) + " obwod: " + (4 * a));
        } else if ("prostokata".contains(figure.toLowerCase())) {
            System.out.println("podaj boki prostokata: ");
            a = input.nextInt();
            b = input.nextInt();
            System.out.println("pole: " + (a * b) + " obwod: " + ((2 * a) + (2 * b)));
        } else if ("kola".contains(figure.toLowerCase())) {
            System.out.println("podaj promień koła: ");
            a = input.nextInt();
            System.out.println("pole: " + Math.round(Math.PI * a * a) + " obwod: " + Math.round(2 * Math.PI * a));
        }
    }

    //ZAD4 sprawdz czy pierwsza
    public void checkForPrime() {
        System.out.println("podaj liczbe: ");
        int a = input.nextInt();
        boolean flag = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) flag = false;
        }
        System.out.println("liczba " + a + " jest pierwsza: " + flag);

    }







}
