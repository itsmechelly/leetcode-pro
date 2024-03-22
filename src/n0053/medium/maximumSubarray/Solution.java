package n0053.medium.maximumSubarray;

public class Solution {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int cur = 0;

        for (int i = 0; i < nums.length; i++) {
            if (cur < 0) {
                cur = 0;
            }
            cur += nums[i];
            max = Math.max(max, cur);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int[] nums02 = {1};
        int[] nums03 = {5, 4, -1, 7, 8};
        System.out.println(solution.maxSubArray(nums01));
        System.out.println(solution.maxSubArray(nums02));
        System.out.println(solution.maxSubArray(nums03));
    }
}
