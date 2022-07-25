package n0994.medium.rottingOranges;

public class Solution {

    public int orangesRotting(int[][] grid) {

        if (grid.length == 0 || grid[0].length == 0) return 0;
        int res = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) res++;
            }
        }
        if (res <= 0) return 0;
        res = 0;
        int pre = 0;
        int cur = 0;
        while ((cur = oH(grid)) > 0 && pre != cur) {
            pre = cur;
            res++;
        }
        return cur > 0 ? -1 : res + 1;
    }

    public int oH(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 2) continue;
                set(grid, i - 1, j);
                set(grid, i + 1, j);
                set(grid, i, j - 1);
                set(grid, i, j + 1);
            }
        }
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) res++;
                if (grid[i][j] == 5) grid[i][j] = 2;
            }
        }
        return res;
    }

    public void set(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length) return;
        if (grid[i][j] == 1) grid[i][j] = 5;
    }

    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        int[][] arr1 = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int[][] arr2 = {{2, 2, 1}, {0, 1, 1}, {1, 0, 1}};
        System.out.println(solution2.orangesRotting(arr1));
        System.out.println(solution2.orangesRotting(arr2));
    }
}
