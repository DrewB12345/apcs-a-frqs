
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        CookieOrder o1 = new CookieOrder("Chocolate Chip", 1);
        CookieOrder o2 = new CookieOrder("Shortbread", 5);
        CookieOrder o3 = new CookieOrder("Macaroon", 2);
        CookieOrder o4 = new CookieOrder("Chocolate Chip", 3);
        
        MasterOrder m = new MasterOrder();
        m.addOrder(o1);
        m.addOrder(o2);
        m.addOrder(o3);
        m.addOrder(o4);
        System.out.println(m.getTotalBoxes());
        System.out.println(m.removeVariety("Chocolate Chip"));
        m.printOrders();
    }
}
