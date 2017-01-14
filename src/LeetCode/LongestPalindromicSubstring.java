package LeetCode;

/**
 * Created by vikram on 14/1/17.
 *
 * Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

 Example:

 Input: "babad"

 Output: "bab"

 Note: "aba" is also a valid answer.
 Example:

 Input: "cbbd"

 Output: "bb"
 */
public class LongestPalindromicSubstring {


    public static void main(String[] args) {
        LongestPalindromicSubstring longestPalindromicSubstring= new LongestPalindromicSubstring();
        System.out.println(longestPalindromicSubstring.longestPalindrome("babad"));
    }


    public boolean checkPalindrome(String str)
    {
        StringBuilder rev= new StringBuilder();
        rev.append(str);
        rev.reverse();
        String revString =rev.toString();
        if (revString.equals(str))
            return true;
        else return false;

    }
    ///Use BruteForce on3
    //check for each substring whether it is palindrome or not
    // 2 for loops for trying out all combination
    //and  boolean check palindrome function
    public String longestPalindrome(String s) {


        int len =0;
        int maxlen=0;
        int start=0;
        int end=0;
        for (int i=0;i<s.length();i++)
        {
            for (int j=i+1;j<s.length();j++)
            {
               if (checkPalindrome(s.substring(i,j+1)))
               {
                   len=j-i+1;
                   if (maxlen<len)
                   {
                       start=i;
                       end= j;
                       maxlen=len;
                   }
               }


            }
        }

          return s.substring(start,end+1);
    }
}
