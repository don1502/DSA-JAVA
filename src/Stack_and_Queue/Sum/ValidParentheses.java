package Stack_and_Queue.Sum;

// https://leetcode.com/problems/valid-parentheses/
// Leetcode problem 20. Valid Parentheses

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else {
                if (ch == ')'){
                    if(stack.isEmpty() || stack.pop() != '(') {
                        return false;
                    }
                }
                if (ch == '}'){
                    if(stack.isEmpty() || stack.pop() != '{'){
                        return false;
                    }
                }
                if (ch == ']'){
                    if(stack.isEmpty() || stack.pop() != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

}
