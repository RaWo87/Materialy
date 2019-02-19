package com.company;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sortowanie1 a = new Sortowanie1();
        List<Integer> randomNumbers= a.randomList();

        List<Integer>[] b = a.evenOdd(a.randomList());
       // System.out.println(b[0]+"\n"+b[1]);
        System.out.println(randomNumbers);

        System.out.println(a.sortByPicking(randomNumbers));

        System.out.println(a.tabToList(a.sortByPicking2(randomNumbers)));
        for (Integer x :a.sortByPicking2(randomNumbers)
             ) {
            System.out.print(x+" ");
        }
    }



}
