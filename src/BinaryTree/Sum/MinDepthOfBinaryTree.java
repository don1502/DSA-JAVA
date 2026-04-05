package BinaryTree.Sum;

// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Leetcode problem 111. Minimum Depth of Binary Tree

public class MinDepthOfBinaryTree {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if(left == 0 || right == 0) return Math.max(left, right) + 1;
        return Math.min(left, right) + 1;
    }

}
