package BinaryTree.Sum;

// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
// Leetcode problem 116. Populating Next Right Pointers in Each Node

import java.util.*;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

public class NextRightPointer {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static Node connect(Node root) {
        if(root == null) {
            return null;
        }
        Node leftMost = root;
        while(leftMost.left != null){
            Node current = leftMost;
            while(current != null){
                current.left.next = current.right;
                if(current.next != null){
                    current.right.next = current.next.left;
                }
                current = current.next;
            }
            leftMost = leftMost.left;
        }
        return root;
    }

}
