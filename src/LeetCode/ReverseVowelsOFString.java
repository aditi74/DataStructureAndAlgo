package LeetCode;

import java.util.HashSet;

/**
 * Created by vikram on 19/11/16.
 * Write a function that takes a string as input and reverse only the vowels of a string.

 Example 1:
 Given s = "hello", return "holle".

 Example 2:
 Given s = "leetcode", return "leotcede".

 Note:
 The vowels does not include the letter "y".

 */
public class ReverseVowelsOFString {
    public static void main(String[] args) {
        ReverseVowelsOFString reverseVowelsOFString= new ReverseVowelsOFString();
        System.out.println(reverseVowelsOFString.reverseVowels("hello"));
    }

    public String reverseVowels(String s) {
        if (s.length()==0 || s.length()==1)
            return s;
        int start= 0;
        int end=s.length()-1;
        int startVowelPos=-1;
        int endVowelPos=-1;
        HashSet<Character> set= new HashSet<>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');

        char[] str= s.toCharArray();

        while (start<=end)
        {
            if(set.contains(str[start]) && startVowelPos==-1) {
                startVowelPos = start;
            }
            if (startVowelPos==-1)
                start++;

            if (set.contains(str[end]) && endVowelPos ==-1)
                endVowelPos=end;

            if (endVowelPos==-1)
                end--;

            if (startVowelPos!=-1 && endVowelPos!=-1)
            {
                char tobeSwapped= str[startVowelPos];
                str[startVowelPos]=str[endVowelPos];
                str[endVowelPos]=tobeSwapped;
                if (startVowelPos==start)
                    start++;
                if (endVowelPos==end)
                    end--;
                startVowelPos=-1;
                endVowelPos =-1;

            }
        }
   return String.valueOf(str);

    }
}
