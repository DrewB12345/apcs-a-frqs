
/**
 * Write a description of class BatteryCharger here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BatteryCharger
{
    private int[] rateTable;

    /**
     * Constructor for objects of class BatteryCharger
     */
    public BatteryCharger(int[] rateTable)
    {
        this.rateTable = rateTable;
    }

    /**
     * Finds the total cost to charge the battery starting at startHour and for chargeTime hours
     *
     * @param startHour The hour when it starts to charge
     * @param chargeTime The amount of time the battery will be charging
     * @return The total cost to charge the battery starting at startHour and for chargeTime hours
     */
    public int getChargingCost(int startHour, int chargeTime)
    {
        int h = startHour;
        int hours = 0;
        int total = 0;
        while (hours < chargeTime) {
            if (h > 23) h = 0;
            total += rateTable[h];
            h++;
            hours++;
        }
        return total;
    }
    
    /**
     * Finds the cheapest total cost for charging a given number of hours
     * 
     * @param chargeTime The amount of time the battery will be charging
     * @return The cheapest total cost for charging chargeTime hours
     */
    public int getChargeStartTime(int chargeTime) {
        int best = getChargingCost(0, chargeTime);
        int time = 0;
        for (int i = 0; i <= 23; i++) {
            if (getChargingCost(i, chargeTime) < best) {
                best = getChargingCost(i, chargeTime);
                time = i;
            }
        }
        return time;
    }
}
