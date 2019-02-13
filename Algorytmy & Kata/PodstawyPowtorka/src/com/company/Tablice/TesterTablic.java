package com.company.Tablice;

public class TesterTablic {
    public static void main(String[] args) {
        Tablice a = new Tablice();
        a.printInt(new int[]{2,34,5,445,343});

        System.out.println("\n"+a.maxInt(new int[]{2,32,4,-900,4}));
        System.out.println(a.minInt(new int[]{2,0,3,4,-900,4}));
        System.out.println(a.sumInt(new int[]{2,3,4,-900,4}));

        for (int ele: a.getMaxMinAndSum(new int[]{1,8,3,4,0,0,-1})
             ) {
            System.out.print(ele+" ");
        }


    }
}
