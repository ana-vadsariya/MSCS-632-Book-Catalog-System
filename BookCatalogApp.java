import java.util.*;

public class BookCatalogApp{
    private List<Book> books = new ArrayList<>();

    // Add a book
    public void addBook(Book book) {
        books.add(book);
    }
    
    public boolean removeBook(String title){
        String bookTitle = title.toLowerCase();
        //iterate over books to find by title
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            if (book.getTitle().toLowerCase().equals(bookTitle)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    

}

