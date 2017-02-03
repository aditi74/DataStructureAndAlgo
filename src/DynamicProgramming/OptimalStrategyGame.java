package DynamicProgramming;

/**
 * Created by vikram on 4/2/17.
 * Problem statement: Consider a row of n coins of values v1 . . . vn, where n is even.
 * We play a game against an opponent by alternating turns.
 * In each turn, a player selects either the first or last coin from the row, removes it from the row permanently, and receives the value of the coin. Determine the maximum possible amount of money we can definitely win if we move first.

 Note: The opponent is as clever as the user.

 Let us understand the problem with few examples:

 1. 5, 3, 7, 10 : The user collects maximum value as 15(10 + 5)

 2. 8, 15, 3, 7 : The user collects maximum value as 22(7 + 15)


 *
 */
public class OptimalStrategyGame {
    public static void main(String[] args) {
        int[] arr= {5,3,7,10};
        OptimalStrategyGame optimalStrategyGame= new OptimalStrategyGame();
        System.out.println(optimalStrategyGame.optimalStrategy(arr,0,3));

    }

    public int optimalStrategy(int[] arr, int i,int j)
    {
        if (i==j)
           return arr[i];

        if (i+1==j)
            return Math.max(arr[i],arr[j]);  //if only 2 elements present, since player 1 has 1st turn


        return Math.max(arr[i]+ Math.min(optimalStrategy(arr,i+1,j-1),optimalStrategy(arr,i+2,j)),arr[j]+Math.min(optimalStrategy(arr,i,j-2),optimalStrategy(arr,i+1,j-1)));

    }

}
