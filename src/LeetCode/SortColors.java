package LeetCode;

/**
 * Created by vikram on 6/3/17.
 * Given an array with n objects colored red, white or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white and blue.

 Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 */
public class SortColors {
    public void sortColors(int[] nums) {

        int low = 0, high = nums.length - 1;

        for (int i = 0; i <= high; ) {
            if (nums[i] == 0) {
                //swap it with low

                int lowvar = nums[low];
                nums[low] = nums[i];
                nums[i] = lowvar;
                i++;
                low++;


            } else if (nums[i] == 2) {
                int highVar = nums[high];

                nums[high] = 2;
                nums[i] = highVar;
                high--;


            } else
                i++;


        }
    }


}
