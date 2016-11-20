package LeetCode;

/**
 * Created by vikram on 19/11/16.
 * 66. Plus One
 * Given a non-negative number represented as an array of digits, plus one to the number.

 The digits are stored such that the most significant digit is at the head of the list.


 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusONE= new PlusOne();
        int[] arr= {9,9,9};
       int[] res=plusONE.plusOne(arr);
        for (int i=0;i<res.length;i++)
            System.out.print(res[i]);


    }

    public int[] plusOne(int[] digits) {
        int carry=1;
        int sum=0;
        if (digits.length==0)
            return new int[digits.length];
        for (int i=digits.length-1;i>=0;i--)
        {

              sum=digits[i] + carry;


            if (sum>=10)
            {

                carry=1;

            }
            else
            {

            carry=0;}
            digits[i]=sum%10;
        }
        if (carry==1)
        {
            int[] res= new int[digits.length+1];
            res[0]=carry;
            int z=0;
            for (int k=1;k<digits.length;k++)
            {
                res[1]=digits[z];
                z++;
            }
        return res;
        }

        else return digits;
    }


}
