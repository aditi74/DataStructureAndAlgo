package LeetCode;

/**
 * Created by vikram on 14/1/17.
 * Reverse digits of an integer.

 Example1: x = 123, return 321
 Example2: x = -123, return -321
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger= new ReverseInteger();

        System.out.println(reverseInteger.reverse(10));
    }


    public int reverse(int x) {

        boolean flag = false;
        if (x<0)
            flag= true;


        x= Math.abs(x);

        long rev=0;
        while (x>0)

        {

            int b=x%10;
            x= x/10;

            rev=rev*10+b;

        }



        if (flag==false )
        {
            if (rev>Integer.MAX_VALUE)
                return 0;
            else
                return (int)rev;

        }


        rev = -rev;
        if (rev< Integer.MIN_VALUE)
        return 0;

        else
            return (int)rev;
    }


}
