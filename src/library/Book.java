package library;

/**
 * Book.java - This is the Main Class of the Program
 *
 * @author Tharindu Kottegoda
 * @since Oct. 30, 2020
 */
public class Book {

    // PROPERTIES (below)...................................................
    private String title;
    private String author;
    private int ISBN;    // encapsulated property

    // METHODS (below)......................................................
    /**
     * Default constructor, set class properties
     */
    /**
     *
     * @param title
     * @param author
     * @param ISBN
     */
    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }
}
