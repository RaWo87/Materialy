package com.company;


import java.util.Scanner;

public class ScannerC {
    public static void main(String[] args) {

        System.out.print("podaj liczbe: ");

        Scanner sc = new Scanner(System.in);
        float value = 0f;
        value = sc.nextFloat();

        System.out.print("podales: ");
        System.out.println(value);
    }
}
