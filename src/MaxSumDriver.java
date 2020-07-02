
/**
 * CISC 380
 * Algorithms Assignment 3 EXTRA CREDIT
 * <p>
 * Driver file for the MaxSum class
 * Tests the maxSumSubarray method.
 * <p>
 * <p>
 * This driver file contains a single example test case to get you started.
 * You should include more test cases to ensure that your implemenetation works correctly.
 * You do NOT need to submit this file.
 *
 * @author Daniel Taufiq
 * Due Date: 03/16/2020
 */


public class MaxSumDriver
{
    public static void main(String[] args)
    {
        try
        {
            // test positive and negative numbers
            int[] array = {10, -5, 40, 10};
            System.out.println("Expected: 55 " +"Actual: " + MaxSum.maxSumSubarray(array));
            // test negative numbers
            int[] array2 = {-1, -2, -3};
            System.out.println("Expected: -1 " +"Actual: " +MaxSum.maxSumSubarray(array2));
            // test null array
            int[] array3 = null;
            System.out.println("Expected: 0 " +"Actual: " +MaxSum.maxSumSubarray(array3));
            // test empty array
            int[] array4 = {};
            System.out.println("Expected: 0 " +"Actual: " +MaxSum.maxSumSubarray(array4));
            // test all positive numbers
            int[] array5 = {1, 2, 3, 4, 5, 6};
            System.out.println("Expected: 21 " +"Actual: " +MaxSum.maxSumSubarray(array5));
        } catch (Exception e)
        {
            e.printStackTrace();
        }

    }//main


}