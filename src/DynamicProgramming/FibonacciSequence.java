package DynamicProgramming;

/**
 * Created by vikram on 17/11/16.
 *
 *
 */
public class FibonacciSequence {

    public static void main(String[] args) {



    }


    public int fibonacci(int n, int[] fib)
    {
        if (fib[n]!=0)
            return fib[n];

        else
            fib[n]=fibonacci(n-1,fib)+fibonacci(n-2,fib);
        return fib[n];


    }

}
