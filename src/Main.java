import java.util.*;

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        Scanner scn = new Scanner(System.in);

        System.out.println("Input book ISBN:");
        int ISBN = scn.nextLine();
        System.out.println("Input book title:");
        String title = scn.nextLine();
        System.out.println("Input book author:");
        String author = scn.nextLine();
        book1.addBook(title, author);

        System.out.println("Input book ISBN:");
        int ISBN = scn.nextLine();
        System.out.println("Input book title:");
        String title = scn.nextLine();
        System.out.println("Input book author:");
        String author = scn.nextLine();
        book2.addBook(title, author);

        System.out.println("Input book ISBN:");
        int ISBN = scn.nextLine();
        System.out.println("Input book title:");
        String title = scn.nextLine();
        System.out.println("Input book author:");
        String author = scn.nextLine();
        book3.addBook(title, author);

        System.out.println(book1.getTitle, book1.getAuthor);
        System.out.println(book2.getTitle);
        System.out.println(book3.getAuthor);
    }
}
