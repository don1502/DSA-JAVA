package HackwithInfy;

// Given an array a of length n and an integer k.
// You must perform the following operation exactly k times: choose two indices i, j and swap**(ai, aj).
// ** Find the maximum possible MSS (maximum subarray sum) after performing the above operation exactly k times.

// Note: Swapping the same pair again is allowed but useless (a double-swap cancels out).
// Therefore, performing exactly k swaps is equivalent to at most k useful swaps.

import java.util.*;

public class MSSSwaps {

    // Standard Kadane's algorithm
    static int kadane(int[] a) {
        int maxSum = a[0], cur = a[0];
        for (int i = 1; i < a.length; i++) {
            cur = Math.max(a[i], cur + a[i]);
            maxSum = Math.max(maxSum, cur);
        }
        return maxSum;
    }

    public static int solve(int n, int k, int[] a) {
        // k == 0: no swaps, plain Kadane
        if (k == 0) return kadane(a);

        // k >= 1: separate positives and negatives
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();
        for (int x : a) {
            if (x > 0) pos.add(x);
            else neg.add(x);
        }

        // All values negative → forced to take max single element
        if (pos.isEmpty()) return Collections.max(Arrays.stream(a)
                .boxed().collect(java.util.stream.Collectors.toList()));

        // Sort positives descending — greedily pick the best ones
        pos.sort(Collections.reverseOrder());

        // With k useful swaps: take min(k + pos.size(), total positives)
        // but at most all positives (can't create new ones)
        // Actually: we can pull in at most k positives that were
        // outside our window. Optimal: take ALL positives.
        // (Because a double-swap wastes one swap on a neutral pair,
        //  so k ≥ 1 is sufficient to take all positives IF k ≥ negCount)
        // For the general case with constraints (n ≤ 500, k ≤ n):
        // take min(pos.size(), pos.size() + Math.min(k, neg.size())) positives
        int take = Math.min(pos.size(), pos.size()); // all positives
        // Actually we can always pick all positives with k≥1 since
        // we just need to relocate negatives out of our subarray.
        // The number of useful swaps needed = number of negatives
        // inside the best all-positive subarray. With k swaps available,
        // take all positives when k >= negsToRemove, else take top k+origPos.

        // Simple correct approach for n ≤ 500:
        long sum = 0;
        // We can include all positives; number of negatives we must
        // swap out of a contiguous window = 0 since we pick any subarray.
        // Maximum: just sum all positives (they can always form a subarray
        // by swapping negatives between them outside, using k swaps).
        // Edge: if k < number of negatives embedded in best window,
        // we can only clear k of them.

        // Most reliable for the given constraints: O(n^2) over all windows,
        // for each window count embedded negatives, clear min(k, that count).
        int best = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int windowSum = 0, negsInWindow = 0;
            // Sort positives not in window ascending to replace worst first
            List<Integer> outsidePos = new ArrayList<>(pos);
            for (int j = i; j < n; j++) {
                windowSum += a[j];
                if (a[j] < 0) {
                    negsInWindow++;
                    // Replace this negative with best outside positive
                    // (simplified: just add the sum of top-k outside positives)
                }
                // Compute gain from swapping k negatives in [i..j]
                // with top positives outside [i..j]
                int canSwap = Math.min(k, negsInWindow);
                int adjusted = windowSum;
                // Collect negatives in [i..j] sorted ascending
                List<Integer> negsHere = new ArrayList<>();
                for (int x = i; x <= j; x++) if (a[x] < 0) negsHere.add(a[x]);
                Collections.sort(negsHere); // worst negatives first
                // Collect positives outside [i..j] sorted descending
                List<Integer> posOut = new ArrayList<>();
                for (int x = 0; x < n; x++)
                    if ((x < i || x > j) && a[x] > 0) posOut.add(a[x]);
                Collections.sort(posOut, Collections.reverseOrder());
                int swaps = Math.min(canSwap, Math.min(negsHere.size(), posOut.size()));
                for (int s = 0; s < swaps; s++) {
                    adjusted -= negsHere.get(s);   // remove negative
                    adjusted += posOut.get(s);       // add outside positive
                }
                best = Math.max(best, adjusted);
            }
        }
        return best;
    }

    public static void main(String[] args) {
        // Case 1: n=3,k=1, a={1,-5} wait input is 3 lines
        // Input: n=2(size implied), k=1, a=[1,-5] → 3
        // Re-reading: first line=n=3? No — "3\n1\n1\n-5" means n=3,k=1,a=[1,-5]?
        // Actually: n=size of array, then k, then n elements
        // Case1: n=2, k=1, a=[1,-5]  → after swap [1,1]? No...
        // PDF: "3\n1\n1\n-5" → n=3? But only 2 elements shown
        // Likely: line1=n=2, line2=k=1, lines 3..n+2 = elements [1,-5] → ans=3? No sum=1+(-5)=-4
        // The sample says swap 1 and -5 → [−5,1] MSS=1+2? Hmm. Likely a=[1,2,-5], swap -5 with something
        // Most consistent reading: n=3, k=1, a=[1,2,-5] but PDF shows "1\n-5"
        // Going with: Case1 a=[1,-5] k=1 → swap → [-5,1] MSS=1? But PDF says 3=1+2
        // Likely a=[1,2,-5] printed as 3 values. Let's verify with the code.
        System.out.println(solve(3, 1, new int[]{1, 2, -5})); // expect 3
        System.out.println(solve(3, 0, new int[]{5, -1, 5})); // expect 10? PDF says 2? Recheck
        System.out.println(solve(3, 0, new int[]{1, -5, 2})); // expect 2
    }
}

