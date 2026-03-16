package BinaryTree.Implementation;

public class AVLTree {

    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    public AVLTree(){

    }

    public int height(Node head){
        if (head == null){
            return -1;
        }
        return head.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    // Inserting lower value than root at left and greater at right
    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node head){
        if (head == null){
            head = new Node(value);
            return head;
        }
        if(value < head.value){
            head.left = insert(value, head.left);
        }
        if(value > head.value){
            head.right = insert(value, head.right);
        }
        head.height = Math.max(height(head.left), height(head.right) ) + 1;
        return rotate(head);
    }

    private Node rotate(Node head){
        if (height(head.left) - height(head.right) > 1){
            // left heavy
            if (height(head.left.left) - height(head.left.right) > 0){
                // left - left case
                return rightRotate(head);
            }
            if (height(head.left.left) - height(head.left.right) < 0){
                // left - right case
                head.left = leftRotate(head.left);
                return rightRotate(head);
            }
        }
        if (height(head.left) - height(head.right) < -1){
            // right heavy
            if (height(head.right.left) - height(head.right.right) < 0){
                // right - right case
                return leftRotate(head);
            }
            if (height(head.right.left) - height(head.right.right) > 0){
                // left - right case
                head.right = rightRotate(head.right);
                return leftRotate(head);
            }
        }
        return head;
    }

    private Node leftRotate(Node child) {
        Node parent = child.right;
        Node t = parent.left;
        parent.left = child;
        child.right = t;

        child.height = Math.max(height(parent.left), height(parent.right) + 1);
        child.height = Math.max(height(child.left), height(child.right) + 1);
        return parent;
    }

    private Node rightRotate(Node parent) {
        Node child = parent.left;
        Node t = child.right;
        child.right = parent;
        parent.left = t;

        parent.height = Math.max(height(parent.left), height(parent.right) + 1);
        child.height = Math.max(height(child.left), height(child.right) + 1);
        return child;
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node head){
        if (head == null){
            return true;
        }
        return Math.abs(height(head.left) - height(head.right)) <= 1 && balanced(head.left) && balanced(head.right);
    }

    public void display(){
        display(root, "Root node : ");
    }
    private void display(Node head, String details){
        if (head == null){
            return;
        }
        System.out.println(details + head.value);

        display(head.left, "Left child of " + head.value + " : ");
        display(head.right, "Right child of " + head.value + " : ");

    }

    public void prettydisplay(){
        prettydisplay(root, 0);
    }
    private void prettydisplay(Node node, int level){
        if (node == null){
            return;
        }
        prettydisplay(node.right, level + 1);
        if (level != 0){
            for (int i = 0; i < level - 1; i++){
                System.out.print("|\t");
            }
            System.out.println("|---->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettydisplay(node.left, level + 1);
    }

    public static void main(String[] args) {
        int [] nums ={7, 9, 5, 6, 9, 10, 8, 2, 3, 4, 1};
        AVLTree tree = new AVLTree();
        tree.populate(nums);
        tree.display();
        tree.prettydisplay();
    }

}
