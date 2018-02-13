
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        NumberCube n = new NumberCube();
        
        System.out.println(n.toss());
        
        int[] nums1 = n.getCubeTosses(n, 10);
        for (int i:nums1) System.out.print(i + " ");
        System.out.println();
        System.out.println(n.getLongestRun(nums1));
        
        int[] nums2 = n.getCubeTosses(n, 30);
        for (int i:nums2) System.out.print(i + " ");
        System.out.println();
        System.out.println(n.getLongestRun(nums2));
    }
}
