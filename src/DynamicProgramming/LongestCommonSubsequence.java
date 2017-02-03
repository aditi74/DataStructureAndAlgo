package DynamicProgramming;

/**
 * Created by vikram on 5/12/16.
 *  Given two string sequences, write an algo­rithm to find the length of longest sub­se­quence present in both of them.

 longest sub­se­quence is a sequence that appears in the same rel­a­tive order, but not nec­es­sar­ily contiguous(not sub­string) in both the string.
 String A = "acbaed";
 String B = "abcadf";
 Longest Common Subsequence(LCS):     acad, Length: 4

 */
public class LongestCommonSubsequence {

     public int LongestCommonSub(String strA,String strB)
     {
          int[][] lcs= new int[strA.length()+1][strB.length()+1];
          int rows= strA.length()+1;
          int cols=strB.length()+1;


          for (int i=0;i<rows;i++)
          {
               lcs[i][0]=0;
          }

          for (int j=0;j<cols;j++)
          {
               lcs[0][j]=0;
          }

          int maxlength=0;

          for (int m=1;m<rows;m++)
          {
               for (int n=1;n<cols;n++)
               {
                    if (strA.charAt(m)==strA.charAt(n))
                    {
                         lcs[m][n]=1+ lcs[m-1][n-1]; // if same string get the longest length before that
                    }

                    else
                         lcs[m][n]= Math.max(lcs[m-1][n],lcs[m][n-1]);

                    if (maxlength<lcs[m][n])
                         maxlength=lcs[m][n];
               }


          }
          return maxlength;



     }

}
