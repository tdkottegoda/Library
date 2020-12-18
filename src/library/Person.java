package library;


/**
 * Person.java - 
 *
 * @author Tharindu Kottegoda 
 * @since Nov. 12, 2020 
*/
public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isMale;
    
    
    /**
     * Default constructor, set class properties
     */
    public Person(String firstName, String lastName, int age, boolean isMale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMale = isMale;
    }
    
}



































///**
//     * String representation of this object
//     *
//     * @return The object represented as a String
//     */
//    @Override
//    public String toString() {
//        return "Person: " + super.toString();
//    }
//   
//    /**
//     * Deep comparison, determines if two objects are "equal" in this context
//     *
//     * @param object the object to compare to
//     * @return the objects are "equal" (true) or not (false)
//     */
//    @Override
//    public boolean equals(Object object) {
//        return super.equals(object);
//    }
//       
//    /**
//     * a Deep clone, creates a duplicate object using new memory
//     *
//     * @return a "clone" of the object using new memory
//     */
//    @Override
//    public Person clone() {
//        return this;
//    }