package com.company.BitTorrent;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Director d1 = new Director("ridley","Scott",Genre.ACTION);
        Director d2 = new Director("George","Lucas",Genre.COMEDY);
        Film obcy = new Film(d1,Genre.DRAMA,"Obcy", LocalDate.of(1987,8,22));

        Film obcy2 = (Film)obcy.clone();
        System.out.println(obcy.getGatunek()+" "+obcy.getRezyser().getName());
        System.out.println(obcy2.getGatunek()+" "+obcy2.getRezyser().getName());

        obcy2.setRezyser(d2);
        obcy2.setGatunek(Genre.COMEDY);

        System.out.println("----------");
        System.out.println(obcy.getGatunek().violence+" "+obcy.getRezyser().getName());
        System.out.println(obcy2.getGatunek().violence+" "+obcy2.getRezyser().getName());


    }
}
