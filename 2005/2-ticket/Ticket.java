
/**
 * Write a description of class Ticket here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Ticket
{
    private int serialNumber;

    /**
     * Constructor for objects of class Ticket
     */
    public Ticket()
    {
        serialNumber = getNextSerialNumber();
    }

    public abstract double getPrice();
    
    /**
     * Returns a string that shows the number and the price
     *
     * @return Number: [serialNumber] \nPrice: [price]
     */
    public String toString()
    {
        return "Number: " + serialNumber + "\nPrice: " + getPrice();
    }
    
    /**
     * Returns a random number to be used as a serial number
     * 
     * @return A random number from 100 to 999, inclusive
     */
    private static int getNextSerialNumber(){
        return 100 + (int)(Math.random() * ((999 - 100) + 1));
    }
    
    /**
     * Returns the serial number for easy access
     * 
     * @return The serial number
     */
    public int getNumber() {
        return serialNumber;
    }
}
