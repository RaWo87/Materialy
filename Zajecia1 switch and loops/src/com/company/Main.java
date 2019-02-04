

public class Main
{

    public static void main(String[] args) {

        /*
        byte iloscRodzenstwa = 1;
        short wiek = 32 ;
        int dzienKursu = 1;
        long pesel = 11223301234l;
        double wzrostEu = 1.85d;
        float wzrostUs = 6.2f;
        boolean czyOsobaJestPelnoletnia = true;
        char plec = 'M';
        String imie = "Rafal";

            if(wiek >18){
                czyOsobaJestPelnoletnia = true;
            }else czyOsobaJestPelnoletnia =false;
        *//*
        System.out.print("imie: ");
        System.out.println(imie);
        System.out.print("Ile masz rodzenstwa?: ");
        System.out.println(iloscRodzenstwa);
        System.out.print("dzien kursu?: ");
        System.out.println(dzienKursu);
        System.out.print("pesel: ");
        System.out.println(pesel);
        System.out.print("Wzrost: ");
        System.out.println(wzrostEu + "cm lub "+wzrostUs+"ft");
        System.out.print("pelc: ");
        System.out.println(plec);
        System.out.print("wiek: ");
        System.out.println(wiek);
        System.out.print("Czy osoba jest pelnoletnia?: ");
        System.out.println(czyOsobaJestPelnoletnia);

        */
        /**
      int  zmiennaArtymetyczna = 50;
        System.out.println(zmiennaArtymetyczna);
      zmiennaArtymetyczna =  zmiennaArtymetyczna*2;
        System.out.println(zmiennaArtymetyczna);
      zmiennaArtymetyczna = zmiennaArtymetyczna/3;
        System.out.println(zmiennaArtymetyczna);
      zmiennaArtymetyczna = zmiennaArtymetyczna - 100;
        System.out.println(zmiennaArtymetyczna);
      zmiennaArtymetyczna = zmiennaArtymetyczna +1000;
        System.out.println(zmiennaArtymetyczna);
      zmiennaArtymetyczna = zmiennaArtymetyczna%2;
        System.out.println(zmiennaArtymetyczna);
       */ /*

            int maxInt = Integer.MAX_VALUE;
        System.out.println(maxInt+1);
            System.out.println();


        *//*

        int counter = 0;
        System.out.println(counter++);
        System.out.println(++counter);
        System.out.println(counter++);
        System.out.println(counter);
        */ /*
        int a = 10;
        int b = 10;
        System.out.println(a > b);

        boolean czyAjestWiekszeodB = (a> b);
        System.out.println(!czyAjestWiekszeodB);
        */ /*

        short wiek2 = 34;
        boolean czyJestPelnoletni = wiek>=18;
        System.out.println("Czy osoba jest pełnoletnia?: "+ czyJestPelnoletni);

        double firstNumber = 5d;
        double secondNumber = 5d;
        double wynik = firstNumber*secondNumber;
        boolean isEven = wynik%2==0;
        System.out.println("czy wynik jest parzysty?: " + isEven+ ((wynik%2)==0));
        */
        int wiek = -11;

        boolean checkPrzedProd = wiek < 18;
        boolean checkProd = wiek >= 18 && wiek < 65;
        boolean checkEmeryt = wiek >= 65;
        /*
        System.out.println("Czy osoba jest w wieku przed prod?: "+ checkPrzedProd);
        System.out.println("Czy osoba jest w wieku prod?: "+ checkProd);
        System.out.println("Czy osoba jest emerytem?: "+ checkEmeryt);

        if(wiek<18 && wiek> 0){
            System.out.println("Czy osoba jest w wieku przed prod?: "+ checkPrzedProd);
        } else if(wiek>=18 && wiek <65) {
            System.out.println("Czy osoba jest w wieku prod?: " + checkProd);
        } else if(wiek >=65){
            System.out.println("Czy osoba jest emerytem?: "+ checkEmeryt);
             } else System.out.println("wiek poza skala");

        */
//        double karta = 107;
//        int owoc = 5;
//        int koszyk = 0;
//
//
//
//
//        if(karta >= owoc ){
//            karta-=5;
//            System.out.println("masz na karcie: " +karta+ "zł");
//        } else System.out.println("Jesteś biedny");
//
//

        int dzienTyg = -1;

        switch (dzienTyg) {
            case 1:
                System.out.println("Poniedziałek");
                break;
            case 2:
                System.out.println("wtorek");
                break;
            case 3:
                System.out.println("sroda");
                break;
            case 4:
                System.out.println("czwartek");
                break;
            case 5:
                System.out.println("piatek");
                break;
            case 6:
                System.out.println("sobota");
                break;
            case 7:
                System.out.println("niedziela");
                break;
            default:
                System.out.println("zły dzień");
        }
                char plec = '9';
                switch(plec) {
                    case 'k':
                        System.out.println("jesteś kobieta");
                        break;
                    case 'm':
                        System.out.println("jestes mezczyzna");
                        break;
                    case 'K':
                        System.out.println("jesteś kobieta");
                        break;
                    case 'M':
                        System.out.println("mezczyzna");
                        break;
                    default:
                        System.out.println("Wybierz [M]ężczyzna lub [K]obieta");
                }

        }
    }



