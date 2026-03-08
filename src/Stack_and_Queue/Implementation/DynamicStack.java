package Stack_and_Queue.Implementation;

public class DynamicStack extends CustomStack{

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {

        // This will take care of being full

        if (this.isFull()){
            // Double the array size
            int [] temp = new int[data.length * 2];
            
            // copy all previous items in new array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }

        return super.push(item);
    }
}
