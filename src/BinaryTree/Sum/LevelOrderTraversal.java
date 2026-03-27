package BinaryTree.Sum;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
// Leetcode problem 102. Binary Tree Level Order Traversal

import java.util.*;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println(levelOrder(root));
    }

    // Main leetcode function...
    static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                TreeNode current = queue.poll();
                currentList.add(current.val);
                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right);
                }
            }
            result.add(currentList);
        }

        return result;

    }

}
