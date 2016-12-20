package LeetCode;

/**
 * Created by vikram on 5/12/16.
 *
 * Determine whether an integer is a palindrome. Do this without extra space.


 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x<0)
            return false;

        int temp=x;
        int rev=0;
        while(temp>0)
        {
            rev=rev*10+temp%10;
            temp=temp/10;
        }

        if (rev==x)
            return true;
        else
            return false;

    }
}
