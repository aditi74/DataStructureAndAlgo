package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by vikram on 12/1/17.
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 You may assume that each input would have exactly one solution.

 Given nums = [2, 7, 11, 15], target = 9,

 Because nums[0] + nums[1] = 2 + 7 = 9,
 return [0, 1].
 */
public class TwoSum {

  // Two pass
   // first putting the elements and then checking for it

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> map= new HashMap<>();
        int[] result= new int[2];
        for (int i = 0; i < nums.length; i++)
        {
          map.put(nums[i],i);

        }



        for(int k=0;k< nums.length;k++)
        {
            int currValue= target-nums[k];
            if (map.containsKey(currValue) && map.get(currValue)!= k )
            {
                result[0]=k;
                result[1]=map.get(currValue);


            }


        }
        Arrays.sort(result);
        return result;
    }



    //while putting map

    public int[] twoSumWithOnePass(int[] nums,int target)
    {
        int[] result= new int[2];
        int currTarget=0;

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            currTarget =target-nums[i];
            if (map.containsKey(currTarget))
            {
                result[0]=map.get(currTarget);
                result[1]=i;
                return result;
            }
            map.put(nums[i],i);



        }
    return result;


    }
}
