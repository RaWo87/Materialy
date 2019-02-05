package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class UserService {
    Integer nrID = 1;
    Map<Integer, User> allusers = new HashMap<>();

    public void addUser(User user) {
        if (validateUser(user)) {
            allusers.put(nrID, user);
            nrID++;
        } else System.out.println("error can, not add user");

    }

    public boolean checkLogin(User user) {

        for (User x : allusers.values()
        ) {
            if (x.getLogin() == user.getLogin()) {
                return false;
            }
        }
        return true;
    }

    public void updateUser(String login, User user) {
        for (User x : allusers.values()
        ) {
            if (x.getLogin() == login) {
                x = user;
            }
        }
    }

    // Glupie jak... ale dziala :-D
    public void removeUser(String login) {
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
    public void removeUserV2(String login) {
        int delKey = 0;
        for (Integer key : allusers.keySet()
        ) {
            if (allusers.get(key).getLogin().equals(login)) {
                delKey = key;
            }
        }
        // tym warunkiem upewniamy sie, że nie usuniemy przypadkowego klucza,
        // przy podaniu błędnego loginu Chociaz przy zalozeniu, że klucze
        // zaczynaja sie od 1(generator id), klucz 0 wydaje sie byc bezpieczny
        if (allusers.containsKey(delKey)) {
            allusers.remove(delKey);
        } else
            System.out.println("invalid login");
    }


    public boolean validateUser(User user) {
        // if zwraca wartosc false kiedy którekolwiek z pól bedzie puste,
        // wiek za niski, albo login taki sam jak juz istniejacy.
        if (
                user.getLogin().isEmpty() ||
                        user.getPassword().isEmpty() ||
                        user.getName().isEmpty() ||
                        user.getLastname().isEmpty() ||
                        !checkLogin(user) ||
                        !user.checkAge() ||
                        user.getBirthDate().toString().isEmpty() //???<- czy to ma sens
        ) return false;
        else return true;
    }

    public List<User> getAllUsers() {
        List<User> resault = new LinkedList<>();
        for (User x : allusers.values()
        ) {
            resault.add(x);
        }
        //ERASE PASSWORDS
        for (User x: resault
        ) {
            x.setPassword(passEraser(x.getPassword()));
        }
        return resault;
    }

    //Logowanie
    public User logByPassword(String log, String pass) {

        for (User x : allusers.values()
        ) {
            if (x.getLogin().equals(log)) {
                if (x.getPassword().equals(pass)) {
                    return x;
                }
            }
        }

        return null; // Czy da rade cos z tym zrobic?
    }


    //
    public List<User> findUser(String tekst) {
        List<User> resault = new LinkedList<>();
        for (Integer key: allusers.keySet()
             ) {
            if(allusers.get(key).getName().contains(tekst)){
                resault.add(allusers.get(key));
            }else if(allusers.get(key).getLastname().contains(tekst)){
                resault.add(allusers.get(key));
            }
        }
        //ERASE PASSWORDS
        for (User x: resault
             ) {
            x.setPassword(passEraser(x.getPassword()));
        }
        return resault;
    }
    //
    private String passEraser(String pass){
        String resault="";
        for (int i = 0; i < pass.length(); i++) {
            resault+="*";
        }
        return resault;
    }
    //SHOW ALL DATA
    public void flashAll(){
        for (Integer key:allusers.keySet()
             ) {
            System.out.println("id: "+key+
                    " name: "+allusers.get(key).getName()+
                " LastName: "+allusers.get(key).getLastname()+
                " log: "+allusers.get(key).getLogin()+
                " pass: "+allusers.get(key).getPassword()+
                " BD: "+allusers.get(key).getBirthDate()
            );
        }
    }
    //CHANGE PASSWORD
    public void changePass(String login, String pass){

        for (Integer key: allusers.keySet()
             ) {
            if(allusers.get(key).getLogin().equals(login)){
                allusers.get(key).setPassword(pass);
                System.out.println("password changed");
            }
        }

    }
}
