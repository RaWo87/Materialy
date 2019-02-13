package com.company.CharyMary;

public class CharyMary {
    //ZAD 1 wypisz alfabet
    public void zad1(){
        char a=' ';
        System.out.println();
        for (int i = 65; i < 91; i++) {
            System.out.print((char)i+" ");
        }
    }
    //ZAD 2 co drugi znak z alfabetu
    public void zad2(){
        char a=' ';
        System.out.println();
        for (int i = 65; i < 91; i=i+2) {
            System.out.print((char)i+" ");
        }
    }
    //ZAD 3 alfabet od tylu
    public void zad3(){
        char a=' ';
        System.out.println();
        for (int i = 90; i > 64; i--) {
            System.out.print((char)i+" ");
        }
    }
    //ZAD 4 znajdz najwieksza litere - wnioskuje litere o najwiekszej wartosci ASCII
   public void zad4(){
        String tekst = "alfazbetam";
        char[] tab = tekst.toCharArray();
        char biggerChar;
       char resault = ' ';

       for (int i = 0; i < tab.length-1; i++) {
           biggerChar=(tab[i]>tab[i+1]? tab[i]:tab[i+1]);
           resault=(biggerChar>resault? biggerChar:resault);
       }
       System.out.println("\nnajwieksza wartosc ma: "+resault);

    }

    //ZAD 5 ciecie tekstu na znaki
    public void zad5(){
        String tekst = "hej Sokoły";
        char[] tab = tekst.toCharArray();
        for (char letter:tab
             ) {
            System.out.println(letter);
        }
    }
    //ZAD6 counting a's
    public void zad6(){
        int resault=0;
        String tekst = "alfabet";
        for (int i = 0; i < tekst.length(); i++) {
            if(tekst.charAt(i)=='a')resault++;
        }
        System.out.println("liter 'a' w "+tekst+" jest "+ resault);
    }

    //ZAD7 palimdrom
    public boolean zad7(String tekst) {
        // case sensitivity
        tekst = tekst.toLowerCase();
        // algorytm nie musi sprawdzic całego słowa w obie strony
        for (int i = 0; i < tekst.length() / 2; i++) {
            if (tekst.charAt(i) != tekst.charAt(tekst.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
    //ZAD8 wyszukiwanie najdluzszego ciagu liter
    public void zad8(String tekst){

        tekst=tekst.toLowerCase();
        int currentStreak=0;
        int bestStreak=0;
        char bestLetter=' ';

        for (int i = 0; i <tekst.length()-1 ; i++) {
            if (tekst.charAt(i)==tekst.charAt(i+1)){
                currentStreak++;
               if(currentStreak>bestStreak){
                   bestStreak=currentStreak;
                   bestLetter=tekst.charAt(i);
               }
            }else currentStreak=0;

        }
        System.out.println("most common letter: "+
                bestLetter+" "+
                bestStreak+" times in a row");
    }
    //ZAD9 wyszukiwanie frazy
    public void zad9(){
        String tekst = "ala ma kota, kot albo ale lubi albo kot to tam wie";
        String fraza="kot";

        if(tekst.contains(fraza)){
            System.out.println(fraza+" wystepuje w tekscie");
        }
        if(fraza.contains(tekst)){
            System.out.println(tekst+" wystepuje w frazie");
        }
    }




}
