package DynamicProgramming;

/**
 * Created by vikram on 5/12/16.
 * Problem: given n, find the number of different ways to write
 n as the sum of 1, 3, 4
 ◮ Example: for n = 5, the answer is 6
 5 = 1 + 1 + 1 + 1 + 1
 = 1 + 1 + 3
 = 1 + 3 + 1
 = 3 + 1 + 1
 = 1 + 4
 = 4 + 1
 */
public class CountDistinctWaysOfSum {
    public static void main(String[] args) {

    }

    public int countWays(int n)
    {
        int[] countWays= new int[n+1];
        countWays[0]=countWays[1]=countWays[2]=1;
        countWays[3]=2;

        countWays[4]=4;

        for (int i=5;i<=n;i++)
        {
            countWays[i]=countWays[i-1]+countWays[i-3]+countWays[i-4];
        }

      return countWays[n];

    }
}
