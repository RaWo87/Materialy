package SDA;

import sun.invoke.empty.Empty;

import java.util.EmptyStackException;

public class Calc {

    public int dodaj(int a, int b){
        return a+b;
    }
    public double mnoz(int a, int b){
        return a*b;
    }
    public double dziel (int a, int b){
       // if(b==0){throw new ArithmeticException("incorrect value");}
        return a/b;
    }
    public double power(int a, int b){
        double resault=1;
        for (int i = 0; i < b; i++) {
            resault*=a;
        }
        return resault;
    }
    public int factorial(int a){
        if(a<0){
            throw new ArithmeticException("must be positive");
        }
        if(a==1){
            return 1;
        }
 return a*factorial(a-1);
    }

    public int[] primes(int max)throws ArithmeticException{
        if(max<2){ return new int[]{0};}
        boolean[] flags = new boolean[max+1];

        for (int i = 2; i < max; i++) {
            for (int j = 2; j*i < max; j++) {
                flags[i*j]=true;
            }
        }

        int size=0;
        for (boolean f:flags
             ) {
            if(!f){size++;}
        }

        int[] resault = new int[size-2];
        int counter=0;
        for (int i = 2; i <flags.length ; i++) {
            if(flags[i]==false){
                resault[counter]=i;
                counter++;}
        }
        return resault;
    }

    public int[] bubbleSort(int[] input){
        int check=0;
        for (int a: input
             ) {
            check+=a;
        }
        if(check==0){throw new EmptyStackException();
        }

        int[] resault = new int[input.length];
        resault = input;
        int temp;
        int iterator=0;
        while(iterator<resault.length) {
            for (int i = 0; i < resault.length - 1; i++) {
                if (resault[i] > resault[i + 1]) {
                    temp = resault[i];
                    resault[i] = resault[i + 1];
                    resault[i + 1] = temp;
                }
            }
            iterator++;
        }
        return resault;
    }

}
