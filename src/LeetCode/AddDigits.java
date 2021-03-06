package LeetCode;

/**
 * Created by vikram on 16/11/16.
 *  Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.


 */
public class AddDigits {
    public static void main(String[] args) {
        AddDigits addDigitss= new AddDigits();
        System.out.println( addDigitss.addDigits(38));
    }
    public int addDigits(int num) {

        int sum=0;
        while (num>0)
        {
            sum+=num%10;
            num=num/10;
        }

        if (sum>=10)
            return addDigits(sum);
        else return sum;
    }
}
