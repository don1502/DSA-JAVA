package Recursion;

import java.util.ArrayList;
import java.util.List;

public class mazeBacktracking {
    public static void main(String[] args) {
        boolean [][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        System.out.println("The path with obstacle is " + allPathMovement("", maze, 0, 0));
    }

    // Main function which creates backtracking...

    static List<String> allPathMovement(String processed, boolean [][] maze, int row, int column){
        // Here we use boolean maze foe checking whether the current location is water or not and safe to travel along
        if (row == maze.length-1 && column == maze[0].length-1){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> answer = new ArrayList<>();

        if (!maze[row][column]){
//            answer.add("Obstacle");
            return answer;
        }

        maze[row][column] = false; // This line makes the cell that are visited... for backtracking

        if (row < maze.length-1) {
            answer.addAll(allPathMovement(processed+"D", maze,row + 1, column));
        }
        if (column < maze[0].length-1){
            answer.addAll(allPathMovement(processed+"R", maze, row , column + 1));
        }

        if (row > 0 ){
            answer.addAll(allPathMovement(processed+"U", maze, row-1, column));
        }

        if (column > 0){
            answer.addAll(allPathMovement(processed + "L", maze, row, column-1));
        }

        // This is the line where function will be over
        // so before the function gets removed, also remove the changes that were made by the function

        maze[row][column] = true; // This line changes the changes that are done during the function call...
        // This make the backtracking work properly...

        return answer;

    }

}
