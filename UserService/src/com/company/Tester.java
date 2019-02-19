package com.company;

public class Tester {
    public static void main(String[] args) {

        GenerateUserPara generatorDanych = new GenerateUserPara();
        System.out.println(generatorDanych.generateLogin("jan", "kowalski"));

        System.out.println(generatorDanych.generatePassword());
        //INICJALIZACJA
        UserService service = new UserService();

        service.addUser(new User("jan", "kowalski", new Integer[]{2, 22, 1999}));
        service.addUser(new User("tom", "nowak", new Integer[]{3, 22, 1999}));
        service.addUser(new User("ada", "zebra", new Integer[]{4, 22, 2001}));
        service.addUser(new User("andrzej", "Rys", new Integer[]{5, 22, 1999}));
        // DANE DO POROWNANIA
        service.flashAll();
        //TEST USUWANIA
        for (User x: service.getAllUsers()
        ) {
            System.out.println(x.getName()+" "+x.getPassword());
        }
        //service.removeUser("abc");
        service.removeUserV2("abcasd");
        System.out.println();
        for (User x: service.getAllUsers()
        ) {
            System.out.println(x.getName());
        }
        //TEST LOGOWANIA
        try {
            service.changePass("tnowak", "1234");
            System.out.println("\n" + service.logByPassword("tnowak", "1234").getName()+" - zalogowany");
            System.out.println("\n"+service.logByPassword("Incorrect Login","1234").getName()+" - zalogowany");
            System.out.println("\n"+service.logByPassword("login","Incorrect password").getName()+" - zalogowany");
        }catch(Exception e){
            System.out.println("incorrect log in or password");
        }

        // TEST WYSZUKIWANIA PO FRAZIE
        for (User x: service.findUser("z")
        ) {
            System.out.print("\n"+x.getName()+" "+x.getLastname()+" "+x.getPassword());
        }


    }
}
