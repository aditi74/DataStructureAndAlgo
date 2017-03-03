package LeetCode;

import java.util.Arrays;

/**
 * Created by vikram on 3/3/17.
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[] arr={1,2,3};
        RotateMatrix rotateMatrix= new RotateMatrix();
        rotateMatrix.rotate(arr,1);
        System.out.println(Arrays.toString(arr));



    }
    public void rotate(int[] nums, int k) {

        if(k>=nums.length)
            k= k%nums.length;

        k=nums.length-k;
        reverseArr(nums,0,k-1);
        reverseArr(nums,k,nums.length-1);

        reverseArr(nums,0,nums.length-1);


    }


    public void reverseArr(int[] nums, int k, int l) {

        int i = k, j = l;

        while (i <= j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;


        }

    }
}