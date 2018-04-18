
/**
 * Write a description of class ClimbInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbInfo
{
    private String peakName;
    private int climbTime;

    /**
     * Constructor for objects of class ClimbInfo
     * 
     * @param peakName The peak's name
     * @param climbTime The amount of time it took to climb
     */
    public ClimbInfo(String peakName, int climbTime)
    {
        this.peakName = peakName;
        this.climbTime = climbTime;
    }

    /**
     * Returns the peak's name
     *
     * @return peakName
     */
    public String getName()
    {
        return peakName;
    }

    /**
     * Returns the climb time
     *
     * @return climbTime
     */
    public int getTime()
    {
        return climbTime;
    }
    
    /**
     * Prints peakName and climbTime
     */
    public void printThis() {
        System.out.println(this.peakName);
        System.out.println(this.climbTime);
        System.out.println();
    }
}
