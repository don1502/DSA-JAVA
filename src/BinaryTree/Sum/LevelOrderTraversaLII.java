package BinaryTree.Sum;

// https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
// Leetcode problem 107. Binary Tree Level Order Traversal II

import java.util.*;

public class LevelOrderTraversaLII {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static List<List<Integer>> levelOrderBottom(TreeNode root) {
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
            result.add(0,currentList); // It is just same as level order traversal but with index specified....
        }

        return result;

    }

}
