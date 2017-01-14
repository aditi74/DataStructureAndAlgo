package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by vikram on 14/1/17.
 * Given a string, find the length of the longest substring without repeating characters.

 Examples:

 Given "abcabcbb", the answer is "abc", which the length is 3.

 Given "bbbbb", the answer is "b", with the length of 1.

 Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


 */
public class LongestSubStringWithOutRepeatChar {
    //use Window Concept
    // 2 variables i j , keep incresing j -- if no duplicate found , if found
    //keep increasing i (keep count of max substring)
    public static void main(String[] args) {

        LongestSubStringWithOutRepeatChar lo= new LongestSubStringWithOutRepeatChar();
        System.out.println(lo.lengthOfLongestSubstringUsingMap("dvdf"));

    }

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set= new HashSet<>();
        int i=0,j=0,ans=0;

        while (j<s.length())
        {
            if (!set.contains(s.charAt(j)))
              {
                  set.add(s.charAt(j++));

                  ans = Math.max(ans,j-i);

              }
             else
                 set.remove(s.charAt(i++));




        }
return ans;

    }
    //Use Map-- instead of iterating i till j , once you detect duplicate
    // put i as last instance of that char +1


    public int lengthOfLongestSubstringUsingMap(String s)
    {
        HashMap<Character,Integer> map= new HashMap<>();

        int ans=0;
        for (int i=0,j=0;j<s.length();j++)
        {
            if (map.containsKey(s.charAt(j)))
            {
                //map.put(s.charAt(j),j);
                i=Math.max(map.get(s.charAt(j)),i);


            }


            ans=Math.max(ans,j-i+1);


            map.put(s.charAt(j),j+1);
        }

    return ans;

    }


}
