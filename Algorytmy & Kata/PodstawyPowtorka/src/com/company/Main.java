package com.company;


import com.company.Generyki.MyMap;

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

        MyMap<Integer,Integer> mojaMapa = new MyMap<>();

        mojaMapa.put(1,10);
        mojaMapa.put(2,20);
        mojaMapa.put(3,30);

        System.out.println(mojaMapa.get(2));
        System.out.println(mojaMapa);


    }
}
