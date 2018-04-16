
/**
 * Write a description of class Sandwich here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sandwich implements MenuItem
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class Sandwich
     * 
     * @param name The order's name
     * @param price The price of the order
     */
    public Sandwich(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String getName()
    {
        return name;
    }
    
    public double getPrice() {
        return price;
    }
}
