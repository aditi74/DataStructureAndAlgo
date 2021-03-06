package LeetCode;

/**
 * Created by aditi on 3/11/16.
 *
 * Invert a binary tree.

 4
 /   \
 2     7
 / \   / \
 1   3 6   9

 to

 4
 /   \
 7     2
 / \   / \
 9   6 3   1
 */
public class InvertBinaryTree {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode invertTree(TreeNode root) {

        if(root==null)
            return  null;

        else
            invertTree(root.left);
        invertTree(root.right);

        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;

        return root;

    }
}
