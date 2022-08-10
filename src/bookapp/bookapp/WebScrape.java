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
            //set proxy ip and port number
            document = Jsoup
                       .connect("https://www.etymonline.com/word/" + word)
                       .proxy("127.0.0.1", 8080)
                       .userAgent("Mozilla/5.0 (Macintosh; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2")
                       .header("Content-Language", "en-US")
                       .get();
            System.out.println(document.title());
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        //search for definition of current word & print
        Elements definitions = document.getElementsByClass(WORD_DEF_CLASS);
        for(Element definition : definitions) {
            definition.select("##div.word_4pc--2SZw8.word--C9UPa > div").first();
            System.out.println(definition.text());
        }

        //search for root word of original word searched & print
        Elements roots = document.getElementsByClass(WORD_ROOT_SELECTOR);
        for(Element root : roots){
            root.select("##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)");
            System.out.println(root.text());
        }

        //find & print root word definition
        Elements root_defs = document.getElementsByClass(WORD_ROOT_DEF);
        for(Element rdefs : root_defs){
            rdefs.select("##div.word_4pc--2SZw8.word--C9UPa:nth-of-type(1)");
            System.out.println(rdefs.text());
        }

        Elements image = document.getElementsByClass("image");
        for(Element img : image){
            img.select("#word");
            System.out.println(img);
        }

    }


}