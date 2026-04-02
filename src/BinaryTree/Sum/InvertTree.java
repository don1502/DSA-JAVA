package BinaryTree.Sum;

// https://leetcode.com/problems/invert-binary-tree/
// Leetcode problem 226. Invert Binary Tree

public class InvertTree {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.right = left;
        root.left = right;
        return root;
    }

}
