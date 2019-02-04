package com.company;

public class User {
    String imie="John";
    String nazwisko="Doe";
    int wiek= 1234;


User(String imie, String nazwisko){
    this.imie=imie;
    this.nazwisko = nazwisko;
}

User(int wiek, String nazwisko){
        this.wiek = wiek;
        this.nazwisko = nazwisko;
}
}
