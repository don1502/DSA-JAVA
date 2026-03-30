package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/subarrays-with-k-different-integers/
// Leetcode problem 992. Subarrays with K Different Integers

import java.util.*;

public class SubarrayWithKDifferentInt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the goal : ");
        int k = input.nextInt();
        System.out.println("Number of subarrays with K different Integers are " + subarraysWithKDistinct(arr, k));
    }

    // Main leetcode function....

    static int subarraysWithKDistinct(int[] nums, int k)  {
        int subK = helper(nums,k);
        int sub = helper(nums,k-1);
        return subK-sub;
    }
    private static int helper(int nums[], int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int left=0;
        int right=0;
        int count=0;
        while(right<nums.length){
            map.put(nums[right], map.getOrDefault(nums[right],0)+1);
            while(map.size()>k){
                map.put(nums[left],map.get(nums[left])-1);
                if(map.get(nums[left])==0){
                    map.remove(nums[left]);
                }
                left++;
            }
            count = count+ right-left+1;
            right++;
        }
        return count;
    }

}
