package LinkedList;

// https://leetcode.com/problems/linked-list-cycle/
// Leetcode problem 141. Linked List Cycle

public class CycleDetection {
    public static void main(String[] args) {
        // Whenever we see cycle detection we should fast and slow pointer.
        // If there is a cycle present then definitely fast and slow pointer will meet, so that time return true
        // Else return false ----> No cycle detected.
    }

    // main leetcode function

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

}
