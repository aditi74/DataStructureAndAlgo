package LeetCode;

/**
 * Created by aditi on 13/11/16.
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class ExcelSheet {

    public static void main(String[] args) {



    }

    public int titleToNumber(String s) {
        int num=0;

        for(int i=0;i< s.length();i++)
        {
            num=num*26+ ((int)s.charAt(i) -65 +1 );
        }

        return num;

    }
}
