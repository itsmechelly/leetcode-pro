package n0027.easy.removeElement;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int k = 0; // represents the number of elements not equal to val
        for (int i = 0; i < nums.length; i++) { //O(n)
            if (nums[i] != val) {
                nums[k++] = nums[i]; // move the non-val element to the front
                /*
                the above code line is same as:
                nums[k] = nums[i];
                k++;
                 */
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        System.out.println(removeElement(nums1, val1));

        System.out.println("==================");

        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        System.out.println(removeElement(nums2, val2));
    }
}
