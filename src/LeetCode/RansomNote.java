package LeetCode;

/**
 * Created by aditi on 12/11/16.
 * Given an arbitrary ransom note string and another string containing letters from all the magazines, write a function that will return true if the ransom note can be constructed from the magazines ; otherwise, it will return false.

 Each letter in the magazine string can only be used once in your ransom note.

 Note:
 You may assume that both strings contain only lowercase letters.

 canConstruct("a", "b") -> false
 canConstruct("aa", "ab") -> false
 canConstruct("aa", "aab") -> true
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
     int[] alphabets= new int[26];


     for (int i=0;i<alphabets.length;i++)
     {
         alphabets[i]=0;
     }

     for (int k=0;k<magazine.length();k++)
     {
         int num= (int) magazine.charAt(k)-97;
         alphabets[num]=alphabets[num]+1;
     }

     for (int j=0;j<ransomNote.length();j++)
     {
         int num=(int) ransomNote.charAt(j)-97;
         if (alphabets[num] >0)
             alphabets[num]=alphabets[num]-1;
         else
             return false;


     }


     return true;

    }
}
