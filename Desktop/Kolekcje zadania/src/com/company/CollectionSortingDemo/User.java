package com.company.CollectionSortingDemo;

import java.time.LocalDate;
//  IMPLEMENTS COMPARABLE<CLASS>!!!!
// OMG WTF Q_Q''
public class User implements Comparable<User>{
    int priority;
    String name;
    LocalDate whenmade;

    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public LocalDate getWhenmade() {
        return whenmade;
    }
    public void setWhenmade(LocalDate whenmade) {
        this.whenmade = whenmade;
    }

    User(int priority, String name) {
        this.priority = priority;
        this.name = name;
        this.whenmade = LocalDate.now();
    }


    @Override
    public int compareTo(User other) {
//        if (this.getPriority() >  other.getPriority()){ return 1; }
//        else if(this.getPriority()< other.getPriority())return -1;
//        else return 0;
        //Tutaj zachodzi prioretytowanie po imieniu
        return this.getName().compareToIgnoreCase(other.getName());

    }


}
