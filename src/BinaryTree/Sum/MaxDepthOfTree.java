package BinaryTree.Sum;

// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Leetcode problem 104. Maximum Depth of Binary Tree

public class MaxDepthOfTree {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int depth = Math.max(left, right) + 1;
        return depth;
    }

}
