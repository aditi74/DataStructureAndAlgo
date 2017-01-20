package LeetCode;

import DynamicProgramming.MinimumCoinChange;

/**
 * Created by vikram on 20/1/17.
 *
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).


 Find the minimum element.

 You may assume no duplicate exists in the array.
 */
public class MinimumInSortedRotatedArray {


    public static void main(String[] args) {
        MinimumInSortedRotatedArray minimumInSortedRotated= new MinimumInSortedRotatedArray();

        int[] arr={3,1,2};
        System.out.println(minimumInSortedRotated.findMin(arr));


    }
    public int findMin(int[] nums) {


        if( nums.length==0 ||nums==null)
            return -1;
         return binarySearchSortedArray(nums,0,nums.length-1);

    }


    public int binarySearchSortedArray(int[] nums,int start,int end)
    {

        if (start<=end)

        {
            if (nums[start]<=nums[end])
                 return start;

            int mid=(start+end)/2;
            System.out.println(mid);

            if (nums[start]<=nums[mid])//already sorted

                return binarySearchSortedArray(nums,mid+1,end);
            else
                return binarySearchSortedArray(nums,start,mid);

/* if(nums[m]>=nums[i]){
            i=m+1;
        }else{
            j=m;
        }*/
        }

      return -1;



    }


}
