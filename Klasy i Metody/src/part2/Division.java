package part2;

public class Division {
   private double score;


    void ShowDivision(int a, int b) {
        if (b == 0) {
            System.out.println("division by zero");
        } else {
            this.score = (double) a / (double) b;
        }
    }
    void ShowDivision(float a, float b) {
        if (b == 0) {
            System.out.println("division by zero");
        } else {
            this.score = (double) a / (double) b;
        }
    }
    void ShowDivision(long a, long b) {
        if (b == 0) {
            System.out.println("division by zero");
        } else {
            this.score = (double) a / (double) b;
        }
    }
    void ShowDivision(double a, double b) {
        if (b == 0) {
            System.out.println("division by zero");
        } else {
            this.score = (double) a / (double) b;
        }
    }
    void ShowDivision(short a, short b) {
        if (b == 0) {
            System.out.println("division by zero");
        } else {
            this.score = (double) a / (double) b;
        }
    }
    double getScore(){
        return score;

    }
    //REKURENCJA
    // Wyswietlanie do 10
    int  counter=10;
    void rekurencja(){
        System.out.println(counter);
        if(counter > 0) {
            counter--;
         rekurencja();
        }
    }
    //Liczenie silni dla zadanego parametru
    int licznik=1;
    int wynik =1;
    void silnia(int zakres){
        if(licznik<=zakres){
            wynik*=licznik;
            licznik++;
            silnia(zakres);
        }
    }

    int silnia2(int value){
        if(value < 1){
            return 1;
        }
        else {
            return value*silnia2(value-1);
        }
    }





}