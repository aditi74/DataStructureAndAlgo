package Tree;

import LeetCode.TreeNode;

/**
 * Created by vikram on 23/2/17.
 *
 * Is given binary tree BST or not
 */
public class CheckBSTOrNot {
    public static void main(String[] args) {


        TreeNode node1= new TreeNode(4);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(1);
        TreeNode node4= new TreeNode(3);
        TreeNode node5= new TreeNode(8);
        //TreeNode node6= new TreeNode(6);

        node1.left=node2;
        node1.right=node5;
         node2.left=node3;
        node2.right=node4;
        //node3.left=node6;

        CheckBSTOrNot checkBSTOrNot= new CheckBSTOrNot();
        boolean result=checkBSTOrNot.isBSTOrNot(node1);
        System.out.println("is BST" +result);
    }

TreeNode prev=null;
    public boolean isBSTOrNot(TreeNode node)
    {
        if (node==null)
            return true;

        boolean leftTree=isBSTOrNot(node.left);

        if (prev!=null)
        {
           if (prev.val>node.val)
               return false;
        }

        prev=node;


        boolean rightTree= isBSTOrNot(node.right);
        return leftTree&& rightTree;



    }


}
