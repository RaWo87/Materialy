package part2;
import java.util.*;

public class NewMain {
    public static void main(String[] args) {

        User jacek = new User("jacek",80,55,'M');
        User agatka = new User("agatka",50,25,'F');

//        System.out.println(jacek.weight);
//
//        jacek.weight = 66;
//
//        System.out.println(jacek.weight);
//        User martyna = new User(120,29,'F');
//
//        jacek.showUserData();
//
//        int wiekJacka = jacek.dajWiek();
//        System.out.println(wiekJacka);
//
//        jacek.getNewAge(112);
//        jacek.getNewAge(200);
//        jacek.getNewAge(2012);
//
//        System.out.println(jacek.age);
//        jacek.ageInTen();
//
//        System.out.println(jacek.age);

//        System.out.println(jacek.sex);
//        System.out.println(jacek.changeSex(jacek.sex));
//        System.out.println(agatka.changeSex(jacek.sex));
//
//        System.out.println(jacek.showName(jacek.name));
//        System.out.println(jacek.showNamev2());

//        jacek.printName(5);
//
//        Multiplication terazMnoze =  new Multiplication(2,4);
//        terazMnoze.oblicz();
//        terazMnoze.showNumber(5*5);
//        terazMnoze.ShowAndOblicz();
//        Profile profil = new Profile();
//        profil.getSalary();
//        System.out.println(profil.getSalary());
//
//        Kolo kolo = new Kolo();
//        kolo.setPressure(90);
//        System.out.println(kolo.getPressure());
//
//        User user = new User("",0,0, 'x');
//        System.out.println("plec usera: "+user.getSex());
//        user.setSex('F');
//        System.out.println("plec usera: "+user.getSex());
//        user.setSex('d');
//        System.out.println("plec usera: "+user.getSex());
//
//        jacek.ShowMe("trololo");
//        jacek.ShowMe(3);
//        jacek.ShowMe('H');
//        jacek.ShowMe(false,5);
//
        Division dzielenie = new Division();
//        dzielenie.ShowDivision(10,10);
//        System.out.println(dzielenie.getScore());

//        dzielenie.rekurencja();

//        dzielenie.silnia(5);
//        System.out.println(dzielenie.wynik);

        //STRING METHODS

        String imie = "Jacek";
        String text ="Ala ma kota, kot lubi placki";
        System.out.println(imie.length());
        System.out.println(imie.equals("jacek"));
        System.out.println(imie.equalsIgnoreCase("JaCeK"));
        System.out.println(imie.toLowerCase());
        System.out.println(imie.toUpperCase());
        System.out.println(imie.contains("ala"));
        System.out.println(imie.toLowerCase().contains("JAC".toLowerCase()));
        System.out.println(text.substring(7,11));
        System.out.println(text.indexOf("psa"));

        String credentials = "haslo: fgdfgdg         ";
        String poprawneHaslo = credentials;
        if(credentials.startsWith("haslo:")){
            poprawneHaslo = credentials.substring(("haslo:".length())).trim();
        }
        System.out.println(poprawneHaslo);
        String zmienionyText = text.replace("kota","jacka");
        System.out.println(zmienionyText);

        text.isEmpty();
        System.out.println("".isEmpty());

        String[] wynik = text.split(" ");
        System.out.println(wynik[wynik.length-1]);


        String[] wynik2 = text.split(",");
        System.out.println(wynik[wynik.length-1]);

    }
}
