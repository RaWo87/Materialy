package SDA.Biblioteka;

import SDA.Strumienie;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Biblioteka {
    static final Logger log = Logger.getLogger(Biblioteka.class.getName());
    static final String s = Paths.get("").toAbsolutePath().toString().replace("\\","/");
    static final String resourcesPath = s+"/src/main/resources/";
    public void clearLog() throws IOException {
        FileUtils.write(new File(resourcesPath + "StrumienieLogs.log"), "", "UTF-8");
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
