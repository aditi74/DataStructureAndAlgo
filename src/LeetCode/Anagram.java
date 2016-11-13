package LeetCode;

/**
 * Created by vikram on 2/11/16.
 */
public class Anagram {
    public static void main(String[] args) {
        Anagram anagram= new Anagram();
        System.out.println( anagram.isAnagram("rat","tar  "));


    }

    public boolean isAnagram(String s, String t) {
        int[] result = new int[26];
        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {
            result[s.charAt(i) - 97]++;
        }

        for (int k = 0; k < t.length(); k++) {
            if (result[t.charAt(k) - 97] == 0)
                return false;
            else
                result[t.charAt(k) - 97]--;
        }
        return true;

    }
}