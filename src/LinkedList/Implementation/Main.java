package LinkedList.Implementation;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertLast(3);
        list.insertLast(12);
        list.insertLast(4);
        list.insertAny(3, 15);

        list.display();
        list.deleteFirst();
        list.display();
        list.deleteLast();
        list.display();
        list.deleteAnyPosition(3);
        list.display();
        System.out.println("The target value is at " + list.find(3));
    }
}
