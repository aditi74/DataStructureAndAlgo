package DynamicProgramming;

/**
 * Created by vikram on 4/2/17.
 */
public class LongestPalindromSubstring {
    public static void main(String[] args) {

        String str= "cbbd";

        char[] arr= str.toCharArray();
        LongestPalindromSubstring longestPalindromSubstring= new LongestPalindromSubstring();
        System.out.println(longestPalindromSubstring.recursiveLPSubstring(arr,0,arr.length-1));

    }

public int recursiveLPSubstring(char[] arr,int i,int j)
{
    if (i==j)
        return 1;
    if (i+1== j && arr[i]==arr[j])
        return 2;

    if (arr[i]==arr[j] && recursiveLPSubstring(arr,i+1,j-1)!=0)

    {
      return 2+ recursiveLPSubstring(arr,i+1,j-1);

    }


        return Math.max(recursiveLPSubstring(arr,i+1,j),recursiveLPSubstring(arr,i,j-1));


}

}
