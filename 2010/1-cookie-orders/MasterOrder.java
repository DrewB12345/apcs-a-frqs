
/**
 * Write a description of class MasterOrder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class MasterOrder
{
    // instance variables - replace the example below with your own
    private ArrayList<CookieOrder> orders;

    /**
     * Constructor for objects of class MasterOrder
     */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }

    /**
     * Adds an order to the master order
     */
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }
    
    /**
     * Finds the total number of boxes
     * 
     * @return The total number of boxes
     */
    public int getTotalBoxes() {
        int total = 0;
        for (CookieOrder order:orders) total += order.getNumBoxes();
        return total;
    }
    
    /**
     * Removes each order with the given variety
     * 
     * @param cookieVar The variety that will be removed
     * @return The number of boxes that were removed
     */
    public int removeVariety(String cookieVar) {
        int removed = 0;
        for (int i = orders.size()-1; i >= 0; i--) {
            if (orders.get(i).getVariety().equals(cookieVar)) {
                removed += orders.get(i).getNumBoxes();
                orders.remove(i);
            }
        }
        return removed;
    }
    
    /**
     * Prints each order
     */
    public void printOrders() {
        for (CookieOrder n:orders) n.printOrder();
    }
}
