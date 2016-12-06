package LeetCode;

/**
 *
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.

 Do not allocate extra space for another array, you must do this in place with constant memory.

 For example,
 Given input array nums = [1,1,2],

 Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively. It doesn't matter what you leave beyond the new length.


 * Created by vikram on 4/12/16.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int dup=0;
        int next=1;

        if (nums.length==0 || nums.length==1)
            return nums.length;




        while (next< nums.length)
        {
            if (nums[dup]== nums[next])
            {
                next++;

            }

            else
            {
                dup++;
                nums[dup]= nums[next];
                next++;
            }



        }

        return dup+1;




    }

}


