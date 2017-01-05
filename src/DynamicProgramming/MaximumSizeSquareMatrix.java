package DynamicProgramming;

/**
 * Created by vikram on 4/1/17.
 * Given a matrix of dimensions mxn having all entries as 1 or 0,
 * find out the size of maximum size square sub-matrix with all 1s.
 *
 */
public class MaximumSizeSquareMatrix {

    public static void main(String[] args) {
        /*char matrix[][] = { { '1', '1', '0', '0', '1', '1' },
                	                           { '0', '0', '1', '0', '1', '1' },
                	                           { '1', '1', '1', '1', '1', '0' },
                	                           { '1', '1', '1', '1', '1', '1' },
                	                           { '1', '1', '1', '1', '1', '1' },
                	                           { '0', '1', '1', '1', '1', '1' },
                	                           { '1', '0', '0', '0', '1', '1' }
                	                         };*/

       /* char matrix[][]= { {'1','0','1','0','0'},
                           {'1','0','1','1','1'},
                {'1','1','1','1','1'},
                {'1','0','0','1','0'}

        };*/
       char matrix[][] ={{'1'}};
                	                         //["10100","10111","11111","10010"]


         MaximumSizeSquareMatrix maximumSizeSquareMatrix= new MaximumSizeSquareMatrix();
        System.out.println(maximumSizeSquareMatrix.maxSize(matrix));


    }

    public int maxSize(char[][] matrix)
    {
        int[][] result= new int[matrix.length][matrix[0].length];

        int max= Integer.MIN_VALUE;
        for (int i=0;i<matrix.length;i++)
        {
            result[i][0]=Character.getNumericValue(matrix[i][0]);
            if (result[i][0]>max)
                max= result[i][0];
        }


        for (int j=0;j<matrix[0].length;j++)
        {
            result[0][j]= Character.getNumericValue(matrix[0][j]);
            if (result[0][j]>max)
                max= result[0][j];
        }


       // int currMax= Integer.MIN_VALUE;
        for (int k=1;k<matrix.length;k++)
        {
            for (int l=1;l<matrix[0].length;l++)
            {
                if (Character.getNumericValue(matrix[k][l])==0)
                     result[k][l]=0;

                else
                {
                    int curr= Math.min(result[k-1][l],Math.min(result[k-1][l-1],result[k][l-1]));

                    result[k][l]= curr+ Character.getNumericValue(matrix[k][l]);
                }

             if (result[k][l]>max)
                 max= result[k][l];


            }


        }

        return max ;

    }
}
