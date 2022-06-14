package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class TextBookTester {

    public static void main(String[] args) {

        ArrayList<Book> myBooks = new ArrayList<>();
        TextBook textbook = new TextBook("3295016510492", "Big Java", 5, "Computer Science");
        textbook.setEbook(true);
        textbook.setePrice(50);
        textbook.setPrice(85);
        textbook.addAuthor("Horstmann");
        textbook.setPages(983);
        textbook.adjustTitle();
        myBooks.add(textbook);

        Book book;
        book = new Book("1239812482912", "The Hunchback", 2);
        book.addAuthor("Victor Hugo");
        book.setPrice(120);
        myBooks.add(book);

        System.out.println("List of my textbooks");
        System.out.println("----------------");
        for (Book b: myBooks) {
            System.out.println(b);
            System.out.println("------");
        }
    }
}