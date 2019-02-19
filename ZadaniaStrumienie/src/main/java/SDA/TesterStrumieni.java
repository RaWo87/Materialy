package SDA;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class TesterStrumieni {


    public static void main(String[] args) throws IOException {
        Strumienie a = new Strumienie();
        Pogoda w = new Pogoda();
     // w.showDay(w.findAday("3/2/1966"));
      //  w.showDay(w.setDay("2/15/1966,8,3,-1"));

        //System.out.println(w.tempInPeriod("8/28/2004","8/29/2004"));
      //  System.out.println(w.aboveAndBelow(0));
        w.hottestColdest();

//        wDay dzien = new wDay("1/22/1990",10,5,0);
//        wDay dzien2 = new wDay("1/22/199",10,5,0);
//        wDay dzien3 = new wDay("1/22/2999",10,5,0);
//        wDay dzien4 = new wDay("1/22/1909",10,5,0);
//
//        List<wDay> lista = new LinkedList<>();
//        lista.add(dzien);
//        lista.add(dzien2);
//        lista.add(dzien3);
//        lista.add(dzien4);
//
//        System.out.println("polizcone lata "+w.countYears(lista));
//        for (wDay x: lista
//             ) {
//            System.out.println(x.getDzien());
//        }
//        Collections.sort(lista);
//        System.out.println();
//        for (wDay x: lista
//        ) {
//            System.out.println(x.getDzien());
//        }







    }
}
