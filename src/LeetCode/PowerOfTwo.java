package LeetCode;

/**
 * Created by vikram on 13/11/16.
 *
 * Given an integer, write a function to determine if it is a power of two.
 *
 * // rightmost bit is significant rest all are 0 -- in case of power of two
 *
 * n & n-1 will return 0
 *
 */
public class PowerOfTwo {
    public static void main(String[] args) {


    }
    public boolean isPowerOfTwo(int n) {
        if (n>0 &&(n& n-1)==0)
            return true;

        else
            return false;





    }

}
