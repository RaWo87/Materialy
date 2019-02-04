package part2;

public class Multiplication {
    double a;
    double b;
    Multiplication(double a, double b){
        this.a=a;
        this.b=b;
    }
    double oblicz(){
        double wynik = a*b;
        return wynik;
    }
    void showNumber(double resault){
        System.out.println(resault);
    }
    void ShowAndOblicz(){
        showNumber(oblicz());
    }

}
