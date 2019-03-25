package com.company;

public class PortalGem {


    // x2 180g x3 490g
    // 100g = 150s
    static int soulsPerRun =50;
    static int totalSouls =0;

    public static void main(String[] args) {
        PortalGem a = new PortalGem();

        int maxRuns=120;
        int runs=0;

        while(runs < maxRuns){

            totalSouls += soulsPerRun;
            runs++;
        }
        totalSouls = totalSouls*3 - (int)1.8*150-(int)4.9*150;

        System.out.println(totalSouls);
    }




}
