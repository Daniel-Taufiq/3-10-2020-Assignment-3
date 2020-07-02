
/**
 * CISC 380
 * Algorithms Assignment 3 EXTRA CREDIT
 *
 *
 * Implements an iterative dynamic programming solution to find the subarray of maximum sum, of a given array of numbers.
 *
 * @author Daniel Taufiq
 * Due Date: 03/16/2020
 *
 */


public class MaxSum{

    /**
     * Returns the sum of the subarray with the maximum sum from the given array of integers.
     *
     *
     * @param a an array of integers
     * @return the sum of the subarray with the maximum sum.
     */

    public static int maxSumSubarray(int[] a)
    {
        if (a == null)
        {//if a is null return 0
            return 0;
        }
        else if (a.length == 0)
        {//if a has no values return 0
            return 0;
        }

        int[] maxSum = new int[a.length];//initalize MaxSum array

        maxSubArray(a, a.length-1, maxSum);

        int totalMax = Integer.MIN_VALUE;//set totalMax to 0
        for(int i = 0; i < maxSum.length; i++)
        {
            totalMax = Math.max(maxSum[i], totalMax);//get the max overall so far
        }
        return totalMax;
    }//maxSumSubarray

    private static int maxSubArray(int[] arr, int position, int[] maxSum)
    {
        if(position == 0)
        {
            maxSum[0] = arr[0];
            return maxSum[0];
        }
        else
        {
            maxSum[position] = Math.max(maxSubArray(arr, position-1, maxSum)+ arr[position], arr[position]);//get the max for that location
            return maxSum[position];
        }

    }//maxSub

}//class