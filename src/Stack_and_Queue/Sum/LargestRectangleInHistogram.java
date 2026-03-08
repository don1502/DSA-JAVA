package Stack_and_Queue.Sum;

// https://leetcode.com/problems/largest-rectangle-in-histogram/
// Leetcode problem 84. Largest Rectangle in Histogram

import java.util.Stack;

public class LargestRectangleInHistogram {
    public static void main(String[] args) {
        
    }
    
    // Main leetcode function

    static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int max = 0;

        stack.push(0);

        for (int i = 1; i < heights.length; i++){
            while (!stack.isEmpty() && heights[i] < heights[stack.peek()]){
                max =  getMax(heights, stack, max, i);
            }
            stack.push(i);
        }

        int i = heights.length;
        while (!stack.isEmpty()){
            max = getMax(heights, stack, max, i);
        }

        return max;
    }

    static int getMax( int [] arr, Stack<Integer> stack, int max, int i){
        int area;

        int popped = stack.pop();
        if (stack.isEmpty()){
            area = arr[popped] * i;
        }else {
            area = arr[popped] * (i - 1 - stack.peek());
        }

        return Math.max(max, area);
    }
    
}
