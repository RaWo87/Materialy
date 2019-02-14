package com.company.Klasy.Zad2;

public class Party {
    Person host;
    Person[] attendants;

    public double getAvAge(){
        int attendantsAge=0;
        for (Person x: attendants
             ) {
            attendantsAge+=x.getAge();
        }
        return attendantsAge/attendants.length;
    }
}
