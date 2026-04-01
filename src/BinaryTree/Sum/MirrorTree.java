package BinaryTree.Sum;

// https://leetcode.com/problems/symmetric-tree/
// Leetcode problem 101. Symmetric Tree

import java.util.*;

public class MirrorTree {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);

        while(!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if(left == null && right == null) continue;
            if(left == null || right == null) return false;
            if(left.val != right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }
        return true;
    }

}
