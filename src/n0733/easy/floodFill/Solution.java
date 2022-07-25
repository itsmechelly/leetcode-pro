package n0733.easy.floodFill;

import java.util.Arrays;

class Solution {

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color) {
            return image;
        }

        fill(image, sr, sc, image[sr][sc], color);
        return image;
    }

    public void fill(int[][] image, int i, int j, int color, int newColor) {
        if (i < 0 || i >= image.length || j < 0 || j >= image[i].length || image[i][j] != color) {
            return;
        }
        image[i][j] = newColor;
        fill(image, i + 1, j, color, newColor);
        fill(image, i - 1, j, color, newColor);
        fill(image, i, j + 1, color, newColor);
        fill(image, i, j - 1, color, newColor);
    }

    public static void main(String[] args) {
        int[][] image = {{1, 1, 1}, {1, 1, 1}, {1, 0, 1}};
        Solution solution = new Solution();
        System.out.println(Arrays.deepToString(solution.floodFill(image, 1, 1, 2)));
    }
}
