package SDA.Adapter;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private List<Account> accounts = new ArrayList<>();

    public void saveUser(String name, String sureName, String phoneNumber, String pin, boolean active) {
        accounts.add(new Account(name, sureName, phoneNumber, pin, active));
    }
}

interface wrapper{
 void saveUser();
}

