package DynamicProgramming;

/**
 * Created by vikram on 15/12/16.
 * Given two words word1 and word2, find the minimum number of steps required to convert word1 to word2. (each operation is counted as 1 step.)

 You have the following 3 operations permitted on a word:

 a) Insert a character
 b) Delete a character
 c) Replace a character
 */
public class EditDistance {

    public static void main(String[] args) {

        EditDistance editDistance= new EditDistance();
        System.out.println(editDistance.minDistance("cat","cutter",3,6));
    }

  //Recursive solution
    public int minDistance(String word1, String word2,int m, int n) {
        if (m==0)
           return n;
        if (n==0)
            return m;


        if (word1.charAt(m-1)==word2.charAt(n-1))
             return minDistance(word1,word2,m-1,n-1);

        else
            return 1+ min( minDistance(word1,word2,m,n-1),minDistance(word1,word2,m-1,n-1),minDistance(word1,word2,m-1,n));


    }

    public int min(int x,int y,int z)
    {
        return Math.min(Math.min(x, y), z);
    }


        
}
