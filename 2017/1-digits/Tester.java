
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Tester
{
    public static void main(String[] args) {
        System.out.println(new Digits(0).isStrictlyIncreasing());
        System.out.println(new Digits(7).isStrictlyIncreasing());
        System.out.println(new Digits(1356).isStrictlyIncreasing());
        System.out.println(new Digits(1336).isStrictlyIncreasing());
        System.out.println(new Digits(65310).isStrictlyIncreasing());
        System.out.println(new Digits(123456789).isStrictlyIncreasing());
    }
}
