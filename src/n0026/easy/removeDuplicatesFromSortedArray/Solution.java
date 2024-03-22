package n0026.easy.removeDuplicatesFromSortedArray;

import java.util.Arrays;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; //empty array

        int k = 1;//O(1)
        System.out.println(Arrays.toString(nums));
        //iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {//O(n)
            //if the current element is different from the previous one, copy it to the next available position
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}
