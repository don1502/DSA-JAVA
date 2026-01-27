package LinkedList;

// https://leetcode.com/problems/palindrome-linked-list
// Leetcode problem 234. Palindrome Linked List...

public class palindromeLinkedList {
    public static void main(String[] args) {

//        public class ListNode {
//      int val;
//      ListNode next;
//      ListNode() {}
//      ListNode(int val) { this.val = val; }
//      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
// }


    }

    // Main leetcode function....

    ListNode curr;
    public boolean isPalindrome(ListNode head) {  // This approach uses Recursion.....
        curr = head;
        return solve(head);
    }

    // Time complexity - O(N) Space complexity - O(N) As it uses recursion stack so space complexity is O(N)

    public boolean solve(ListNode head) {
        if(head == null) return true;
        boolean ans = solve(head.next) && head.val == curr.val;
        curr = curr.next;
        return ans;
    }

    // The other approaches...


    // This approach uses an Arraylist which copies the original linkedlist and check for palindrome
    // Time complexity - O(N) Space complexity - O(N) (Because it uses new arraylist which takes N space for N elements)

//    public boolean isPalindrome(ListNode head) {
//        List<Integer> list = new ArrayList();
//        while(head != null) {
//            list.add(head.val);
//            head = head.next;
//        }
//
//        int left = 0;
//        int right = list.size()-1;
//        while(left < right && list.get(left) == list.get(right)) {
//            left++;
//            right--;
//        }
//        return left >= right;
//    }


    // This approach uses stack to find palindrome by pushing all the elements from linkedlist to stack and comparing
    // head of linkedlist with stack.pop()
    // Time complexity - O(N) Space complexity - O(N) (Because it uses new stack which takes N space for N elements)

//    public boolean isPalindrome(ListNode head) {
//        Stack<Integer> stack = new Stack();
//        ListNode curr = head;
//        while(curr != null) {
//            stack.push(curr.val);
//            curr = curr.next;
//        }
//        curr = head;
//        while(curr != null && curr.val == stack.pop()) {
//            curr = curr.next;
//        }
//        return curr == null;
//    }

    // This approach uses two pointer and reversing the second half of linkedlist and check whether
    // 1st half and 2nd half is equal
    // Time complexity - O(N) and space complexity - O(1) as it doesnot change the existing linkedlist....



//    public ListNode reverse(ListNode head) {
//        ListNode prev = null;
//        ListNode curr = head;
//        while(curr != null) {
//            ListNode next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head.next;
//        while(fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//        }
//        ListNode rev = reverse(slow.next); // reverse second list
//        slow.next = null;
//        while(rev != null) {
//            if(head.val != rev.val) {
//                return false;
//            }
//            head = head.next;
//            rev = rev.next;
//        }
//        return true;
//    }

}
