package Graph;

// https://leetcode.com/problems/flood-fill/
// Leetcode problem 733. Flood Fill

public class FloodFill {
    public static void main(String[] args) {

    }

    // Main leetcode function...

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        int originalColor = image[sr][sc];
        int newColor = color;

        if(originalColor ==  newColor) return image;

        flooding(image, sr, sc, newColor, originalColor);
        return image;

    }

    public static void flooding(int [][]image, int row, int col, int newColor, int originalColor){

        int m = image.length;
        int n=image[0].length;

        if(row<0 || col<0 || row==m || col==n || image[row][col]!=originalColor){
            return;
        }

        image[row][col]=newColor;

        flooding(image, row-1, col, newColor, originalColor);
        flooding(image, row, col-1, newColor, originalColor);
        flooding(image, row+1, col, newColor, originalColor);
        flooding(image, row, col+1, newColor, originalColor);
    }

}
