package com.company.Tablice;

public class Tablice {
    //ZAD1 print tablicy intow

    public void printInt(int[] tab){
        System.out.println();
        for (int a: tab
        ) {
            System.out.print(a+" ");
        }
    }
    //ZAD2 najwiekszy int w tablicy
    public int maxInt(int[] tab){
        int resault=0;
        for (int i = 0; i < tab.length-1; i++) {
            if(tab[i]>tab[i+1]){
                resault=tab[i];
            }
        }
        return resault;
    }
    //ZAD3 najmniejszy int w tablicy
    public int minInt(int[] tab){
        int resault=0;

        for (int i = 0; i <tab.length-1 ; i++) {
            if(tab[i]<tab[i+1]){
                resault=tab[i];
            }
        }
        return resault;
    }
    //ZAD4 suma elementow tablicy
    public int sumInt(int[] tab){
        int resault=0;
        for (int a:tab
             ) {
            resault+=a;
        }
        return resault;
    }
    //ZAD5 max min sum
    public int[] getMaxMinAndSum(int[] tab){
        int[] resaults= {0,0,tab[tab.length-1]};
        for (int i = 0; i < tab.length-1; i++) {
            if(tab[i]>tab[i+1]){
                resaults[0]=tab[i];
            }

                if(tab[i]<tab[i+1]){
                    resaults[1]=tab[i];
                }

            resaults[2]+=tab[i];
        }


        return resaults;
    }


}
