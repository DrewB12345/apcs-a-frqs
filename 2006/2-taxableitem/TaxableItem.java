
/**
 * Write a description of class TaxableItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class TaxableItem implements Item
{
    // instance variables - replace the example below with your own
    private double taxRate;
    private double listPrice;

    /**
     * Constructor for objects of class TaxableItem
     * 
     * @param rate The tax rate
     */
    public TaxableItem(double taxRate)
    {
        this.taxRate = taxRate;
    }

    public abstract double getListPrice();
    
    /**
     * Returns the price of the item including the tax
     *
     * @return The price of the item including the tax
     */
    public double purchasePrice()
    {
        return getListPrice() * (taxRate + 1.00);
    }
}
