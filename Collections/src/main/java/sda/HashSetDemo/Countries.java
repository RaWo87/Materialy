package sda.HashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class Countries {

    Set<String> zbiorKrajow = new HashSet<>();

    public void addCountry(String kraj){
        if(zbiorKrajow.contains(kraj)){
            System.out.println("hahah, nice try");
        }
        zbiorKrajow.add(kraj);
    }

    public Set<String> getALLCountries(){
        return zbiorKrajow;
    }

    public void modifyCountry(String name, String newName){
        if(zbiorKrajow.contains(name)) {
            zbiorKrajow.remove(name);
            zbiorKrajow.add(newName);
        }else {
            System.out.println("nie ma takeigo kraju");
        }
    }

    public void removeCountry(String name){
    zbiorKrajow.remove(name);
    }

    public Set<String> getALLAlphabetical() {


        return zbiorKrajow;
    }
}
