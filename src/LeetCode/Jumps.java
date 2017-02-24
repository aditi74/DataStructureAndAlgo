package LeetCode;

/**
 * Created by vikram on 25/2/17.
 */
public class Jumps {


    public static void main(String[] args) {
        Jumps jumps= new Jumps();
        int[] arr={1,2};
        System.out.println(jumps.canJump(arr));


    }
    public boolean canJump(int[] nums) {
        if (nums.length==0)
            return false;

    int[] jumps= new int[nums.length];



        for(int i=0;i< jumps.length ;i++)

    {

        jumps[i]= 99999;
    }

    jumps[0]=0;
        for(int i=1;i< jumps.length;i++)
    {
        for(int j=0;j<i;j++)
        {
            if(i-j<=nums[j])
            {
                jumps[i]= Math.min(jumps[i],jumps[j]+1);

            }


        }

    }

        if(jumps[jumps.length-1]!=99999)
            return true;
           else
                   return false;

}
}
