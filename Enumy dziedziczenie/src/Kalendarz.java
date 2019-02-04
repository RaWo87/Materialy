import java.util.*;

public class Kalendarz {
    public static void main(String[] args) {
//         String text;
//         char index = '1';
//         String jezyk = "PL";
//         boolean goON = true;
//        Scanner wejscie = new Scanner(System.in);
//
//        do{
//        System.out.println("podaj dzien i jezyk");
//        text = wejscie.nextLine();
//                index = text.charAt(0);
//                if(text.contains("pol")){
//                jezyk = "PL";
//                    goON = false;
//                    break;
//                }else if(text.contains("esp")){
//                jezyk ="ESP";
//                    goON = false;
//                    break;
//                }else if(text.contains("chin")){
//                    jezyk ="CHN";
//                    goON = false;
//                    break;
//                }else{
//                    System.out.println("zly jezyk");
//                    goON = true;
//                }
//    }while(goON == true);
//
//        int numerDnia = Character.getNumericValue(index);
//        DzienTygodnia wybranyDzien = DzienTygodnia.PONIEDZIALEK;
//
//        switch (numerDnia) {
//            case 1:
//                wybranyDzien = DzienTygodnia.PONIEDZIALEK;
//                break;
//            case 2:
//                wybranyDzien = DzienTygodnia.WTOREK;
//                break;
//            case 3:
//                wybranyDzien = DzienTygodnia.SRODA;
//                break;
//            case 4:
//                wybranyDzien = DzienTygodnia.CZWARTEK;
//
//                break;
//            case 5:
//                wybranyDzien = DzienTygodnia.PIATEK;
//
//                break;
//            case 6:
//                wybranyDzien = DzienTygodnia.SOBOTA;
//
//                break;
//            case 7:
//                wybranyDzien = DzienTygodnia.NIEDZIELA;
//
//                break;
//            default:
//                System.out.println("nie ma takiego dnia");
//
//        }
//
//        wybranyDzien.getChoosen(jezyk);

        DzienTygodnia[] tablicaDni = DzienTygodnia.values();

//        for (DzienTygodnia a : tablicaDni
//             ) {
//            System.out.println(a);
//        }
        System.out.println(tablicaDni[4]);
    }
}
