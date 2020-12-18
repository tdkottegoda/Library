package library;

/**
 * Date.java - 
 *
 * @author Tharindu Kottegoda
 * @since Nov. 9, 2020
 */
class Date {

    private int day;
    private int month;
    private int year;

    /**
     * Default constructor, set class properties
     */
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
