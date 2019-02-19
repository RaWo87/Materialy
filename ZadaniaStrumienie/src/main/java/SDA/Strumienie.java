package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Strumienie extends Algorytmy{
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
// ########################## USER
    public List<User> makeUsers() throws IOException {
        clearLog();
        List<User> userzy = new LinkedList<>();
        File tekstFile = new File(resourcesPath + "users.txt");
        LineIterator rekordUsera = FileUtils.lineIterator(tekstFile, "UTF-8");

        while (rekordUsera.hasNext()) {
            String[] dane = rekordUsera.nextLine().split(" ");
            userzy.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
            log.info("user " + dane[0] + " was made");

        }
        return userzy;
    }

    public List<User>[] makeAdults() throws IOException {
        clearLog();
        List<User> male = new LinkedList<>();
        List<User> female = new LinkedList<>();
        List<User>[] userzy = new List[]{male, female};

        File tekstFile = new File(resourcesPath + "users.txt");
        LineIterator rekordUsera = FileUtils.lineIterator(tekstFile, "UTF-8");

        while (rekordUsera.hasNext()) {
            String[] dane = rekordUsera.nextLine().split(" ");
            if (Integer.parseInt(dane[2]) > 18) {
                if (dane[0].charAt(dane[0].length() - 1) != 'a') {
                    male.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
                    log.info("man " + dane[0] + " was made");
                } else {
                    female.add(new User(dane[0], dane[1], Integer.parseInt(dane[2])));
                    log.info("woman " + dane[0] + " was made");

                }
            } else log.error("user to young!");
        }
        return userzy;
    }
 //   ###############################LIBRARY

    public List<Book> library() throws IOException {
        clearLog();
        List<Book> biblioteka = new LinkedList<>();
        File bookCSV = new File(resourcesPath + "books.csv");
        LineIterator currentRecord = FileUtils.lineIterator(bookCSV, "UTF-8");


        while (currentRecord.hasNext()) {
            try {
                String[] currentLine = currentRecord.nextLine().split(",");
                biblioteka.add(new Book(
                        Integer.parseInt(currentLine[0]),
                        currentLine[1],
                        currentLine[2],
                        Double.parseDouble(currentLine[3]),
                        Boolean.parseBoolean(currentLine[4]),
                        currentLine[5],
                        currentLine[6],
                        Integer.parseInt(currentLine[7]),
                        currentLine[8]
                ));
                log.info("book was added "+ currentLine[2]);

            }catch (Exception e){
                log.error("blad w lini");
            }
        }
        return biblioteka;
    }

    public void listToCSV(List<Book> booklist)throws IOException{

        List<Book> biblioteka = new LinkedList<>();
        File bookCSV = new File(resourcesPath + "sortedBooks.csv");
        String endString="";
        for (Book b: booklist
             ) {
            endString+= b.toString();
        }
        FileUtils.write(new File(resourcesPath + "sortedBooks.csv"), endString, "UTF-8");
    }












}