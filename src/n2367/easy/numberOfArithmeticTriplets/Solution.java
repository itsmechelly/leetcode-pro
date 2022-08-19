package n2367.easy.numberOfArithmeticTriplets;

public class Solution {

    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {0, 1, 4, 6, 7, 10};
        int[] nums02 = {4, 5, 6, 7, 8, 9};
        System.out.println(solution.arithmeticTriplets(nums01, 3));
        System.out.println(solution.arithmeticTriplets(nums02, 2));
    }
}
