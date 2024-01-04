package researead.models;

import java.util.HashMap;
import java.util.Map;

public class LibraryModel {
    private final HashMap<String, Book> userBooks = new HashMap<>();
  
    public void addBook(String title, Book newBook) {
        userBooks.put(title, newBook);
    }
    
    public Book getBook(String title) {
        return userBooks.get(title);
    }
    
    public Map<String, Book> getUserBooks() {
        return new HashMap<>(userBooks);
    }
}
