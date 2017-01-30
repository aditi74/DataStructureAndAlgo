package DynamicProgramming;

/**
 * Created by vikram on 31/1/17.
 * Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

 For example, given the array [−2,1,−3,4,−1,2,1,−5,4], the contiguous subarray [4,−1,2,1] has the largest sum = 6.
                               -2,1,-2,4,3,5,6,1,5
 */
public class MaximumSubArray
{

    public static void main(String[] args) {

    }

    public int maxSubArr(int[] nums)
    {
        if (nums.length==0)
            return 0;

        int[] sum= new int[nums.length];

        sum[0]=nums[0];
        int max=sum[0];

        for (int i=1;i<nums.length;i++)
        {
            sum[i]= Math.max(sum[i-1]+nums[i],nums[i]);
            max=Math.max(max,sum[i]);

        }
        return max;

    }
}
