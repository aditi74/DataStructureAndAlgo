package DynamicProgramming;

import java.util.Arrays;

/**
 * Created by vikram on 9/12/16.
 * You are given coins of different denominations and a total amount of money amount. Write a function to compute the fewest number of coins that you need to make up that amount. If that amount of money cannot be made up by any combination of the coins, return -1.

 Example 1:
 coins = [1, 2, 5], amount = 11
 return 3 (11 = 5 + 5 + 1)

 Example 2:
 coins = [2], amount = 3
 return -1.
 */
public class MinimumCoinChange {


    public static void main(String[] args) {

        int[] arr={1};

        MinimumCoinChange minimumCoinChange= new MinimumCoinChange();
        System.out.println( minimumCoinChange.coinChange(arr,1));
    }


    public int coinChange(int[] coins, int amount) {
        // Create an array and populate its value with infinity

        int[] minCoinRequired = new int[amount+1];
        Arrays.fill(minCoinRequired,9999);
        minCoinRequired[0]=0;


        for (int i=1;i<=amount;i++)
        {

            for (int j=0;j<coins.length;j++)
            {
                if (i>=coins[j])
               minCoinRequired[i]= Math.min(minCoinRequired[i],1+minCoinRequired[i-coins[j]]);



            }



        }

        return minCoinRequired[minCoinRequired.length-1]==9999? -1:minCoinRequired[minCoinRequired.length-1];
    }
}


