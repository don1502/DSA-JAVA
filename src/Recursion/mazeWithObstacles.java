package Recursion;

import java.util.ArrayList;
import java.util.List;

public class mazeWithObstacles {
    public static void main(String[] args) {
        boolean [][] maze = {
            {true, true, true}, {true, false, true},{true, true, true}
        };

        System.out.println("The path with obstacle is " + pathFindWIthObstacle("", maze, 0, 0));

    }

    // Main function...
    // This is the starting of back tracking as we stop at an obstacle

    static List<String> pathFindWIthObstacle(String processed, boolean [][] maze,  int row, int column){
        // Here we use boolean maze foe checking whether the current location is water or not and safe to travel along
        if (row == maze.length-1 && column == maze[0].length-1){
            List<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }

        List<String> answer = new ArrayList<>();

        if (!maze[row][column]){
            answer.add("Obstacle");
            return answer;
        }

        if (row < maze.length-1) {
            answer.addAll(pathFindWIthObstacle(processed+"D", maze,row + 1, column));
        }
        if (column < maze[0].length-1){
            answer.addAll(pathFindWIthObstacle(processed+"R", maze, row , column + 1));
        }

        return answer;

    }

}
