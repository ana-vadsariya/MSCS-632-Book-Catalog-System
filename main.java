import java.util.*;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        BookCatalogApp catalog = new BookCatalogApp();
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Welcome to the Book Catalog App:");
            System.out.println("Choose from the following actions:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book");
            System.out.println("4. Display a Book");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1 -> {
                    System.out.print("Enter the title of the Book: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter the author: ");
                    String author = scanner.nextLine();
                    System.out.print("Enter the genre: ");
                    String genre = scanner.nextLine();
                    System.out.print("Enter the year the book was published: ");
                    int year = Integer.parseInt(scanner.nextLine());
                    catalog.addBook(new Book(title, author, genre, year));
                    System.out.println("The given Book has been added to the Catalog.");
                }

                case 2 ->{
                    System.out.print("Enter the title of the Book you want to remove: ");
                    String title = scanner.nextLine();
                    boolean removed = catalog.removeBook(title);
                    if (removed) {
                        System.out.println("Book successfully removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                }



        }  

    }
}
}