package SDA;

public class Calculator {
    public int add(int i, int i1) {
        return i+i1;
    }

    public boolean isEven(int value) {
        return value%2==0;
    }

    public int square(int value) {
        return value*value;
    }

    public int powerOf(int base, int power) {
        int resault=base;
        while (power>1){
            resault*=base;
           power--;
        }
        return resault;
    }

    public double getVat(int price) {

        return price*0.19;
    }
}
