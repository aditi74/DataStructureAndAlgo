package LeetCode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vikram on 3/11/16.
 *
 *  3
 / \
 9  20
 /  \
 15   7

 There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

 */
public class SumLeftLeaves {


    public int sumOfLeftLeaves(TreeNode root) {
        int sum=0;
        if (root!=null)
        {
            if (root.left!=null && (root.left.left==null && root.left.right==null ))
                sum+= root.left.val;

            sum+=   sumOfLeftLeaves(root.left) ;
            sum+= sumOfLeftLeaves(root.right) ;


        }

        return sum;

    }

    /*public int sumOfLeftLeaves(TreeNode root) {
        Queue<TreeNode> queue= new LinkedList<>();
        //queue.add
        if (root==null)
            return 0;
        queue.add(root);
        int sum=0;
        while (!queue.isEmpty())
        {
            TreeNode temp=queue.remove();
            if (temp.left!=null)
            {
                TreeNode leftChild=temp.left;
                if (leftChild.left==null && leftChild.right==null)
                    sum+=leftChild.val;
                else
                    queue.add(leftChild);

            }

            if (temp.right!=null)
            {
                queue.add(temp.right);
            }
        }

        return sum;


    }*/
}
