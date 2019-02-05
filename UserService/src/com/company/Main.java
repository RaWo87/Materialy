package com.company;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // write your code here

        GenerateUserPara generatorDanych = new GenerateUserPara();
        System.out.println(generatorDanych.generateLogin("jan", "kowalski"));

        System.out.println(generatorDanych.generatePassword());
        //INICJALIZACJA
        UserService service = new UserService();

        service.addUser(new User("jan", "kowalski", "abcd", "1234", new Integer[]{2, 22, 1999}));
        service.addUser(new User("tom", "nowak", "bcc", "1234", new Integer[]{3, 22, 1999}));
        service.addUser(new User("ada", "zebra", "login", "1234", new Integer[]{4, 22, 1999}));
        service.addUser(new User("andrzej", "Rys", "abc", "1234", new Integer[]{5, 22, 1999}));
        //TEST USUWANIA
        for (User x: service.getAllUsers()
             ) {
            System.out.println(x.getName());
        }
        //service.removeUser("abc");
        service.removeUserV2("abcasd");
        System.out.println();
        for (User x: service.getAllUsers()
        ) {
            System.out.println(x.getName());
        }
        //TEST LOGOWANIA
        System.out.println("\n"+service.logByPassword("login","1234").getName());
        System.out.println("\n"+service.logByPassword("Incorrect Login","1234").getName());
        System.out.println("\n"+service.logByPassword("login","Incorrect password").getName());




    }
}