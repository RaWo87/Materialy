package com.company.Metody;

public class Metody {

    //ZAD1 mnożenie

    public int multi(int a, int b){
        return a*b;
    }
    //ZAD2 konkatenacja stringow
    public String coconutate(String a, String b){
        return  a+b;
    }
    //ZAD3 stupid multiply
    public int dumbMulti(int a, int b){
        int resault=0;
        for (int i = 0; i < b; i++) {
            resault+=a;
        }
        return resault;
    }
    //ZAD4 powerOF
    public int powerOf(int podstawa, int wykladnik){
        int resault=1;
        for (int i = 0; i < wykladnik; i++) {
            resault*=podstawa;
        }
        return  resault;
    }
    //ZAD5 char in string
    public int charInString(char znak, String tekst){
        int resault=0;
        for (int i = 0; i < tekst.length(); i++) {
        if(tekst.charAt(i)==znak){
            resault++;
        }
        }
        return resault;
    }
    //ZAD6 check String in String
    public boolean stringComparator(String tekst, String szukanaFraza){
        return tekst.contains(szukanaFraza);
    }









}
