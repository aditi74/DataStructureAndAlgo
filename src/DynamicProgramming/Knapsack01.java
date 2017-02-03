package DynamicProgramming;

/**
 * Created by vikram on 4/2/17.
 * Given a set of items, each of which is associated with some weight and value.
 * Find the subset of items which can be carried into the knapsack with weight limit W. It is required that the cumulative value of the items in the knapsack is maximum value possible.


 Weights : 2 3 3 4 6

 Values :    1 2 5 9 4

 Knapsack Capacity (W) = 10
       0 1 2 3 4 5 6 7 8 9 10
    0
 (2)1
 (3)2
 (3)3
 (4)4
 (6)5

 */
public class Knapsack01 {

    public static void main(String[] args) {

    }


// either we will include given value or exclude the given value
    public int maxValueKnapsack(int[] wt,int[] val,int maxValue)
    {
        int max=0;
        int[][] MV= new int[wt.length+1][maxValue+1];

        for (int k=0;k<wt.length;k++)
        {
            MV[0][k]=0;
        }
        for (int l=0;l<=maxValue;l++ )

        {
            MV[0][l]=0;
        }
        for (int i=1;i<wt.length;i++)
        {
            for (int j=1;j<=maxValue;j++)
            {
                if(j>=wt[i-1])
                {
                    MV[i][j]=Math.max(val[i]+ MV[i-1][j-wt[i-1]],MV[i-1][j]);//either include the wt or exclude it,get max out it
                }
                else
                    MV[i][j]= MV[i-1][j];

                if(max<MV[i][j])
                    max=MV[i][j];
            }



        }
return max;
    }
}
