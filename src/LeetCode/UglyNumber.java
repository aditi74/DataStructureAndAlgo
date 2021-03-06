package LeetCode;

import com.sun.corba.se.impl.orbutil.graph.Graph;

/**
 * Created by vikram on 16/11/16.
 *  Write a program to check whether a given number is an ugly number.

 Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. For example, 6, 8 are ugly while 14 is not ugly since it includes another prime factor 7.

 Note that 1 is typically treated as an ugly number.
 */
public class UglyNumber {
    public static void main(String[] args) {
        UglyNumber uglyNumber= new UglyNumber();
        System.out.println(uglyNumber.isUgly(100));
    }
    public boolean isUgly(int num) {
        if(num==0) return false;
      if (num==1)
          return true;
      if (num%2==0)
           return isUgly(num/2);
      if (num%3==0)
          return isUgly(num/3);
      if (num%5==0)
          return isUgly(num/5);
      else

          return false;



    }
}
