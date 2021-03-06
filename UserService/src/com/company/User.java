package com.company;

import java.time.LocalDate;

public class User extends GenerateUserPara{
    String name;
    String lastname;
    String login;
    String password;
    LocalDate birthDate;

    User(String name, String lastname, Integer[] dayMonthYear) {
        this.name = name;
        this.lastname = lastname;
        this.login = generateLogin(name,lastname);
        this.password = generatePassword();
        this.birthDate = LocalDate.of(dayMonthYear[2], dayMonthYear[0], dayMonthYear[1]);
    }
    public LocalDate getBirthDate(){
        return birthDate;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPasswordLeangth(User user){
        return password.length()>4;
    }

    public String getLogin() {
        return login;
    }

    //Sprawdzanie pełnoletności
    public boolean checkAge(){

        return this.birthDate.getYear() < (LocalDate.now().getYear()-18);

    }





}
