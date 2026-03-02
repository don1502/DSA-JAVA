package ObjectOrientedProgramming.CustomArraylist;

// Generic and custom Arraylist

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrList {

    private int []  data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArrList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int temp [] = new int[data.length * 2];
        // Copy the current items in new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public int remove(){
        int remove = data[--size];
        return remove;
    }

    public int get(int i){
        return data[i];
    }

    public int size(){
        return size;
    }


    public void set(int index, int val){
        data[index] = val;
    }

    @Override
    public String toString() {
        return "CustomArrList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }


    public static void main(String[] args) {
        ArrayList list = new ArrayList(); // this is the inbuilt arraylist
        // instead of inbuilt we will use our custom arraylist

        CustomArrList customArrList = new CustomArrList();
        customArrList.add(1);
        customArrList.add(2);
        customArrList.add(3);

        System.out.println(customArrList);

        customArrList.remove();
        System.out.println(customArrList);

    }
}
