package Stack_and_Queue.Sum;

// https://leetcode.com/problems/implement-queue-using-stacks/
// Leetcode problem 232. Implement Queue using Stacks

import java.util.Stack;

public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        QueueUsingStack stack = new QueueUsingStack();
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);

        System.out.println(stack.remove());
        System.out.println(stack.peek());

    }

    // We cant make queue with one stack, so we use two stacks...

}

class QueueUsingStack{
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void add(int item){
        first.push(item);
    }

    public int remove(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int removed = second.pop();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }

    public boolean isEmpty(){
        return first.isEmpty(); // As 1st stack is main, we just check whether the 1st stack is empty or not
    }

    public int peek(){
        while (!first.isEmpty()){
            second.push(first.pop());
        }

        int peeked = second.peek();
        while (!second.isEmpty()){
            first.push(second.pop());
        }
        return peeked;
    }

}
