package bookapp;

import java.util.Date;
import java.lang.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * Class containing data fields for a book.
 *
 * **/

public class Book {
    int ISBN; //international standard book number
    int totalPages;
    String title;
    String author;
    String description;
    Date published;

    Map<Integer, String> book = new HashMap<Integer, String>();

    public Book() {

    }

    /**
     * Store ISBN and title in map
     * **/
    public void addBook(int ISBN, String title) {
        if(title.length() > 0){
            book.put(ISBN, title);
            System.out.println("Book" + title + "has been added to map");
            System.out.println(book);
        }
    }

    public Book(int ISBN){
        this.ISBN = ISBN;
    }

    public Book(String title){
        this.title = title;
    }

    public Book(int ISBN, String title, String author){
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, String description, int totalPages){
        this.title = title;
        this.author = author;
        this.description = description;
        this.totalPages = totalPages;
        published = new Date();
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN){
        this.ISBN = ISBN;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
    //create toString method

}