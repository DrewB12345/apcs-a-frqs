
/**
 * Write a description of class StudentAdvance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentAdvance extends Advance
{
    /**
     * Constructor for objects of class StudentAdvance
     */
    public StudentAdvance(int days)
    {
        super(days);
    }

    /**
     * Returns the price of the ticket. If purchased in advance, student tickets cost half the price
     * of a normal ticket.
     *
     * @return The price of the ticket
     */
    public double getPrice()
    {
        return super.getPrice() / 2.0;
    }
    
    /**
     * Returns info about the ticket as well as indicating that a student ID is required
     * 
     * @return Information about the ticket
     */
    public String toString() {
        return super.toString() + "\n(student ID required)";
    }
}
