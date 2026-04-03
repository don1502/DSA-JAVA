package BinaryTree.Sum;

// https://leetcode.com/problems/sum-root-to-leaf-numbers/
// Leetcode problem 129. Sum Root to Leaf Numbers

public class SumRootToLeaf {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static int sumNumbers(TreeNode root) {
        return helper(root, 0);
    }
    static int helper(TreeNode root, int sum){
        if(root == null) return 0;
        sum = sum * 10 + root.val;
        if(root.left == null && root.right == null) return sum;
        return helper(root.left, sum) + helper(root.right, sum);
    }

}
