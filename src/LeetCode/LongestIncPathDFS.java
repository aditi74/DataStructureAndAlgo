package LeetCode;

/**
 * Created by vikram on 19/2/17.
 * Given an integer matrix, find the length of the longest increasing path.

 From each cell, you can either move to four directions: left, right, up or down. You may NOT move diagonally or move outside of the boundary (i.e. wrap-around is not allowed).

 Example 1:

 nums = [
 [9,9,4],
 [6,6,8],
 [2,1,1]
 ]
 Return 4
 The longest increasing path is [1, 2, 6, 9].

 Example 2:

 nums = [
 [3,4,5],
 [3,2,6],
 [2,2,1]
 ]
 Return 4
 The longest increasing path is [3, 4, 5, 6]. Moving diagonally is not allowed.


 */
public class LongestIncPathDFS {

    public static void main(String[] args) {
        int[][] matrix= {{7,7,5},{2,4,6},{8,2,0}};

        LongestIncPathDFS longestIncPathDFS= new LongestIncPathDFS();
        int counter=longestIncPathDFS.longestIncreasingPath(matrix);

        System.out.println(counter);

    }




    public int longestIncreasingPath(int[][] matrix) {

        if(matrix.length==0)
            return 0;

        if(matrix.length==1 && matrix[0].length==1)
            return 1;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int result=0;
        int[] max=new int[1];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

             int   counter=1;
          DFSUtil(matrix,i,j,rows,cols,counter,max);
              /*  System.out.println(count);
             if(result<count)
             {
                 result=count;
             }
            }*/}
        }
return max[0];

    }

    int[] neighbourRows = {-1, 0, 1, 0};
    int[] neighbourcols = {0, -1, 0, 1};
   // int counter=0;

    static int result=0;

    public void DFSUtil(int[][] arr, int m, int n, int rows, int cols, int counter,int[] max) {
       max[0]= Math.max(max[0],counter);

        for (int k = 0; k < neighbourRows.length; k++) {
            if ((m + neighbourRows[k]) < 0 || (m + neighbourRows[k]) >= rows || n + neighbourcols[k] < 0 || n + neighbourcols[k] >= cols)
                continue;

            else {
                if (arr[m + neighbourRows[k]][n + neighbourcols[k]] > arr[m][n]) {
                  //  counter++;
                  //  System.out.println(counter);
                    DFSUtil(arr, m + neighbourRows[k], n + neighbourcols[k], rows, cols, counter+1,max);

                }
            }


        }

    }
}
