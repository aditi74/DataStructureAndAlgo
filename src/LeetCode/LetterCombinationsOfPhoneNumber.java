package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikram on 10/3/17.
 */
public class LetterCombinationsOfPhoneNumber {

    String[] telephoneMap= {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        char[] num= digits.toCharArray();
        if (num.length==0)
            return result;
        String str ="";
        generatingKeypads(num,str,num.length,0);
        return result;

    }

    ArrayList<String> result = new ArrayList<>();

    public void generatingKeypads(char[] num,String str,int total,int curr)
    {
        if (str.length()==total || curr==total)
        {
            result.add(str);

            return;

        }


        for (int i=0;i< telephoneMap[(int)num[curr]-48].length();i++)
        {
            str = str+telephoneMap[(int)num[curr]-48].charAt(i);
            generatingKeypads(num,str,total,curr+1);
            str=str.substring(0,curr);
        }



    }
}
