package Stack_and_Queue.Sum;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
// Leetcode problem 921. Minimum Add to Make Parentheses Valid

import java.util.Stack;

public class MinimumValidParentheses {
    public static void main(String[] args) {

    }

    // main leetcode function

    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()){
            if (ch == ')'){
                if(!stack.isEmpty() && stack.peek() == '('){
                    stack.pop();
                }else {
                    stack.push(ch);
                }
            }else{
                stack.push(ch);
            }
        }
        return stack.size();
    }

}
