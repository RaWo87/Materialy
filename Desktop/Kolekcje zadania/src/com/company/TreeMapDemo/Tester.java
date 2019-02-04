package com.company.TreeMapDemo;

public class Tester {
    public static void main(String[] args) {
        MetodyTreeMap drzewo = new MetodyTreeMap();
        drzewo.addUsers();
        drzewo.addToComp();
        drzewo.showAllUsers();
        drzewo.showFnLentry();
        drzewo.showHighLow(3);
        drzewo.ifExist(5);
        drzewo.removeFnL();
        drzewo.removeIfMatch(2,"trzeci");
        drzewo.showAllUsers();
        System.out.println();
        drzewo.removeIfMatch(2,"drugi");
        drzewo.showAllUsers();
        System.out.println();
        drzewo.addToComp();
        drzewo.showCtree();




    }
}
