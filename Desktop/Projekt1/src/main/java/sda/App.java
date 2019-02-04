package sda;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


        User user1 = new User();
        user1.setHaslo("tajne");
        user1.setImie("andzej");
        user1.setLogin("andrzej111");
        user1.setNazwisko("kowalski");
        user1.setWiek(1990, 5,1);
        user1.setEmail("gmail3");

        User user2 = new User();
        user2.setHaslo("nietajne");
        user2.setImie("maciek");
        user2.setLogin("maciek111");
        user2.setNazwisko("nowak");
        user2.setWiek(2002, 1,30);
        user2.setEmail("wp.pl");

        User user3 = new User();
        user3.setHaslo("qwerty");
        user3.setImie("tomek");
        user3.setLogin("tomek111");
        user3.setNazwisko("duda");
        user3.setWiek(1987, 12,30);
        user3.setEmail("gmaiggl");

        UserService usluga = new UserService();

        usluga.addToMap(user1);
        usluga.addToMap(user2);
        usluga.addToMap(user3);



        System.out.println(usluga.getAllUsers());
        System.out.println(usluga.getUserByID(1));


//        usluga.addUser(user1);
//        usluga.addUser(user2);
//        usluga.addUser(user3);
        //usluga.printALL();
//
//        user1.toString();
//    //Listy
//        Listy lista = new Listy();
//
//        List<User> listaUserow = new ArrayList<>();
//        listaUserow.add(user1);
//        listaUserow.add(user2);
//        listaUserow.add(user3);
//
//        System.out.println(listaUserow);
//
//        UserService usluga2 = new UserService();
//        usluga2.addUserL(user3);
//        usluga2.addUserL(user2);
//        usluga2.addUserL(user1);
//
//        System.out.println(usluga2.getAllUsers());
//
//        //Mapy
//        Mapy mojaMapa = new Mapy();
//        mojaMapa.addWord("piesek","puppy");
//        mojaMapa.addWord("kotek","cat");
//        mojaMapa.addWord("piesek","puppy");
//
//        System.out.println(mojaMapa.dictionary.get("piesek"));
//        System.out.println(mojaMapa.dictionary.get("kotek"));
//
//        mojaMapa.modifyWord("piesek","daug");
//        mojaMapa.modifyWord("kociatko","cat");
//        System.out.println("piesek - "+mojaMapa.getWord("piesek"));
//        System.out.println(mojaMapa.dictionary.get("piesek"));
//        System.out.println(mojaMapa.dictionary.get("kociatko"));
//        System.out.println(mojaMapa.dictionary.get("piesek"));
//        mojaMapa.removeTrans("piesek");
//        System.out.println(mojaMapa.dictionary.get("piesek"));
//        mojaMapa.addWord("statek","ship");
//        System.out.println(mojaMapa.getFullList());
//
//        mojaMapa.addWord2("piesek","dog1","dog2");
//        System.out.println(mojaMapa.dictionary2);
//        System.out.println(mojaMapa.getWord2("piesek"));
//        System.out.println(mojaMapa.dictionary);
//        System.out.println("wyszukiwanie: ");
//        mojaMapa.addWord("piesek1","dog1");
//        mojaMapa.addWord("elopiesek1","dog2");
//        mojaMapa.addWord("hehespiesesek1","dog3");
//
//        System.out.println(mojaMapa.askSearch("ese"));
//
//        //
//
//


    }



}
