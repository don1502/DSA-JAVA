package Gready;

// https://leetcode.com/problems/queue-reconstruction-by-height/
// Leetcode problem 406. Queue Reconstruction by Height

import java.util.*;

public class HeightQueueReconstruction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt(); // deadline
            arr[i][1] = sc.nextInt(); // profit
        }
        System.out.println(reconstructQueue(arr));
    }

    // Main Leetcode function...

    static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a,b) -> {
            if(a[0]==b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        List<int[]> list = new ArrayList<>();
        for(int a[] : people){
            list.add(a[1], a);
        }
        return list.toArray(new int [list.size()][]);
    }

}
