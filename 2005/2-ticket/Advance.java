
/**
 * Write a description of class Advance here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Advance extends Ticket
{
    // instance variables - replace the example below with your own
    private int days;

    /**
     * Constructor for objects of class Advance
     */
    public Advance(int days)
    {
        this.days = days;
    }

    /**
     * Returns the price of the ticket. If the ticket was purchased ten or more days in advance, its
     * price is $30. Otherwise, it's $40.
     *
     * @return The price of the ticket
     */
    public double getPrice()
    {
        if (days >= 10) return 30.0;
        else return 40.0;
    }
}
