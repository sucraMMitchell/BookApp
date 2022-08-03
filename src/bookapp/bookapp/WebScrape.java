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
import org.jsoup.Connection;
import org.jsoup.Connection.Method;

class WebScrape extends Book {

    private static final String WORD_DEF_CLASS = "##div.word_4pc--2SZw8.word--C9UPa > div";
    private static final String WORD_TITLE_CLASS = "##.word_thumbnail__name--1khEg.word__name--TTbAA";
    private static final String WORD_ROOT_SELECTOR = "##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)";
    private static final String WORD_ROOT_DEF = "##.undefined.word__defination--2q7ZH > p";
    //two urls, one for definition one for images

    public void Scrape(String word) {
        Document document;
        try{
            document = Jsoup.connect("https://www.etymonline.com/word/" + word).get();
            System.out.println(document.title());
        }catch(IOException e){
            throw new RuntimeException(e);
        }
        //print definition of word
        Elements definitions = document.getElementsByClass(WORD_DEF_CLASS);
        for(Element definition : definitions) {
            definition.select("##div.word_4pc--2SZw8.word--C9UPa > div").first();
            System.out.println(definition.text());
        }
        //print root word of original word searched
        Elements roots = document.getElementsByClass(WORD_ROOT_SELECTOR);
        for(Element root : roots){
            root.select("##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)");
            System.out.println(root.text());
        }
        //print root word definition
        Elements root_defs = document.getElementsByClass(WORD_ROOT_DEF);
        for(Element rdefs : root_defs){
            rdefs.select("##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)");
            System.out.println(rdefs.text());
        }

    }

    class Proxy{
        Connection proxy(String proxyHost, String proxyPort) {
            return null;
        }
    }








    /*public void searchPageNum(String pageNum){} //find page number

    public void searchWord(String word){}

    public String searchDefinition(String word){String definition =""; return definition; } //find word definition using web scrape class

    public String searchRoot(String word){String root =""; return root; } //find root word using web scrape class
    */

}