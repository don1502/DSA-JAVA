package BinaryTree.Sum;

// https://leetcode.com/problems/count-complete-tree-nodes/
// Leetcode problem 222. Count Complete Tree Nodes

public class CountNodes {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static int countNodes(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

}
