package n0015.medium.threeSum;

import java.util.List;

import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        int N = nums.length;
        Arrays.sort(nums);

        // if we have less than 3 element there is no valid subset
        // if we have min value greater than 0, it's not possible to produce subset where count is zero
        // if we have max value less than 0, it's not possible to produce subset where count is zero
        if (N < 3 || nums[0] > 0 || nums[N - 1] < 0)
            return result;

        for (int i = 0; i < N - 2; i++) {
            // current i is same as previous, it will create duplicate result
            if (i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            int left = i + 1, right = N - 1;
            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    // if we have duplicate elements, we need get rid of it,
                    // so we are moving left and right pointer to a position
                    // where there's no duplicate elements
                    while (left < right && nums[left] == nums[left + 1])
                        left++;
                    while (left < right && nums[right] == nums[right - 1])
                        right--;
                    left++;
                    right--;
                } else if (sum > 0)
                    right--;
                else
                    left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {-1, 0, 1, 2, -1, -4};
        int[] nums02 = {0, 1, 1};
        int[] nums03 = {0, 0, 0};
        System.out.println(solution.threeSum(nums01));
        System.out.println(solution.threeSum(nums02));
        System.out.println(solution.threeSum(nums03));
    }
}