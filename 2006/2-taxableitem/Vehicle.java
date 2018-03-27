
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle extends TaxableItem
{
    // instance variables - replace the example below with your own
    private double dealerCost;
    private double dealerMarkup;

    /**
     * Constructor for objects of class Vehicle
     * 
     * @param dealerCost The dealer cost
     * @param dealerMarkup The dealer markup
     * @param taxRate The tax rate of the thing
     */
    public Vehicle(double dealerCost, double dealerMarkup, double taxRate)
    {
        super(taxRate);
        this.dealerCost = dealerCost;
        this.dealerMarkup = dealerMarkup;
    }

    /**
     * Returns the list price, which is the price before tax is added
     * 
     * @return The list price
     */
    public double getListPrice() {
        return dealerCost + dealerMarkup;
    }
    
    /**
     * Replaces the current dealer markup with the new given markup
     *
     * @param markup The new markup
     */
    public void changeMarkup(double markup)
    {
        dealerMarkup = markup;
    }
    
    public double purchasePrice() {
        return super.purchasePrice();
    }
}
