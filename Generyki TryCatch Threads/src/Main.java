import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

    // write your code here
    static void doMagic(int wiek) throws IllegalArgumentException{
            if(wiek < 0){
                throw new IllegalArgumentException("zly wiek elo");
            }
            System.out.println("do magic");
        }
        // metoda łapania błędow
        static int tryGetInt(String[] args, int position){
            try {
                return Integer.parseInt(args[position]);
            } catch (NullPointerException e) {
                System.out.println("null error lapaj 0");
            } catch (NumberFormatException e) {
                System.out.println("to nie liczba chapaj 0");
            } catch (IndexOutOfBoundsException e) {
                System.out.println(" index out of bound, tablica ma "+e +"elementow"+"a ty masz 0");
            }


            return 0;
        }

        //metoda sprawdzajaca wiek
        static void sprawdzCzy18(int s)throws MojBlad{
            if(s < 18) {
                throw new MojBlad(s);
            }
            System.out.println("mozna pic!");}

    private static Para podajOceny(){
        return new Para<>("Jacek", 5);
    }
    private static Para podajDaty(){
        return new Para<>("jacek",new Date());
    }
    private static Para parka(){
        return new Para<>("jacek","agatka");
    }
    private  static <T> void coZatyp(T t){
        System.out.println(t.getClass().getSimpleName());
    }

    private static <T> void coZaTyp2(T t){
        if(t instanceof Integer){
            System.out.println("to jest integer");
        }
        if(t instanceof Double){
            System.out.println("to jest double");
        }
    }

    private static <T extends  Number> void coZaTyp3(T t){
// ten kod nie ejst nawet potrzebny, extends zalatwia wszystko
        if(t instanceof Number){
            System.out.println("to jest liczba");

        }
    }

// Metody generyczne
        public static void main(String[] args)throws MojBlad {

        //wielowatkowaosc
            Thread t1 = new Thread();
            Thread t2 = new Thread();
            Thread t3 = new Thread();

            t1.start();
            t2.start();
            t3.start();

            try {
                t1.join();
                t2.join();
                t3.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


////arraylista/hashmapa
//            Map<String, String> map = new HashMap<>();
//            System.out.println(map.put("ole", "fd"));
//
//            ArrayList<Samochod> garaz = new ArrayList<>();
//            garaz.add(new Samochod());
//            garaz.add(new Samochod());
//            garaz.add(new Samochod());
//            garaz.add(new Samochod());
//            System.out.println(garaz.size());
//// Generyki
//
//    coZaTyp3(23);
//
//        coZaTyp2(2.23);
//
//            Para<String, Integer> oceny = podajOceny();
//            Para<String, Date> daty = podajDaty();
//            Para<String, Date> parka = parka();
//
//            coZatyp('d');
//
//            System.out.println(daty.getT()+" "+daty.getJ());
//            System.out.println(oceny.getT()+" "+oceny.getJ());
//            System.out.println(parka.getT()+" "+parka.getJ());
//


//                String a = "sss";
////            Kontener<String> cubiq = new Kontener<>(a);
//
//          // Wyjatki i bledy
//        //przypadek z try/catch
//        try{
//            sprawdzCzy18(17);
//
//        }catch(MojBlad e){
//            System.out.println(e.getMessage());
//            System.out.println(" za malo lat");
//        }
//        //przypadek bez try/catch
//        sprawdzCzy18(18);

//
//
//
//
//        String arg[] = new String[5];
//        arg[0] = null;
//        arg[1] = "4";
//        int liczba1 = tryGetInt(arg,0);
//        int liczba2 = tryGetInt(arg,4);
//
//        System.out.println("gogo gadget   "+liczba1);
//


//
//
//        int wiek =10;
//        try{
//            if(wiek <0){
//                throw new IllegalArgumentException();
//            }
//            doMagic(10);
//            doMagic(-1);
//            doMagic(0);
//
//            System.out.println("gogo gadget");
//
//        }catch(IllegalArgumentException e){
//            System.out.println("wiek musi byc > 0  "+e.getMessage());
//            System.out.println(e.getLocalizedMessage());
//        }
//        System.out.println("dalej dalej dalej");
//
//

            Pudelko<Integer> box1 = new Pudelko<>(5);
            System.out.println(box1.getPole());

            Pudelko<String> box2 = new Pudelko<>("6");
            System.out.println(box2.getPole().length());

            Pudelko<Samochod> box3 = new Pudelko<>();
            //box3.Napraw();




    }
}
