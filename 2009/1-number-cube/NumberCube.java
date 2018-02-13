
/**
 * Write a description of class NumberCube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumberCube
{
    // instance variables - replace the example below with your own

    /**
     * Constructor for objects of class NumberCube
     */
    public NumberCube()
    {

    }

    /**
     * Tosses the number cube
     *
     * @return A random value from one to six, inclusive
     */
    public int toss() {
        return (int)(Math.random() * 6 + 1);
    }
    
    /**
     * Creates an array of values produced by the toss() function
     * 
     * @param cube The number cube to be rolled
     * @param numTosses The number of times the number cube will be rolled
     * @return An array of numTosses values, each randomly generated via the toss() function
     */
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        int[] nums = new int[numTosses];
        for (int i=0; i<nums.length;i++) nums[i] = cube.toss();
        return nums;
    }
    
    /**
     * Finds the location of the longest run; a run is when the same number is produced consecutively
     * 
     * @param values The array that will be checked for runs
     * @return The location of the start of the longest run; will be -1 if no runs are present
     */
    public static int getLongestRun(int[] values) {
        int loc = -1;
        int highest = 1;
        int count = 1;
        for (int i=values.length-1; i>=0; i--) {
            if (i != 0) {
                if (values[i] == values[i-1]) count++;
                else {
                    if (count > highest) {
                        highest = count;
                        loc = i;
                    }
                    count = 1;
                }
            }
            else {
                if (count > highest) return 0;
            }
        }
        return loc;
    }
}
