package n0136.easy.singleNumber;

import java.util.HashSet;

public class Solution {

    public int singleNumber(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i)) {
                set.remove(i);
            } else {
                set.add(i);
            }
        }

        for (int i : set) {
            return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] nums01 = {2, 2, 1};
        System.out.println(solution.singleNumber(nums01));
        int[] nums02 = {4, 1, 2, 1, 2};
        System.out.println(solution.singleNumber(nums02));
        int[] nums03 = {1};
        System.out.println(solution.singleNumber(nums03));
    }
}
