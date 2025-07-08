import behavior.*;
import model.Book;
import model.Inventory;

public class Main {
    public static void main(String[] args) throws Exception {
         Inventory inventory = new Inventory();

        Book paperBook = new Book("ISBN001", "Clean Code", 2008, 250.0, new PaperBook(5));
        Book ebook = new Book("ISBN002", "Effective Java", 2018, 180.0, new EBook("PDF"));
        Book demoBook = new Book("ISBN003", "Sample Preview", 2010, 0.0, new ShowCase());

        inventory.addBook(paperBook);
        inventory.addBook(ebook);
        inventory.addBook(demoBook);

        System.out.println("----------------------------------------------------------------------------");

        //Buy a Paper Book
        try {
            double total = inventory.buyBook("ISBN001", 2, "customer@mail.com", "Cairo");
            System.out.println("Paid amount. $" + total);
            
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        
        //Buy an EBook
        try {
            double total = inventory.buyBook("ISBN002", 1, "ebookuser@mail.com", "");
            System.out.println("Paid amount. $" + total);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Try to Buy a Showcase Book
        try {
            inventory.buyBook("ISBN003", 1, "demo@mail.com", "Alexandria");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("----------------------------------------------------------------------------");
        //Remove outdated books (older than 12 years)
        System.out.println("\nRemoving old books:");
        inventory.removeOldBooks(12); // Example: remove books older than 12 years
    }
}
