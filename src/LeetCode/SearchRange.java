package LeetCode;

/**
 * Created by vikram on 11/2/17.'
 * Given an array of integers sorted in ascending order, find the starting and ending position of a given target value.

 Your algorithm's runtime complexity must be in the order of O(log n).

 If the target is not found in the array, return [-1, -1].

 For example,
 Given [5, 7, 7, 8, 8, 10] and target value 8,
 return [3, 4].
 */
public class SearchRange {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};

     SearchRange searchRange= new SearchRange();
      int[]  arr= searchRange.searchRangeInArray(nums,8);

        for (int i=0;i<2;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public int[] searchRangeInArray(int[] nums, int target) {




        int[] result= new int[2];
        //searching for start

        result[0]=-1;
        result[1]=-1;
        int start=0;
        int end= nums.length-1;
        while (start<=end)
        {
            int mid=(start+end)/2;

            if (nums[mid]==target )
            {
                if((mid-1>=0 && nums[mid-1]!=target) || (mid-1==-1)) {
                    result[0] = mid;
                    break;
                }

                else
                    end--;
            }

            else if (nums[mid]>target)
            {
                end=mid-1;
            }

            else
                start=mid+1;


        }

        start=0;
        end=nums.length-1;

        while (start<=end)
        {
            int mid=(start+end)/2;

            if (nums[mid]==target)
            {
                 if((mid+1<nums.length && nums[mid+1]!=target) ||(mid+1==nums.length))
                 {
                result[1]=mid;
                break;}
                else
                    start++;


            }

            else if (nums[mid]>target)
            {
                end=mid-1;
            }

            else
                start=mid+1;


        }


return result;

        //searching for end
    }


}
