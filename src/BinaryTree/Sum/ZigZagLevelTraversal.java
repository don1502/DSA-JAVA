package BinaryTree.Sum;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
// Leetcode problem 103. Binary Tree Zigzag Level Order Traversal

import java.util.*;

public class ZigZagLevelTraversal {
    public static void main(String[] args) {

    }

    // Main leetcode function....

    static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) return result;

        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while (!queue.isEmpty()){
            int levelsize = queue.size();
            List<Integer> currentList = new ArrayList<>();
            for (int i = 0; i < levelsize; i++) {
                // Both used to maintain zigzag traversal
                if(!reverse){ // Normal order
                    TreeNode current = queue.pollFirst(); // removing from front
                    currentList.add(current.val);
                    if (current.left != null){
                        queue.addLast(current.left); // And adding in the last
                    }
                    if (current.right != null){
                        queue.addLast(current.right);
                    }
                }else{ // reverse
                    TreeNode current = queue.pollLast(); // removing from front
                    currentList.add(current.val);
                    if (current.right != null){
                        queue.addFirst(current.right);
                    }
                    if (current.left != null){
                        queue.addFirst(current.left); // And adding in the last
                    }
                }
            }
            reverse = !reverse;
            result.add(currentList);
        }

        return result;

    }

}
