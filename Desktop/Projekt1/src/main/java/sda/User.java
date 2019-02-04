package sda;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Date;

public class User {
    private String imie;
    private String nazwisko;
    private String login;
    private String haslo;
    private LocalDate dataUrodzenia;
    private String emailAdress;



    public void setEmail(String adres){
        this.emailAdress = adres;
    }
    public String getEmail(){
        return emailAdress;
    }

    public void setWiek(int year, int month, int day){
        this.dataUrodzenia=LocalDate.of(year,month,day);
    }
    public int getAge(){
        return Period.between(dataUrodzenia, LocalDate.now()).getYears();
    }

    public void setImie(String imie){
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public void setHaslo(String haslo){
        this.haslo = haslo;
    }

    public String getImie(){
        return imie;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public String getLogin(){
        return login;
    }

    public String getHaslo(){
        return haslo;
    }

    @Override
    public String toString() {
        return "User{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", login='" + login + '\'' +
                ", haslo='" + haslo + '\'' +
                ", data ur='" + dataUrodzenia + '\'' +
                '}';
    }

}
