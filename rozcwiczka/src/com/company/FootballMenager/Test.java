package com.company.FootballMenager;

public class Test {


    public static void main(String[] args) throws CloneNotSupportedException{
        Menager antonio = new Menager();
        Club club = new Club("juve",antonio);
        Player player1 = new Player("pan","kowalski",Position.ATAK,club);

        Player player2 = (Player)player1.clone();

        System.out.println(player1.getClub().getName());
        System.out.println(player2.getClub().getName());


    }
}
