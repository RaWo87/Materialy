package SDA.Adapter;

public class Account {

    private String name;
    private String sureName;
    private String phoneNumber;
    private String pin;
    private boolean active;

    public Account(String name, String sureName, String phoneNumber, String pin, boolean active) {
        this.name = name;
        this.sureName = sureName;
        this.phoneNumber = phoneNumber;
        this.pin = pin;
        this.active = active;
    }

}
