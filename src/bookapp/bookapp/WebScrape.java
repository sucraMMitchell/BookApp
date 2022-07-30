package bookapp;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class WebScrape extends Book {


    public WebScrape() throws IOException {

    }

    Document page = Jsoup.connect("https://www.thefreedictionary.com/").get();

    /*public void searchPageNum(String pageNum){} //find page number

    public void searchWord(String word){}

    public String searchDefinition(String word){String definition =""; return definition; } //find word definition using web scrape class

    public String searchRoot(String word){String root =""; return root; } //find root word using web scrape class
    */

}