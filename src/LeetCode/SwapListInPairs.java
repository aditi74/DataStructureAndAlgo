package LeetCode;

/**
 * Created by vikram on 19/11/16.
 * Given a linked list, swap every two adjacent nodes and return its head.

 For example,
 Given 1->2->3->4, you should return the list as 2->1->4->3.

 Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 */
public class SwapListInPairs {

    public static void main(String[] args) {
        ListNode nodeA= new ListNode(1);
        ListNode nodeB= new ListNode(2);
        ListNode nodeC= new ListNode(3);
        ListNode nodeD= new ListNode(4);
        ListNode nodeE= new ListNode(5);


        nodeA.next= nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        nodeD.next=nodeE;

        SwapListInPairs swapListInPairs= new SwapListInPairs();
        ListNode result=swapListInPairs.swapPairs(nodeA);

        while (result!=null){
            System.out.println(result.val);

        result=result.next;}
    }

    public ListNode swapPairs(ListNode head) {
        if (head==null || head.next==null)
            return head;


        ListNode curr= head.next;
        ListNode temp= curr.next;
        head.next=null;

        curr.next=head;

        head.next= swapPairs(temp);
        return curr;



    }
}
