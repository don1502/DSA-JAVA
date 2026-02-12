package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mazePathFinding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = input.nextInt();
            }
        }

        System.out.println("The total number of ways to go to exit is " + pathCount(arr[0].length, arr.length));

        System.out.println("Combinations are " + pathFind("", arr[0].length, arr.length));

    }

    // Main recursive function...

    // Counting the possible ways to go to exit of maze.

    static int pathCount(int row, int colunm){
        if (row == 1 || colunm == 1){
            return 1;
        }

        int left = pathCount(row-1, colunm);
        int right = pathCount(row, colunm-1);

        return left + right;
    }

    // Printing all the Path from start to exit.

    static List<String> pathFind(String processed, int row, int column){
        if (row == 1 && column == 1){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> answer = new ArrayList<>();

        if (row > 1) {
            answer.addAll(pathFind(processed+"D", row -1, column));
        }
        if (column > 1){
            answer.addAll(pathFind(processed+"R", row , column - 1));
        }

        return answer;

    }

}
