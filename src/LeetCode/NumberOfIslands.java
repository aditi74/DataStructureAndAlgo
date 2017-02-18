package LeetCode;

/**
 * Created by vikram on 18/2/17.
 * Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 *
 */
public class NumberOfIslands {
    public int numIslands(char[][] grid) {

        if (grid.length==0 )
            return 0;
        int rows= grid.length;
        int cols= grid[0].length;
        int[][] adjMatrix= new int[rows][cols];

        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)
            {
                if (grid[i][j]=='1')
                    adjMatrix[i][j]=1;
                else
                    adjMatrix[i][j]=0;


            }


        }

        return islands(adjMatrix);


    }


    public int islands(int[][] adjMatrix)
    {
        int[][] visitedArray= new int[adjMatrix.length][adjMatrix[0].length];
        int rows= adjMatrix.length;
        int cols= adjMatrix[0].length;
        for (int i=0;i<rows;i++)
        {
            for (int j=0;j<cols;j++)

            {
                visitedArray[i][j]=0;
            }
        }

        int counter=0;

        for (int m=0;m<rows;m++)
        {
            for(int n=0;n<cols;n++)
            {

                if(adjMatrix[m][n]==1  && visitedArray[m][n]==0)
                {
                    DFSutil(adjMatrix,visitedArray,m,n,rows,cols);
                    counter++;
                }


            }
        }

        return counter;





    }


    int[] neighbourRows={-1,0,0,1};
    int[] neighbourcols= {0,-1,1,0};

    public void DFSutil(int[][] matrix,int[][] counterMatrix,int m,int n,int rows,int cols)

    {   for (int k=0;k<neighbourRows.length;k++)
    {
        if ((m+neighbourRows[k])<0 ||(m+neighbourRows[k])>=rows || n+neighbourcols[k]<0 || n+neighbourcols[k]>=cols  )
            continue;

        else {
            if (matrix[m+neighbourRows[k]][n+neighbourcols[k]]==1  && counterMatrix[m+neighbourRows[k]][n+neighbourcols[k]]==0){

                counterMatrix[m+neighbourRows[k]][n+neighbourcols[k]]=1;

                DFSutil(matrix,counterMatrix,m+neighbourRows[k],n+neighbourcols[k],rows,cols);}
        }



    }







    }


    }
