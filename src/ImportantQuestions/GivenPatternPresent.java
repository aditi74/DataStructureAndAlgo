package ImportantQuestions;

/**
 * Created by vikram on 10/3/17.
 * Question: You are given a 2D array of characters and a character pattern. WAP to find if pattern is present in 2D array. Pattern can be in any way (all 8 neighbors to be considered) but you can’t use same character twice while matching. Return 1 if match is found, 0 if not.

 Example: Find “microsoft” in below matrix.
 */
public class GivenPatternPresent {


    public static void main(String[] args) {
        char[][] matrix={{'A','C','P','R','C'},{'X','S','O','P','C'},{'V','O','V','N','I'},{'W','G','F','M','N'},
                {'Q','A','T','I','T'}};

 GivenPatternPresent patternPresent= new GivenPatternPresent();
     boolean pat=   patternPresent.patternCheck(matrix,"RRRRR",0);
        System.out.println(pat);


    }


    public boolean patternCheck(char[][] matrix,String str,int currLoc)
    {
        if (str.length()==currLoc)
           return  true;

        for (int i=0;i<matrix.length;i++)
            for (int j=0;j<matrix[0].length;j++)
            {
                if (matrix[i][j]==str.charAt(currLoc))
                {
                  //  ++currLoc;
                    matrix[i][j]='#';
                   return patternCheck(matrix,str,++currLoc);


                }


            }

            return false;

    }


    //Improving redcursion

    //pattern should be matched within 8neighbour


    public boolean searchWithinNeighbour(char[][] mat,String str,int currlen,int x,int y,int row,int col)
    {
        if (str.length()==currlen)
            return true;


        if (x<0 || y<0 || x>=row || y>=col )
            return false;

        if (mat[x][y]== str.charAt(currlen))
        {
            //marking this cell as used
            char temp= mat[x][y];

            mat[x][y]='#';

            boolean res;

            res= searchWithinNeighbour(mat,str,currlen+1,x-1,y-1,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x-1,y,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x-1,y+1,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x,y-1,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x,y+1,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x+1,y-1,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x+1,y,row,col)
                    ||
                    searchWithinNeighbour(mat,str,currlen+1,x+1,y+1,row,col);
            mat[x][y]=temp;

            return res;






        }
   else
       return false;





    }


    boolean wrapperfindPatter(String str,char[][] matrix) {

        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == str.charAt(0))
                    return searchWithinNeighbour(matrix, str, 0, i, j, matrix.length, matrix[0].length);


            }
        return false;
    }
}
