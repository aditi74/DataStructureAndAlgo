package LeetCode;

/**
 * Created by vikram on 19/2/17.
 *
 * Given a binary tree, determine if it is a valid binary search tree (BST).

 Assume a BST is defined as follows:

 The left subtree of a node contains only nodes with keys less than the node's key.
 The right subtree of a node contains only nodes with keys greater than the node's key.
 Both the left and right subtrees mu
 st also be binary search trees.
 */
public class ValidateBSt {

    public static void main(String[] args) {
        TreeNode nodeA= new TreeNode(3);
        TreeNode nodeB= new TreeNode(2);
        TreeNode nodeC= new TreeNode(5);
        TreeNode nodeD= new TreeNode(1);
        TreeNode nodeE= new TreeNode(4);


        nodeA.left=nodeB;
        nodeA.right=nodeC;
        nodeB.left= nodeD;
        nodeB.right=nodeE;

        ValidateBSt validateBSt= new ValidateBSt();
        boolean a=validateBSt.isValidBST(nodeA);
        System.out.println(a);

    }


    TreeNode prev= null;

    public boolean isValidBST(TreeNode root) {

        if (root == null)
            return true;

     boolean left=isValidBST(root.left);


        if (prev != null) {
            System.out.println(prev.val);
            System.out.println("root"+root.val);
            if (prev.val >= root.val)
                return false;




        }
        prev = root;
      boolean right= isValidBST(root.right);

       return left && right;

    }

}
