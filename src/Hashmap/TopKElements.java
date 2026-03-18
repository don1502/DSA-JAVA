package Hashmap;

// https://leetcode.com/problems/top-k-frequent-elements/
// Leetcode problem 347. Top K Frequent Elements

import java.util.*;

public class TopKElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = input.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the k value: ");
        int k = input.nextInt();
        System.out.println("Top K elements are " + Arrays.toString(topKFrequent(arr, k)));
    }

    // Main leetcode function...

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) freq.put(n, freq.getOrDefault(n, 0) + 1);

// Step 2: Sort by frequency (or use bucket sort for O(n))
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freq.keySet()) {
            int f = freq.get(key);
            if (bucket[f] == null) bucket[f] = new ArrayList<>();
            bucket[f].add(key);
        }
// Step 3: Pick top k from high frequency buckets
        int[] result = new int[k]; int idx = 0;
        for (int i = bucket.length - 1; i >= 0 && idx < k; i--)
            if (bucket[i] != null)
                for (int n : bucket[i]) if (idx < k) result[idx++] = n;
        return result;
    }

}
