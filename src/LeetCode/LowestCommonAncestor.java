package LeetCode;

/**
 * Created by vikram on 15/11/16.
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.

 According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes v and w as the lowest node in T that has both v and w as descendants (where we allow a node to be a descendant of itself).”

 _______6______
 /              \
 ___2__          ___8__
 /      \        /      \
 0      _4       7       9
 /  \
 3   5
 For example, the lowest common ancestor (LCA) of nodes 2 and 8 is 6. Another example is LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.
 */
public class LowestCommonAncestor {
    public static void main(String[] args) {

        TreeNode node1= new TreeNode(6);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(0);
        TreeNode node4= new TreeNode(4);
        TreeNode node5= new TreeNode(8);
        TreeNode node6= new TreeNode(7);
        TreeNode node7= new TreeNode(9);
        TreeNode node8= new TreeNode(3);
        TreeNode node9= new TreeNode(5);

        node1.left=node2;
        node1.right=node5;
        node2.left=node3;
        node2.right=node4;
        node3.left=node8;
        node3.right=node9;
        node5.left=node6;
        node5.right=node9;

        LowestCommonAncestor lowestC= new LowestCommonAncestor();
        TreeNode node=lowestC.lowestCommonAncestor(node1,node2,node9);
        System.out.println(node.val);
    }



    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (((p.val< root.val) && (q.val>root.val)) ||((p.val> root.val) && (q.val<root.val)) )
            return root;

        if (root==p || root==q)
            return root;
        if ((p.val<root.val) && (q.val<root.val))
            return lowestCommonAncestor(root.left,p,q);
        else
            return lowestCommonAncestor(root.right,p,q);



    }


}
