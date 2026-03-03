package LinkedList.DoublyLinkedList;

//  --------- DOUBLY LINKED LIST IMPLEMENTATION --------


import LinkedList.Implementation.LinkedList;

public class DoublyLinkedList {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val); // Declaring new node

        node.next = head; // As we are inserting at first, new node's next will point head
        node.prev = null; // And also new node's previous will point null
        if (head != null){ // To handle NULLPOINTEREXCEPTION check whether the head is not null
            head.prev = node; // If not null head's previous is new node as new node is inserting at 1st.
        }
        head = node; // As inserted at first making the new node as head.
    }

    public void insertLast(int val){ // Inserting at last
        Node current = head; // Temperary node for traversing

        if (head == null){ // To handle NULLPOINTEREXCEPTION check whether the head is not null
            insertFirst(val); // If null then insert at first
            return;
        }

        while (current.next != null){ // Traversing till last node
            current = current.next; // Updating current
        }

        Node node = new Node(val); // Declaration of new node with given value
        node.next = null; // As the new node is inserted at last, new node's next will point null
        node.prev = current; // As current node is the last node of the existing doubly linkedlist and new node is last node
                            // making new node's previous is current.
        current.next = node; // Updating the doubly link.
    }

    public void insertAny(int index, int value){ // Inserting at any position
        // Get position and value from the user.
        if (index == 0 ){ // If the index is 0 then it means inserting at first.
            insertFirst(value); // So insert 1st
            return;
        }

        Node before = null; // A new before node which points null.
        Node current = head; // This acts as temperary node

        for (int i = 0; i < index-1; i++) { // Traversing till position index-2 as we want the element to be in the given index
            before = current; // Before will be indicating index-1
            current = current.next; // Current will be indicating index+1
        }

        Node node = new Node(value); // Creating new node
        before.next = node; // Connecting next of previous to new node
        node.next = current;// New node's next is current --> This make the new node value to be inserted into linkedlist
        node.prev = before; // Making the proper links between nodes.
        current.prev = node;

    }

    public void deleteFirst(){ // Deleting at 1st position
        if (head == null){
            System.out.println("No node to delete");
        }
//      Node prev = head;
        head = head.next;// Just by making the head to next, 1st element will be removed.
        head.prev = null;
    }

    public void deleteLast(){ // Deleting at the last position

        Node current = head;

        while (current.next.next != null){
            current = current.next;
        }
        Node last = current.next; // making current node as secondlast node.
        current.next = null; // As now, secondlast is the tail, making it tail.
        last.prev = null; // Always tail should point null.

    }

    public void deleteAnyPosition(int index){
        if (index == 0 ){ // If the index is 0 then it means deleting at first.
            deleteFirst(); // So delete 1st
            return;
        }

        Node current = head; //current node for traversing
        Node previous = null; // Previous node which will be denoting previous of the current node
        Node after = current; // After node will be pointing current node at 1st

        for (int i = 0; i < index-1; i++) { // Traversing till index-1
            previous = current; // making previous to current
            current = current.next; // traversing current node to next node of current
            after = current.next; // Traversing after node to next node of current (updated current from above)
        }
        previous.next = after; // Cutting the link between previous and current and  connnecting to after.
        current.next = null; // As current node is removed from linked list, point its next to null.
        current.prev = null; // Completely removing the current node
        after.prev = previous; // Connecting previous and after
    }

    public Node find(int value){
        Node node = head;
        while (node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){  // This function helps us to print/display the elements in the linkedlist
        Node temp = head; // As head should not be changed unless structure of linkedlist is modified we create a temp node

        while (temp != null){ // Traversing the temp node till null
            System.out.print(temp.value + " -> "); // Printing the value od temp node
            temp = temp.next; // Traversing next node
        }
        System.out.print("NULL\n");
    }

    public void displayReverse(){  // This function helps us to print/display the elements in the linkedlist
        Node temp = head; // As head should not be changed unless structure of linkedlist is modified we create a temp node
        Node node = null;
        while (temp != null){ // Traversing the temp node till null
            node = temp; // Updating a node so that at the end of this loop it points the last node.
            temp = temp.next;// Traversing next node
        }
        while (node != null){ // Traversing from the last node
            System.out.print(node.value + " -> "); // Printing the last node
            node = node.prev; // Traversing backward
        }
        System.out.print("NULL\n");
    }

    private class Node { // Node declaration class and its constructor.
        private int value; // A node has value and next
        private Node next;// Next contain memory address of next node
        private Node prev; // Previous contain memory address of previous node.

        public Node(int value) {
            this.value = value;
        }

    }
}
