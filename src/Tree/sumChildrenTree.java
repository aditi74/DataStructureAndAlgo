package Tree;

import LeetCode.TreeNode;

/**
 * Created by vikram on 23/2/17.
 * You are given a binary tree, you have to check if tree satisfies the property of children sum.
 * This property says that for each node sum of its left and right children should be equal to node value.
 */


public class sumChildrenTree {

    public static void main(String[] args) {

        TreeNode node1= new TreeNode(10);
        TreeNode node2= new TreeNode(5);
        TreeNode node3= new TreeNode(6);
        TreeNode node4= new TreeNode(2);
        TreeNode node5= new TreeNode(3);


        node1.left=node2;
        node1.right= node3;
        node2.left=node4;
        node2.right=node5;
        sumChildrenTree sumChildrenTree= new sumChildrenTree();
        boolean result= sumChildrenTree.sumTree(node1);

        System.out.println(result);


    }


    public boolean sumTree(TreeNode node)
    {
       if(node == null)
           return true;


       if (node.left!=null && node.right!=null && node.val!=node.left.val+node.right.val)
           return false;

        if (node.left!=null && node.right==null && node.val!=node.left.val)
            return false;

        if(node.left==null && node.right!=null && node.val!=node.right.val)
            return false;

        boolean left= sumTree(node.left);
        boolean right = sumTree(node.right);

        return left&&right;


    }
}
