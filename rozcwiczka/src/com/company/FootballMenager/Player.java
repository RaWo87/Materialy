package com.company.FootballMenager;

public class Player implements Cloneable{
    private String name;
    private String lastName;
    private Position position;
    private Club club;


    protected Object clone()throws CloneNotSupportedException{
        Player player = (Player)super.clone();
        player.club = (Club)club.clone();

        return player;
    }

    public Player(String name, String lastName, Position position, Club club) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.club = club;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }


}
