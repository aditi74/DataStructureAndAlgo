package DynamicProgramming;

/**
 * Created by vikram on 4/2/17.
 * What is Longest Palin­dromic Sub­se­quence:
 * A longest palin­dromic sub­se­quence is a sequence that appears in the same rel­a­tive order,
 * but not nec­es­sar­ily contiguous(not sub­string) and palin­drome in nature( means the sub­se­quence will read same from the front and back.

 Example:

 String A = " AABCDEBAZ";

 Longest Palindromic subsequence: ABCBA or ABDBA or ABEBA
 */
public class LongestPalindromicSubsequence {

    public static void main(String[] args) {
        String  str="AABCDEBAZ";

        char[] arr= str.toCharArray();
        LongestPalindromicSubsequence longestPalindromicSubsequence= new LongestPalindromicSubsequence();
        System.out.println( longestPalindromicSubsequence.recusiveLPS(arr,0, arr.length-1));
        System.out.println("-----------------");
        System.out.println(longestPalindromicSubsequence.DynaProgLPS(arr));

    }


    public int recusiveLPS(char[] arr,int i,int j)
    {
        if (i==j)
            return 1;  // when only 1 character is present

        if (i+1==j && arr[i]==arr[j])
            return 2; //when only 2 characters are present

        if(arr[i]== arr[j])  // when 1st and last element are equals
          return 2+ recusiveLPS(arr,i+1,j-1);

        else
            return Math.max(recusiveLPS(arr,i,j-1), recusiveLPS(arr,i+1,j));



    }


    public int DynaProgLPS(char[] arr)
    {
        int[][] lps= new int[arr.length][arr.length];

        for (int k=0;k<arr.length;k++)
        {
            lps[k][k]=1;
        }

//starting for sublength=2;
        int max=1;
        for (int sublen=2;sublen<=arr.length;sublen++)
        {
            for (int i=0;i<arr.length-sublen;i++)
            {
                int j=i+sublen-1;

                if(sublen==2 && arr[i]==arr[j])
                    lps[i][j]=2;

                if (arr[i]==arr[j])
                        lps[i][j]=2+lps[i+1][j-1];

                else
                    lps[i][j]= Math.max(lps[i+1][j],lps[i][j-1]);


                if(max<lps[i][j])
                    max=lps[i][j];

            }


        }
return max;


    }
}
