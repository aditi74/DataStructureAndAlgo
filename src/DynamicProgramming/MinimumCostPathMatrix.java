package DynamicProgramming;

/**
 * Created by vikram on 4/1/17.
 * Given a cost matrix having a cost at each cell. Find the minimum cost it will take to reach cell (m, n) from top left corner cell (0, 0) if the only allowed directions to move from a cell are right, down and diagonally down.

 In this matrix, the minimum cost path to reach cell 3,2 is as shown:

 Hence, minimum cost is = 11


 1 2 3     ({1,2,3},{3,1,2})
 3 1 2

 */
public class MinimumCostPathMatrix {

    public int minCostPath(int[][] costMatrix,int m,int n)
    {

        int[][] costResult= new int[costMatrix.length][costMatrix[0].length];
        costResult[0][0]= costMatrix[0][0];

        for (int i=1;i<costMatrix.length;i++)
        {
            costResult[i][0]= costResult[i-1][0]+costMatrix[i][0];
        }

        for (int j=1;j<costMatrix[0].length;j++)
        {
            costResult[0][j]= costResult[0][j-1]+costMatrix[0][j];
        }


        for (int i=1;i< costMatrix.length;i++) {
            for (int j = 1; j < costMatrix[0].length; j++) {

                costResult[i][j] = costMatrix[i][j] + Math.min(costResult[i - 1][j], Math.min(costResult[i - 1][j - 1], costResult[i][j - 1]));

            }
        }

        return costResult[m][n];



    }

}
