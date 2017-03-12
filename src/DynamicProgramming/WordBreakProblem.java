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



    public  static HashSet<String> set = new HashSet<>();


    public static void main(String[] args) {
       WordBreakProblem wordBreakProblem= new WordBreakProblem();
        List<String> list= new ArrayList<>();
        list.add("leet");
        list.add("code");
       // System.out.println(wordBreakProblem.wordBreak("leetcode",list));

       set.add("leet");
        set.add("code");
        System.out.println(wordBreakProblem.wordBreakRecursive("leetcode"));
    }


    public boolean    wordBreaKDP(String s)
    {
        boolean[][] matrix= new boolean[s.length()][s.length()];

        for (int i=0;i<s.length();i++)
        {
            if (set.contains(String.valueOf(s.charAt(i))))
                matrix[i][i]= true;
            else
                matrix[i][i]=false;
        }


        for (int k=2;k<=s.length();k++)
          for (int i=0;i<s.length()-k;i++)
          {
              int j=i+k-1;
              //if string between i to j is in dictionary T[i][j] is true
              if (set.contains(s.substring(i,j+1)))
                  matrix[i][j]=true;

              else {
                  //find a k between i+1 to j such that T[i][k-1] && T[k][j] are both true

                  for (int m = i + 1; m <= j; m++) {
                      if (matrix[i][m - 1] == true && matrix[m][j] == true) {
                          matrix[i][j] = true;
                          break;
                      }


                  }


              }
          }
          if (matrix[0][s.length()-1]==true)
              return true;
        else
            return false;





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


    // recursive solution // we consider each prefix and search it in dictionary. ifthe prefix is present
    // we recur for the rest of the string

    /*public boolean usingDPWordCheck(String string)
    {

    }*/


    public boolean wordBreakRecursive(String str) {
        if (str.length() == 0)
            return true;



        for (int i = 0; i <str.length(); i++){
            if (set.contains(str.substring(0, i+1)) && wordBreakRecursive(str.substring(i+1, str.length())))
                return true;
    }
    return false;



    }
}
