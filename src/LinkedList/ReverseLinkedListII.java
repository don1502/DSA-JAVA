package LinkedList;

// https://leetcode.com/problems/reverse-linked-list-ii/
// Leetcode problem 92. Reverse Linked List II

public class ReverseLinkedListII {
    public static void main(String[] args) {

    }

    // Main leetcode function
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode node = head; // node = current
        ListNode a = null; // a = previous
        if(left == right){
            return head;
        }
        for (int i = 0; node != null && i < left-1; i++){
            a = node;
            node = node.next;
        }
        ListNode last = a;
        ListNode newEnd = node;
        ListNode after = node.next; // after = next
        for (int i = 0; node != null && i < right - left + 1; i++){
            node.next = a;
            a = node;
            node = after;
            if(after != null){
                after = after.next;
            }
        }
        if(last != null){
            last.next = a;
        }else{
            head = a;
        }
        newEnd.next = node;
        return head;
    }

}
