package LeetCode;

/**
 * Created by vikram on 16/12/16.
 */

import java.util.TreeMap;
import java.util.TreeMap;

/**
 * Created by vikram on 16/12/16.
 *
 * Given a binary tree, print the values of nodes that would appear when the tree is viewed from top. Print the node values starting from left-most end.
 *
 *
 */

//a modified hashmap which keeps entries sorted by key
public class BottomView {

    public TreeMap<Integer,Integer> map=new TreeMap<>();
    public static void main(String[] args) {
        TreeNode node1= new TreeNode(1);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(3);
        TreeNode node4= new TreeNode(4);
        TreeNode node5= new TreeNode(5);
        TreeNode node6= new TreeNode(6);
        TreeNode node7= new TreeNode(7);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        node2.right=node5;
        node3.left=node6;
        node3.right=node7;
        //map= new TreeMap<>();
        BottomView bottomViewOfBinaryTree= new BottomView();
        bottomViewOfBinaryTree.bottomView(node1,0);
        bottomViewOfBinaryTree.mapTraversal();
        // System.out.println();
        //for(Integer key: )

    }

    public void mapTraversal()
    {

        for(Integer key:map.keySet())
            System.out.println( map.get(key));
    }



    public  void bottomView(TreeNode node,int counter)
    {
        if (node==null)
        {
            return;
        }

        if (map.containsKey(counter))
        {
            map.put(counter,node.val);
        }
        else
            map.put(counter,node.val);

        bottomView(node.left,counter-1);
        bottomView(node.right,counter+1);




    }



}

