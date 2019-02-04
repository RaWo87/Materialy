package com.company.CollectionSortingDemo;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorDemo {


    public static void main(String[] args) {
        List<String> lista1 = new LinkedList<>();
        List<String> lista2 = new LinkedList<>();

        lista1.add("A");
        lista1.add("B");
        lista1.add("C");
        lista1.add("D");
        lista1.add("E");

        lista2.add("A");
        lista2.add("B");
        lista2.add("G");
        lista2.add("E");
        System.out.print("lista 1:" +lista1+"\n");
        System.out.print("lista 2:" +lista2+"\n");

        edycjaList(lista1,lista2);

        System.out.print("lista 1:" +lista1+"\n");
        System.out.print("lista 2:" +lista2+"\n");
    }

    public static void edycjaList(Collection<String> lista1, Collection<String> lista2){
        // Iterator jest obiektem który przebiega po wszystkich elementach danej listy
        // najpierw tworzymy iterator stringow, a potem deklarujemy po której liscie ma biegać
        Iterator<String> it = lista1.iterator();
        // .hasNext zwraca true jezeli nastepne pole iteratora istnieje
        while(it.hasNext()){
            if(lista2.contains(it.next())){
            it.remove();
        }
        }

    }
}
