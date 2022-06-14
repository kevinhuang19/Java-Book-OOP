package com.company;

import java.util.ArrayList;


public class Book {
    private String isbn;
    private String title;
    private ArrayList<String> authors = new ArrayList<>();
    private int edition;
    private int pages;
    private double price;

    public Book() {
        title = "No Title Yet";//pre set title
        ArrayList<String> authors = new ArrayList<>();
    }

    public Book(String isbn, String title, int edition) {//constructor
        this.isbn = isbn;
        this.title = title;
        this.edition = edition;
    }
    //getter and setters for each variable
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getEdition() {
        return edition;
    }
    public void setEdition(int edition) {
        this.edition = edition;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public void addAuthor(String author) {//add author
        authors.add(author);
    }
    public void removeAuthor(String author) {//remove author
        authors.remove(author);

    }
    public void changeAuthor(String author, String newAuthor) {
        int index = this.authors.indexOf(author);
        if (index != -1) {
            this.authors.set(index, newAuthor);
        }
    }
    public String toString(){
        String authorsList = this.authors.toString();
        authorsList = authorsList.replace("[", "").replace("]", "");
        return "Title: " + this.title + "\nEdition: " + this.edition + "\nISBN: " + this.isbn + "\nAuthors: " + authorsList + "\nPages: " + this.pages + "\nPrice: " + this.price;
    }
}
