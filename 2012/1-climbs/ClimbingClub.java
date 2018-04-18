
/**
 * Write a description of class ClimbingClub here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class ClimbingClub
{
    private ArrayList<ClimbInfo> climbList;

    /**
     * Constructor for objects of class ClimbingClub
     */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    /**
     * Adds a climb to climbList; climbs are added alphabetically based on the peak's name
     *
     * @param peakName The name of the peak in the new climb
     * @param climbTime The time of the new climb
     */
    public void addClimb(String peakName, int climbTime)
    {
        ClimbInfo c = new ClimbInfo(peakName, climbTime);
        if (climbList.size() == 0) climbList.add(c);
        else {
            boolean done = false;
            int i = 0;
            String name = c.getName();
            while (!done && i < climbList.size()) {
                String name2 = climbList.get(i).getName();
                if (name.compareTo(name2) <= 0) {
                    climbList.add(i,c);
                    done = true;
                }
                i++;
            }
            if (!done) climbList.add(c);
        }
    }
    
    /**
     * Finds how many different peaks were climbed
     * 
     * @return The number of distinct names in the list of climbs
     */
    public int distinctPeakNames() {
        if (climbList.size() == 0) return 0;
        ClimbInfo currInfo = climbList.get(0);
        String prevName = currInfo.getName();
        String currName = null;
        int numNames = 1;
        
        for (int k=1; k<climbList.size(); k++) {
            currInfo = climbList.get(k);
            currName = currInfo.getName();
            if (prevName.compareTo(currName) != 0) {
                numNames++;
                prevName = currName;
            }
        }
        return numNames;
    }
    
    /**
     * Prints each ClimbInfo object in climbList
     */
    public void printThis() {
        for (ClimbInfo c : climbList) c.printThis();
    }
}
