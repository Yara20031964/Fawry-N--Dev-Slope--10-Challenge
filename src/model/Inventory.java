package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class Inventory {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle() + " has been added to the inventory successfully");
    }
    public List<Book> removeOldBooks(int limits){
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        List<Book> outdated = new ArrayList<>();

        for (int i = books.size() - 1; i >= 0; i--) {
            Book b = books.get(i);
            if ((currentYear - b.getYear()) > limits) {
                outdated.add(b);
                books.remove(i);
                System.out.println("Quantum book store: Removed outdated book " + b.getTitle());
            }
        }
                
        if (outdated.isEmpty()) {
            System.out.println("Quantum book store: No outdated books found.");
        }
        return outdated;
    }
    public double buyBook(String isbn, int quantity, String email, String address) {
        for (Book b : books) {
            if (b.getIsbn().equals(isbn)) {
                return b.sell(quantity, email, address);
            }
        }

        throw new RuntimeException("Quantum book store: Book with ISBN " + isbn + " not found.");
    }
    

}
