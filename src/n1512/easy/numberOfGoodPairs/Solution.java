package n1512.easy.numberOfGoodPairs;

public class Solution {

    public int numIdenticalPairs(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    res++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums01 = {1, 2, 3, 1, 1, 3};
        int[] nums02 = {1, 1, 1, 1};
        int[] nums03 = {1, 2, 3};
        System.out.println(solution.numIdenticalPairs(nums01));
        System.out.println(solution.numIdenticalPairs(nums02));
        System.out.println(solution.numIdenticalPairs(nums03));
    }
}
