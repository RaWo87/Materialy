package com.company;

import java.util.stream.IntStream;

public class Zadanie3 {
    public static void main(String[] args) {
         /* for (int i = 5; i < 51; i+=2) {
            System.out.println(i);
        }
        */
        for (int i = 50; i >= 10 & i%2==0; i-=2) {
            System.out.println(i);
        }
        IntStream.range(0,10).forEach(i -> System.out.println(i));

    }
}
