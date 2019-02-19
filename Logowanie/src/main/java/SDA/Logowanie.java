package SDA;
import java.util.logging.Logger;
import java.util.logging.Logger.*;
public class Logowanie {
    //protected static final Logger logJU = Logger.getLogger(Logowanie.class.getName());
    // trzeba dorzucic log4j main->resources-> add log4j.properties
    // a w properties layout
    protected static final org.apache.log4j.Logger logger4j =
            org.apache.log4j.Logger.getLogger(Logowanie.class.getName());


    protected  void RNG() {
        int a,i = 0;
        while (i < 10) {

        a=(int)(Math.random()*100);
        logger4j.fatal("wylosowano liczbe: "+ a);
            System.out.println(a);
        i++;
        }
    }

}
