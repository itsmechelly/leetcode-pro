package n0167.medium.twoSumIIInputArrayIsSorted;

import java.util.*;

public class TwoPointersSolution {

    public int[] twoSum(int[] numbers, int target) {
        int sum;
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            sum = numbers[i] + numbers[j];
            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoPointersSolution solution = new TwoPointersSolution();
        int[] nums01 = {2, 7, 11, 15};
        int[] nums02 = {2, 3, 4};
        int[] nums03 = {-1, 0};
        System.out.println(Arrays.toString(solution.twoSum(nums01, 9)));
        System.out.println(Arrays.toString(solution.twoSum(nums02, 6)));
        System.out.println(Arrays.toString(solution.twoSum(nums03, -1)));
    }
}
