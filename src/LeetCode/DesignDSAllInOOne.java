package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by vikram on 5/3/17.
 *
 * Design a data structure that supports insert, delete, search and getRandom in constant time
 Design a data structure that supports following operations in Θ(1) time.

 insert(x): Inserts an item x to the data structure if not already present.

 remove(x): Removes an item x from the data structure if present.

 search(x): Searches an item x in the data structure.

 getRandom(): Returns a random element from current set of elements
 */
public class DesignDSAllInOOne {


    public static void main(String[] args) {

        DesignDSAllInOOne dsAllInOOne= new DesignDSAllInOOne();
        dsAllInOOne.insert(1);
        dsAllInOOne.removeItem(2);
        dsAllInOOne.insert(2);
        System.out.println(dsAllInOOne.getRandom());
        dsAllInOOne.removeItem(1);
        System.out.println(dsAllInOOne.getRandom());


    }

    public HashMap<Integer,Integer> map= new HashMap<>();
    public ArrayList<Integer> arrayList= new ArrayList<>();

    public  void insert(int val)
    {
        if (!map.containsKey(val))
        {

            arrayList.add(val);
            map.put(val,arrayList.size()-1);


        }

       else
            System.out.println("Item already present");


    }

    public void removeItem(int val)
    {
        if (map.containsKey(val))
        {
            int index= map.get(val);

            //swap it with last element of arraylist // to make o1 operation
            int lastele= arrayList.get(arrayList.size()-1);
            arrayList.add(index,lastele);
            arrayList.remove(arrayList.size()-1);


            map.put(lastele,index);
            map.remove(val);



        }

        else
            System.out.println("key not found");




    }


    public int search(int val)
    {
    if (map.containsKey(val))
      return val;

        else return -1;


    }


    public int getRandom()
    {
        Random random= new Random();
        int num=random.nextInt(arrayList.size());
        return arrayList.get(num);

    }

}
