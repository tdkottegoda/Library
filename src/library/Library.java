package library;

/**
 * Library.java - 
 *
 * @author Tharindu Kottegoda
 * @since Oct. 30, 2020
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Book book = new Book("", "", 0);
        Date date = new Date(0, 0, 0);
        Librarybook librarybook = new Librarybook("", "", 0, 0, 0);
        Person person = new Person("", "", 0, true);
        Student student = new Student("", "", 0, true, 0);
    }

}
