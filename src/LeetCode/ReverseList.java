package LeetCode;

/**
 * Created by aditi on 13/11/16.
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode nodeA= new ListNode(1);
        ListNode nodeB= new ListNode(2);
        ListNode nodeC= new ListNode(3);

        nodeA.next=nodeB;
        nodeB.next=nodeC;

        ReverseList reverseList= new ReverseList();
        ListNode nodeD= reverseList.reverseRecursive(nodeA);
        while (nodeD!=null)
        {
            System.out.println(nodeD.val);
            nodeD= nodeD.next;
        }
    }

    public ListNode reverseIterative(ListNode node)
    {
        if (node==null)
            return node;

        ListNode curr=node;
        ListNode prev= null;
        ListNode upcoming = null;

        while (curr!=null)
        {
            upcoming=curr.next;
            curr.next=prev;
            prev=curr;
            curr=upcoming;


        }

    return prev;

    }


    public ListNode reverseRecursive(ListNode node)
    {
        if (node==null || node.next==null)
            return node;

        ListNode second=node.next;

        node.next=null;

        ListNode rest= reverseRecursive(second);
        second.next=node;
        return rest;


    }
}
