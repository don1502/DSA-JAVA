package Gready;

// https://leetcode.com/problems/assign-cookies/
// Leetcode problem 455. Assign Cookies

// This is like players and trainers sum

import java.util.*;

public class AssignCookies {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("Enter the number of elements: ");
        int m = input.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Assigned cookies = " + findContentChildren(arr, arr1));
    }

    // Main leetcode function.....

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = i;
        while(i < g.length && j < s.length){
            if(g[i] <= s[j]) i++;
            j++;
        }
        return i++;
    }

}
