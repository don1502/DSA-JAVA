package BinaryTree.Sum;

// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
// Leetcode problem 987. Vertical Order Traversal of a Binary Tree

import java.util.*;

public class VerticalOrderTraversal {
    public static void main(String[] args) {
        // To know what is vertical traversal check notes...
    }

    // Main leetcode function...

    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> queue = new LinkedList<Tuple>();
        queue.offer(new Tuple(root, 0, 0));
        while(!queue.isEmpty()){
            Tuple tuple = queue.poll();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;
            if(!map.containsKey(x)) map.put(x, new TreeMap<>());
            if(!map.get(x).containsKey(y)) map.get(x).put(y, new PriorityQueue<>()) ;
            map.get(x).get(y).offer(node.val);
            if(node.left != null) queue.offer(new Tuple(node.left, x - 1, y + 1));
            if(node.right != null) queue.offer(new Tuple(node.right, x + 1, y + 1));
        }
        List<List<Integer>> list = new ArrayList<>();
        for(TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()){
            list.add(new ArrayList<>());
            for(PriorityQueue<Integer> nodes : ys.values()){
                while(!nodes.isEmpty()){
                    System.out.println(nodes.peek());
                    list.get(list.size() - 1).add(nodes.poll());
                }
            }
        }
        return list;
    }

}

class Tuple{
    TreeNode node;
    int row;
    int col;
    public Tuple(TreeNode _node, int _row, int _col){
        node = _node;
        row = _row;
        col = _col;
    }
}
