package sda;

public class Prezydent {
    String imie;
    String nazwisko;

    Prezydent(String imie, String nazwisko){
        this.imie =imie;
        this.nazwisko = nazwisko;
    }
    public String getName(){
        return imie+" "+nazwisko;
    }
}
