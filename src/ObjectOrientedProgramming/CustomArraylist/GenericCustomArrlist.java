package ObjectOrientedProgramming.CustomArraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class GenericCustomArrlist <T>{
    private Object[]  data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public GenericCustomArrlist() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object temp [] = new Object[data.length * 2];
        // Copy the current items in new array

        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T remove = (T)(data[--size]);
        return remove;
    }

    public T get(int i){
        return (T)(data[i]);
    }

    public int size(){
        return size;
    }


    public void set(int index, T val){
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

        GenericCustomArrlist<Integer> customArrList = new GenericCustomArrlist<>();
        // Here we have created an arraylist which is not default as integer and we have to give the type of that arraylist
        // This is how custom generic arraylist works
        customArrList.add(1);
        customArrList.add(2);
        customArrList.add(3);

        GenericCustomArrlist<String> stringList = new GenericCustomArrlist<>();

        stringList.add("Don");
        stringList.add("Gomez");

        System.out.println(customArrList);

        customArrList.remove();
        System.out.println(customArrList);

        System.out.println(stringList);

    }
}
