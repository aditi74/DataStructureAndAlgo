package LeetCode;

import sun.reflect.generics.tree.Tree;

/**
 * Created by vikram on 18/11/16.
 *
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

 For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

 1
 / \
 2   2
 / \ / \
 3  4 4  3
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {

                if (root==null)
                  return true;
        return isSymTree(root.left,root.right);

    }

    public boolean isSymTree(TreeNode nodeA,TreeNode nodeB)
    {

        if (nodeA==null && nodeB==null)
            return true;

        if (nodeA==null|| nodeB==null)
            return false;
        if (nodeA.val!=nodeB.val)
            return false;

        return (nodeA.val==nodeB.val && isSymTree(nodeA.left,nodeB.right)&& isSymTree(nodeA.right,nodeB.left));

    }
}
