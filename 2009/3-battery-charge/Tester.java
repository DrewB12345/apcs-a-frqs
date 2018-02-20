
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        int[] costs = {50, 60, 160, 60, 80, 100, 100, 120, 150, 150, 150, 200, 40, 240, 220, 220, 200, 200, 180, 180, 140, 100, 80, 60};
        BatteryCharger b = new BatteryCharger(costs);
        System.out.println(b.getChargingCost(22, 4));
        System.out.println(b.getChargeStartTime(4));
    }
}
