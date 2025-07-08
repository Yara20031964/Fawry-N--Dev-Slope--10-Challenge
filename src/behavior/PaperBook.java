package behavior;

import model.Book;
import services.ShippingService;

public class PaperBook implements BookBehavior{
    private int stock ;
    private ShippingService shippingService;
    public PaperBook(int stock){
        this.stock = stock;
        this.shippingService = new ShippingService();
    }
    public double sell(Book book, int quantity, String email, String address){
        if(quantity > stock){
            throw new RuntimeException( book.getTitle() +  " is out of stock");
        }
        stock -= quantity;
        shippingService.ship(book, address);
        return quantity * book.getPrice();
    }
    

}
