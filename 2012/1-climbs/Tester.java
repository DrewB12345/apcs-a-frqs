
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        ClimbingClub c = new ClimbingClub();
        c.addClimb("Monadnock", 274);
        c.addClimb("Whiteface", 301);
        c.addClimb("Algonquin", 225);
        c.addClimb("Monadnock", 344);
        c.printThis();
        System.out.println(c.distinctPeakNames());
    }
}
