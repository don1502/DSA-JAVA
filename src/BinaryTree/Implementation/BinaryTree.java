package BinaryTree.Implementation;

import java.util.Scanner;

public class BinaryTree {

    public BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }
    private Node root; // Main root node

    // Inserting elements

    public void populate(Scanner input){
        System.out.println("Enter the root node value");
        int value = input.nextInt();
        root = new Node(value);
        populate(input, root);
    } // This method call its helper function which is in private
    private void populate(Scanner input, Node root){
        System.out.println("Do you want to enter from the left of " + root.value + " true/false ");
        boolean left = input.nextBoolean();
        if (left){
            System.out.println("Enter the value from the left of " + root.value );
            int value = input.nextInt();
            root.left = new Node(value);
            populate(input, root.left);
        }

        System.out.println("Do you want to enter from the right of " + root.value + " true/false ");
        boolean right = input.nextBoolean();
        if (right){
            System.out.println("Enter the value from the right of " + root.value);
            int value = input.nextInt();
            root.right = new Node(value);
            populate(input, root.right);
        }
    }

    public void display(){
        display(root, "");
    }
    private void display(Node root, String indent){
        if (root == null){
            return;
        }
        System.out.println(indent + root.value);
        display(root.left, indent + "\t");
        display(root.right, indent + "\t");
    }

    // Displaying prettier way
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
        Scanner input = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(input);
        tree.display();
        tree.prettydisplay();
    }

}
