package LeetCode;

/**
 * Created by vikram on 12/1/17.
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * Input  : {“geeksforgeeks”, “geeks”, “geek”, “geezer”}
 Output : "gee"

 Input  : {"apple", "ape", "april"}
 Output : "ap"*/


public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] str= {"a"};
        LongestCommonPrefix  longestCommonPrefix= new LongestCommonPrefix();
        System.out.println(longestCommonPrefix.longestCommonPrefixfn(str));


    }
    public String longestCommonPrefixfn(String[] strs) {
        boolean flag= true;
        int minLength=99999;
        int minLengthStr=0;

        for (int i=0;i<strs.length;i++)
        {

            if (minLength> strs[i].length())
            {
                minLength= strs[i].length();
                minLengthStr=i;
            }

        }
        System.out.println(strs[minLengthStr]);

        StringBuilder retString = new StringBuilder();

        for (int j=0;j<minLength;j++)
        {
            for (int k=0;k<strs.length;k++)
            {

                if (strs[k].charAt(j)!=strs[minLengthStr].charAt(j))
                {
                    flag = false;
                }



            }

            if (flag==false)
                return retString.toString();

            else
                retString.append(strs[minLengthStr].charAt(j));


        }
        return retString.toString();


    }



}
