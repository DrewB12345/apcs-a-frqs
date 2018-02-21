
/**
 * Write a description of class Digits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Digits
{
    private ArrayList<Integer> digitList;

    /**
     * Constructor for objects of class Digits
     */
    public Digits(int num)
    {
        digitList = new ArrayList<Integer>();
        
        do {
            digitList.add(0, num % 10);
            num /= 10;
        } while (num > 0);
    }

    /**
     * Finds whether the number is strictly increasing; this means that each digit is larger than the
     * digit to its left. The number is not strictly increasing if there are two consecutive identical
     * digits.
     *
     * @return Whether the number is strictly increasing
     */
    public boolean isStrictlyIncreasing()
    {
        if (digitList.size() > 1) {
            for (int i = 1; i < digitList.size(); i++) {
                if (digitList.get(i) <= digitList.get(i-1)) return false;
            }
        }
        return true;
    }
}
