package SDA;

public class Test {


    public static void main(String[] args) {
        Algorytmy a =new Algorytmy();
        int[] tab ={1,2,3,43,5,6,7,8};
        a.sumaPar(tab);
        //a.evenOdd();

        System.out.println(a.returnHalf("abcdefghijk"));

        System.out.println("Palimdrome: "+a.palindromeCheck("kaJaK"));
        a.tekstAnalyzer("ala ala ala kot kot b");

            System.out.print(a.nthFibonacci(10));
        System.out.println("\n"+a.nthFibonacciB(6));

    }

}
