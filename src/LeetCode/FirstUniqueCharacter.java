package LeetCode;

/**
 * Created by vikram on 2/11/16.
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
