package BinaryTree.Sum;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// Leetcode problem 236. Lowest Common Ancestor of a Binary Tree

public class LeastCommonAncestor {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if(root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        if(left != null && right != null) return root;

        return left == null ? right : left;

    }

}
