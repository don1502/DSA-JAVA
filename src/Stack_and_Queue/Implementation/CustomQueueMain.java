package Stack_and_Queue.Implementation;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);

        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);

        queue.display();

        System.out.println(queue.remove());

        queue.display();

        CircularQueue queue1 = new CircularQueue(5);
        queue1.insert(10);
        queue1.insert(20);
        queue1.insert(30);
        queue1.insert(40);
        queue1.insert(50);

        queue1.display();

        System.out.println(queue1.remove());

        queue1.display();

    }
}
