package ImportantQuestions;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by vikram on 20/1/17.
 * ou are given an array of N integers, A1, A2 ,…, AN and an integer K. Return the of count of distinct numbers in all windows of size K.

 Formally, return an array of size N-K+1 where i’th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,…, Ai+k-1.

 Note:
 - If K > N, return empty array.

 For example,

 A=[1, 2, 1, 3, 4, 3] and K = 3

 All windows of size K are
 [1, 2, 1]
 [2, 1, 3]
 [1, 3, 4]
 [3, 4, 3]

 So, we return an array [2, 3, 3, 2].

 */
public class DistinCtNumbersInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {

        ArrayList<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map= new HashMap<>();
        if (A.size()<B)
            return result;
        for (int i=0;i<B;i++)
        {
            if (map.containsKey(A.get(i)))
            {
                int value= map.get(A.get(i));
                value++;
                map.put(A.get(i),value);

            }

            else
                map.put(A.get(i),1);
        }

        result.add(map.size());

        // int j=0;
        for(int j=0,k=B;k<A.size();k++,j++)
        {
            if (map.containsKey(A.get(j)))
            {
                int keyValue= map.get(A.get(j));
                keyValue--;

                if (keyValue==0)
                    map.remove(A.get(j));
                else
                    map.put(A.get(j),keyValue);
            }

            if (map.containsKey(A.get(k)))
            {
                int val=map.get(A.get(k));
                val++;

                map.put(A.get(k),val);
            }
            else
                map.put(A.get(k),1);

            result.add(map.size());

        }

        return result;



    }
}
