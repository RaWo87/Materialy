package SDA.Library;

import java.util.HashMap;
import java.util.Map;

public class StoredBooks {
    private Map<Book, Integer> books= new HashMap<>();

    StoredBooks(){
        books.put(new Book("mobidick","autor"),5);
        books.put(new Book("fellowship","Tolkien"),15);
        books.put(new Book("songs of","Martin"),25);
        books.put(new Book("wplyw","Zimbardo"),35);
        books.put(new Book("lalka","prus"),45);
        books.put(new Book("Casablancka","autorCasablanci"),55);
    }

    public Map getBooks(){
        return books;
    }


}
