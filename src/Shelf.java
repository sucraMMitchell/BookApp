import java.util.Collections;
import java.util.HashMap;

public class Shelf extends Book{

    /**
     * Search for book by title in the hash map of books.
     * Key = ISBN number Value = Title, Author
     **/
    private Map<Integer, String> books = new HashMap<String, String>();

    public Shelf(String title, String author){
        this.title = title;
        this.author = author;
    }

}