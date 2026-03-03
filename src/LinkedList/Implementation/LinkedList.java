package LinkedList.Implementation;

public class LinkedList {

    private Node head; // Declaring head, which is very important, it is used to access the linkedlist
    private Node tail; // Declaring tail, it is not necessary and optional, tail represent last node of linkedlist.
    private int size;

    public LinkedList(){
        this.size=0;
    }

    public void insertFirst(int val){ // This function helps us to insert an element at the beginning of the linkedlist
        Node node = new Node(val); // Creating new node with value to insert in to the linkedlist.
        node.next = head; // Inserting in first, before head
        head = node; // As new node is first and it should act as head, asigning head to new node.

        if (tail == null){
            tail = head;
        }
        size+=1;
    }

    public void insertLast(int val){

        if (tail == null ){ // Checking whether the linkedlist is null or not
            insertFirst(val); // if null insert the given value at first
            return;
        }

        // Else
        Node node = new Node(val); // Create node
        tail.next = node; // As tail will be at last and we need to insert the value at last node, tail's next is new node
        tail = node; // As tail should be always last making the new node as tail.
        size+=1;
    }

    public void insertAny(int index, int value){ // Inserting at any position
        // Get position and value from the user.
        if (index == 0 ){ // If the index is 0 then it means inserting at first.
            insertFirst(value); // So insert 1st
            return;
        }

        if (index == size){ // If the index is size then it means inserting at last.
            insertLast(value); // So insert last
            return;
        }

        Node prev = null; // A new previous node which points null.
        Node current = head; // This acts as temperary node

        for (int i = 0; i < index; i++) { // Traversing till position index-1
            prev = current; // Previous will be indicating index-1
            current = current.next; // Current will be indicating index+1
        }

        Node node = new Node(value); // Creating new node
        prev.next = node; // Connecting next of previous to new node
        node.next = current; // New node's next is current --> This make the new node value to be inserted into linkedlist

    }

    public void deleteFirst(){ // Deleting at 1st position
        if (head == null){
            System.out.println("No node to delete");
        }
//      Node prev = head;
        head = head.next; // Just by making the head to next, 1st element will be removed.
    }

    public void deleteLast(){ // Deleting at the last position

        Node current = head;

        for (int i = 0; i < size-2; i++) { // Traversing till the second last node.
            current = current.next;
        }

        Node secondLast = current; // making current node as secondlast node.
        tail = secondLast; // As now, secondlast is the tail, making it tail.
        tail.next = null; // Always tail should point null.

    }

    public void deleteAnyPosition(int index){
        if (index == 0 ){ // If the index is 0 then it means inserting at first.
            deleteFirst(); // So insert 1st
            return;
        }

        Node current = head;
        Node previous = null;
        Node after = current;

        for (int i = 0; i < index; i++) {
            previous.next = current;
            current = current.next;
            after = current.next;
        }
        previous.next = after;
        current.next = null;
    }

    public void display(){  // This function helps us to print/display the elements in the linkedlist
        Node temp = head; // As head should not be changed unless structure of linkedlist is modified we create a temp node

        while (temp != null){ // Traversing the temp node till null
            System.out.print(temp.value + " -> "); // Printing the value od temp node
            temp = temp.next; // Traversing next node
        }
        System.out.print("NULL\n");
    }

    private class Node{ // Node declaration class and its constructor.
        private int value; // A node has value and next
        private Node next; // Next contain memory address of next node

        public Node(int value){
            this.value = value;
        }

//        public Node(int value, Node next){
//            this.value = value;
//            this.next = next;
//        }

    }
}
