package Recursion;

// Amazon asked question


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceRollToTargetSumCombination {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        int st = input.nextInt();

        dice("", st);

        System.out.println();

        System.out.println("Returning the same output in a list " + diceReturn("",st));
    }


    // What this problem is, we should give all the combinations
    // which we get from rolling dice sum of elements to obtain given target value....

    // Main function

    static void dice(String p, int target){  // P == Processed integer
        if (target == 0){
            System.out.print(p + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p+i, target-i);
        }

    }

    // Returning the same answer in an  ArrayList.

    static List<String> diceReturn(String p, int target) {
        if (target == 0){
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> answer = new ArrayList<>();

        for (int i = 1; i <= 6 && i <= target; i++) {
            answer.addAll(diceReturn(p+i, target-i));
        }
        return answer;
    }

}
