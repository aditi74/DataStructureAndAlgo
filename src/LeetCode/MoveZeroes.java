package LeetCode;

/**
 * Created by vikram on 12/11/16.
 */
/**
 * Created by vikram on 31/10/16.
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] nums={0, 1, 0, 3, 12};
        MoveZeroes move= new MoveZeroes();
        move.moveZeroes(nums);

    }
    public void moveZeroes(int[] nums) {
        int start=0;
        int end=1;

        for (int i=0;i< nums.length;i++)
        {
            if (end <nums.length && nums[end]==0 )
            {
                while(nums[end]!=0 )
                {
                    end++;


                }
            }
            if (end== nums.length)
                return ;
            if (nums[start]==0){
                int temp= nums[start];
                nums[start]=nums[end];
                nums[end]=0;
                end++;
            }


            start++;





        }
        return;


    }

}
