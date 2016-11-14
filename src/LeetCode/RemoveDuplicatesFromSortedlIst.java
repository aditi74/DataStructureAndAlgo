package LeetCode;

/**
 * Given a sorted linked list, delete all duplicates such that each element appear only once.

 For example,
 Given 1->1->2, return 1->2.
 Given 1->1->2->3->3, return 1->2->3.


 * Created by aditi on 13/11/16.
 */
public class RemoveDuplicatesFromSortedlIst {
    public static void main(String[] args) {
        //1->1->2->3->3
        ListNode nodeA= new ListNode(1);
        ListNode nodeB= new ListNode(1);
        ListNode nodeC= new ListNode(2);
       /* ListNode nodeD= new ListNode(3);
        ListNode nodeE= new ListNode(3);*/
        nodeA.next=nodeB;
        nodeB.next=nodeC;
       /* nodeC.next=nodeD;
        nodeD.next=nodeE;
*/
        RemoveDuplicatesFromSortedlIst removeDuplicatesFromSortedlIst= new RemoveDuplicatesFromSortedlIst();
        ListNode node=removeDuplicatesFromSortedlIst.deleteDuplicates(nodeA);

        while (node!=null)
        {
            System.out.println(node.val);
            node= node.next;
        }

    }


    public ListNode deleteDuplicates(ListNode head) {

        ListNode temp= head;
        if ( temp==null|| temp.next==null )
            return temp;
        ListNode upcoming= temp.next;

        while (temp.next!=null)
        {
           if (temp.val==upcoming.val) {
               temp.next = upcoming.next;
               upcoming=temp.next;
           }
           else
           {
               temp=upcoming;
               upcoming=upcoming.next;
           }
        }
        return head;

    }
}

