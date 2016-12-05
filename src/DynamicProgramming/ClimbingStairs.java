package DynamicProgramming;

/**
 * Created by vikram on 17/11/16.
 */


/**
 * Created by aditi on 15/11/16.
 * You are climbing a stair case. It takes n steps to reach to the top.

 Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        LeetCode.ClimbingStairs climbingStairs= new LeetCode.ClimbingStairs();
        int[] arr= new int[101];
        System.out.println(climbingStairs.climbStairs(4));
    }

    public int climbStairs(int n) {
        int[] dyn= new int[n+1];
        for (int i=0;i<=n;i++)
        {
            dyn[i]=-1;
        }
       /* dyn[0]=0;
        dyn[1]=1;
        dyn[2]=2;
*/
        return dynClimbingStairs(n,dyn);

    }

    public int dynClimbingStairs(int n,int[] dyn)
    {

        if (n<3)
        {
            dyn[n]=n;
            return dyn[n];
        }
        if (dyn[n]!=-1)

            return dyn[n];
        else
        {
            dyn[n]=dynClimbingStairs(n-1,dyn)+dynClimbingStairs(n-2,dyn);
            return dyn[n];

        }

    }
}

