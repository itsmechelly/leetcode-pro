package n0001.easy.twoSum;

import java.util.Arrays;
import java.util.HashMap;

public class SolutionWithHashMap {

    public int[] twoSum(int[] nums, int target) {

        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)) {
                res[0] = i;
                res[1] = map.get(difference);
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        SolutionWithHashMap solution = new SolutionWithHashMap();
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));

        int[] nums2 = {3, 2, 3};
        int target2 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums2, target2)));

        int[] nums3 = {3, 2, 4};
        int target3 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums3, target3)));

        int[] nums4 = {3, 3};
        int target4 = 6;
        System.out.println(Arrays.toString(solution.twoSum(nums4, target4)));
    }
}
