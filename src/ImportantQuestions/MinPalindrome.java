package ImportantQuestions;

import DynamicProgramming.MinimumCoinChange;

/**
 * Created by vikram on 13/3/17.
 * Given a string s, form a shortest palindrome by appending characters at the start of the string.
 Example: abab => babab. abcd => dcbabcd. ananab    => bananab.

 # reverse the array
 # append it front (Brute form,may not be the shortest)
 # append it back
 # form KMP partial table
 # remove elements giving at nth position from the end
 # left over appended string at the front

 */
public class MinPalindrome {
    public static void main(String[] args) {


        MinPalindrome minPalindrome= new MinPalindrome();
        minPalindrome.shortestPalindrome("abcd");

    }


       public void shortestPalindrome(String str)
        {
            StringBuilder result= new StringBuilder();
            result=result.append(str);
            String rev= result.reverse().toString();

            String resultstr= str + rev.toString();

            int[] kmpTable= new int[resultstr.length()];
            System.out.println(resultstr.length());

            for (int i=1,j=0;i<resultstr.length();)
            {
                if(resultstr.charAt(i)==resultstr.charAt(j))
                {
                    kmpTable[i]=j+1;
                    j++;
                    i++;
                }
                else {

                    if (j!=0)
                    {
                        j=kmpTable[j-1];

                    }
                    else
                        i++;


                }

            }

            //3rd step
            String intermediate= resultstr.substring(0,resultstr.length()-kmpTable[resultstr.length()-1]);
            String attache= intermediate.substring(str.length(),intermediate.length());


            System.out.println(attache+str);


        }


}
