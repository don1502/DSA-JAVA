package Stack_and_Queue.Sum;

// Creating binary representation for each number till N

import java.util.*;

public class NBinaryNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Binary numbers from 1 to " + n + " are:");
        Queue<String> queue = new LinkedList<>();
        queue.offer("1");
        for(int i = 0; i < n; i++){
            String curr = queue.poll();
            System.out.println(curr);
            queue.offer(curr + "0");
            queue.offer(curr + "1");
        }
    }
}
