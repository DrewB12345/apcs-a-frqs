
/**
 * Write a description of class CookieOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CookieOrder
{
    // instance variables - replace the example below with your own
    private String variety;
    private int numboxes;

    /**
     * Constructor for objects of class CookieOrder
     */
    public CookieOrder(String variety, int numboxes)
    {
        this.variety = variety;
        this.numboxes = numboxes;
    }

    /**
     * Allows the variety to be found in another class
     *
     * @return The variety
     */
    public String getVariety()
    {
        return variety;
    }
    
    /**
     * Allows the number of boxes to be found in another class
     * 
     * @return The number of boxes
     */
    public int getNumBoxes()
    {
        return numboxes;
    }
    
    /**
     * Prints the variety followed by the number of boxes
     */
    public void printOrder() {
        System.out.println(variety + " " + numboxes);
    }

}
