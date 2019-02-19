package com.company.Dziedziczeni;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesterDziedziczenia {


    public static void main(String[] args) {

        System.out.println(cezarCode(2, "azezz"));
        System.out.println(getPrime(15));
        System.out.println(rozkladNaCzynniki(8));
        System.out.println(nww(192,348));
        obdarowywacz();
        System.out.println();
        for (int a: sharedElements(new int[]{1,2,3,4,5}, new int[]{1,2,0,0,5,7,7,7,123,4})
             ) {
            System.out.print(a+" ");
        }
        Walec walec = new Walec(1,10);
        System.out.println("\npole walca: "+walec.getSurfaceArea());


    }

    //ZAD 7 szyfr Cezara
    static String cezarCode(int i, String tekst) {
        //ascii 65-90
        tekst = tekst.toLowerCase();
        char[] tab = tekst.toCharArray();
        tekst = "";
        for (char x : tab
        ) {
            if ((int) x + i > 122) {
                x = (char) (x + i - 122 + 96);
            } else x = (char) (x + i);
            tekst += x;
        }

        return tekst;
    }

    //ZAD 8 Sito Eratonesa
    static List<Integer> getPrime(int l) {
        boolean[] tab = new boolean[l];
        List<Integer> resault = new LinkedList<>();

        for (int j = 2; j < l; j++) {
            if (tab[j] == false) {
                for (int k = 2; k * j < l; k++) {

                    tab[j * k] = true;
                }
            }
        }
        for (int i = 2; i < l; i++) {
            if (tab[i] == false) {
                resault.add(i);
            }
        }
        return resault;
    }

    // ZAD9 rozklad na czynniki pierwsze
    static List<Integer> rozkladNaCzynniki(int number) {
        List<Integer> resault = new LinkedList<>();
        int scope = number;
        resault.add(1);

        for (int i = 2; i <= scope; i++) {
            while (number % i == 0) {
                number = number / i;
                resault.add(i);
            }
        }
        return resault;
    }
    //ZAD10 elementy wspolne 
    static int[] sharedElements(int[] tab1, int[] tab2){
        int[] resault=(tab1.length>tab2.length? tab1:tab2);
        boolean[] filter = new boolean[resault.length];
        int k=0;
        for (int i = 0; i < tab1.length; i++) {
            for (int j = 0; j < tab2.length; j++) {

                if(tab1[i]==tab2[j] && filter[j]==false){
                    resault[k]=tab1[i];
                    k++;
                    filter[j]=true;
                }
            }
        }
        int[] out = new int[k];
        for (int i = 0; i < k; i++) {
            out[i]=resault[i];
        }
        return  out;
    }
    //ZAD11 najmniejsza wspolna wielokrotnosc
    static int nww(int a, int b){
        
        for (int i = 1; i <=a*b ; i++) {
            if(i%a==0 && i%b==0){
                return i;
            }
        }
        return 0;
    }
    //ZAD12 obdarowywanie
    
    static void obdarowywacz(){
        long total=0,retired=0;
        long nowi;
        long[] dzien=new long[3];
        dzien[0]=1;
        int liczbaDni=0;

        while (total<8000000000L){
            nowi=(dzien[0])+(dzien[1])+(dzien[2]);

            retired+=dzien[2];

            dzien[2]=dzien[1];
            dzien[1]=dzien[0];
            dzien[0]=nowi;

            total=dzien[0]+dzien[1]+dzien[2]+retired;
            liczbaDni++;
        }
        System.out.println("ludnosc: "+ total+ " liczba dni: "+liczbaDni);
    }


}
