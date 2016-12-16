package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikram on 16/12/16.
 */
public class LeftViewBinaryTree {

    public List<Integer> leftSideView(TreeNode root) {

        List<Integer> nodes= new ArrayList<>();
        leftView(root,0,0,nodes);
        List<Integer> finalNode= new ArrayList<>();
        for (int i=nodes.size()-1;i>=0;i--)
        {
            finalNode.add(nodes.get(i));
        }
        return finalNode;
    }

    public void leftView(TreeNode node,int currLevel,int maxlevel,List<Integer> nodes)
    {
        if (node==null)
            return;

        leftView(node.left,currLevel+1,maxlevel,nodes);
        leftView(node.right,currLevel+1,maxlevel,nodes);
        if(currLevel>maxlevel)
        {
            nodes.add(node.val);
            maxlevel=currLevel;
        }

    }
}
