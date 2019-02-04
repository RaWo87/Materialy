package com.company;

import java.util.Scanner;

public class Srednia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("podaj 3 liczby: ");
            float A = 0f;
            float B = 0f;
            float C = 0f;
            float srednia = 0f;
                A = sc.nextFloat();
                B = sc.nextFloat();
                C = sc.nextFloat();
        System.out.println("Srednia podanych liczb to: ");
        srednia = (A + B + C)/3;
        System.out.println(srednia);

    }
}
