package LeetCode;

/**
 * Created by vikram on 20/11/16.
 * 141. Linked List Cycle   QuestionEditorial Solution  My Submissions
 Total Accepted: 143034
 Total Submissions: 397739
 Difficulty: Easy
 Contributors: Admin
 Given a linked list, determine if it has a cycle in it.

 Follow up:
 Can you solve it without using extra space?

 Subscribe to see which companies asked this question
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head==null||head.next==null)
            return false;

        ListNode fast= head;
        ListNode slow= head;

        while (fast.next!=null && fast.next.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;

            if (fast==slow)
                return true;


        }

        return false;

    }

}
