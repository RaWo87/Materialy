package com.company.CollectionSortingDemo;
import  java.util.*;
import java.util.PriorityQueue;

public class PriorityQDemo {

    public static void main(String[] args) {


        PriorityQueue<String> userList2 = new PriorityQueue<>();
        userList2.add("first");
        userList2.add("second");
        userList2.add("third");

//        showAll(userList2);
//        System.out.println(userList2.peek());

        PriorityQueue<User> userList = new PriorityQueue<>();
        User A = new User(5, "adas");
        User B = new User(4, "Jacek");
        User C = new User(3, "maciek");
        User D = new User(2, "Persona non grata");
        User E = new User(1, "ViP");

        userList.add(A);
        userList.add(B);
        userList.add(C);
        userList.add(D);
        userList.add(E);
        // drukowanie wszystkich elementow kolejki NIE MA NIC WSPOLNEGO Z PRIORYTETAMI, HAWK!
        System.out.println(userList.size());
       for(int i=0; i< 5;i++) {
           System.out.println(userList.poll().getName());


       }


    }
    protected static void showAll (PriorityQueue<String> Que) {
        System.out.println(Que);
        while (!Que.isEmpty()){
            System.out.println(Que);
            Que.remove();
        }
    }
}
