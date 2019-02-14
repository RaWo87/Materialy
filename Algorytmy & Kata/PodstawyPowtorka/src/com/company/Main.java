package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
     String tekst;
     tekst= input.nextLine();

     Integer a = Integer.valueOf(tekst);
        System.out.println((Integer.valueOf(tekst) instanceof Integer? true:false));
        System.out.println(a);

    }
}
