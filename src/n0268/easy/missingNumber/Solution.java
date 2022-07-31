package n0268.easy.missingNumber;

class Solution {

    public int missingNumber(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i]) - i;
        }
        return nums.length - sum;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {3, 0, 1};
        int[] nums02 = {0, 1};
        int[] nums03 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        System.out.println(solution.missingNumber(nums01));
        System.out.println(solution.missingNumber(nums02));
        System.out.println(solution.missingNumber(nums03));
    }
}
