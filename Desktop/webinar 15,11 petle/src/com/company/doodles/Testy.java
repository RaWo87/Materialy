package com.company.doodles;
import java.util.Random;
public class Testy {


    public static void main(String[] args) {
        /*
        String firstName = "Jan";
        String lastName = "Kowalski";
        final String pesel = "11229901234";
        int age = 32;
        double height = 199.9;

        System.out.println("Cześć, Nazywam sie " + firstName +""+ lastName + "\n" + "Mam " + age + "lat");
        System.out.println("mam " + height + "cm wzrostu, a mój pesel to");
        System.out.println(pesel);
        */

        Random rand = new Random();
        int x = rand.nextInt(10);
        int y = rand.nextInt(10);
        int z = new Random().nextInt(10);
        System.out.println(z+" "+y+" "+x);

        System.out.println("Czy z > y?????? ");
        boolean resault = z>y;
        System.out.println(resault);

        System.out.println("Czyich iloczyn jest parzysty? ");
        resault = (z*y)%2==0;
        System.out.println(resault);





    }

}