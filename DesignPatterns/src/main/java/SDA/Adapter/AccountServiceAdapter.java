package SDA.Adapter;

import java.util.Random;

public class AccountServiceAdapter {
    private AccountService accountService = new AccountService();

    public void saveUser(String name, String sureName) {
        accountService.saveUser(name, sureName, getRandomDigits(9), getRandomDigits(4), true);
    }

    private String getRandomDigits(int size) {
        Random random = new Random();
        String value = "";
        for (int i = 0; i < size; i++) {
            int randomVal = random.nextInt(10);
            value += randomVal;
        }
        return value;

    }



}
