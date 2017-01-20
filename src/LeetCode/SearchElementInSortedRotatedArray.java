package LeetCode;

/**
 * Created by vikram on 20/1/17.
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

 (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

 You are given a target value to search. If found in the array return its index, otherwise return -1.

 You may assume no duplicate exists in the array.
 */
public class SearchElementInSortedRotatedArray {


    public static void main(String[] args) {
        int[] arr={1,3};

        SearchElementInSortedRotatedArray sortedRotatedArray= new SearchElementInSortedRotatedArray();
        System.out.println(sortedRotatedArray.search(arr,3));
    }

    public int search(int[] nums, int target) {

        if (nums.length==0 || nums==null)
            return -1;
       return binarySearch(nums,0,nums.length-1,target);

    }

    public int binarySearch(int[] nums,int start,int end , int target)
    {



        if (start<=end)
        {
            int mid= (start+end)/2;

            if (nums[mid]==target)
                return mid;

            if (nums[start]<=nums[mid] )  //first half is sorted
            {
                if (target>=nums[start] && target<nums[mid])
                    return binarySearch(nums,start,mid-1,target);
                else
                    return binarySearch(nums,mid+1,end,target);



            }

            else  //later half is sorted
            {
                if (target> nums[mid] && target<=end)
                    return binarySearch(nums,mid+1,end,target);
                else
                    return binarySearch(nums,start,mid-1,target);




            }



        }

return -1;

    }

}


