package LinkedList.CircularLinkedList;

// Circular Linked list implementation

public class CircularLinkedList {

    private Node head; // Declaration of head
    private Node tail; // Declaration of tail

    public CircularLinkedList() {
        // Both head and tail is null in beginning as both pointer points same.
        this.head = null;
        this.tail = null;
    }

    public void insert(int val){ // Inserting value in circular linked list
        Node node = new Node(val); // New node with value to be inserted
        if (head == null){ // If head is null, then the value will be inserted first
            head = node;
            tail = node;
            return;
        }
        tail.next = node; // making new nodes and inserting it
        node.next = head;
        tail = node;
    }

    public void delete(int val){
        Node current = head;

        while (current.next.value != val){
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void display(){ // Displaying the circular linked list
        Node node = head;
        if (head != null){
            do {
                System.out.print(node.value + " -> ");
                node = node.next;
            }while (node!=head);
        }
        System.out.print("HEAD\n");
    }

    private class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }
}
