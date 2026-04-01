package BinaryTree.Sum;

// https://leetcode.com/problems/binary-tree-right-side-view/
// Leetcode problem 199. Binary Tree Right Side View

import java.util.*;

public class BinaryTreeRightView {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()){
            int levelsize = queue.size();
            for (int i = 0; i < levelsize; i++) {
                TreeNode current = queue.poll();

                if(i == levelsize - 1){
                    result.add(current.val);
                }

                if (current.left != null){
                    queue.offer(current.left);
                }
                if (current.right != null){
                    queue.offer(current.right);
                }
            }
        }

        return result;
    }

}
