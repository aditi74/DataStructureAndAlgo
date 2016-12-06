package LeetCode;

/**
 * Created by vikram on 24/11/16.
 * Given a linked list, remove the nth node from the end of list and return its head.

 For example,

 Given linked list: 1->2->3->4->5, and n = 2.

 After removing the second node from the end, the linked list becomes 1->2->3->5.
 Note:
 Given n will always be valid.
 Try to do this in one pass.

 ***/
public class NthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr= null;
        ListNode moving=head;

        int i=1;

        while(i<n )
        {
            moving=moving.next;
            i++;
        }


        while(moving.next!=null)
        {
            if (curr==null)
                curr=head;
            else
                curr=curr.next;
            moving=moving.next;
        }

        if (curr==null)
            return head.next;

        else
        {
            curr.next=curr.next.next;
        }
        return head;
    }
}
