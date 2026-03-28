package TwoPointersAndSlidingWindow;

// https://leetcode.com/problems/fruit-into-baskets/
// Leetcode problem 904. Fruit Into Baskets

import java.util.*;

public class FruitInBasket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of Garden: ");
        int n = input.nextInt();
        System.out.println("Enter the types of fruit in garden:  ");
        int [] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println("The maximum fruits taken in two baskets are " + totalFruit(arr));

    }

    // Main leetcode function...

    static int totalFruit(int[] arr) {
        int maxlen=0;int n=arr.length;
        int r=0;int l=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        while(r<n){
            map.put(arr[r],map.getOrDefault(arr[r],0)+1);
            if(map.size()>2){
                while(map.size()>2){
                    map.put(arr[l],map.get(arr[l])-1);
                    if(map.get(arr[l])==0) map.remove(arr[l]);
                    l=l+1;
                }
            }

            if(map.size()<=2){
                maxlen=Math.max(maxlen,r-l+1);
            }
            r=r+1;
        }
        return maxlen;
    }

}
