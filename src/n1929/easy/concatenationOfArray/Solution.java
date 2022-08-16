package n1929.easy.concatenationOfArray;

import java.util.Arrays;

public class Solution {

    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {1, 2, 1};
        int[] nums02 = {1, 3, 2, 1};
        System.out.println(Arrays.toString(solution.getConcatenation(nums01)));
        System.out.println(Arrays.toString(solution.getConcatenation(nums02)));
    }
}
