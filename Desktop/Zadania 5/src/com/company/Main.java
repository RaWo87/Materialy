package com.company;
import javax.swing.JFrame;
public class Main {

    public static void main(String[] args) {
        MyFirstGUI okienko = new MyFirstGUI();
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienko.setSize(500,500);
        okienko.setVisible(true);

    }
}
