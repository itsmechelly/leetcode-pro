package n1920.easy.buildArrayFromPermutation;

import java.util.Arrays;

public class Solution {

    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {0, 2, 1, 5, 3, 4};
        int[] nums02 = {5, 0, 1, 2, 3, 4};
        System.out.println(Arrays.toString(solution.buildArray(nums01)));
        System.out.println(Arrays.toString(solution.buildArray(nums02)));
    }
}
