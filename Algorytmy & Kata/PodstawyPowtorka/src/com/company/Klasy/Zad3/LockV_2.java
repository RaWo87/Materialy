package com.company.Klasy.Zad3;

import java.util.HashMap;
import java.util.Map;

public class LockV_2 {
   private Map<Integer, Integer> combination = new HashMap<>();
    private Map<Integer, Integer> solution = new HashMap<>();
    //counter potrzebny do synchronizacji kluczy rozwiazan z kluczami prob
    private Integer counter;
    // generowanie losowego szyfru dla zadanej liczby przekladni
    LockV_2(int iloscPrzekładni){
        counter=1;
        for (int i = 0; i <iloscPrzekładni ; i++) {

            combination.put(counter,(int)(Math.round(Math.random() * 9)));
                    counter++;
        }
    }
    // generowanie warunkow poczatkowych dla rozwiazan
    public void startingCondition(){
        counter=1;
        for (int i = 0; i <combination.size() ; i++) {
            solution.put(counter,(int)(Math.round(Math.random() * 9)));
            counter++;
        }
    }

    public void showLock(){
        counter=1;
        System.out.println();
        for (Integer a: solution.keySet()
             ) {
            if(counter%10==0) System.out.println();
            System.out.print("L"+counter+"= "+solution.get(a)+" ");
            counter++;
        }
        System.out.println();
    }
    public boolean checkUP(){
        boolean resault=true;
        for (Integer key: combination.keySet()
             ) {
            if(combination.get(key)!=solution.get(key))
            resault=false;
        }
        return resault;
    }
    public void turnUP(int ktora){
        if(ktora> solution.size()){System.out.println(" zly numer");
        }else if(solution.get(ktora)==9){
            solution.replace(ktora,9,0);
            System.out.println("--turning "+ktora +" --");
        }else {
            Integer newVal,oldVal;
            oldVal =solution.get(ktora);
            newVal =++oldVal;
            solution.replace(ktora,newVal);
            System.out.println("--turning "+ktora +" --");
        }
        if(checkUP()) System.out.println("lock is open");
    }
    public void lockBreaker(int iloscPrzekładni){
        Integer[][] a = new Integer[iloscPrzekładni+1][iloscPrzekładni+1];
        int i=1;
        while(checkUP()==false){







        }
    }

}
