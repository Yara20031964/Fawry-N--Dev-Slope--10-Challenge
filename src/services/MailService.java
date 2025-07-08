package services;

import model.Book;

public class MailService {
    public void send(Book book, String email){
        System.out.println(book.getTitle() + "sending to this email" + email);
    }
}
