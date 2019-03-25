package com.company;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class zad {
    public static void main(String[] args) {
        zad a = new zad();
        int[] input = new int[20];
        input = a.randomInput(input.length);
        System.out.println();
        for (int ele : input
             ) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele : a.minmax(input)
        ) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele : a.findUnique(input)
        ) {
            System.out.print(ele+" ");
        }
        System.out.println(a.minMaxSet(input));
    }
    public int[] minmax(int[] input){
        int min=input[0];
        int max=input[0];

        for (int i = 0; i < input.length; i++) {
            if(input[i]>max){
                max = input[i];
            }
            if(input[i]<min){
                min = input[i];
            }
        }
        int[] resault={min,max};
        return resault;
    }

    public int[] findUnique(int[] input){
        int[] resault = new int[input.length];
        int k=0;
        for (int i = 0; i <input.length ; i++) {
            boolean duplikat= false;

            for (int j = 0; j < resault.length; j++) {
                if (input[i] == resault[j]) {
                    duplikat = true;
                    break;
                }
            }
            if(!duplikat){
                resault[k]=input[i];
                k++;
            }
        }

        int[] finalResault = new int[k+1];
        for (int j = 0; j < finalResault.length; j++) {
            finalResault[j]=resault[j];
        }
        return finalResault;

    }
    public int[] randomInput(int leangth){
        int[] resaut = new int[leangth];
        for (int i = 0; i < leangth; i++) {
            resaut[i]= (int) (Math.random()*9);
        }
        return resaut;
    }
    public Set<Integer> minMaxSet(int[] input){

        Set<Integer> resault = new HashSet<>();
        Set<Integer> entrySet = new HashSet<>();

        for(int e: input)entrySet.add(e);

        int min = entrySet.iterator().next();
        int max = min;
        for (int e: entrySet
             ) {
            if(e>max){max=e;}
            if(e<min){min=e;}
        }
        resault.add(min);
        resault.add(max);
        return resault;
    }



}
