package SDA.Library;

import java.util.Map;

public class BookService {
    private StoredBooks myBooks = new StoredBooks();

    public void addBooks(Book book, int ammount){
       myBooks.getBooks().put(book,ammount);
   }

   public Map getlist(){
        return myBooks.getBooks();
   }

}
