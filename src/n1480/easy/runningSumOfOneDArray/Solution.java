package n1480.easy.runningSumOfOneDArray;

import java.util.Arrays;

class Solution {

    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (sum += nums[i]);
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {1, 2, 3, 4};
        int[] nums02 = {1, 1, 1, 1, 1};
        int[] nums03 = {3, 1, 2, 10, 1};
        System.out.println(Arrays.toString(solution.runningSum(nums01)));
        System.out.println(Arrays.toString(solution.runningSum(nums02)));
        System.out.println(Arrays.toString(solution.runningSum(nums03)));
    }
}
