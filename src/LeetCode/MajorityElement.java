package LeetCode;

/**
 * Created by vikram on 15/11/16.
 * Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

 You may assume that the array is non-empty and the majority element always exist in the array.
 */
public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement MmajorityElement= new MajorityElement();
        int[] arr={3,2,3};
        System.out.println(MmajorityElement.majorityElement(arr));
    }

    //Boyer Moore Algorithm
    //Find the candidate (maximum frequency)
    // and then check whether the candidate is majority or not
    public int majorityElement(int[] nums) {
        int candidate=0,count=0;

        for (int i=0;i<nums.length;i++)
        {
            if (count==0)
            {
                candidate= nums[i];
                count++;
            }

            else {
                if (nums[i]!=candidate)
                    count--;
                else
                    count++;

            }


        }

        if (count==0)
            return 0;

        int counter=0;
        // check if element is Majority

        for (int k=0;k<nums.length;k++)
        {
            if (nums[k]==candidate)
                counter++;

        }

        if (counter >(nums.length/2))
            return candidate;

        else
            return 0;


    }
}
