package LeetCode;

/**
 * Created by vikram on 19/2/17.
 * Remove all elements from a linked list of integers that have value val.

 Example
 Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
 Return: 1 --> 2 --> 3 --> 4 --> 5


 */
public class RemoveLinkedListElements {


    public static void main(String[] args) {



    }

    public ListNode removeElements(ListNode head, int val) {


        if (head==null)
            return head;

        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null)
        {
            if(prev==null && temp.val>val)
            {
                head=temp.next;
                temp=temp.next;
            }


            else{

                if(temp.val>val)
                {
                    if (temp.next!=null)
                        prev.next=temp.next;
                    else
                        prev.next=null;
                    temp=prev.next;
                }

                else
                {
                    prev=temp;
                    temp=temp.next;

                }



            }


        }


        return head;


    }
}
