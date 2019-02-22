package com.company.Generyki;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyMap<K,V>{
    private List<K> k = new LinkedList<>();
    private List<V> v= new LinkedList<>();

    public void put(K k,V v){
        this.k.add(k);
        this.v.add(v);
    }

    public V get(K k) {
        for (int i = 0; i < this.k.size(); i++) {

            if (this.k.get(i).equals(k)) {
                return v.get(i);
            }
        }
        return null;
        }

}
