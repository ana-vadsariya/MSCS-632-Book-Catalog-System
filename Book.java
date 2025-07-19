//Book Class to keep record of the attributes related to the Book

public class Book {
    private String title;
    private String author;
    private String genre;
    private int publicationYear;

    public Book(String title, String author, String genre, int publicationYear) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.publicationYear = publicationYear;
    }

    public String getTitle(){ 
        return title; 
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return String.format("'%s' by %s [%s, %d]", title, author, genre, publicationYear);
    }
}
