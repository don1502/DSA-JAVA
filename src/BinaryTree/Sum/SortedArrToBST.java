package BinaryTree.Sum;

// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Leetcode problem 108. Convert Sorted Array to Binary Search Tree

public class SortedArrToBST {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static public TreeNode sortedArrayToBST(int[] nums) {
        return convert(nums, 0, nums.length - 1);
    }

    static TreeNode convert(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode node = new TreeNode(nums[mid]);

        node.left = convert(nums, left, mid - 1);
        node.right = convert(nums, mid + 1, right);

        return node;
    }

}
