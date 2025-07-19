import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BookCatalogApp catalog = new BookCatalogApp();
        Scanner scanner = new Scanner(System.in);

        //Main Menu
        while (true) {
            System.out.println("\nWelcome to the Book Catalog App:");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Find Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");

            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                //Adding a new book
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
                    System.out.println("The book has been added to the catalog.");
                }

                //Remove a book using the title
                case 2 -> {
                    System.out.print("Enter the title of the Book you want to remove: ");
                    String title = scanner.nextLine();
                    boolean removed = catalog.removeBook(title);
                    if (removed) {
                        System.out.println("Book successfully removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                }

                //Search Book by different criteria
                case 3 -> {
                    System.out.println("Search by:");
                    System.out.println("1. Title");
                    System.out.println("2. Author");
                    System.out.println("3. Genre");

                    int criteria = Integer.parseInt(scanner.nextLine());

                    switch (criteria) {
                        case 1 -> {
                            System.out.print("Enter the title: ");
                            String title = scanner.nextLine();
                            Book result = catalog.searchBookByTitle(title);
                            if (result != null) {
                                System.out.println("Found: " + result);
                            } else {
                                System.out.println("Book not found.");
                            }
                        }
                        case 2 -> {
                            System.out.print("Enter the author: ");
                            String author = scanner.nextLine();
                            catalog.searchBooksByAuthor(author);
                        }
                        case 3 -> {
                            System.out.print("Enter the genre: ");
                            String genre = scanner.nextLine();
                            catalog.searchBooksByGenre(genre);
                        }
                        default -> System.out.println("Invalid search option.");
                    }
                }

                //Display all books
                case 4 -> {
                    catalog.displayBooks();
                }

                case 5 -> {
                    System.out.println("Exiting the Book Catalog App.");
                    return;
                }

                default -> System.out.println("Invalid menu option. Try again.");
            }
        }
    }
}
