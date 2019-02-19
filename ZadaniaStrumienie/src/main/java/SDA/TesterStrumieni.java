package SDA;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TesterStrumieni {


    public static void main(String[] args) throws IOException {
        Strumienie a = new Strumienie();
        Pogoda w = new Pogoda();
       w.showDay(w.findAday("3/2/1966"));
        w.showDay(w.setDay("2/15/1966,8,3,-1"));

        //System.out.println(w.tempInPeriod("8/28/2004","8/29/2004"));
      //  System.out.println(w.aboveAndBelow(0));



        System.out.println();


    }
}
