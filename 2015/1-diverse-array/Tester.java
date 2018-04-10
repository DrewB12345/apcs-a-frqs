
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String[] args) {
        int[] nums1 = {1, 3, 2, 7, 3};
        int[] nums2 = {10, 10, 4, 6, 2};
        int[] nums3 = {5, 3, 5, 9, 6};
        int[] nums4 = {7, 6, 4, 2, 1};
        int[][] bignums = new int[4][5];
        bignums[0] = nums1;
        bignums[1] = nums2;
        bignums[2] = nums3;
        bignums[3] = nums4;
        System.out.println(DiverseArray.arraySum(nums1));
        DiverseArray.printArray(DiverseArray.rowSums(bignums));
        System.out.println();
        System.out.println(DiverseArray.isDiverse(bignums));
    }
}
