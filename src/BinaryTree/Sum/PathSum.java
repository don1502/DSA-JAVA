package BinaryTree.Sum;

// https://leetcode.com/problems/path-sum/
// Leetcode problem 112. Path Sum

public class PathSum {
    public static void main(String[] args) {

    }

    // Main leetcode problem...

    static boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null) return false;
        if(root.val == targetSum && root.left == null && root.right == null) return true;
        return hasPathSum(root.left , targetSum - root.val) || hasPathSum(root.right , targetSum - root.val);
    }

}
