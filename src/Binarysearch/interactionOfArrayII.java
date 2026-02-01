package Binarysearch;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/
// Leetcode problem 350. Intersection of Two Arrays II

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class interactionOfArrayII {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = input.nextInt();
        }
        int m = input.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = input.nextInt();
        }

        System.out.print("The intersection of two lists are " + intersect(arr1, arr2));
    }

    // Main leetcode function...

    static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums2) {
            if(map.containsKey(num) && map.get(num) > 0) {
                list.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        int[] ans = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            ans[i] = list.get(i);
        }

        return ans;
    }

}
