package Stack_and_Queue.Implementation;

import java.util.*;

public class CustomStack {
    protected  int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){

        if (isFull()){
            System.out.println("Stack is full");
            return false;
        }

        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot pop from an empty stack");
        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peek() throws Exception{
        if (isEmpty()){
            throw new Exception("Cannot peek from an empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length -1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

    public static class DynamicStack {
    }

    public static class InbuiltStackandQueue {
        public static void main(String[] args) {
            Stack<Integer> stack = new Stack<>();

            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());


            Queue<Integer> queue = new LinkedList<>();

            queue.add(10);
            queue.add(20);
            queue.add(30);
            queue.add(40);

            System.out.println(queue.remove());
            System.out.println(queue.remove());

            System.out.println(queue.peek());

            Deque<Integer> deque = new ArrayDeque<>(); // It is mostly used in tress

            deque.add(10);
            deque.add(20);
            deque.add(30);

            System.out.println(deque.remove());

        }
    }
}
