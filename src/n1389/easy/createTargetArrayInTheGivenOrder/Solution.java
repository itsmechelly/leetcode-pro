package n1389.easy.createTargetArrayInTheGivenOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums01 = {0, 1, 2, 3, 4};
        int[] index01 = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(solution.createTargetArray(nums01, index01)));

        int[] nums02 = {1, 2, 3, 4, 0};
        int[] index02 = {0, 1, 2, 3, 0};
        System.out.println(Arrays.toString(solution.createTargetArray(nums02, index02)));

        int[] nums03 = {1};
        int[] index03 = {0};
        System.out.println(Arrays.toString(solution.createTargetArray(nums03, index03)));
    }
}
