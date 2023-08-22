package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("23489", "The Dead of Night", "Horror", "A Great Book to share with friends", "S.L. Eleton"));
        books.add(new Book("26789", "Great Atmosphere", "Cultural", "Life this exciting experience with nature", "A.M. Bientalist"));
        books.add(new Book("32456", "Tlacuache boy", "Comedy", "Join us in this comedy for all family", "Adam Sandler"));
    }

    public Book findByIsbn(String isbn){

        for(Book book : books){
            if(book.getIsbn().equals(isbn)) return book;
        }
        return null;
    }
}
