package LeetCode;

import sun.reflect.generics.tree.Tree;

/**
 * Created by vikram on 12/2/17.
 *
 * Two elements of a binary search tree (BST) are swapped by mistake.

 Recover the tree without changing its structure.

 A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?

 */
public class RecoverBST {


    public static void main(String[] args) {
        TreeNode nodeB= new TreeNode(1);
        TreeNode nodeA= new TreeNode(2);
        TreeNode nodeC= new TreeNode(3);

        nodeA.right=nodeB;
        nodeA.left=nodeC;

        RecoverBST recoverBST= new RecoverBST();
        recoverBST.recoverTree(nodeA);


        System.out.println(nodeA.left.val);
        System.out.println(nodeA.right.val);

    }
    public  void recoverTreeUtil(TreeNode root)
    {
        if (root==null)
            return;
        recoverTreeUtil(root.left);

if (prev!=null) {

    if (prev.val > root.val) {
        if (firstpoint == null) {
            firstpoint = prev;
        }

        lastpoint = root;
        //prev=root;


    }
}
prev=root;

        recoverTreeUtil(root.right);

    }

    TreeNode firstpoint=null;
    TreeNode lastpoint =null;
    TreeNode prev= null;

    public void recoverTree(TreeNode root) {
        //recoverTree(root.left);

        if (root==null)
           return;

        recoverTreeUtil(root);



        int temp= firstpoint.val;

        firstpoint.val= lastpoint.val;
        lastpoint.val= temp;







    }
}
