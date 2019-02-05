package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserService {
Integer nrID=1;
    Map<Integer, User> allusers = new HashMap<>();

    public void addUser(User user){
        if(validateUser(user)) {
            allusers.put(nrID, user);
            nrID++;
        }else System.out.println("error can, not add user");

    }

    public boolean checkLogin(User user){

        for (User x: allusers.values()
             ) {
            if(x.getLogin() == user.getLogin()){
                return false;
            }
        }
        return true;
    }

    public void updateUser(String login,User user){
        for (User x: allusers.values()
             ) {
            if(x.getLogin()==login){
                x=user;
            }
        }
    }
    // Glupie jak... ale dziala :-D
    public void removeUser(String login){
        int currentKey = 1, deletekey = 0;
        for (User x : allusers.values()
        ) {
            if (x.getLogin() == login) {
                deletekey = currentKey;
            }
            currentKey++;
        }
        allusers.remove(deletekey);
    }
    //NOTE: usuwanie elementu podczas iteracji po całej kolekcji,
    // wysypie program, chyba, że dany element jest ostatni!
public void removeUserV2(String login){
    int delKey=0;
    for (Integer key: allusers.keySet()
         ) {
        if(allusers.get(key).getLogin().equals(login)){
            delKey=key;
        }
    }
    // tym warunkiem upewniamy sie, że nie usuniemy przypadkowego klucza,
    // przy podaniu błędnego loginu Chociaz przy zalozeniu, że klucze
    // zaczynaja sie od 1(generator id), klucz 0 wydaje sie byc bezpieczny
    if(allusers.containsKey(delKey))
    {allusers.remove(delKey);
    }else
        System.out.println("invalid login");
}


    public boolean validateUser(User user) {
        // if zwraca wartosc false kiedy którekolwiek z pól bedzie puste,
        // wiek za niski, albo login taki sam jak juz istniejacy.
        if (
                user.getLogin()   .isEmpty() ||
                user.getPassword().isEmpty() ||
                user.getName()    .isEmpty() ||
                user.getLastname().isEmpty() ||
                !checkLogin(user)            ||
                !user.checkAge()             ||
                user.getBirthDate().toString().isEmpty() //???<- czy to ma sens
        ) return false;
        else return true;
    }
    public List<User> getAllUsers(){
        List<User> resault = new LinkedList<>();
        for (User x: allusers.values()
             ) {
            resault.add(x);
        }
        return resault;
    }
    //Logowanie
    public User logByPassword(String log, String pass){

        for (User x: allusers.values()
             ) {
            if(x.getLogin().equals(log)){
                if(x.getPassword().equals(pass)){
                    return x;
                }
            }
        }
        System.out.println(" incorrect login or passwprd");
        return null; // Czy da rade cos z tym zrobic?
    }
}
