package LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vikram on 5/12/16.
 * Given a binary tree, return all root-to-leaf paths.

 For example, given the following binary tree:

 1
 /   \
 2     3
 \
 5
 All root-to-leaf paths are:

 ["1->2->5", "1->3"]
 */
public class RootToLeafPath {
    List<String> stringList= new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        int[] arr= new int[2000];
        rootToLeafPath(root,arr,0);
        return stringList;


    }

    public void rootToLeafPath(TreeNode root, int[] arrpath,int counter)
    {
        if (root==null)
            return;


        arrpath[counter]=root.val;
        counter++;

        if (root.left==null&& root.right==null)
        {

            printArray(arrpath,counter);
        }

        else {
            rootToLeafPath(root.left,arrpath,counter);
            rootToLeafPath(root.right,arrpath,counter);
        }

    }

    private void printArray(int[] arr,int counter)
    {
        String str= "";
        for (int i=0;i<counter;i++)
        {
            str+=String.valueOf(arr[i]);
            if (i!=counter-1)
            str+="->";
        }
        stringList.add(str);



    }


}
