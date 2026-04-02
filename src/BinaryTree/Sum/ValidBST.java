package BinaryTree.Sum;

// https://leetcode.com/problems/validate-binary-search-tree/
// Leetcode problem 98. Validate Binary Search Tree

public class ValidBST {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }
    static boolean helper(TreeNode root, Integer low, Integer high){
        if(root == null) return true;
        if(low != null && root.val <= low) return false;
        if(high != null && root.val >= high) return false;
        boolean leftTree = helper(root.left, low, root.val);
        boolean rightTree = helper(root.right, root.val, high);
        return leftTree && rightTree;
    }

}
