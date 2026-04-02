package BinaryTree.Sum;

// https://leetcode.com/problems/diameter-of-binary-tree/
// Leetcode problem 543. Diameter of Binary Tree

public class DiameterOfBinaryTree {
    public static void main(String[] args) {

    }

    // Main leetcode problem....

    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter - 1;
    }

    int height(TreeNode root){
        if(root == null) return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(diameter, dia);

        return Math.max(leftHeight, rightHeight) + 1;
    }

}
