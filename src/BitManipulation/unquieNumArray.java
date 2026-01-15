package BitManipulation;

// Finding unique in an array using bitwise operator...

import java.util.Scanner;

public class unquieNumArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.print("The unique element in array is " + unique(arr));
    }

    static int unique(int[] arr) {
        int res = 0;

        for(int num : arr){
            res ^= num;
        }
        return res;
    }
}
