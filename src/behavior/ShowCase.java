package behavior;

import model.Book;

public class ShowCase implements BookBehavior{
    public double sell(Book book, int quantity, String email, String Address){
        throw new RuntimeException( book.getTitle() +  " is not fo sale");
    }
}
