package LeetCode;

/**
 * Created by vikram on 11/2/17.
 *
 * There are N gas stations along a circular route, where the amount of gas at station i is gas[i].

 You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.

 Return the starting gas station's index if you can travel around the circuit once, otherwise return -1.

 petrol : 4 6 7 4
 cost : 6 5 3 5


 p 4
 cs 5
 */
public class GasStation {


    public static void main(String[] args) {
        int[] gas= {2,4};
        int[] cost={3,4};
        GasStation station= new GasStation();
        System.out.println(station.canCompleteCircuit(gas,cost));
    }
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int currCount=0;
        int carry=0;
        int index=0;
        for (int i=0;i<gas.length;i++)
        {
            currCount += gas[i]-cost[i];

            if (currCount<0)
            {
                carry+= currCount;
                index=i+1;
                currCount=0;
            }



        }

        if (carry+currCount>=0)
            return index;
        else
            return -1;
    }

}
