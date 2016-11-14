package LeetCode;

/**
 * Created by aditi on 3/11/16.
 * Write a function that takes a string as input and returns the string reversed.
 * Given s = "hello", return "olleh".
 */

public class ReverseString {
    public String reverseString(String s) {
        int len=s.length();
        int start= 0;
        int end=len-1;
        char[] str= s.toCharArray();

        while(start<=end)
        {
            char temp= str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;




        }
        return String.valueOf(str);


    }
}
