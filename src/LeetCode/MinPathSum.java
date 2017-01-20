package LeetCode;

/**
 * Created by vikram on 16/1/17.
 *
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum of all numbers along its path.

 Note: You can only move either down or right at any point in time.

 1 2 3 4
 4 8 2 5
 1 5 3 6

 {}

 */
public class MinPathSum {



    public int minPathSum(int[][] grid) {
        int[][] resultGrid= new int[grid.length][grid[0].length];

        resultGrid[0][0]=grid[0][0];
        for (int i=1;i<grid[0].length;i++)
        {
            resultGrid[0][i]=resultGrid[0][i-1]+grid[0][i];


        }

        for(int j=1;j<grid.length;j++)
        {
            resultGrid[j][0]= resultGrid[j-1][0]+grid[j][0];
        }

        for (int x=1;x<grid.length;x++)
        {
            for(int y=1;y<grid[0].length;y++)
            {
                resultGrid[x][y]= grid[x][y]+ Math.min(resultGrid[x-1][y],resultGrid[x][y-1]);


            }

        }
        return resultGrid[grid.length-1][grid[0].length-1];
    }
}
