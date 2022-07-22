package n200.numberOfIslands;

import java.util.Stack;

public class Solution {

    //https://www.javatpoint.com/find-number-of-island-in-java
    public int findIslands(char[][] matrix) {

        int rows = matrix.length;
        if (rows == 0) {
            return 0;
        }

        int columns = matrix[0].length;
        int numberOfIslands = 0;

        //returns true if the same number of columns as the first row
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        //loop for rows
        for (int i = 0; i < rows; i++) {
            //loop for columns
            for (int j = 0; j < columns; j++) {
                //set element to false
                visited[i][j] = false;
            }
        }

        //creating stack
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                //returns true if both conditions returns true
                if (!visited[i][j] && matrix[i][j] == '1') {
                    //if the above condition returns true, push the i-th row and the j-th column to the stack
                    stack.push(i + "," + j);
                    //calling the dfs() function
                    dfs(stack, matrix, visited);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }

    //function performs the depth first search over the matrix
    public void dfs(Stack<String> stack, char[][] matrix, boolean[][] visited) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        while (stack.empty() == false) {
            String sPop = stack.pop();
            //casting rows and columns
            int row = Integer.parseInt(sPop.split(",")[0]);
            int col = Integer.parseInt(sPop.split(",")[1]);
            if (row < 0 || col < 0 || row >= rows || col >= columns || visited[row][col] || matrix[row][col] != '1')
                continue;
            //marking element as visited
            visited[row][col] = true;
            //moves in left direction
            stack.push(row + "," + (col - 1));
            //moves in right direction
            stack.push(row + "," + (col + 1));
            //moves in upward direction
            stack.push((row - 1) + "," + col);
            //moves in downward direction
            stack.push((row + 1) + "," + col);
        }
    }

    public static void main(String args[]) {

        char[][] island = new char[][]{
                {'1', '1', '0', '0', '1'},
                {'1', '0', '0', '1', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}};

        Solution solution = new Solution();
        System.out.println("Number of Islands: " + solution.findIslands(island));
    }
}