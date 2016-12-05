package DynamicProgramming;

import java.util.HashSet;

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


    }


    public boolean checkWord(String string)
    {
        //arrays, dynamic, heaps, IDeserve, learn, learning, linked, list, platform, programming, stacks, trees
        set.add("arrays");
        set.add("dynamic");
        set.add("heaps");
        set.add("IDeserve");
        set.add("learn");
        set.add("learning");
        set.add("linked");
        set.add("list");
        set.add("platform");
        set.add("programming");
        set.add("stacks");
        set.add("trees");

        boolean[] validWords= new boolean[string.length()];

        for(int i=0;i<string.length();i++)
           {
             if(set.contains(string.substring(0,i+1)));
               {
                   validWords[i]=true;
               }
               if (validWords[i]==true && (i==string.length()-1))
                   return true;

               if (validWords[i]==true)
               {
                   for (int j=i+1;j<string.length();j++)
                   {
                       if (set.contains(string.substring(i+1,j+1)))
                       {
                           validWords[j]=true;
                       }
                       if (j==string.length()-1 && validWords[j]==true)
                           return true;
                   }
               }


           }
         return false;

    }
}
