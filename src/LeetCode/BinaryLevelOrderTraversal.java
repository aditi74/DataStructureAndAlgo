package LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * Created by vikram on 20/11/16.
 * 102. Binary Tree Level Order Traversal   QuestionEditorial Solution  My Submissions
 Total Accepted: 137546
 Total Submissions: 379371
 Difficulty: Easy
 Contributors: Admin
 Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its level order traversal as:
 [
 [3],
 [9,20],
 [15,7]
 ]
 */
public class BinaryLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list= new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        if (root==null)
             return result;

        TreeNode dummy = new TreeNode(-100);

        queue.add(root);
        queue.add(dummy);

        list.add(root.val);
        result.add(list);

        list= new ArrayList<>();

        while (!queue.isEmpty())
        {
            TreeNode temp= queue.remove();

            if (temp== dummy && !queue.isEmpty())
            {
                result.add(list);
                list = new ArrayList<>();
                queue.add(dummy);
            }

            if (temp.left!=null)
            {
                list.add(temp.left.val);
                queue.add(temp.left);
            }

            if (temp.right!=null)
            {
                list.add(temp.right.val);
                queue.add(temp.right);
            }
        }

      return result;

    }


}
