package com.company.CollectionSortingDemo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Kolekcje {
    // Lista do posortowania
    List<String> lista = new ArrayList<>();

    Kolekcje(){
        lista.add("Z");
        lista.add("Z");
        lista.add("ale");
        lista.add("bedzie");
        lista.add("ciebie");
        lista.add("dzisiaj");
        lista.add("zZZzz");
    }

    protected void showSorted(){
       Collections.sort(lista);
        System.out.println(lista);
    }
    protected void showReverse(){
        Collections.sort(lista, Collections.reverseOrder());
        System.out.println(lista);
    }
    //Pokazuje ile razy dana pozycja jest na liscie
    protected void showFreque(){
        System.out.println(Collections.frequency(lista, "Z"));
    }

}
