package LeetCode;

/**
 * Created by vikram on 12/1/17.
 *
 * Given a binary tree and a sum, determine if the tree has a
 * root-to-leaf path such that adding up all the values along the path equals the given sum.

 For example:
 Given the below binary tree and sum = 22,
 */
public class HasPathSum {

    public static void main(String[] args) {
        TreeNode node1= new TreeNode(1);
        TreeNode node2= new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4= new TreeNode(4);
        TreeNode node5= new TreeNode(5);

        node1.left=node2;
        node1.right= node3;
        node3.left=node4;
        node3.right=node5;

        HasPathSum hasPathSumm=new HasPathSum();
        System.out.println(hasPathSumm.hasPathSum(node1,1));


    }

    public boolean hasPathSum(TreeNode root, int sum) {
       if (root==null)
           return false;
        return hasPath(root,0,sum);
    }

    public boolean hasPath(TreeNode root,int currSum,int sum)
    {
        currSum+=root.val;

        if (root.left ==null && root.right==null)
        {
            if(currSum==sum)
                return true;
            else
                return false;


        }

        return (hasPath(root.left,currSum,sum)|| hasPath(root.right,currSum,sum));


    }
}
