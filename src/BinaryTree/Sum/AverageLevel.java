package BinaryTree.Sum;

// https://leetcode.com/problems/average-of-levels-in-binary-tree/
// Leetcode problem 637. Average of Levels in Binary Tree

import javax.swing.tree.TreeNode;
import java.util.*;

public class AverageLevel {
    public static void main(String[] args) {

    }

    // main leetcode function...

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
