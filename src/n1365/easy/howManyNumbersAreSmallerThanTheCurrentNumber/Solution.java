package n1365.easy.howManyNumbersAreSmallerThanTheCurrentNumber;

import java.util.Arrays;

public class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] smaller = new int[nums.length];
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    count++;
                    smaller[i] = count;
                }
            }
            count = 0;
        }
        return smaller;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {8, 1, 2, 2, 3};
        int[] nums02 = {6, 5, 4, 8};
        int[] nums03 = {7, 7, 7, 7};
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums01)));
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums02)));
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums03)));
    }
}
