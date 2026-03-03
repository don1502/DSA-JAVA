package LinkedList;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list
// Leetcode problem no. 83. Remove Duplicates from Sorted List

public class RemoveDub {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;
        if(head == null){
            return head;
        }
        while(current.next != null){
            if(current.next != null && current.val == current.next.val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return head;
    }

}
