package Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class mazePathFindInDiagonal {
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

        System.out.println("The total path by moving in down, right and diagonal " );
        System.out.print(pathFindInDiag("", arr[0].length, arr.length));

    }

    // Main function

    static List<String> pathFindInDiag(String processed, int row, int column){
        if (row == 1 && column == 1){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> answer = new ArrayList<>();

        if (row > 1) {
            answer.addAll(pathFindInDiag(processed+"D", row -1, column));
        }

        if (row > 1 && column > 1){
            answer.addAll(pathFindInDiag(processed+"d", row - 1, column - 1));
        }

        if (column > 1){
            answer.addAll(pathFindInDiag(processed+"R", row , column - 1));
        }

        return answer;

    }

}
