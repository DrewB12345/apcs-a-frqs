
/**
 * Write a description of class Trio here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trio implements MenuItem
{
    private Sandwich sandwich;
    private Salad salad;
    private Drink drink;

    /**
     * Constructor for objects of class Trio
     * 
     * @param sandwich The sandwich
     * @param salad The salad
     * @param drink The drink
     */
    public Trio(Sandwich sandwich, Salad salad, Drink drink)
    {
        this.sandwich = sandwich;
        this.salad = salad;
        this.drink = drink;
    }

    public String getName() {
        return sandwich.getName() + "/" + salad.getName() + "/" + drink.getName() + " Trio";
    }
    
    public double getPrice() {
        double p1 = sandwich.getPrice();
        double p2 = salad.getPrice();
        double p3 = drink.getPrice();
        if (p1 <= p2 && p1 <= p3) return p2 + p3;
        else if (p2 <= p1 && p2 <= p3) return p1 + p3;
        return p1 + p2;
    }
}
