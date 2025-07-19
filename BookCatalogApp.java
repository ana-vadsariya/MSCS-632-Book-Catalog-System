import java.util.*;

public class BookCatalogApp {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean removeBook(String title) {
        String bookTitle = title.toLowerCase();
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

    public Book searchBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void searchBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by that author.");
        }
    }

    public void searchBooksByGenre(String genre) {
        boolean found = false;
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(book);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found in that genre.");
        }
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The catalog is empty.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}
