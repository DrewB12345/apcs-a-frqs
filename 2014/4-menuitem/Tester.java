
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        Sandwich sandwich1 = new Sandwich("Chicken", 2.50);
        Salad salad1 = new Salad("Extra Healthy", 3.00);
        Salad salad2 = new Salad("Straight from McDonald's", 1.50);
        Drink drink1 = new Drink("Soda", 2.00);
        Trio t1 = new Trio(sandwich1, salad1, drink1);
        Trio t2 = new Trio(sandwich1, salad2, drink1);
        System.out.println(t1.getName());
        System.out.println(t1.getPrice());
        System.out.println(t2.getName());
        System.out.println(t2.getPrice());
    }
}
