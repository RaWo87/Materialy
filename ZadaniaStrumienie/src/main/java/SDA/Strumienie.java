package SDA;

import SDA.Biblioteka.Algorytmy;
import SDA.urzytkownicy.User;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Strumienie extends Algorytmy {

    static final Logger log = Logger.getLogger(Strumienie.class.getName());
    String resourcesPath = "C:/Users/m1rage/IdeaProjects/ZadaniaStrumienie/src/main/resources/";


    public void clearLog() throws IOException {
        FileUtils.write(new File(resourcesPath + "StrumienieLogs.log"), "", "UTF-8");
    }

    public void logPing() {
        log.info("ping ping");
    }

    public void readExample() throws IOException {
        clearLog();
        File plik = new File(resourcesPath + "example.txt");
        LineIterator zawartoscPliku = FileUtils.lineIterator(plik, "UTF-8");

        while (zawartoscPliku.hasNext()) {

            log.info(zawartoscPliku.nextLine());
        }
    }














}