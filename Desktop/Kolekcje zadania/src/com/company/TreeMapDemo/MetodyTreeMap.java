package com.company.TreeMapDemo;

import java.util.Comparator;
import java.util.TreeMap;

public class MetodyTreeMap {
    //TreeMap automatycznie Sortuje klucze w pożądku rosnącym/alfabetycznym

    TreeMap<Integer, String> users = new TreeMap<>();

    protected void addUsers(){
        users.put(1,"pierwszy");
        users.put(5,"piaty");
        users.put(2,"drugi");
        users.put(4,"czwarty");
        users.put(3,"trzeci");
    }

    protected  void showAllUsers(){
        System.out.print(users);

    }
    protected void showFnLentry(){
        System.out.println("\nfirst: "+users.firstEntry());
        System.out.println("last: "+users.lastEntry());
    }
    protected void showHighLow(int entryNR){

        System.out.println("\nfirst: "+users.higherEntry(entryNR));
        System.out.println("last: "+users.lowerEntry(entryNR));
    }
    protected  void ifExist(int number){
        if(users.containsKey(number)){
            System.out.println("user nr"+ number + " exist "+ "his name is "+users.get(number));
        }else  System.out.println("there is no user with number "+ number);
    }
    //Kasowanei z mapy po kluczach
    protected  void removeFnL(){
        users.remove(users.firstEntry().getKey());
        users.remove(users.lastEntry().getKey());
    }
    //kasowanie z mapy jesli klucz pasuje do watrosci
    protected  void removeIfMatch(int key, String flag){
        users.remove(key, flag);
    }
    // Drzewo w porządku malejącym / odwróconym
    TreeMap<Integer, String> comparableTree = new TreeMap<>(new Comparator<Integer>(){

        public int compare(Integer i1, Integer i2){
            return i2.compareTo(i1);
        }
    } );
    TreeMap<Integer, String> comparableTree2 = new TreeMap<>(Comparator.reverseOrder());

    protected void addToComp(){
        comparableTree.putAll(users);
    }
    protected void showCtree(){
        System.out.println(comparableTree);
    }



}
