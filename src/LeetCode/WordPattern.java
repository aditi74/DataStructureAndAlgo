package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vikram on 11/1/17.
 * Given a pattern and a string str, find if str follows the same pattern.

 Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

 Examples:
 pattern = "abba", str = "dog cat cat dog" should return true.
 pattern = "abba", str = "dog cat cat fish" should return false.
 pattern = "aaaa", str = "dog cat cat dog" should return false.
 pattern = "abba", str = "dog dog dog dog" should return false.
 */
public class WordPattern {

    public static void main(String[] args) {
        WordPattern wordPatternn= new WordPattern();
        //"aaa"
       // "aa aa aa aa"
        /*"abba"
"dog dog dog dog" */
        System.out.println(wordPatternn.wordPatternAnotherWay("abba","dog dog dog dog"));


    }

    public boolean wordPatternAnotherWay(String pattern, String str)
    {
        String[] strlist= str.split(" ");

        if (pattern.length()!=strlist.length)
            return false;

        HashMap<Character,String> map= new HashMap<>();

        for (int i=0;i<pattern.length();i++)
        {
            if (map.containsKey(pattern.charAt(i)))
            {
                if (!map.get(pattern.charAt(i)).equals(strlist[i]))
                {
                    return false;
                }

            }

            else if (map.containsValue(strlist[i]))
                 return false;

            else
                map.put(pattern.charAt(i),strlist[i]);



        }
return true;



    }





}
