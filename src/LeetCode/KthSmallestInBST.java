package LeetCode;

/**
 * Created by vikram on 12/2/17.
 *
 * Given a binary search tree, write a function kthSmallest to find the kth smallest element in it.
 *
 *
 */
public class KthSmallestInBST {

    public static void main(String[] args) {
        TreeNode nodeA= new TreeNode(5);
        TreeNode nodeB= new TreeNode(3);
        TreeNode nodeC= new TreeNode(1);
        TreeNode nodeD= new TreeNode(7);

        //
        nodeA.left=nodeB;
        nodeA.right=nodeD;
        nodeB.left=nodeC;
        KthSmallestInBST kthSmallestInBST = new KthSmallestInBST();
        int a= kthSmallestInBST.kthSmallest(nodeA,4);
        System.out.println(a);
    }


    int count=0;
    int val=0;
    public int kthSmallest(TreeNode root, int k) {
        if (root==null)
            return 0;

       kthSmallest(root.left,k);

        if(++count ==k)
           val=root.val;


       kthSmallest(root.right,k);

    return val;
    }
}
