package LeetCode;

/**
 * Created by vikram on 14/11/16.
 */
public class PowerofThree {
    public static void main(String[] args) {
   PowerofThree powerofThree= new PowerofThree();
        System.out.println(powerofThree.isPowerOfThree(4));

    }


    public boolean isPowerOfThree(int n) {
        if (n<1)
             return false;

        while (n%3==0)
        {
            n=n/3;

        }


        return n==1;



    }

}
