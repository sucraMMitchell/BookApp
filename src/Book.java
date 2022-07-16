import java.util.Date;
import java.util.*;
public class Book {
    String title = null;
    String author = null;
    String description = null;
    int totalPages = 0;
    Date published;
    List<Book> books = new ArrayList<Book>();

    public void searchPageNum(int pageNum){} //find page number
    public void searchWord(String word){} //find word on page
    public String searchDefinition(String word){String definition =""; return definition; } //find word definition using web scrape class
    public String searchRoot(String word){String root =""; return root; } //find root word using web scrape class
    //public Book getBook(String title, String author, String description, int totalPages){return books[title, author, description, totalPages];} //
}