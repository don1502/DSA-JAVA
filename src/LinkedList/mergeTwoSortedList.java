package LinkedList;

// https://leetcode.com/problems/merge-two-sorted-lists
// Leetcode problem 21. Merge Two Sorted Lists

//class ListNode {
//    int val;
//    ListNode next;
//    ListNode() {}
//    ListNode(int val) { this.val = val; }
//    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//} Already we declared this public in reverselinedlist file so dont want to declare it again

public class mergeTwoSortedList {
    public static void main(String[] args) {

    }

    // Main leetcode functionnn....

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode=new ListNode(0);
        ListNode head = null;
        ListNode current=newNode;
        while(list1!=null && list2!=null){
            if(list1.val<=list2.val){
                current.next=list1;
                list1=list1.next;
            }else{
                current.next=list2;
                list2=list2.next;
            }
            current=current.next;
        }
        while(list1!=null){
            current.next=list1;
            list1=list1.next;
            current=current.next;
        }
        while(list2!=null){
            current.next=list2;
            list2=list2.next;
            current=current.next;
        }
        head=newNode.next;
        newNode.next=null;
        return head;
    }
}
