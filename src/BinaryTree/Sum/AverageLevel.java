package BinaryTree.Sum;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
// Leetcode problem 637. Average of Levels in Binary Tree

import java.util.*;

// 1. Remove the javax.swing.tree.TreeNode import

public class AverageLevel {
    public static void main(String[] args) {
        // You can test it here now!
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20, new TreeNode(15), new TreeNode(7));

        System.out.println(averageOfLevels(root)); // Output should be [3.0, 14.5, 11.0]
    }

    // Your main LeetCode function (Logic is completely correct!)
    static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelsize = queue.size();
            double average = 0;

            for (int i = 0; i < levelsize; i++) {
                TreeNode current = queue.poll();
                average += current.val;

                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right);
                }
            }
            average = average / levelsize;
            result.add(average);
        }

        return result;
    }
}