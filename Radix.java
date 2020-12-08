import java.util.*;
public class Radix
{
    /** 
     * postcondition:  returns kth digit of number
     */
    private static int getDigit(int number, int k)
    {   
        for(int i = 0; i < k; i++)
        {
            number /= 10;
        }
        return number%10;

    }

    /**
     * precondition:   nums.length > 0; all values in list are positive;
     *                 k >= 0
     * postcondition:  returns an array of 10 queues;
     *                 all values in nums array should be put in proper
     *                 queue based upon the kth digit
     */ 
    private static Queue[] itemsToQueues(int[] nums, int k)
    {
        return null;
    }

    /**
     * precondition:   ques.length is 10
     * postcondition:  returns an array that contains the integers
     * from ques[0] through ques[9] in the order in which
     * they were stored in the queues.
     * The queues in ques should now be empty
     */ 

    private static int[] queuesToArray(Queue[] ques, int numVals)
    {
        return null;
    }

    /**
     * precondition:   nums.length > 0; all values in nums are positive;
     *                 the largest value in nums has numDigits digits
     * postcondition:  returns an array of all the values found in nums, 
     *                 sorted in nondecreasing order using a radix sort
     */ 

    public static int[] sort(int[] nums, int numDigits)
    {
        return nums;
    }

}