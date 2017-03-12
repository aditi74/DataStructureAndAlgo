package GreedyAlgo;

/**
 * Created by vikram on 29/1/17.
 * You are given n activities with their start and finish times. Select the maximum number of activities that can be performed by a single person,
 * assuming that a person can only work on a single activity at a time.
 * Consider the following 6 activities.
 start[]  =  {1, 3, 0, 5, 8, 5};
 finish[] =  {2, 4, 6, 7, 9, 9};
 The maximum set of activities that can be executed
 by a single person is {0, 1, 3, 4}
 *
 */
public class ActivitySelectionProblem {
    public static void main(String[] args) {
        int[] start={1, 3, 0, 5, 8, 5};
        int[] end={2, 4, 6, 7, 9, 9};
ActivitySelectionProblem activitySelectionProblem= new ActivitySelectionProblem();
        int val=activitySelectionProblem.maxActivity(start,end);
        System.out.println(val);
    }



    public int maxActivity(int[] start,int[] end)
    {
      int counter=1;
       int  startcounter=1;
        int endcounter=0;

      while (startcounter<start.length)
      {
          if (start[startcounter]>end[endcounter])
          {
              counter++;
              endcounter=startcounter;
              startcounter++;
          }
          else
              startcounter++;


      }
        return counter;


    }

}
