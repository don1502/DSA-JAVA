package Stack_and_Queue.Implementation;

public class CustomStackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // Here itr throws stack is full error.

        System.out.println(stack.pop());
        System.out.println(stack.pop());

        DynamicStack list = new DynamicStack(5);
        list.push(10);
        list.push(20);
        list.push(30);
        list.push(40);
        list.push(50);
        list.push(60); // Here it will not say stack is full as we have built a
        // dynamic way to add item in stack by doubling the length of the original stack

    }
}
