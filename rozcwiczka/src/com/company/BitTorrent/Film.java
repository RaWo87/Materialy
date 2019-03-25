package com.company.BitTorrent;

import java.time.LocalDate;

public class Film implements Cloneable{
    private Director rezyser;
    private Genre gatunek;
    private String title;
    private LocalDate releaseDate;

    public Film(Director rezyrer, Genre gatunek, String title, LocalDate releaseDate) {
        this.rezyser = rezyrer;
        this.gatunek = gatunek;
        this.title = title;
        this.releaseDate = releaseDate;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Film film = (Film)super.clone();
        film.rezyser = (Director)rezyser.clone();
        return film;
    }

    public Director getRezyser() {
        return rezyser;
    }

    public void setRezyser(Director rezyser) {
        this.rezyser = rezyser;
    }

    public Genre getGatunek() {
        return gatunek;
    }

    public void setGatunek(Genre gatunek) {
        this.gatunek = gatunek;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}




