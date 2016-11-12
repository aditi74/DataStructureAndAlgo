package LeetCode;

/**
 * Created by vikram on 3/11/16.
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * 2 2 1 3 4 3 4
 * 1
 *
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result=0;
        for (int i=0;i< nums.length;i++)
        {
            result = result ^nums[i];
        }

        return result;


    }
}
