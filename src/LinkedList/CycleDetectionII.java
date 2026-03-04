package LinkedList;

// https://leetcode.com/problems/linked-list-cycle-ii/
// Leetcode problem 142. Linked List Cycle II

public class CycleDetectionII {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public ListNode detectCycle(ListNode head) {
        int length = 0;
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                length = cycleLength(slow);
                break;
            }
        }

        if(length == 0){
            return null;
        }

        ListNode f = head;
        ListNode s = head;
        while(length > 0){
            s = s.next;
            length--;
        }
        while(f!=s){
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public int cycleLength( ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                ListNode temp = slow;
                int length = 0;
                do{
                    temp = temp.next;
                    length++;
                }while(temp!=slow);
                return length;
            }
        }
        return 0;

    }

}
