package com.company;
import  java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFirstGUI extends JFrame{
    private JTextField pole1;
    private JTextField pole2;
    private JTextField pole3;
    private JTextField pole4;
    private JPasswordField poleHaslo;

    public MyFirstGUI(){
        super("my first window title");
        setLayout(new FlowLayout());
        pole1 = new JTextField(10);
        add(pole1);
        pole2 = new JTextField("write smth here");
        add(pole2);
        poleHaslo = new JPasswordField("haslohaslo");
        add(poleHaslo);
        pole3 = new JTextField("nieedytoalne",6);
        pole3.setEditable(false);
        add(pole3);
        pole4 = new JTextField("pole tekstowe",10);
        add(pole4);

        Dzialacz handlarz = new Dzialacz();
        pole1.addActionListener(handlarz);
        pole2.addActionListener(handlarz);
        pole3.addActionListener(handlarz);
        pole4.addActionListener(handlarz);
        poleHaslo.addActionListener(handlarz);

    }
    private class Dzialacz implements ActionListener{

        public void actionPerformed(ActionEvent event) {
            String mojtekst="";
            if (event.getSource() == pole1) {
                mojtekst = String.format("pole pierwsze: %s", event.getActionCommand());
            } else if (event.getSource() == pole2) {
                mojtekst = String.format("pole drugie: %s", event.getActionCommand());
            } else if (event.getSource() == poleHaslo) {
                mojtekst = String.format("Haslo to : %s", event.getActionCommand());
            } else if (event.getSource() == pole1) {
                mojtekst = String.format("pole pierwsze: %s", event.getActionCommand());
            }else if (event.getSource() == pole4) {
                mojtekst = String.format("pole tekstowe: %s", event.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,mojtekst);

        }
    }
}
