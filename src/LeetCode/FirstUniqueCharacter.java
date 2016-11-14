package LeetCode;

/**
 * Created by aditi on 2/11/16.
 * Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

 Examples:

 s = "leetcode"
 return 0.

 s = "loveleetcode",
 return 2.
 Note: You may assume the string contain only lowercase letters.
 */
public class FirstUniqueCharacter {
    public static void main(String[] args) {
        FirstUniqueCharacter firstUniqueCharacter= new FirstUniqueCharacter();
        System.out.println(firstUniqueCharacter.firstUniqChar("loveleetcodev"));
    }
    public int firstUniqChar(String s) {
        int[] result= new int[26];

        for (int i=0;i<s.length();i++)
        {
            result[(int)s.charAt(i)-97]++;
        }


        for (int k=0;k<s.length();k++)
        {
            if (result[(int)s.charAt(k)-97]==1)
                return k;
        }

        return -1;
    }
}
