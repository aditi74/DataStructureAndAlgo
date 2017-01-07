package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by vikram on 17/11/16.
 * Given a dictionary of words and a string of characters, find if the string of characters can be broken into individual valid words from the dictionary.
 Example:
 Dictionary: arrays, dynamic, heaps, IDeserve, learn, learning, linked, list, platform, programming, stacks, trees
 String    : IDeservelearningplatform
 Output   : true
 Because the string can be broken into valid words: IDeserve learning platform
 */
public class WordBreakProblem {



    HashSet<String> set = new HashSet<>();

    public static void main(String[] args) {
       WordBreakProblem wordBreakProblem= new WordBreakProblem();
        List<String> list= new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreakProblem.wordBreak("leetcode",list));



    }


//O n2 trivial solution
    public boolean wordBreak(String s, List<String> wordDict)
    {
        HashSet<String> set = new HashSet<>();

        if (s.length()==0)
            return false;
        for (int i=0;i<wordDict.size();i++)
        {
            set.add(wordDict.get(i));
        }

        boolean[] word = new boolean[s.length()];

        int m=0;
        while (m<s.length())
        {
            for (int n=m+1;n<s.length();n++)
            {
                if (set.contains(s.substring(m,n+1)))
                {
                    word[n]=true;
                    if (n==s.length()-1)
                    {
                        return word[s.length()-1];
                    }
                    m=n+1;
                    n=m;
                }

                if (n==s.length()-1)
                    return word[s.length()-1];

            }



        }
        return word[s.length()-1];



    }

    /*public boolean usingDPWordCheck(String string)
    {

    }*/
}
