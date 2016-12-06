package LeetCode;

import java.util.HashMap;
import java.util.Stack;

/**
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

 The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * Created by vikram on 5/12/16.
 */
public class IsValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character,Character> map= new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');


        Stack<Character> stack= new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if (map.containsKey(s.charAt(i)))
            {
                if (stack.isEmpty())
                    return false;

                if (stack.peek()== map.get(s.charAt(i)))
                    stack.pop();
                else
                    stack.push(s.charAt(i));


            }

            else
                stack.push(s.charAt(i));




        }

        if (stack.isEmpty())
            return true;

        else
            return false;





    }
}
