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
        int resault = 0;
        int current = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            current = (tab[i] > tab[i + 1] ? tab[i] : tab[i + 1]);
            resault = (current > resault ? current : resault);
        }
        return resault;
    }
    //ZAD3 najmniejszy int w tablicy
    public int minInt(int[] tab){
        int resault = 0;
        int current = 0;
        for (int i = 0; i < tab.length - 1; i++) {
            current = (tab[i] < tab[i + 1] ? tab[i] : tab[i + 1]);
            resault = (current < resault ? current : resault);
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
        int[] resaults = {0, 0, tab[tab.length - 1]};
        int currentMax;
        int currentMin;

        for (int i = 0; i < tab.length - 1; i++) {
            currentMax = (tab[i] > tab[i + 1] ? tab[i] : tab[i + 1]);
            currentMin = (tab[i] < tab[i + 1] ? tab[i] : tab[i + 1]);
            resaults[0] = (currentMax > resaults[0] ? currentMax : resaults[0]);
            resaults[1] = (currentMin < resaults[0] ? currentMin : resaults[0]);
            resaults[2] += tab[i];
        }
        return resaults;
    }
    //ZAD6 sumuj elementy 2och tablic,
    // wypluj ta gdzie suma elementow jest wieksza.
    public int[] getLarger(int[] tab1, int[] tab2){
        int sum1=0;
        int sum2=0;
        for (int a: tab1
             ) {
            sum1+=a;
        }
        for (int a: tab2
        ) {
            sum2+=a;
        }
        if(sum1>sum2){
            return tab1;
        }else return tab2;
    }
    //ZAD7 merge int tables
    public int[] mergeTable(int[] tab1, int[] tab2) {
        int[] resault = new int[tab1.length + tab2.length];
        for (int i = 0; i < resault.length; i++) {
            if (i < tab1.length) {
                resault[i] = tab1[i];
            } else {
                resault[i] = tab2[i - tab1.length];
            }
        }
        return resault;
    }
    //ZAD8 eliminacja duplikatow z tablicy
    public int[] getDistinct(int[] tab){

        int[] dPosition= new int[tab.length];
        for (int i = 0; i < tab.length; i++) {
            for (int j = i+1; j < tab.length; j++) {
                if(tab[i]==tab[j]){
                    dPosition[j]=1;
                }
            }
        }
        // Najlepiej było by w tym miejscu zadeklarowac tablice
        // o rozmiarze pomniejszonym o liczbe wystepujacych duplikatow,
        // jednak umieszczenie countera w pierwszym for'rze sprawia, że
        // w przypadku wystapienia  wiecej niz jednego duplikatu licznik
        // zaczyna zliczac kopie podwojnie, co sprawia, że on sam
        // staje się bezurzyteczny. wygodniejszym rozwiazaniem jest
        // przepisanie wyniku do tablicy zaleznej od iteratora.
        int[] resault = new int[tab.length];
        int iterator = 0;
        for (int i = 0; i < tab.length; i++) {
            if (dPosition[i] != 1) {
                resault[iterator] = tab[i];
                iterator++;
            }
        }
        int[] solution = new int[iterator];
        for (int i = 0; i <solution.length ; i++) {
            solution[i]=resault[i];
        }
        return solution;
           }
    


}
