package LeetCode;

/**
 * Created by vikram on 15/1/17.
 * Implement atoi to convert a string to an integer.
 */
public class StringToInteger {


    public static void main(String[] args) {

        StringToInteger stringToInteger= new StringToInteger();
        System.out.println(stringToInteger.myAtoi("2147483648"));


    }


    public int myAtoiFn(String str)
    {
        if (str == null || str.length() < 1)
            return 0;

        // trim white spaces
        str = str.trim();

        char flag = '+';

        // check negative or positive
        int i = 0;
        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }
        // use double to store result
        double result = 0;

        // calculate value
        while (str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }

    public int myAtoi(String str) {


        long result=0;
        boolean negflag=false;
        boolean posflag=false;
        boolean flag=false;

        if (str.length()==0)
            return 0;

      /*  if (str.charAt(0)=='-')
            flag =true;*/

        for (int i=0;i<str.length();i++)
        {
            if ((int) str.charAt(i)>=48 && (int) str.charAt(i)< 57)
            {
                result=result*10 +(int)str.charAt(i)-48;

                flag=true;


            }

            if (flag==true &&((int) str.charAt(i)<48 || (int) str.charAt(i)> 57))

            {
                break;
            }
            if (str.charAt(i)=='-')
            {
                negflag=true;
            }

            if (str.charAt(i)=='+')
            {
                posflag=true;
            }


        }

        if (negflag==true && posflag==true)

            return 0;

        if (negflag == true)
            result = -result;

        // handle max and min
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;

    }


}
