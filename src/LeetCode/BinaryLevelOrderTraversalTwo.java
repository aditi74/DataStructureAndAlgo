package LeetCode;

import java.util.*;

/**
 * Created by vikram on 18/11/16.
 *  example:
 Given binary tree [3,9,20,null,null,15,7],
 3
 / \
 9  20
 /  \
 15   7
 return its bottom-up level order traversal as:
 [
 [15,7],
 [9,20],
 [3]
 ]

 */
public class BinaryLevelOrderTraversalTwo {

        public static void main(String[] args) {
            TreeNode nodeA = new TreeNode(3);
            TreeNode nodeB = new TreeNode(9);
            TreeNode nodeC = new TreeNode(20);
            TreeNode nodeD = new TreeNode(15);
            TreeNode nodeE = new TreeNode(7);

            nodeA.left = nodeB;
            nodeA.right = nodeC;
            nodeC.left = nodeD;
            nodeC.right = nodeE;

            BinaryLevelOrderTraversalTwo binaryLe = new BinaryLevelOrderTraversalTwo();
            List<List<Integer>> result=binaryLe.levelOrderBottom(nodeA);
            System.out.println(result);



        }


        public List<List<Integer>> levelOrderBottom(TreeNode root) {
            Queue<TreeNode> queue= new ArrayDeque<>();
            TreeNode dummynode= new TreeNode(-100);
            queue.add(root);
            queue.add(dummynode);
            List<List<Integer>> result= new ArrayList<>();
            List<Integer> list= new ArrayList<>();
            list.add(root.val);
            result.add(list);
            list=new ArrayList<>();

            while (!queue.isEmpty())
            {
                TreeNode node= queue.remove();
                if (node==dummynode)
                {

                    if (queue.size()==0)
                        break;;
                    result.add(list);
                    list= new ArrayList<>();

                    queue.add(dummynode);
                }

                if (node.left!=null)
                {
                  queue.add(node.left);
                  list.add(node.left.val);

                }
                if (node.right!=null)
                {
                    list.add(node.right.val);
                    queue.add(node.right);
                }
            }

            int listSize= result.size();
            List<List<Integer>>  res= new ArrayList<>();

            for (int i =listSize-1;i>=0;i--)
              {
                  res.add(result.get(i));

              }





        return res;


        }

}
