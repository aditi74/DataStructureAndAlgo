package Tree;

import LeetCode.TreeNode;

/**
 * Created by vikram on 23/2/17.
 */
public class GetAllAncestorsOfBT {


    public static void main(String[] args) {
        TreeNode node1= new TreeNode(4);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(1);
        TreeNode node4= new TreeNode(3);
        TreeNode node5= new TreeNode(8);

        node1.left=node2;
        node1.right=node5;
        node2.left=node3;
        node2.right=node4;

        GetAllAncestorsOfBT getAllAncestorsOfBT = new GetAllAncestorsOfBT();

        getAllAncestorsOfBT.printAllAncestors(node1,node4);

    }

    public  boolean printAllAncestors(TreeNode root, TreeNode node)
    {
       if (root==null)
             return false;

       if (root.val ==node.val)
            return true;

       if(printAllAncestors(root.left,node)|| printAllAncestors(root.right,node))
       {
           System.out.println(root.val);
           return true;
       }

      return false;
    }


}
