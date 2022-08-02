package bookapp;

/** Author: Marcus Mitchell
 *  Class: WebScrape
 *  Description: Extract root word and definition of word.
 * **/

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

class WebScrape extends Book {

    private static final String WORD_DEF_CLASS = "##div.word_4pc--2SZw8.word--C9UPa > div";
    private static final String WORD_TITLE_CLASS = "##.word_thumbnail__name--1khEg.word__name--TTbAA";
    private static final String WORD_ROOT_SELECTOR = "##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)";
    private static final String WORD_ROOT_DEF = "##.undefined.word__defination--2q7ZH > p";

    public void Scrape(String word) {
        Document document;
        try{
            document = Jsoup.connect("https://www.etymonline.com/word/" + word).get();
            System.out.println(document.title());
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        Elements elements = document.getElementsByClass(WORD_DEF_CLASS);
        for(Element element : elements) {
            element.select("a").first();
            System.out.println(element.text());
        }

    }









    /*public void searchPageNum(String pageNum){} //find page number

    public void searchWord(String word){}

    public String searchDefinition(String word){String definition =""; return definition; } //find word definition using web scrape class

    public String searchRoot(String word){String root =""; return root; } //find root word using web scrape class
    */

}