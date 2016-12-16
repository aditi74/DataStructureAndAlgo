package ImportantQuestions;

import LeetCode.TreeNode;

/**
 * Created by vikram on 9/12/16.
 * In BST, find the number of elements in a given range
 *
 *
 */
public class BSTElementsInRange {

   public int count=0;
    public static void main(String[] args) {
        TreeNode nodeA= new TreeNode(5);
        TreeNode nodeB= new TreeNode(3);
        TreeNode nodeC= new TreeNode(1);
        TreeNode nodeD= new TreeNode(7);

        //
        nodeA.left=nodeB;
        nodeA.right=nodeD;
        nodeB.left=nodeC;

        BSTElementsInRange bstElementsInRange= new BSTElementsInRange();
        System.out.println(bstElementsInRange.countRangeUsingRecur(nodeA,2,6));

    }

    public int countRange(TreeNode root,int start,int end)
    {
        if(root!=null)
        {
            countRange(root.left,start,end);
            if(root.val>=start && root.val<=end)
                count++;

            countRange(root.right,start,end);
        }

     return count;

    }


    //another way by not traversing the whole binary tree

    public int countRangeUsingRecur(TreeNode root,int start,int end)
    {

        if (root==null)
            return 0;

        if (root.val>=start && root.val<=end)
            return 1+ countRangeUsingRecur(root.left,start,end)+countRangeUsingRecur(root.right,start,end);

        if (root.val<start)
            return countRangeUsingRecur(root.right,start,end);

        else return countRangeUsingRecur(root.left,start,end);



    }
}
