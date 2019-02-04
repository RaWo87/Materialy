package sda.HashSetDemo;

import java.util.HashSet;
import java.util.Set;

public class Countries2 {

    private Set<Country> mojeKraje = new HashSet<>();

    public void addCountry(String name, String Capital, double pop, Prezydent glowapanstwa){
        Country kraj = new Country(name, Capital, pop, glowapanstwa);
        mojeKraje.add(kraj);
    }

    public Set<Country> getALLCountries (){
        return mojeKraje;
    }

    public Country getByName(String name){
        for (Country tenKraj: mojeKraje
             ) {
            if(name.equals(tenKraj.getCountryName())){
                return tenKraj;
            }
        }
        return null;
    }




}
