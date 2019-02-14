package com.company.While;

import java.util.Scanner;

public class While {

    //ZAD1 mysteryBox
    Scanner input = new Scanner(System.in);
    public void wantToEnd(){
        boolean flag=true;
        do {
            System.out.println("zakończyć?: ");
            String a = input.nextLine();
            if(a.toLowerCase().contains("tak"))flag=false;
        }while(flag);
    }
    //ZAD2 give next power of 3 bigger then given number
    public void powerOf3(){
        System.out.println("podaj liczbe: ");
        int a= input.nextInt();
        int pow=1;
        int resault=0;
       while(a>pow){
           pow*=3;
           resault++;
       }
        System.out.println("nastepna potęga liczby 3 to: 3^" + resault+" = "+pow);
    }
    //ZAD3 ustalanie minimalnej zawartosci portfela

    public void wallet(){
        System.out.println("Podaj kwote ktora chcesz podzielić: ");
        int a = input.nextInt();
        int[] wynik = new int[8];
        while(a>199){
            wynik[0]++;
            a-=200;
        }
        while(a>99){
            wynik[1]++;
            a-=100;
        }
        while(a>49){
            wynik[2]++;
            a-=50;
        }
        while(a>19){
            wynik[3]++;
            a-=20;
        }
        while(a>9){
            wynik[4]++;
            a-=10;
        }
        while(a>4){
            wynik[5]++;
            a-=5;
        } while(a>1){
            wynik[6]++;
            a-=2;
        } while(a>0){
            wynik[7]++;
            a-=1;
        }
        System.out.println(wynik[0]+" * 200zl\n"+
                        wynik[1]+" * 100zl\n"+
                        wynik[2]+" * 50zl\n"+
                        wynik[3]+" * 20zl\n"+
                        wynik[4]+" * 10zl\n"+
                        wynik[5]+" * 5zl\n"+
                        wynik[6]+" * 2zl\n"+
                        wynik[7]+" * 1zl\n"
                );


    }


}
