import java.util.Date;
import java.lang.*;
import java.util.Collections;
import java.util.HashMap;

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

    public Book(String ISBN){
        this.ISBN = ISBN;
    }

    public Book(String title){
        this.title = title;
    }

    public Book(String title, String author){
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

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublished() {
        return published;
    }

    public void setPublished(Date published) {
        this.published = published;
    }
    //create toString method

}