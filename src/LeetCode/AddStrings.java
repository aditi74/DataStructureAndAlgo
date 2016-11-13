package LeetCode;

/**
 *  Given two non-negative numbers num1 and num2 represented as string, return the sum of num1 and num2.
 * Created by vikram on 13/11/16.
 */
public class AddStrings {
    public static void main(String[] args) {
        AddStrings addString= new AddStrings();
        System.out.println(addString.addStrings("10","1"));

    }
    public String addStrings(String num1, String num2) {
        long numA,numB=0;


        StringBuilder str= new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;

        while ( i>-1 && j>-1)
        {
            int num= ((int)num1.charAt(i) -48)+(( int) num2.charAt(j)-48)+carry;

            if (num>=10) {
                carry = 1;
                num=num-10;
            }
            else carry=0;

            str.append(String.valueOf(num));
            i--;
            j--;


        }

        while ( i>-1 )
        {
            int num= ((int)num1.charAt(i) -48)+carry;

            if (num>=10) {
                carry = 1;
                num=num-10;
            }
            else carry=0;

            str.append(String.valueOf(num));
            i--;
           // j++;


        }
        while ( j>-1 )
        {
            int num= ((int)num2.charAt(j) -48)+carry;

            if (num>=10) {
                carry = 1;
                num=num-10;
            }
            else carry=0;

            str.append(String.valueOf(num));
            //i++;
             j--;


        }
if (carry==1)
str.append(carry);
        str.reverse();

        return str.toString();


    }

}
