package com.company.CollectionSortingDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkListDemo {
    public static void main(String[] args) {
        String[] things = {"apples","noobs","pwng","bejkon","goATS"};

        List<String> list1 = new LinkedList<>();
        for (String x: things
             ) {
            list1.add(x);
        }

        String[] things2 = {"sausage","abbel","bakkaun","goATS"};
        List<String> list2 = new LinkedList<>();

        for(String x: things2){
            list2.add(x);
        }

        list1.addAll(list2);
        list2=null;

        printme(list1);
        System.out.println();
        removestuff(list1, 2,5);
        System.out.println();

        reverseme(list1);
    }

       static void printme(List<String> lista){
           for (String b: lista
                ) {
               System.out.printf("%s ", b);
           }
       }
       static void removestuff(List<String> list, int from, int to){
            list.subList(from,to).clear();
       }


    static void reverseme(List<String> list){
        //List iterator w konstruktorze przyjmuje wartosc początkową list.size() -> jest ostatnim elementem listy
        ListIterator<String> bobbyIterator = list.listIterator(list.size());
        while(bobbyIterator.hasPrevious()){
            System.out.printf("%s ", bobbyIterator.previous());
        }
    }
}
