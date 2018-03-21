
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        Walkup w1 = new Walkup();
        System.out.println(w1.getNumber());
        System.out.println(w1.toString());
        System.out.println();
        
        Advance a1 = new Advance(5);
        Advance a2 = new Advance(10);
        Advance a3 = new StudentAdvance(5);
        Advance a4 = new StudentAdvance(10);
        System.out.println(a1.toString());
        System.out.println();
        System.out.println(a2.toString());
        System.out.println();
        System.out.println(a3.toString());
        System.out.println();
        System.out.println(a4.toString());
    }
}
