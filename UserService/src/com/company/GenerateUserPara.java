package com.company;

import java.time.LocalDate;

public class GenerateUserPara {

    public String generateLogin(String name, String lastname){
        return name.charAt(0)+lastname;
    }
    public String generatePassword(){
        // Chcemy wartosci ASCII z przedzialow:
        //48 - 57     -> liczby
        //65 - 90     -> wielkie litery
        //97 - 122    -> male litery
        int[] asciiTab = new int[8];
        for (int i = 0; i < 8; i++) {
            int getRange = randomInRange(1, 3);
            if (getRange > 2) {
                asciiTab[i] = randomInRange(48, 57);
            } else if (getRange < 2) {
                asciiTab[i] = randomInRange(65, 90);
            } else {
                asciiTab[i] = randomInRange(97, 122);
            }
        }
        // konwersja z ASCII na char, a nastepnie sklejanie w string
        String resault="";
        for (int x: asciiTab
             ) {
            char symbol = (char)x;
            resault+=symbol;
        }
        return resault;
    }
    public Integer randomInRange(int min, int max){
int range = (1+max-min);
        return (int)(Math.random()*range)+min;
    }



}
