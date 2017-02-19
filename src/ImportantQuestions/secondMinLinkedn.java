package ImportantQuestions;

import LeetCode.*;
import LeetCode.TreeNode;
import sun.reflect.generics.tree.Tree;

/**
 * Created by vikram on 13/2/17.
 */
public class secondMinLinkedn {


    public static void main(String[] args) {


        TreeNode node1= new TreeNode(5);
        TreeNode node2= new TreeNode(5);
        TreeNode node3= new TreeNode(5);
        TreeNode node4= new TreeNode(5);
        TreeNode node5= new TreeNode(7);
        TreeNode node6= new TreeNode(9);
        TreeNode node7= new TreeNode(24);
        TreeNode node8= new TreeNode(72);
        TreeNode node9= new TreeNode(24);
        TreeNode node10= new TreeNode(64);
        TreeNode node11= new TreeNode(7);

        node1.left=node2;
        node1.right=node10;
        node2.left= node3;
        node2.right= node7;
        node3.left=node4;
        node3.right= node5;
        node5.left=node6;
        node5.right=node11;
        node7.left=node8;
        node7.right=node9;


        secondMinLinkedn secondMinLinkedn= new secondMinLinkedn();
        int a=secondMinLinkedn.secondMinUtil(node1);
        System.out.println(a);

    }

    public int secondMinUtil(TreeNode root)
    {

        if (root.val== root.left.val)
            return secondMin(root.left,root.val);

        else
            return secondMin(root.right,root.val);

    }

    int min=0;
    public int secondMin(LeetCode.TreeNode root, int rootval)
    {
        if(root.left==null && root.right==null)
            return root.val;

            if (root.val == root.left.val)
                min= secondMin(root.left,  rootval);

            if (root.val == root.right.val)
               min = secondMin(root.right,  rootval);

            if (root.left.val != rootval) {
                if (min!= rootval)
                  min= Math.min(min,root.left.val);
                else
                    min= root.left.val;
            }
            if (root.right.val != rootval ) {
                if (min!= rootval)
                min= Math.min(min,root.right.val);
                else
                    min=root.right.val;
            }

        return min;
    }
}
