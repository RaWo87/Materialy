package com.company.Klasy.Zad2;

public class House {
    String adress;
    Room kitchen;
    Room bathroom;
    Room[] rooms;

    public int getArea(){
        int roomsArea=0;
        for (Room x: rooms
             ) {
            roomsArea+=x.area;
        }
        return kitchen.area+bathroom.area+roomsArea;
    }
}
