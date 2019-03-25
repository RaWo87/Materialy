package com.company.BitTorrent;

public enum Genre {
    ACTION(true),COMEDY(false),DRAMA(true);
    boolean violence;
    Genre(Boolean hasViolence){
     violence=hasViolence;
    }
}
