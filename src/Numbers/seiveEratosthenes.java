package Numbers;

// It is a technique to find the number of prime numbers till n.
// Time complexity is O(N * log(logN))

import java.util.Scanner;

public class seiveEratosthenes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        boolean [] primeArray = new boolean[number + 1];
        System.out.println(primeArray[0]);
        prime(number, primeArray);
    }

    static void prime(int n, boolean [] arr){
        for(int i = 2; i*i <= n; i++){
            if (!arr[i]){
                for (int j = i*2; j <= n; j = j+i) {
                    arr[j] = true;
                }
            }
        }
        for (int i = 2; i <= n; i++){
            if (!arr[i]) {System.out.print(i + " ");}
        }
    }
}
