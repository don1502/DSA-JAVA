package Binarysearch;

// https://leetcode.com/problems/h-index-ii
// Leetcode problem 275. H-Index II

import java.util.Scanner;

public class H_IndexCitations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        int result = hIndex(arr);
        System.out.print("The number of citations >= 1 is "  + result);
    }

    // Main leetcode functon ...

    static int hIndex(int[] citations) {
        int ans=0,i=1,j=citations.length;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(citations[citations.length-mid]>=mid){
                ans=mid;
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return ans;
    }
}
