package SDA;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public List<String> getNumbers()throws IOException {
        File csvFile = new File("./resources/dane.csv");
        LineIterator iterator = FileUtils.lineIterator(csvFile,"UTF-8");
        List<String> out = new ArrayList<>();
        while(iterator.hasNext()){
            out.add(iterator.next());
        }
        return out;
    }
    public static void main( String[] args )throws IOException
    {
        App a = new App();
        System.out.println(a.getNumbers());
    }
}
