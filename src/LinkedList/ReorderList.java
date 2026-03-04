package LinkedList;

// https://leetcode.com/problems/reorder-list/
// Leetcode problem 143. Reorder List

public class ReorderList {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        ListNode head1 = head;

        // Rearranging according to the given order
        while(head1 != null && head2 != null){
            ListNode temp = head1.next;
            head1.next = head2;
            head1 = temp;

            temp = head2.next;
            head2.next = head1;
            head2 = temp;
        }
        if(head1 != null){
            head1.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        return head;
    }

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
