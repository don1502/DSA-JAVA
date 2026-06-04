package Sorting;

import java.util.Arrays;

public class ArraysSort {
    public static void main(String[] args) {
        int [] arr = {3, 9, 1, 6, 7};
        Arrays.sort(arr); // ----- type 1
        System.out.println(Arrays.toString(arr));

        int [][] arr1 = {
                 {1,9,3}
                ,{6,2,2}
                ,{4,4,1}};
        Arrays.sort(arr1, (a, b) -> a[1] - b[1]);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(Arrays.toString(arr1[i]));
        }

    }
}
