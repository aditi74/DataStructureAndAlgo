package LeetCode;

/**
 * Created by vikram on 5/12/16.
 *
 * Given an integer n, return the number of trailing zeroes in n!.

 Note: Your solution should be in logarithmic time complexity.

 //no of 5 present
 Trailing 0s in n! = Count of 5s in prime factors of n!
 = floor(n/5) + floor(n/25) + floor(n/125) + ....
 */
public class FactorialTrailingZeroes {

    public int trailingZeroes(int n) {
        if (n<0)
            return -1;

        int count =0;

        for (long i=5; n/i>=1; i *= 5)
            count += n/i;

        return count;
        //return count;

    }
}
