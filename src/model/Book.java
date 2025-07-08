package model;

import behavior.*;

public class Book {
    private String ISBN;
    private String title;
    private int year;
    private double price;
    private BookBehavior bookBehavior;

    public Book(String ISBN, String title, int year, double price, BookBehavior bookBehavior){
        this.ISBN = ISBN;
        this.title = title;
        this.year = year;
        this.price = price;
        this.bookBehavior = bookBehavior;
    }
    public String getIsbn(){
        return ISBN;
    }
    public String getTitle(){
        return title;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public double sell(int quantity, String email, String address){
        return bookBehavior.sell(this, quantity, email, address);
    }

}
