package LeetCode;

import java.util.HashMap;

/**
 * Created by vikram on 16/11/16.
 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.

 This is case sensitive, for example "Aa" is not considered a palindrome here.
 */
public class LongestPalindrome {

    public static void main(String[] args) {
        LongestPalindrome palindrome= new LongestPalindrome();
        System.out.println(palindrome.longestPalindrome("abccccdd"));
    }
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        int counter=1;
        for (int i=0;i<s.length();i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                 int value=map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i),value);
            }

            else
                map.put(s.charAt(i),counter);

        }

        int palindromelength=0;

        for (Character key : map.keySet())
        {
            if (map.get(key)%2==0)
                palindromelength+= map.get(key)/2;
            else
            {
                if  (  map.get(key)==1)
                    continue;
                else
                {
                    int num=map.get(key)-1;

                    if (map.get(key)%2==0)
                        palindromelength+= map.get(key)/2;
                }

            }
        }
        return palindromelength;


    }
}
