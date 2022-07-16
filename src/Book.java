import java.util.Date;
import java.util.*;
import java.lang.*;

public class Book {
    String title;
    String author;
    String description;
    int totalPages;
    Date published;
    List<Book> books = new ArrayList<Book>();;


    public Book(String title, String author, String description, int totalPages, Book books){
        this.title = title;
        this.author = author;
        this.description = description;
        this.totalPages = totalPages;
        published = new Date();
    }
    public void searchPageNum(int pageNum){} //find page number
    public void searchWord(String word){} //find word on page
    public String searchDefinition(String word){String definition =""; return definition; } //find word definition using web scrape class
    public String searchRoot(String word){String root =""; return root; } //find root word using web scrape class

    /**
     * Search for book by title or author in the array list of books.
     **/
    public Book getBook(String title, String author){
        for(Book book: books) {
            if(book.title.equals(title)) {
                return (book);
            }else if(book.author.equals(author)){
                return (book);
            }
        }
        return null;
    }
    public void addBook(String title, String author, String description, int totalPages, Book books){
        if (title != null && author != null && description != null) {
            books.add(title);
            books.add(author);
            books.add(description);
        }
    }

    private void add(String title) {
        this.title= title;
    }
}