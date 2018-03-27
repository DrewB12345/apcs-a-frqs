
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(20000.00, 2500.00, 0.10);
        System.out.println("The vehicle's list price is " + v1.getListPrice() + ".");
        System.out.println("The vehicle's purchase price is " + v1.purchasePrice() + ".");
    }
}
