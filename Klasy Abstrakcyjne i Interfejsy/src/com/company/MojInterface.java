package com.company;

public interface MojInterface {
    void doMagic();

    default void doMagic2(){
        System.out.println("gogogo");
    }
}
