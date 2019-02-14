package com.company.Tablice;

public class TesterTablic {
    public static void main(String[] args) {
        Tablice a = new Tablice();
        a.printInt(new int[]{2,34,5,445,343});

        System.out.println("\nmax int: "+a.maxInt(new int[]{2,32,4,-900,42}));
        System.out.println("min int: "+a.minInt(new int[]{2,0,32,4,-9,-40}));
        System.out.println(+a.sumInt(new int[]{2,3,4,-900,4}));

        for (int ele: a.getMaxMinAndSum(new int[]{1,8,3,4,0,0,-1})
             ) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele: a.getLarger(new int[]{1,8,3,4,0,0,-1}, new int[]{20,-100,8})
        ) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele: a.mergeTable(new int[]{1,5,0,0,2}, new int[]{20,-100,123})
        ) {
            System.out.print(ele+" ");
        }
        System.out.println();
        for (int ele: a.getDistinct(new int[]{1,1,1,0,1,2,8,0,3,2,2})
        ) {
            System.out.print(ele+" ");
        }



    }
}
