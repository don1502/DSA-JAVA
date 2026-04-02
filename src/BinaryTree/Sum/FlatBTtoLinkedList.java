package BinaryTree.Sum;

// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
// Leetcode problem 114. Flatten Binary Tree to Linked List

public class FlatBTtoLinkedList {
    public static void main(String[] args) {

    }

    // main leetcode function...

    static void flatten(TreeNode root) {
        TreeNode curr = root;
        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left;
                while(temp.right != null) temp = temp.right;
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }

}
