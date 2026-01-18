package Numbers;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class factors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        factor1(n);
        factors2(n);
        factors3(n);
    }

    // O(N) ---> Time complexity

    static void factor1(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) System.out.print(i + " ");
        }
    }

    // O(Sqrt(N)) ---> Time complexity

    static void factors2(int n) {
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) System.out.print(i + " ");
                else System.out.print(i + " " + n / i + " ");
            }
        }
    }

    // Both time and space complexity is O(sqrt(N))

    static void factors3(int n) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) System.out.print(i + " ");
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.print(list.get(i) + " ");
        }

    }
}
