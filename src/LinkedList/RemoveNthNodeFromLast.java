package LinkedList;

// https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// Leetcode problem 19. Remove Nth Node From End of List

public class RemoveNthNodeFromLast {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }
        ListNode current = head;
        ListNode temp = head;
        int length = 1;
        while(length <= n){
            temp = temp.next;
            length++;
        }

        if(temp == null) return head.next;

        while( temp.next != null ){
            temp = temp.next;
            current = current.next;
        }

        if( current.next != null ){
            current.next = current.next.next;
        }

        return head;
    }

}
