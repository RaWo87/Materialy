package com.company;

public class Sortowanie2 {
    // Counting sort

    public static void main(String[] args) {

        int[] input = {0,1,1,3,0,5};

        CountingSort sort = new CountingSort();
        sort.showResault(sort.sorting(input));

        System.out.println();
        sort.showResault(sort.CountingSortMap(input));
    }
}
