package DynamicProgramming;

/**
 * Created by vikram on 4/2/17.
 */
public class LongestPalindromSubstring {
    public static void main(String[] args) {

        String str= "aba";

        char[] arr= str.toCharArray();
        LongestPalindromSubstring longestPalindromSubstring= new LongestPalindromSubstring();
       // System.out.println(longestPalindromSubstring.recursiveLPSubstring(arr,0,arr.length-1));
      // System.out.println(longestPalindromSubstring.DynamicLPSubstring(arr,str));
    }

public int recursiveLPSubstring(char[] arr,int i,int j)
{
    if (i==j)
        return 1;
    if (i+1== j && arr[i]==arr[j])
        return 2;

    if (arr[i]==arr[j] && recursiveLPSubstring(arr,i+1,j-1)==0)

    {
      return 2+ recursiveLPSubstring(arr,i+1,j-1);

    }


        return Math.max(recursiveLPSubstring(arr,i+1,j),recursiveLPSubstring(arr,i,j-1));


}



    public String longestPalindrome(String s) {
        if(s==null || s.length()<=1)
            return s;

        int len = s.length();
        int maxLen = 1;
        boolean [][] dp = new boolean[len][len];

        String longest = null;
        for(int l=0; l<s.length(); l++){
            for(int i=0; i<len-l; i++){
                int j = i+l;
                if(s.charAt(i)==s.charAt(j) && (j-i<=2||dp[i+1][j-1])){
                    dp[i][j]=true;

                    if(j-i+1>maxLen){
                        maxLen = j-i+1;
                        longest = s.substring(i, j+1);
                    }
                }
            }
        }

        return longest;
    }


























}
