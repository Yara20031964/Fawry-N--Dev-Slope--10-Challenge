package behavior;

import model.Book;
import services.MailService;

public class EBook implements BookBehavior {
    private String filetype;    
    private MailService mailService;

    public EBook(String filetype){
        this.filetype = filetype;
        this.mailService = new MailService();
    }
    
    public void Ebook(String filetype){
        this.filetype = filetype;
        this.mailService = new MailService();
    }
    public double sell(Book book, int quantity, String email, String address){
        //assume that there is not limit of quantity for this ttpe of book 
        mailService.send(book, email);
        return book.getPrice() * quantity;
    }
}
