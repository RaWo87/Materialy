package com.company;


import com.company.Generyki.MyMap;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        MyMap<Integer,Integer> mojaMapa = new MyMap<>();

        mojaMapa.put(new Integer(1),new Integer(10));
        mojaMapa.put(2,20);
        mojaMapa.put(3,30);

        MyMap<String,String> stringMap = new MyMap<>();
        stringMap.put("kot","cat");
        stringMap.put("pies","dog");
        stringMap.put("ryba","Sthur");

        System.out.println(stringMap.get("pies"));

    }
}
