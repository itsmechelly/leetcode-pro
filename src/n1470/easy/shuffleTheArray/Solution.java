package n1470.easy.shuffleTheArray;

import java.util.Arrays;

public class Solution {

    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[n * 2];
        for (int i = 0; i < n; i++) {
            shuffle[i * 2] = nums[i];
            shuffle[i * 2 + 1] = nums[i + n];
        }
        return shuffle;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {2, 5, 1, 3, 4, 7};
        int[] nums02 = {1, 2, 3, 4, 4, 3, 2, 1};
        int[] nums03 = {1, 1, 2, 2};
        System.out.println(Arrays.toString(solution.shuffle(nums01, 3)));
        System.out.println(Arrays.toString(solution.shuffle(nums02, 4)));
        System.out.println(Arrays.toString(solution.shuffle(nums03, 2)));
    }
}
