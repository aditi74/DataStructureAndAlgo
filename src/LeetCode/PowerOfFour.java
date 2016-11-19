package LeetCode;

/**
 * Created by vikram on 19/11/16.
 *
 * Given an integer (signed 32 bits), write a function to check whether it is a power of 4.

 Example:
 Given num = 16, return true. Given num = 5, return false.

 Follow up: Could you solve it without loops/recursion?


 */
public class PowerOfFour {

    public static void main(String[] args) {
        PowerOfFour powerofFour= new PowerOfFour();
        System.out.println(powerofFour.isPowerOFFourUsingBits(0));
    }

    public boolean isPowerOFFourUsingBits(int num)
    {
        if (num <0)
            return false;
        if (num==0)
            return true;
        if ((num & (num-1)) !=0)
            return false;

        return ((num & 0x55555555)!=0);




    }
    public boolean isPowerOfFour(int num)
    {
        if (num==0)
            return false;
        if( num%2!=0)
            return  false;

        while (num%4==0)
        {
            num=num/4;
            if (num==1)
                return true;

        }


         return false;



    }
}
