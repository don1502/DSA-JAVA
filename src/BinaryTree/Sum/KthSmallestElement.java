package BinaryTree.Sum;

// https://leetcode.com/problems/kth-smallest-element-in-a-bst/
// Leetcode problem 230. Kth Smallest Element in a BST

public class KthSmallestElement {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static int count = 0;

    static int kthSmallest(TreeNode root, int k){
        return helper(root, k).val;
    }

    static TreeNode helper(TreeNode root, int k) {
        if(root == null) return null;
        TreeNode left = helper(root.left, k);
        if(left != null) return left;
        count++;
        if(count == k) return root;
        return helper(root.right, k);
    }

}
