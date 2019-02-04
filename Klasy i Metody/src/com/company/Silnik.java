package com.company;

public class Silnik {
    int pojemnosc = 2400;
    String nazwa;
    Silnik(){
        pojemnosc = 100;
    }
    Silnik(int nowaPojemnosc){
        pojemnosc = nowaPojemnosc;
    }
//    Silnik(int nowaPojemnosc){
//        if (pojemnosc<0){
//            pojemnosc=0;
//        }
//        pojemnosc=nowaPojemnosc;
//    }

    Silnik(int nowaPojemnosc, String nowaNazwa){
        pojemnosc = nowaPojemnosc;
        nazwa = nowaNazwa;
    }
}
