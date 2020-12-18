package library;


/**
 * Librarybook.java - 
 *
 * @author Tharindu Kottegoda 
 * @since Nov. 9, 2020 
*/
public class Librarybook extends Book {

    private int takeoutdate;
    private int duedate;
    
    /**
     * Default constructor, set class properties
     * @param title
     * @param author
     * @param ISBN
     * @param takeoutdate
     * @param duedate
     */
    public Librarybook(String title, 
            String author, 
            int ISBN, 
            int takeoutdate, 
            int duedate) {
    }    
    
    public int getTakeoutdate(){
        return takeoutdate;
    }
    
    public void setTakeoutdate(int takeoutdate){
        this.takeoutdate = takeoutdate ;
    }
    
    public int getDuedate(){
        return duedate;
    }
    
    public void setDuedate(int duedate){
        this.duedate = duedate;
    }
}