
import java.util.*;

public class Shelf extends MultiMap{

    /**
     * Search for book by ISBN in the hash map of books.
     * Key = ISBN number Value = Title, Author
     **/
    public Shelf(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    MultiMap<Integer, String> mmap = new MultiMap<Integer, String>();

    public void addBook(int ISBN, String title, String author){
        mmap.put(ISBN, title, author);
        System.out.println("Added book" + title + "to map");
    }
    public void removeBook(int ISBN, String title, String author){
        map.remove(ISBN, title, author);
        System.out.println("Removed book" + title + " from map");
    }
    public int size(){
        return mmap.size();
    }

    public boolean containsBook(int ISBN){
        mmap.containsKey(ISBN);
    }

    public Collection<Collection<Value>>() {
        return mmap.values();
    }

}