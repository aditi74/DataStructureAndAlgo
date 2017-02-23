package Tree;

import LeetCode.TreeNode;

import java.util.ArrayList;

/**
 * Created by vikram on 23/2/17.
 Find two nodes with given sum in binary search tree (2Sum problem)
 Given a binary search tree and an integer ‘K’,
 find all pairs of nodes (a,b) which sum equal to K, i.e. a+b =K. In other words, find two nodes in binary search tree which have sum equal to a number. For example, if given tree as per below and sum to be found is 60 , then output should be : (15,45) and (20,40)
 */
public class PairNodes {


    /* We can create a arraylist and save all the elements and this problem reduces to two sum problem*/


    ArrayList<Integer> arrayList= new ArrayList<>();
    public void inorderTraversal(TreeNode root)
    {
        if (root==null)
            return;

        inorderTraversal(root.left);
        arrayList.add(root.val);
        inorderTraversal(root.right);
    }

    //2 sum problem on arrayList


}
