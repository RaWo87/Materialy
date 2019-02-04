package com.company;

public class Siema implements Iczesc {
private String imie;

Siema(String imie){
    this.imie = imie;
}

    @Override
    public String podajimie() {
        return imie;

    }

    @Override
    public void przywitanie(String tekst) {
    String imie = podajimie();
        System.out.println(imie);
    }

}
