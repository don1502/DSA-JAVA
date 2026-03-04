package LinkedList;

// https://leetcode.com/problems/sort-list/
// Leetcode problem 148. Sort List

import java.util.List;

public class SortLinkedList {
    public static void main(String[] args) {

    }

    // Main leetcode function

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode mid = getmid(head);
        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode();
        ListNode tail = dummy;
        while (list1 != null && list2 != null){
            if (list1 .val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1!=null) ? list1 : list2;
        return dummy.next;
    }

    ListNode getmid(ListNode head){
        ListNode midPrev = null;
        while (head != null && head.next != null){
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }

}
