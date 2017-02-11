package LeetCode;

/**
 * Created by vikram on 11/2/17.
 *
 * Given a 2D binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.

 For example, given the following matrix:

 1 0 1 0 0
 1 0 1 1 1
 1 1 1 1 1
 1 0 0 1 0
 Return 4.
 */
public class MaximalSquare {


    public int maximalSquare(char[][] matrix) {


        if (matrix.length ==0 ||matrix ==null )
            return 0;

        int[][] result= new int[matrix.length][matrix[0].length];

        int rows= matrix.length;
        int cols=matrix[0].length;
        int max=0;
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                result[i][j]=0;
            }

        }


        for (int i=0;i<rows;i++)
        {
            if(matrix[i][0]== '0')
            {
                result[i][0]=0;
            }
            else
                result[i][0]=1;
            if (max<result[i][0])
            {
                max= result[i][0];
            }

        }

        for (int j=1;j<cols;j++)
        {
            if (matrix[0][j]=='0')
                result[0][j]=0;

            else
                result[0][j]=1;
            if (max< result[0][j])
            {
                max=result[0][j];
            }

        }

        for (int i=1;i<rows;i++)
        {
            for (int j=1;j<cols;j++)
            {
                if (matrix[i][j]== '0')
                    result[i][j]=0;

                if(matrix[i][j]=='1')
                {
                    result[i][j]= Math.min(result[i-1][j],Math.min(result[i-1][j-1],result[i][j-1]))+1;
                    if (result[i][j]>max)
                    {
                        max=result[i][j];
                    }


                }
            }

        }

        return max*max;

    }
}
