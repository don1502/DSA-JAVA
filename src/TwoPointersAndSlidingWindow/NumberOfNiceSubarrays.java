package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/count-number-of-nice-subarrays/
// Leetcode problem 1248. Count Number of Nice Subarrays

import java.util.*;

public class NumberOfNiceSubarrays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array '0' & '1' : ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the goal : ");
        int k = input.nextInt();
        System.out.println("Number of nice subarrays are " + numberOfSubarrays(arr, k));
    }

    // main leetcode function....

    static int numberOfSubarrays(int[] nums, int k) {
        int n=nums.length;
        int[]cnt=new int[n+1];
        cnt[0]=1;
        int sum=0,ans=0;
        for(int num:nums){
            sum+=num%2;
            if(sum>=k)
                ans+=cnt[sum-k];
            cnt[sum]++;
        }
        return ans;
    }

}
