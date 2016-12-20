package LeetCode;

/**
 * Created by vikram on 20/12/16.
 */
public class LeastCommonAncestorBT {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     if(root ==null)
         return null;

     if (p==root || q==root)
         return root;

      TreeNode leftLCA= lowestCommonAncestor(root.left,p,q);
        TreeNode rightLCA = lowestCommonAncestor(root.right,p,q);

      if (leftLCA!=null  && rightLCA!=null)
          return root;

      return leftLCA==null? rightLCA:leftLCA;




    }
}
