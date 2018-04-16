
/**
 * Write a description of class Drink here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Drink implements MenuItem
{
    private String name;
    private double price;

    /**
     * Constructor for objects of class Drink
     * 
     * @param name The order's name
     * @param price The price of the order
     */
    public Drink(String name, double price)
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
