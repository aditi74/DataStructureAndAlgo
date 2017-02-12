package LeetCode;

/**
 * Created by vikram on 12/2/17.
 *
 * Given a binary tree

 struct TreeLinkNode {
 TreeLinkNode *left;
 TreeLinkNode *right;
 TreeLinkNode *next;
 }
 Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

 Initially, all next pointers are set to NULL.

 Note:

 You may only use constant extra space.
 You may assume that it is a perfect binary tree (ie, all leaves are at the same level, and every parent has two children).
 For example,
 Given the following perfect binary tree,
 */

class TreeLinkNode{
    int val;

    TreeLinkNode left, right, next;
    TreeLinkNode(int x) {
        this.val = x; }


}


public class PopulateRightPointers {

  public   void populateRightPointersUtil(TreeLinkNode root)
    {

        if (root.left!=null && root.right!=null)
        {
            root.left.next= root.right;
        }

        if (root.left!=null && root.right==null && root.next!=null)
        {
            TreeLinkNode temp= root.next;

            while (temp.left==null && temp.right==null )
            {
                if (temp.next!=null)
                    temp=temp.next;
                else
                    break;
            }
            //  if temp.
            if (temp.left==null && temp.right==null)
                return;


            if (temp.left!=null)
                root.left.next= temp.left;

            else
                root.left.next=temp.right;

        }

        if (root.right!=null && root.next!=null)
        {

            TreeLinkNode temp= root.next;


            while (temp.left==null && temp.right==null )
            {
                if (temp.next!=null)
                    temp=temp.next;
                else
                    break;
            }
            //  if temp.
            if (temp.left==null && temp.right==null)
                return;


            if (temp.left!=null)
                root.right.next= temp.left;

            else
                root.right.next=temp.right;


        }




    }

    public void connect(TreeLinkNode root) {

        if (root==null || (root.left==null && root.right==null))
           return;



        populateRightPointersUtil(root);

        connect(root.right);
        connect(root.left);




    }

}
