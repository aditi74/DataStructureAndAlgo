package DynamicProgramming;

import java.util.List;

/**
 * Created by vikram on 3/2/17.
 * Given an unsorted array of integers, find the length of longest increasing subsequence.

 For example, given [10, 9, 2, 5, 3, 7, 101, 18],
 the longest increasing subsequence is [2, 3, 7, 101]. Therefore the length is 4.
 */
public class LongestIncreasingSubsequence {


    public static void main(String[] args) {

    }


    public int longestIS(int[] arr)
    {
      int[] LIS= new int[arr.length];

        for (int i=0;i<arr.length;i++)
        {
            LIS[i]=0;
        }
        int maxlis=0;

        for (int m=1;m<arr.length;m++)
        {
            for (int n=0;n<m;n++)
            {
                if(arr[m] > arr[n])
                {
                    LIS[m]= Math.max(LIS[m],LIS[n]+1);

                }
            }
            if (maxlis<LIS[m])
            {
                maxlis=LIS[m];
            }

        }
       return maxlis;
    }
}
