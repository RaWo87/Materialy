package com.company;
//Generyki <T>, T -typ danych
//public class Kontener<T, J> {
public class Kontener<T extends Number> { // extends Throable
    private T t;
    //private J j;
    private T i;

    public Kontener(T t) {
        this.t = t;
//    }
//    public Kontener(T t, J j){
//        this.t=t;
//        this.j=j;
////    }
//    public Kontener(T t, T i) {
//
//        }

    }
}
