package BinaryTree.Sum;

// https://leetcode.com/problems/balanced-binary-tree/
// Leetcode problem 110. Balanced Binary Tree

public class BalancedBinaryTree {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    // Balanced Binary Tree  -> For every node  height(left) - height(right) <= 1

    public boolean isBalanced(TreeNode root) {
        return height(root) != -1;
    }
    int height(TreeNode root){
        if(root == null) return 0;
        int lefth = height(root.left);
        if(lefth == -1) return -1;
        int righth = height(root.right);
        if(righth == -1) return -1;
        if(Math.abs(lefth - righth) > 1) return -1;
        return Math.max(lefth, righth) + 1;
    }

}
