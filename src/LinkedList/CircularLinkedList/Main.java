package LinkedList.CircularLinkedList;

public class Main {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        System.out.println("Inserting values");
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Displaying circular linked list");
        list.display();

        System.out.println("Deletion of element");
        list.delete(30);
        list.display();
    }
}
