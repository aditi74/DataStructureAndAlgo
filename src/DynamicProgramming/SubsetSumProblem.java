package DynamicProgramming;

/**
 * Created by vikram on 13/3/17.
 * Detect if a subset from a given set of N non-negative integers sums upto a given value S.
 Example:
 Set: {1, 3, 9, 2}, S = 5
 Output: trued
 */

public class SubsetSumProblem {
    public static void main(String[] args) {

        int[] arr= {1,3,9,2};
        SubsetSumProblem subsetSumProblem= new SubsetSumProblem();
        subsetSumProblem.detectSubset(arr,5);

    }


    public void detectSubset(int[] arr,int num)
    {
        boolean[][] matrix= new boolean[arr.length+1][num+1];
        int rows= arr.length+1;
        int cols= num+1;

        for (int i=0;i<cols;i++)
        {
            matrix[0][i]=false;
        }

        for (int i=0;i<rows;i++)
        {
            matrix[i][0]= true;  //empty set can always be formed
        }


        for (int i=1;i<rows;i++)
        {

            for (int j=1;j<cols;j++)
            {
                if (j<arr[i-1])
                     matrix[i][j]= matrix[i-1][j];

                else
                    matrix[i][j]= matrix[i-1][j] || matrix[i-1][j-arr[i-1]];


            }

        }

        System.out.println(matrix[rows-1][cols-1]);




    }



}
