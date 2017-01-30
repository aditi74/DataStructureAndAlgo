package DynamicProgramming;

/**
 * Created by vikram on 19/1/17.
 * Given an array of integers, you can maximum jump a[i] positions from given index i. Find minimum number of jumps to reach end of array. For example, in following array, minimum number of jumps is 2.

 minimum number of jumps to reach end


 */
public class MinJumPGame {

    public static void main(String[] args) {
        int[] arr= {0,1,3,5,6,8,12,17};
        MinJumPGame minJumPGame= new MinJumPGame();
        System.out.println(minJumPGame.MinJumps(arr));


    }

public int MinJumps(int[] arr)
{
    int[] jumps= new int[arr.length];

    for(int k=0;k<arr.length;k++)
    {
        jumps[k]=99999;
    }

    jumps[0]=0;
    for (int i=1;i<jumps.length;i++)
    {
        for(int j=0;j<i;j++)
        {
            if (arr[j]-i +j >= 0 && jumps[i]>jumps[j]+1 )
            {
                jumps[i]=jumps[j]+1;
            }

        }


    }

    return jumps[arr.length-1];


}


}
