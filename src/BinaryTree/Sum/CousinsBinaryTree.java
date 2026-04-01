package BinaryTree.Sum;

// https://leetcode.com/problems/cousins-in-binary-tree/
// Leetcode problem 993. Cousins in Binary Tree

public class CousinsBinaryTree {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    static boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx = findNode(root, x);
        TreeNode yy = findNode(root, y);
        return ((level(root, xx, 0) == level(root, yy, 0)) && (!isSibling(root, xx, yy)));
    }

    static TreeNode findNode(TreeNode root, int x){
        if( root == null ) return null;
        if(root.val == x) return root;
        TreeNode n = findNode(root.left, x);
        if( n != null) return n;
        return findNode(root.right, x);
    }

    static boolean isSibling(TreeNode root, TreeNode xx, TreeNode yy){
        if( root == null ) return false;
        return ((root.left == xx && root.right == yy) || (root.left == yy && root.right == xx) ||
                isSibling(root.left, xx, yy) || isSibling(root.right, xx, yy)
        );
    }

    static int level(TreeNode root, TreeNode x, int y){
        if(root == null) return 0;
        if(root == x) return y;
        int lev = level(root.left, x, y + 1);
        if(lev != 0) return lev;
        return level(root.right, x, y + 1);
    }

}
