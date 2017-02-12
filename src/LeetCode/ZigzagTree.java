package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by vikram on 12/2/17.
 * Given a binary tree, return the zigzag level order traversal of its nodes' values. (ie, from left to right, then right to left for the next level and alternate between).

 For example:
 Given binary tree [3,9,20,null,null,15,7],
 */
public class ZigzagTree {


    public static void main(String[] args) {
        TreeNode nodeA= new TreeNode(5);
        TreeNode nodeB= new TreeNode(3);
        TreeNode nodeC= new TreeNode(1);
        TreeNode nodeD= new TreeNode(7);

        //
        nodeA.left=nodeB;
        nodeA.right=nodeD;
        nodeB.left=nodeC;



        ZigzagTree zigzagTree= new ZigzagTree();

        List<List<Integer>> result= zigzagTree.zigzagLevelOrder(nodeA);





    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        Stack<TreeNode> stackright= new Stack<>();
        Stack<TreeNode> stackleft= new Stack<>();

        if (root==null)
           return result;


        boolean flagright=false;

        stackright.push(root);

        List<Integer> vals= new ArrayList<>();
        while (!stackleft.isEmpty() || !stackright.isEmpty())
        {
            if (flagright)
            {
                while (!stackleft.isEmpty())
                {
                    TreeNode node= stackleft.pop();
                    vals.add(node.val);

                    if (node.right!=null)
                    {
                        stackright.push(node.right);
                    }

                    if (node.left!=null)
                    {
                        stackright.push(node.left);
                    }

                }

                flagright=false;
                result.add(vals);
                vals= new ArrayList<>();

            }

            else {


                while (!stackright.isEmpty())
                {
                    TreeNode node= stackright.pop();
                    vals.add(node.val);
                    if (node.left!=null)
                    {
                        stackleft.push(node.left);
                    }
                    if (node.right!=null)
                    {
                        stackleft.push(node.right);
                    }


                }

                flagright=true;
                result.add(vals);
                vals= new ArrayList<>();


            }



        }

        return result;



    }
}
