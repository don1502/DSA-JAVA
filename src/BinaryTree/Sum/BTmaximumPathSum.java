package BinaryTree.Sum;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
// Leetcode problem 124. Binary Tree Maximum Path Sum

public class BTmaximumPathSum {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root);
        return ans;
    }
    int helper(TreeNode root){
        if(root == null) return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        left = Math.max(0, left);
        right = Math.max(0, right);
        int maxSum = left + right + root.val;
        ans = Math.max(ans, maxSum);
        return Math.max(left, right) + root.val;
    }

}
