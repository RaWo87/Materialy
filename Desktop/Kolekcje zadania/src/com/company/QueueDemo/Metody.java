package com.company.QueueDemo;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Metody {

    Queue<String> nazwy = new LinkedList<>();
    Deque<String> talia = new LinkedList<>();

    // Dlaczego nie mozna uzyc metody .add w metodzie Metody???
    protected void dodawanie() {
       nazwy.add("jeden");
       nazwy.add("dwa");
       nazwy.add("trzy");
       nazwy.add("cztery");
       nazwy.add("piec");
        // jaka jest roznica miedzy offer a add?
       // Odp. offer nie zwraca błędu kiedy nie mozna czegos dodac
       nazwy.offer( "szesc");

        talia.add("jeden");
        talia.add("dwa");
        talia.add("trzy");
        talia.add("cztery");
        talia.add("piec");
    }

   protected void showNames(){
       for (String m:nazwy
            ) {
           System.out.print(m+" ");
       }
       System.out.println();
   }
   // kiedy kolejka jest pusta Element zwraca NSEE error, a peek false
   protected  void showElement(){
       System.out.println(nazwy.element());
   }
    protected  void showPeek(){
        System.out.println(nazwy.peek());
    }
    // Analogicznie remove wyzuca błąd, a pool zwraca null kiedy kolejka jest pusta
    protected  void showRemove(){
        System.out.println(nazwy.remove());
    }
    protected  void showPool(){
        System.out.println(nazwy.poll());
    }

    //###################
    // Talia dopaje polecenia: addFirst, addLast, removeFirst, removeLast

    protected void addFrmvL(){
        talia.addFirst("nowy pierwszy");
        talia.removeLast();
        System.out.println(talia.peekFirst());
    }
}
