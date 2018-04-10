
/**
 * Write a description of class DiverseArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiverseArray
{
    /**
     * Constructor for objects of class DiverseArray
     */
    public DiverseArray()
    {
        
    }

    /**
     * Adds up each number in an array of integers
     *
     * @param arr The array of numbers to be used
     * @return The sum of the array's numbers
     */
    public static int arraySum(int[] arr)
    {
        int sum = 0;
        for (int n : arr) sum += n;
        return sum;
    }
    
    /**
     * Finds the sum of each row and creates an array with the sums
     * 
     * @param arr2D The 2D array that will be checked
     * @return An array containing the sums of each row
     */
    public static int[] rowSums(int[][] arr2D) {
        int[] result = new int[arr2D.length];
        for (int i=0; i<result.length; i++) result[i] = arraySum(arr2D[i]);
        return result;
    }
    
    /**
     * Determines whether an array is "diverse." An array is diverse if no sums are repeated.
     * 
     * @param arr2D The 2D array that will be checked
     * @return A statement that determines the array's diversity
     */
    public static boolean isDiverse(int[][] arr2D) {
        int[] sums = rowSums(arr2D);
        for (int i=0; i<sums.length; i++) {
            for (int j=i+1; j<sums.length; j++) if (sums[i] == sums[j]) return false;
        }
        return true;
    }
    
    /**
     * Prints an array
     * 
     * @param arr The array you want to print
     */
    public static void printArray(int[] arr) {
        for (int n : arr) System.out.print(n + " ");
    }
}
