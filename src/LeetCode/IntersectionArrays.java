package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.jar.Pack200;

/**
 * Created by aditi on 13/11/16.
 *
 * Given two arrays, write a function to compute their intersection.

 Example:
 Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2, 2].


 */
public class IntersectionArrays {

    public static void main(String[] args) {
        int[] arrA={1,2,2,1};
        int[] arrB={1,1};

        IntersectionArrays intersectionArrays= new IntersectionArrays();
        int[] arr =intersectionArrays.intersect(arrA,arrB);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);


    }
    public int[] intersect(int[] nums1, int[] nums2) {

        int lenA= nums1.length;
        int lenB= nums2.length;
        if (nums1.length==0 || nums2.length==0)
            return new int[0];

        ArrayList<Integer> arrayList= new ArrayList<>();


        if (lenA <lenB)
        {

            Arrays.sort(nums2);
            for (int i=0;i< nums1.length;i++)
            {
                if (BinarySearch(nums2,0,nums2.length-1,nums1[i]))
                   // res[k++]=nums1[i];
                arrayList.add(nums1[i]);
            }



        }

        else
        {
            Arrays.sort(nums1);

            for (int j=0;j< nums2.length;j++)
            {
                if (BinarySearch(nums1,0,nums1.length-1,nums2[j]))
                    arrayList.add(nums2[j]);
            }



        }

        int[] res = new int[arrayList.size()];
        for (int i=0;i< arrayList.size();i++)
        {
            res[i]= arrayList.get(i);
        }
        return res;







    }



    public boolean BinarySearch(int[] arr, int low,int high,int num)
    {
        if (low<=high)
        {
            int mid= (low+high)/2;

            if (arr[mid]== num)
            {

                arr[mid]=-11;
                Arrays.sort(arr);
                return true;
            }
            else if (arr[mid] > num)
                return BinarySearch(arr, low, mid-1,num);
            else
               return BinarySearch(arr,mid+1,high,num);



        }
        return false;



    }
}
