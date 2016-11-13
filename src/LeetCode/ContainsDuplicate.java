package LeetCode;

import java.util.HashSet;

/**
 * Created by vikram on 13/11/16.
 * Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 */
public class ContainsDuplicate {


    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hset= new HashSet<>();


        for (int i=0;i<nums.length;i++)
        {
            if (hset.contains(nums[i]))
                return true;
            else
                hset.add(nums[i]);
        }
        return false;
    }
}
