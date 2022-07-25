package n0215.medium.KthLargestElementInAnArray;

public class Solution {

    public int findKthLargest(int[] nums, int k) {

        int swaps = nums.length - 1;

        for (int i = 0; i < swaps; i++) {
            for (int j = 0; j < swaps - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                }
            }
        }

        return nums[nums.length - k];
    }

    public void printer(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 4;

        Solution solution = new Solution();

        System.out.println("Before swap:");
        solution.printer(nums);
        System.out.println("result = " + solution.findKthLargest(nums, k));
        System.out.println("After swap:");
        solution.printer(nums);
    }
}
