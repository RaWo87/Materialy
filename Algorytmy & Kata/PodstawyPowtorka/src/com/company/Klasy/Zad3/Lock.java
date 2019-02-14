package com.company.Klasy.Zad3;

public class Lock {
   private int a,b,c;
   public int guessA, guessB, guessC;

    public Lock() {
        this.a = (int)(Math.random()*9);
        this.b = (int)(Math.random()*9);
        this.c = (int)((Math.random()*9));
    }

    public boolean isOpen() {
        return this.a == guessA && this.b == guessB && this.c == guessC;
    }
    public void showLock(){
        System.out.println("A:"+guessA+" B:"+guessB+" C:"+guessC);
    }
    public void turnUP(char which){
        which=Character.toLowerCase(which);
        switch (which){
            case 'a':
                guessA=(guessA==9? 0:++guessA);
                System.out.println("--turning A--");
            break;
            case 'b':
                guessB=(guessB==9? 0:++guessB);
                System.out.println("--turning B--");

                break;
            case 'c':
                guessC=(guessC==9? 0:++guessC);
                System.out.println("--turning C--");

                break;
        }
    }
}
