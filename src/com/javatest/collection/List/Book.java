package com.javatest.collection.List;

public class Book {
    private String title;
    private String author;
    private int price;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "title= " + title + "\t\tauthor= " + author + "\t\tprice= " + price ;
    }
}
