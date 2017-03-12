package GreedyAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by vikram on 29/1/17.
 *
 * Given an array of meeting time intervals consisting of start and end times [[s1,e1],[s2,e2],...] (si < ei), find the minimum number of conference rooms required.

 For example, Given [[0, 30],[5, 10],[15, 20]], return 2.
 */
public class MeetingRooms {
   static class Room implements Comparable<Room>{
        int val;
        Character scheduler;

        Room(int val,Character scheduler)
        {
            this.val=val;
            this.scheduler=scheduler;
        }

       public int compareTo(Room o1) {
           int compareQuantity= o1.val;
           return this.val-compareQuantity;
       }
   }
    public static void main(String[] args) {
        Room aa= new Room(0,'A');
        Room ad = new Room(30,'D');
        Room ba= new Room(5,'A');
        Room bd= new Room(10,'D');
        Room ca= new Room(15,'A');
        Room cd= new Room(20,'D');

        ArrayList<Room> arrayList= new ArrayList<>();
        arrayList.add(aa);
        arrayList.add(ad);
        arrayList.add(ba);
        arrayList.add(bd);
        arrayList.add(ca);
        arrayList.add(cd);

        MeetingRooms rooms=new MeetingRooms();
        int meetingRooms=rooms.meetingRoomsReqd(arrayList);
        System.out.println(meetingRooms);

    }

    public int meetingRoomsReqd(ArrayList<Room> arrayList)
    {
        Collections.sort(arrayList);
        int[] timings= new int[arrayList.size()];

        for (int i=0;i<arrayList.size();i++)
        {
            if (arrayList.get(i).scheduler=='A')
                timings[i]=1;
            else
                timings[i]=-1;

        }

        int max=0;
        int currSum=0;
        for (int i=0;i<arrayList.size();i++)
        {
            currSum+= timings[i];
            if (max<currSum)
            {
                max=currSum;
            }

        }
        return max;
    }

}
