package LeetCode;

import java.util.Stack;

/**
 * Created by vikram on 5/12/16.
 *
 * Implement the following operations of a queue using stacks.

 push(x) -- Push element x to the back of queue.
 pop() -- Removes the element from in front of queue.
 peek() -- Get the front element.
 empty() -- Return whether the queue is empty.
 */
public class ImplementQueueFromStack {

     Stack<Integer> stack= new Stack();

    // Push element x to the back of queue.
    public void push(int x) {

        stack.push(x);
    }

    // Removes the element from in front of queue.
    public void pop() {
        Stack<Integer> tempStack= new Stack();
        while (!stack.isEmpty())
        {
            tempStack.push(stack.pop());

        }

        tempStack.pop();

        while (!tempStack.isEmpty())
        {
            stack.push(tempStack.pop());
        }

    }

    // Get the front element.
    public int peek() {

        Stack<Integer> tempStack= new Stack();
        while (!stack.isEmpty())
        {
            tempStack.push(stack.pop());

        }

        int ele=tempStack.peek();

        while (!tempStack.isEmpty())
        {
            stack.push(tempStack.pop());
        }

        return ele;

    }

    // Return whether the queue is empty.
    public boolean empty() {
        return stack.isEmpty();

    }

}
