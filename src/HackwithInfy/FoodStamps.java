package HackwithInfy;

import java.util.*;

// ------------------------QUESTION-----------------------------

// You want to buy food from a store.
// You have a scoring system that uses a unit called taste points .
// Each time you buy a type of food, you can measure its tastiness by the number of taste points you get from that food.
// You have N types of food. You can buy any type any number of times, as long as the total number of meals does not exceed M.
// However, you don't want to grow tired of a food if you buy it too often.
// Therefore, you will get v[i] − d[i] × (ti − 1) taste points when you buy the i-th type of food for the ti-th time.
// Find the maximum number of taste points you can achieve.

public class FoodStamps {
    public static long solve(int n, int m, int[] v, int[] d) {
        // Max-heap: stores [currentTasteValue, foodIndex, nextDecrement]
        // Java PriorityQueue is min-heap by default → negate for max
        PriorityQueue<long[]> heap = new PriorityQueue<>(
                (a, b) -> Long.compare(b[0], a[0])
        );

        // Step 1: seed heap with first purchase of every food
        for (int i = 0; i < n; i++) {
            if (v[i] > 0) {
                // [taste this purchase, food index, d[i]]
                heap.offer(new long[]{v[i], i, d[i]});
            }
        }

        long total = 0;

        // Step 2: greedily pick the best meal up to M times
        for (int meal = 0; meal < m && !heap.isEmpty(); meal++) {
            long[] top = heap.poll();
            long taste = top[0];
            int idx    = (int) top[1];
            long decr  = top[2];

            if (taste <= 0) break; // no positive meals left

            total += taste;

            // Step 3: push next purchase of same food if still positive
            long nextTaste = taste - decr;
            if (nextTaste > 0) {
                heap.offer(new long[]{nextTaste, idx, decr});
            }
        }

        return total; // Step 4
    }

    public static void main(String[] args) {
        // Case 1 → 5
        System.out.println(solve(1, 1, new int[]{5}, new int[]{2}));
        // Case 2 → 12
        System.out.println(solve(2, 2, new int[]{5,7}, new int[]{2,4}));
        // Case 3 → 27
        System.out.println(solve(3, 5, new int[]{5,7,9}, new int[]{2,4,6}));
    }
}
