package n0088.easy.mergeSortedArray;

import java.util.Arrays;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length1 = m - 1;//O(1)
        int length2 = n - 1;//O(1)
        int mergeLength = m + n - 1;//O(1)

        while (length1 >= 0 && length2 >= 0) {//O(m+n))
            if (nums1[length1] > nums2[length2]) {//O(1)
                nums1[mergeLength] = nums1[length1];//O(1)
                length1--;
            } else {
                nums1[mergeLength] = nums2[length2];//O(1)
                length2--;
            }
            mergeLength--;
        }

        // if there are remaining elements in nums2
        while (length2 >= 0) {//O(n)
            nums1[mergeLength] = nums2[length2];
            length2--;
            mergeLength--;
        }

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
