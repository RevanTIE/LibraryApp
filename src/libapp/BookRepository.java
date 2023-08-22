package libapp;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public BookRepository() {
        books.add(new Book("23489", "The Dead of Night", "Horror", "A Great Book to share with friends", "S.L. Eleton", 10, 7));
        books.add(new Book("26789", "Great Atmosphere", "Cultural", "Life this exciting experience with nature", "A.M. Bientalist", 15, 8));
        books.add(new Book("32456", "Tlacuache boy", "Comedy", "Join us in this comedy for all family", "Adam Sandler", 20, 6));
        books.add(new Book("36475", "The Dead of Zombies", "Horror", "A Great Book to share with friends", "S.L. Eleton", 50, 20));
    }

    public Book findByIsbn(String isbn){

        for(Book book : books){
            if(book.getIsbn().equals(isbn)) return book;
        }
        return null;
    }
    public ArrayList<Book> findByTitle(String keyword){
        ArrayList<Book> booksFound = new ArrayList<>();
        for(Book book : books){
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())){
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
