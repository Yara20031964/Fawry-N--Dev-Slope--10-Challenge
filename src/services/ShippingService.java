package services;

import model.Book;

public class ShippingService {
    public void ship(Book book, String address){
        System.out.println( book.getTitle() + " shipping to this address " + address );
    }
}
