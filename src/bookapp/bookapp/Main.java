package bookapp;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Book book1 = new Book(111, "how to read", "Jane Doe");
        Book book2 = new Book(222, "How to write", "Mack Mon");
        Book book3 = new Book(333, "How to swim", "Love Love");

        Scanner scn = new Scanner(System.in);

        System.out.println("Input book ISBN:");
        int ISBN = Integer.parseInt(scn.nextLine());
        System.out.println("Input book title:");
        String title = scn.nextLine();
        System.out.println("Input book author:");
        String author = scn.nextLine();
        book1.addBook(ISBN, title);

        System.out.println("Input book ISBN:");
        ISBN = Integer.parseInt(scn.nextLine());
        System.out.println("Input book title:");
        title = scn.nextLine();
        System.out.println("Input book author:");
        author = scn.nextLine();
        book2.addBook(ISBN, title);

        System.out.println("Input book ISBN:");
        ISBN = Integer.parseInt(scn.nextLine());
        System.out.println("Input book title:");
        title = scn.nextLine();
        System.out.println("Input book author:");
        author = scn.nextLine();
        book3.addBook(ISBN, title);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
