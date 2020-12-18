package library;

import library.Librarybook;
import library.Library;

/**
 * Student.java - 
 *
 * @author Tharindu Kottegoda 
 * @since Nov. 12, 2020 
*/
public class Student extends Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;
    private int number;
    public Book[] books;
    
    /**
     * Default constructor, set class properties
     */
    public Student(String firstName, String lastName, int age, boolean isMale, int number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
        this.number = number;
        books = new Book[10];
    }
    
    public void takeOutBook(LibraryBook book, Date current, Date dueDate) {
        
    }
}