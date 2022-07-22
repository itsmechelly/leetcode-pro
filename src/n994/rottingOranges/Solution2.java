package n994.rottingOranges;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 {

    public int orangesRotting(int[][] grid) {

        int noOfMinutes = 0, noOfFreshFruits = 0, row = grid.length, col = grid[0].length;
        if (row == 0)
            return 0;

        Queue<int[]> queue = new LinkedList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    noOfFreshFruits++;
                }
            }
        }
        if (noOfFreshFruits == 0)
            return 0;

        int[][] axis = new int[][]{{0, -1}, {-1, 0}, {1, 0}, {0, 1}};
        while (!queue.isEmpty()) {
            noOfMinutes++;
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] position = queue.remove();
                for (int[] arr : axis) {
                    int x = position[0] + arr[0];
                    int y = position[1] + arr[1];

                    if (x < 0 || x >= row || y < 0 || y >= col || grid[x][y] != 1) {
                        continue;
                    }
                    queue.offer(new int[]{x, y});
                    grid[x][y] = 2;
                    noOfFreshFruits--;
                }
            }
        }
        if (noOfFreshFruits > 0)
            return -1;
        return noOfMinutes - 1;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[][] arr1 = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] arr2 = {{2, 2, 1}, {0, 1, 1}, {1, 0, 1}};
        System.out.println(solution2.orangesRotting(arr1));
        System.out.println(solution2.orangesRotting(arr2));
    }
}