package SDA;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Algorytmy {

    public List<Book> librarySort(List<Book> list) {
        List<Book> sortedList = new LinkedList<>();
        sortedList.addAll(list);
        Collections.sort(sortedList);

        return sortedList;
    }


}
