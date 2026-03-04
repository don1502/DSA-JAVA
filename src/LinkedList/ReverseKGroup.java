package LinkedList;

// https://leetcode.com/problems/reverse-nodes-in-k-group/
// Leetcode problem 25. Reverse Nodes in k-Group

public class ReverseKGroup {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) return head;

        ListNode node = head;
        ListNode prev = null;

        while (true) {

            // Check if at least k nodes exist
            ListNode check = node;
            int count = 0;
            while (count < k && check != null) {
                check = check.next;
                count++;
            }

            // If fewer than k nodes remain → stop
            if (count < k) break;

            ListNode last = prev;
            ListNode newEnd = node;

            ListNode next = null;
            ListNode curr = node;

            // Reverse k nodes
            for (int i = 0; i < k; i++) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            newEnd.next = curr;

            if (curr == null) break;

            prev = newEnd;
            node = curr;
        }

        return head;
    }

}
