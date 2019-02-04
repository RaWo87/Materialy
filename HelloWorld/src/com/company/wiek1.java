package com.company;

import java.util.Scanner;

public class wiek1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoj wiek:");
        byte wiekValue = 0;
        wiekValue = sc.nextByte();
        System.out.print("twoj wiek to: ");
        System.out.print(wiekValue);

    }
}
