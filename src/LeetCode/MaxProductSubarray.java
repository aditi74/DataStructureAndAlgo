package LeetCode;

/**
 * Created by vikram on 19/2/17.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest product.

 For example, given the array [2,3,-2,4],
 the contiguous subarray [2,3] has the largest product = 6.


 */


public class MaxProductSubarray {
    public int maxProduct(int[] nums) {
        if (nums.length==0)
            return 0;
        int[] maxProduct= new int[nums.length];
        int[] minProduct= new int[nums.length];

        maxProduct[0]=nums[0];
        minProduct[0]=nums[0];
        int maxRes= nums[0];
        int currMax=nums[0];
        int currMin=nums[0];
        for (int i=1;i<nums.length;i++)
        {
            currMax= Math.max(Math.max(maxProduct[i-1]*nums[i],minProduct[i-1]*nums[i]),nums[i]);
            currMin= Math.min(Math.min(maxProduct[i-1]*nums[i],minProduct[i-1]*nums[i]),nums[i]);

            maxRes=Math.max(currMax,maxRes);
            maxProduct[i]=currMax;
            minProduct[i]=currMin;




        }

        return maxRes;

    }


}
