package Tree;

import LeetCode.TreeNode;

/**
 * Created by vikram on 23/2/17.
 *
 * Diameter of a tree is the longest path between two leaf nodes in a tree.
 *
 *
 * 1) it is in left subtree
 * 2) it is in right subtree
 * 3) or it can pass through left and right
 */
public class DiameterOfTree {

  public int diameterTree(TreeNode node)
  {
      if (node==null)
          return 0;

      int lh= treeHeight(node.left);
      int rh= treeHeight(node.right);

      int ld=diameterTree(node.left);
      int rd= diameterTree(node.right);

       /* Return max of following three
          1) Diameter of left subtree
         2) Diameter of right subtree
         3) Height of left subtree + height of right subtree + 1 */

       return Math.max(Math.max(ld,rd),lh+rh+1);


  }


  public int treeHeight(TreeNode node)
  {
      if (node==null)
          return 0;

      int left= treeHeight(node.left);
      int right=treeHeight(node.right);


      if(left>right)
          return right+1;
      else
      return  left+1;


  }


}
