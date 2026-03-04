package LinkedList;

// https://leetcode.com/problems/middle-of-the-linked-list/
// Leetcode problem 876. Middle of the Linked List

public class MiddleNode {
    public static void main(String[] args) {

    }

    // main leetcode function

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
