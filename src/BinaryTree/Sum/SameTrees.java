package BinaryTree.Sum;

// https://leetcode.com/problems/same-tree/
// Leetcode problem 100. Same Tree

public class SameTrees {
    public static void main(String[] args) {

    }

    // Main leetcode problem

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null) return p == q;
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}
