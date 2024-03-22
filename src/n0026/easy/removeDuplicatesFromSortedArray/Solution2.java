package n0026.easy.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution2 {
    public static int removeDuplicates(int[] nums) {
        int k = 0;

        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {//O(n)
            //if the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {//O(1)
                continue;
            }

            nums[k] = nums[i];
            k++;
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
