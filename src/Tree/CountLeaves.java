package Tree;

import LeetCode.TreeNode;

/**
 * Created by vikram on 23/2/17.
 */
public class CountLeaves {

    public static void main(String[] args) {

        TreeNode node1= new TreeNode(1);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(3);
        TreeNode node4= new TreeNode(4);
        TreeNode node5= new TreeNode(5);
        TreeNode node6= new TreeNode(6);

        node1.left=node2;
        node1.right=node3;
      // node2.left=node4;
        node2.right=node5;
        node3.left=node6;

        CountLeaves countLeaves= new CountLeaves();
        //countLeaves.countingLeaves(node1);
        countLeaves.countNodes(node1);
        System.out.println("nodes "+count);

    }

  static   int count=0;
    public void countingLeaves(LeetCode.TreeNode root)
    {
        if(root==null)
        {
            return;
        }

        if (root.left==null && root.right==null)
        {
            ++count;
            return;
        }

        countingLeaves(root.left);
        countingLeaves(root.right);
    }


    public void countNodes(TreeNode root)
    {
        if (root==null)
            return;

        countNodes(root.left);
        ++count;

        countNodes(root.right);



    }
}
