package BitManipulation;

// https://leetcode.com/problems/flipping-an-image/
// Leetcode problem 832. Flipping an Image

import java.util.Scanner;

public class flippingImage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.print("The flipped image is " + flipAndInvertImage(arr));

    }

    // Main leetcode function...

    static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image){
            // reverse the array
            for (int i = 0; i < (image[0].length + 1)/2; i++){
                //swap
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }

}
