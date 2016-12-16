package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikram on 16/12/16.
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.

 For example:
 Given the following binary tree,
 1            <---
 /   \
 2     3         <---
 \     \
 5     4       <---
 You should return [1, 3, 4].
 */
public class RightViewOfTree {

    //Using preorder Traversal (Modifying preorder traversal a bit)

    public List<Integer> rightSideView(TreeNode root) {

        List<Integer> nodes= new ArrayList<>();
        RightView(root,0,0,nodes);
        List<Integer> finalNode= new ArrayList<>();
        for (int i=nodes.size()-1;i>=0;i--)
        {
            finalNode.add(nodes.get(i));
        }
        return finalNode;
    }

    public void RightView(TreeNode node,int currLevel,int maxlevel,List<Integer> nodes)
    {
        if (node==null)
            return;

        RightView(node.left,currLevel+1,maxlevel,nodes);
        RightView(node.right,currLevel+1,maxlevel,nodes);
        if(currLevel>maxlevel)
        {
            nodes.add(node.val);
            maxlevel=currLevel;
        }

    }
}
