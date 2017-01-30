package DynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by vikram on 17/11/16.
 * Objec­tive: Given a set of coins and amount, Write an algo­rithm to find out how many ways we can make the change of the amount using the coins given.
 * Amount = 5

 coins [] = {1,2,3}

 Ways to make change = 5

 {1,1,1,1,1} {1,1,1,2}, {1,2,2}, {1,1,3} {2,3}
 */
public class CoinChangeProblem {

//m is current amount , n is the total amount
    // S is the array

    public static void main(String[] args) {
        CoinChangeProblem coinChangeProblem= new CoinChangeProblem();
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3));
        System.out.println(coinChangeProblem.coinChange(arr,5));
    }
    public int coinChangeRecursive(int[] S,int m,int n)
    {
        //either include the coin or exclude the coin
        if (n==0)
            return 1;
        if (n>0 && m==0)
            return 0;
        if (n<0)
            return 0;

        return coinChangeRecursive(S,m,n-S[m])+coinChangeRecursive(S,m-1,n);




    }

    public int coinChange(ArrayList<Integer> a, int n)
    {
        long[][] matrix= new long[a.size()+1][n+1];

       // for (int i=0;i<)
        int rows=a.size()+1;
        int cols= n+1;

        matrix[0][0]=1l;
        for (int i=1;i<cols;i++)
        {

            matrix[0][i]=0l;
        }
        for (int j=1;j<rows;j++)
        {
            matrix[j][0]=1l;
        }



        for (int k=1;k<rows;k++)
        {
            for (int l=1;l<cols;l++)
            {

                if(l-a.get(k-1)>=0)
                {
                    matrix[k][l]= matrix[k-1][l]+matrix[k][l-a.get(k-1)];//picking up
                    //System.out.println(matrix[k][l]);
                }
                else
                    matrix[k][l]=matrix[k-1][l];//excluding the coin

            }

        }


        if (matrix[rows-1][cols-1]<Integer.MAX_VALUE)

        {
            int va= (int) (matrix[rows - 1][cols - 1]);
            return va;
        }

        else
            return (int) (matrix[rows-1][cols-1]%1000007);
    }



}
