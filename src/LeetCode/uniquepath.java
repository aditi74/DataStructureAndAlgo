package LeetCode;

/**
 * Created by vikram on 3/1/17.
 */
public class uniquepath {


    public int uniquePaths(int m, int n) {
            int[][] uniqpathval= new int[m+1][n+1];


            for (int i=0;i<=m;i++)
            {
                for (int j=0;j<=n;j++)
                {
                    if (i==0 || j==0)
                        uniqpathval[i][j]=1;

                    else
                        uniqpathval[i][j]= uniqpathval[i-1][j]+uniqpathval[i][j-1];
                }
            }

            return uniqpathval[m][n];


    }


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int rows=obstacleGrid.length;
        int cols=obstacleGrid[0].length;
        int[][] resultMatrix= new int[obstacleGrid.length][obstacleGrid[0].length];

        if (obstacleGrid[0][0]==1)
            resultMatrix[0][0]=0;
        else
            resultMatrix[0][0]=1;

        for (int i=1;i< rows;i++)
        {
            if(obstacleGrid[i][0]==1)
                resultMatrix[i][0]=0;

            else
                resultMatrix[i][0]= resultMatrix[i-1][0];
            //  resultMatrix[rows][0]=1;

        }


        for(int i=1;i<cols;i++)
        {
            if(obstacleGrid[0][i]==1)
                resultMatrix[0][i]=0;
            else
                resultMatrix[0][i]=resultMatrix[0][i-1];

        }

        for(int i=1;i<rows;i++)
        {
            for(int j=1;j<cols;j++)
            {

                if(obstacleGrid[i][j]==1)
                    resultMatrix[i][j]=0;
                else
                    resultMatrix[i][j]= resultMatrix[i-1][j]+resultMatrix[i][j-1];

            }

        }

        return resultMatrix[rows-1][cols-1];

    }
}
