package com.company.sklep;

import java.util.HashSet;
import java.util.Set;

public class klient {
    private Set<String> koszyk = new HashSet<>();
    private String name;
    public void addArticle(String produkt){
        koszyk.add(produkt);
    }
    klient(String name){
        this.name=name;
    }
}
