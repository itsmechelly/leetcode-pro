package n0001.easy.twoSum;

import java.util.Arrays;

public class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
//                    res[0] = nums[i];
//                    res[1] = nums[j];
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        int[] nums2 = {3, 2, 3};
        int target2 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));

        int[] nums3 = {3, 2, 4};
        int target3 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));

        int[] nums4 = {3, 3};
        int target4 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums4, target4)));
    }
}
