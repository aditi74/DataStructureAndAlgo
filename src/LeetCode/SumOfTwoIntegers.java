package LeetCode;

/**
 * Created by vikram on 3/11/16.
 * Calculate the sum of two integers a and b, but you are not allowed to use the operator + and -.
 */
public class SumOfTwoIntegers {
    public int getSum(int a, int b) {

        int sum,carry;
        if (b == 0)
            return a;
        sum = a ^ b; // add without carrying
        carry = (a & b) << 1; // carry, but don’t add
        return getSum(sum,carry); // recurse

    }
}
