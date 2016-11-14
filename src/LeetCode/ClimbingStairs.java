package LeetCode;

/**
 * Created by aditi on 15/11/16.
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        ClimbingStairs climbingStairs= new ClimbingStairs();
        int[] arr= new int[101];
        System.out.println(climbingStairs.climbStairs(3));
    }

    public int climbStairs(int n) {
        int[] dyn= new int[n+1];

        return dynClimbingStairs(n,dyn);

    }

    public int dynClimbingStairs(int n,int[] dyn)
    {

        if (n==0|| n==1)
            return 1;

        else if (dyn[n]!=0)
            return dyn[n];

        else
        {
            dyn[n]= dynClimbingStairs(n-1,dyn)+dynClimbingStairs(n-2,dyn);
            return dyn[n];
        }
    }
}
