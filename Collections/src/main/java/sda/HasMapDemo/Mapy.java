package sda.HasMapDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mapy {

     Map<String,String> dictionary = new HashMap<>();
     Map<String, List<String>> dictionary2 = new HashMap<>();

    public void addWord(String pol, String eng){
    if(!dictionary.containsKey(pol)){
        dictionary.put(pol,eng);
    }else {
        System.out.println("duplikat elo "+ pol);
    }
    }

    public void modifyWord(String pol, String eng) {
        if (dictionary.containsKey(pol)) {
            dictionary.put(pol, eng);
        } else if (dictionary.get(pol) == eng) {
            dictionary.put(pol, eng);
        }
    }


    public void removeTrans(String pol){
                if(dictionary.containsKey(pol)){
                    dictionary.remove(pol);
                }

        }
        public String getWord(String wyszukaneSlowo){
        if(!dictionary.containsKey(wyszukaneSlowo)){
            return "takie slowo nie wystepuje";
        }
        return " takie slowo wystepuje!";
        }

        public Map<String, String> getFullList(){
        return dictionary;
        }
// Arrays.asList ->lepsze
        public void addWord2(String pol, String eng1, String eng2){
        List<String> lista = new ArrayList<>();
        lista.add(eng1); lista.add(eng2);
        dictionary2.put(pol,lista);
        }

        public List<String> getWord2(String pol){

        return dictionary2.get(pol);
        }

    public List<String> askSearch(String pytanie) {
        List<String> resault = new ArrayList<>();
        for(String key: dictionary.keySet()){
            if(key.contains(pytanie))
            {resault.add(key);}
        }

        return resault;
    }


}
