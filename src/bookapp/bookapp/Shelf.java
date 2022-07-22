package bookapp;

import java.util.*;
import java.util.Collections;

public class Shelf extends Book {

    /**
     * Search for book by ISBN in the hash map of books.
     * Key = ISBN number Value = Title, Author
     **/
    public Shelf(int ISBN, String title, String author){
        super();
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    MultiMap<Integer, String> shelf = new MultiMap<Integer, String>();

    public void addBook(int ISBN, String title, String author){
        shelf.put(ISBN, title, author);
        System.out.println("Added book" + title + "to map");
    }
    public void removeBook(int ISBN, String title, String author){
        shelf.remove(ISBN, title, author);
        System.out.println("Removed book" + title + " from map");
    }
    public int size(){
        return shelf.size();
    }

    public boolean containsBook(int ISBN){
       return shelf.containsKey(ISBN);
    }

}