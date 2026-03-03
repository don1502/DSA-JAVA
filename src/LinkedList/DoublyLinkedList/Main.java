package LinkedList.DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        System.out.println("Insert at first");
        list.insertFirst(4);
        list.insertFirst(12);
        list.insertFirst(3);

        list.display();
        list.displayReverse();

        System.out.println("Insert at Last");
        list.insertLast(15);
        list.insertLast(2);
        list.insertLast(6);

        list.display();
        list.displayReverse();

        System.out.println();
        System.out.println("Inserting at any point");

        list.display();

        list.insertAny(4, 10);
        list.display();

        System.out.println("Delete at first");
        list.deleteFirst();
        list.display();

        System.out.println("Delete at last");
        list.deleteLast();
        list.display();

        System.out.println("Delete at any position");
        list.deleteAnyPosition(3);
        list.display();
    }
}
