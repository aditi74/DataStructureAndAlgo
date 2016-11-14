package LeetCode;

/**
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

 For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

 Note:
 You must do this in-place without making a copy of the array.
 Minimize the total number of operations.
 * Created by aditi on 12/11/16.
 */
/**
 * Created by aditi on 31/10/16.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums={0, 1, 0, 3, 12};
        MoveZeroes move= new MoveZeroes();
        move.moveZeroes(nums);

    }
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=1;

        for (int i=0;i< nums.length;i++)
        {
            if (end <nums.length && nums[end]==0 )
            {
                while(nums[end]!=0 )
                {
                    end++;


                }
            }
            if (end== nums.length)
                return ;
            if (nums[start]==0){
                int temp= nums[start];
                nums[start]=nums[end];
                nums[end]=0;
                end++;
            }


            start++;





        }
        return;


    }

}
